package com.example.mymoviewapp.compose

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mymoviewapp.R
import com.example.mymoviewapp.ui.theme.MovieTimeTheme

@Composable
fun MovieItem(
    @DrawableRes drawable: Int,
    @StringRes title: Int,
    modifier: Modifier = Modifier
) {
    Surface(
        shape = MaterialTheme.shapes.small,
        modifier = Modifier
    ) {
        Row(
            modifier = Modifier.width(192.dp)
                .padding(8.dp)
        ) {
            Image(
                painterResource(id = R.drawable.ab1_inversions),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(56.dp)
            )
            Column {
                Text(
                    stringResource(id = R.string.ab1_inversions),
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(horizontal = 8.dp)
                )
                Text(
                    stringResource(id = R.string.ab1_inversions),
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(horizontal = 8.dp)
                )
            }
        }
    }

}

@Preview
@Composable
fun MovieItemPreview() {
    MovieTimeTheme {
        MovieItem(R.drawable.ab1_inversions, R.string.ab1_inversions)
    }
}