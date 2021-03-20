package com.example.udemyjekpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()

                }
            }
        }


@Composable
private fun NewsStory() {
    
val image = painterResource(id = R.mipmap.paisaje)

    Column (modifier = Modifier.padding(16.dp)) {
        val imageModifier = Modifier
            .requiredHeight(150.dp)
            .fillMaxHeight()
            .clip(shape = RoundedCornerShape(10.dp))


    Image(painter = image, contentDescription = "Paisaje",
        modifier = imageModifier,
        contentScale = ContentScale.Crop )
        Spacer(modifier = Modifier.padding(top = 18.dp))
    Text(text = "Titular de la notice", style = MaterialTheme.typography.h6)
    Text(text = "Descripcion de la noticia", style = MaterialTheme.typography.body2)
    Text(text = "Pie de pagina", style = MaterialTheme.typography.body2)
}
}

@Preview(showBackground = true)
@Composable
fun PreviewNewsStory() {
    NewsStory()
    }
