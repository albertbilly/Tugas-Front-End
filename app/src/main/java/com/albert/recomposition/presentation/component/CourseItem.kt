package com.albert.recomposition.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.albert.recomposition.R
import com.albert.recomposition.model.AnimeList
import com.albert.recomposition.ui.theme.RecompositionTheme

@Composable
fun CourseItem(
    course: AnimeList,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = course.photo),
            contentDescription = course.title,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = course.title,
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.fillMaxWidth()
        )
            }
    }

@Preview
@Composable
private fun CourseItemPreview() {
    RecompositionTheme {
        CourseItem(
            course = AnimeList(
                1,
                "Jujutsu Kaisen",
                R.drawable.jujutsu,
            )
        )
    }
}