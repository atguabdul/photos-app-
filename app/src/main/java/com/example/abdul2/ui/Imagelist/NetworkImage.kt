package com.example.abdul2.ui.Imagelist

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.example.abdul2.R

@OptIn(ExperimentalCoilApi::class)
@Composable
fun NetworkImage(
    url: String,
    contentDesc: String?,
    modifier: Modifier
) {
    Box(modifier) {
        val painter = rememberImagePainter(
            data = url,
            builder = {
                placeholder(drawableResId = R.drawable.placeholder)
                crossfade(true)
            }
        )

        Image(
            painter = painter,
            contentDescription = contentDesc,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}





