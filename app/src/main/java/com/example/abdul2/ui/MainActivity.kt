package com.example.abdul2.ui

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import com.example.abdul2.ui.Imagelist.ImagesScreen
import com.example.abdul2.ui.theme.Abdul2Theme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Abdul2Theme {
                window.statusBarColor =
                    MaterialTheme.colors.primary.toArgb()
                ImagesScreen()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DefaultPreview() {
    Abdul2Theme {
        ImagesScreen()
    }
}