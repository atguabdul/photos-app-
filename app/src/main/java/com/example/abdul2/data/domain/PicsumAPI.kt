package com.example.abdul2.data.domain

import retrofit2.http.GET

interface PicsumAPI {
@GET("/v2/list")
    suspend fun getImages() : List<Image>
}