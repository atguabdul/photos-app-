package com.example.abdul2.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.abdul2.data.domain.Image
import com.example.abdul2.ui.Imagelist.NetworkImage

@OptIn(ExperimentalUnitApi::class)
@Composable
fun ImageCard(image: Image){
    Card(
        backgroundColor = Color.LightGray,
        contentColor = Color.Black,
        border = BorderStroke(2.dp, Color.Black),
        elevation = 90.dp,
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier.padding(15.dp)
    )  {
        Box(modifier = Modifier.size(250.dp)
        )
        {
            NetworkImage(url = image.downloadUrl, contentDesc = null, modifier = Modifier.size(200.dp) )





            Text(
                text = image.author.uppercase(),
                color = Color.Black,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .background(MaterialTheme.colors.primary.copy(alpha = 0.8f))
                    .fillMaxWidth()
                    .padding(4.dp),
                fontSize = TextUnit(value = 23f, TextUnitType.Sp),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.subtitle2
            )
        }

    }
}