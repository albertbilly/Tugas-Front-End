package com.albert.recomposition.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.albert.recomposition.R
import com.albert.recomposition.model.Enemies
import com.albert.recomposition.ui.theme.RecompositionTheme

@Composable
fun EnemiesItem(
    enemies: Enemies,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .clickable {
                onItemClicked(enemies.id)
            }
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = enemies.photo),
            contentDescription = enemies.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = enemies.name, style = MaterialTheme.typography.titleMedium)
            Row {
                Text(text = enemies.rank, color = MaterialTheme.colorScheme.primary)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun EnemiesItemHorizontalPreview() {
    RecompositionTheme {
        EnemiesItem(
            enemies = Enemies(1, "Kokushibo", rank = "Uppermoon 1", photo = R.drawable.kokushibo),
            onItemClicked = { enemiesId ->
                println("Enemies Id : $enemiesId")
            }
        )
    }
}