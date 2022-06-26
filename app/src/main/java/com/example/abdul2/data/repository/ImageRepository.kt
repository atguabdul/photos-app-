package com.example.abdul2.data.repository

import com.example.abdul2.common.Response
import com.example.abdul2.data.domain.Image
import com.example.abdul2.data.domain.PicsumAPI
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class ImageRepository @Inject constructor(
    private val picsumAPI: PicsumAPI
) {
    suspend fun getImages(): List<Image> {
        return picsumAPI.getImages()
    }
    fun getAllImages() : Flow<Response<List<Image>>> = flow {
        try {
            emit(Response.Loading<List<Image>>())
            val images = getImages()
            emit(Response.Success<List<Image>>(images))
        } catch (e: HttpException){
            emit(Response.Error<List<Image>>("Wrong way !!"))
        }
        catch (e: IOException) {
            emit(Response.Error<List<Image>>("Failed to connect to server \uD83D\uDE22"))
        }
    }
}