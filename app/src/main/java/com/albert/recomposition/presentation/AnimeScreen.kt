package com.albert.recomposition.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.albert.recomposition.data.DummyData
import com.albert.recomposition.model.AnimeList
import com.albert.recomposition.presentation.component.CourseItem
import com.albert.recomposition.ui.theme.RecompositionTheme

@Composable
fun AnimeScreen(
    modifier: Modifier = Modifier,
    courses: List<AnimeList> = DummyData.AnimeList
) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        columns = GridCells.Adaptive(140.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(courses, key = { it.id }) {
            CourseItem(course = it)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CourseScreenPreview() {
    RecompositionTheme {
        AnimeScreen(courses = DummyData.AnimeList)
    }
}