package com.albert.recomposition.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.albert.recomposition.data.DummyData
import com.albert.recomposition.model.Character
import com.albert.recomposition.model.Enemies
import com.albert.recomposition.navigation.Screen
import com.albert.recomposition.presentation.component.CharacterItem
import com.albert.recomposition.presentation.component.EnemiesItem

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    character: List<Character> = DummyData.Character,
    enemies: List<Enemies> = DummyData.Enemies,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
            ) {
                items(character, key = { it.id }) {
                    CharacterItem(character = it) { characterId ->
                        navController.navigate(Screen.Character.route + "/$characterId")
                    }
                }
            }
        }
        items(enemies, key = { it.id }) {
            EnemiesItem(enemies = it) { enemiesId ->
                navController.navigate(Screen.Enemies.route + "/$enemiesId")
            }
        }
    }
}
