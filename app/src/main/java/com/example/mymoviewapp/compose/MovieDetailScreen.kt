package com.example.mymoviewapp.compose

import androidx.compose.animation.scaleIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mymoviewapp.R
import com.example.mymoviewapp.ui.theme.MovieTimeTheme

@Composable
fun MovieDetailScreen() {
    MovieTimeTheme {
        Column {
            TopSection()
            BottomSection()
        }
    }
}

@Composable
fun TopSection() {
    Box {
        Image(
            painterResource(id = R.drawable.ab1_inversions),
            contentDescription = null,
            Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.FillWidth
        )
        Image(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = null,
            colorFilter = ColorFilter.tint(Color.White),
            modifier = Modifier
                .padding(8.dp)
                .size(18.dp))
        Text(
            text = "Title",
            modifier = Modifier
                .padding(8.dp)
                .align(Alignment.BottomStart),
            color = Color.White,
            style = MaterialTheme.typography.titleSmall
        )
    }
}

@Composable
fun BottomSection() {
    Surface(
        shape = MaterialTheme.shapes.small,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(4.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Text(
                text = "Year: ",
                modifier = Modifier
                    .padding(8.dp),
                style = MaterialTheme.typography.bodySmall
            )
            Text(
                text = "Rating: ",
                modifier = Modifier
                    .padding(8.dp),
                style = MaterialTheme.typography.bodySmall
            )
            Text(
                text = "Language: ",
                modifier = Modifier
                    .padding(8.dp),
                style = MaterialTheme.typography.bodySmall
            )
            Text(
                text = "Overview: ",
                modifier = Modifier
                    .padding(8.dp),
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

@Preview
@Composable
fun MovieDetailScreenPreview() {
    MovieTimeTheme {
        Column {
            TopSection()
            BottomSection()
        }
    }
}
