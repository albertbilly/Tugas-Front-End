package com.albert.recomposition.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Anime: Screen("animelist")
    data object About: Screen("about")
    data object Character: Screen("detail_character")
    data object Enemies: Screen("detail_enemies")
}