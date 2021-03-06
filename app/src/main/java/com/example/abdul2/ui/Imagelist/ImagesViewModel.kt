package com.example.abdul2.ui.Imagelist


import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.abdul2.R
import com.example.abdul2.common.Response
import com.example.abdul2.data.domain.Image
import com.example.abdul2.data.repository.ImageRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ImagesViewModel @Inject constructor(
    private val repository: ImageRepository
) : ViewModel() {
    private val _state = mutableStateOf(ImageListState())
    val state: State<ImageListState> = _state

    init {
        getImages()
    }

    fun getImages() {
        repository.getAllImages().onEach { response ->
            when (response) {
                is Response.Loading -> {
                    _state.value = ImageListState(isLoading = true)
                }
                is Response.Success -> {
                    _state.value = ImageListState(images = response.data ?: emptyList())
                }
                is Response.Error -> {
                    _state.value =
                        ImageListState(error = response.message ?: "There is something wrong \uD83D\uDE22")
                }
            }
        }.launchIn(viewModelScope)
    }
}

