package com.example.abdul2.ui.Imagelist

import com.example.abdul2.data.domain.Image


data class ImageListState (
    val isLoading: Boolean = false,
    val error: String = "",
    val images: List<Image> = emptyList()
)