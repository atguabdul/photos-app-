package com.example.abdul2.data.domain

import com.google.gson.annotations.SerializedName

data class Image(
    val id : String,
    val author: String,
    val width: Int,
    val height: Int,
    val url: String,
    @SerializedName("download_url")
    val downloadUrl: String
)





/*
val item1 = Image(photoPath= R.drawable.item1, title = "Abdul", id = 1 )

val item2 = Image(photoPath = R.drawable.item2, title = "ABDul", id = 2
)
val item3 = Image(photoPath = R.drawable.item3, title = "ABD", id = 3
)
val item4 = Image(photoPath = R.drawable.item4, title = "AB", id = 4
)
val item5 = Image(photoPath = R.drawable.item5, title = "A98", id = 5
)
*

 */