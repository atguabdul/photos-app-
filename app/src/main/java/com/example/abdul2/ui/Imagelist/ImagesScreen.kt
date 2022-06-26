package com.example.abdul2.ui.Imagelist


import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.abdul2.data.domain.Image
import com.example.abdul2.ui.ImageCard
import com.example.abdul2.ui.ImageCard2

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImagesScreen(viewModel: ImagesViewModel = hiltViewModel()) {
    val state = viewModel.state.value
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.primaryVariant
    ) {

        when {
            state.isLoading -> {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center,

                    ) {
                    CircularProgressIndicator()
                }
            }
            state.error.isNotEmpty() -> {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center,

                    ) {
                    Text(text = state.error)
                }
            }
            state.images.isNotEmpty() -> {
                Column() {
LazyRow(
){items(state.images) { picture ->
    Log.e("ImagesScreen", "${state.images}")
    ImageCard2(image = picture)
}}

                    LazyVerticalGrid(
                        cells = GridCells.Adaptive(150.dp),
                        modifier = Modifier.padding(16.dp)
                    ) {
                        item(
                            span = { GridItemSpan(4) }
                        ) {
                            Box(
                                modifier = Modifier
                                    .clip(shape = MaterialTheme.shapes.small)
                            ) {


                                Text(
                                    text = "My photos",
                                    color = Color.Black,
                                    modifier = Modifier
                                        .background(MaterialTheme.colors.secondary.copy(alpha = 0.8f))
                                        .fillMaxWidth()
                                        .padding(4.dp),
                                    textAlign = TextAlign.Center,
                                    style = MaterialTheme.typography.subtitle2
                                )
                            }
                        }
                        items(state.images) { picture ->
                            Log.e("ImagesScreen", "${state.images}")
                            ImageCard(image = picture)
                        }
                    }
                }
            }

        }
    }
}




