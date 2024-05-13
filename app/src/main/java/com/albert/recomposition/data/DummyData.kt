package com.albert.recomposition.data

import com.albert.recomposition.R
import com.albert.recomposition.model.AnimeList
import com.albert.recomposition.model.Character
import com.albert.recomposition.model.Enemies

object DummyData {
    val Character = listOf(
        Character(
            id = 1,
            name = "Tanjiro",
            technique = "Sun Breathing",
            photo = R.drawable.tanjiro
        ),
        Character(
            id = 2,
            name = "Zenitsu",
            technique = "Thunder Breathing",
            photo = R.drawable.zenitsu
        ),
        Character(
            id = 3,
            name = "Inosuke",
            technique = "Beast Breathing",
            photo = R.drawable.inosuke
        ),
        Character(
            id = 4,
            name = "Nezuko",
            technique = "Blood Demon Art",
            photo = R.drawable.nezuko
        ),
        Character(
            id = 5,
            name = "Tomioka",
            technique = "Water Breathing",
            photo = R.drawable.tomioka
        ),
        Character(
            id = 6,
            name = "Kyojuro",
            technique = "Fire Breathing",
            photo = R.drawable.kyojuro
        ),
        Character(
            id = 7,
            name = "Shinobu",
            technique = "Insect Breathing",
            photo = R.drawable.shinobu
        ),
        Character(
            id = 8,
            name = "Muichiro",
            technique = "Mist Breathing",
            photo = R.drawable.muichiro
        ),
        Character(
            id = 9,
            name = "Sanemi",
            technique = "Wind Breathing",
            photo = R.drawable.sanemi
        ),
        Character(
            id = 10,
            name = "Kanao",
            technique = "Insect Breathing",
            photo = R.drawable.kanao
        )
    )

    val Enemies = listOf(
        Enemies(
            id = 1,
            name = "Kokushibo",
            photo = R.drawable.kokushibo,
            rank = "Uppermoon 1",
        ),
        Enemies(
            id = 2,
            name = "Douma",
            photo = R.drawable.douma,
            rank = "Uppermoon 2",
        ),
        Enemies(
            id = 3,
            name = "Akaza",
            photo = R.drawable.akaza,
            rank = "Uppermoon 3",
        ),
        Enemies(
            id = 4,
            name = "Hantengu",
            photo = R.drawable.hantengu,
            rank = "Uppermoon 4",
        ),
        Enemies(
            id = 5,
            name = "Gyoko",
            photo = R.drawable.gyoko,
            rank = "Uppermoon 5",
        ),
        Enemies(
            id = 6,
            name = "Gyutaro",
            photo = R.drawable.gyutaro,
            rank = "Upermoon 6",
        ),
        Enemies(
            id = 7,
            name = "Daki",
            photo = R.drawable.daki,
            rank = "Uppermoon 6",
        ),
        Enemies(
            id = 8,
            name = "Kaigaku",
            photo = R.drawable.kaigaku,
            rank = "Uppermoon 6",
        ),
        Enemies(
            id = 9,
            name = "Enmu",
            photo = R.drawable.enmu,
            rank = "Lowermoon 1",
        ),
        Enemies(
            id = 10,
            name = "Rui",
            photo = R.drawable.rui,
            rank = "Lowermoon 5",
        )
    )

    val AnimeList = listOf(
        AnimeList(
            id = 1,
            title = "Jujutsu Kaisen",
            photo = R.drawable.jujutsu
        ),
        AnimeList(
            id = 2,
            title = "Haikyu",
            photo = R.drawable.haikyu
        ),
        AnimeList(
            id = 3,
            title = "Kuroko No Basket",
            photo = R.drawable.kuroko
        ),
        AnimeList(
            id = 4,
            title = "Solo Leveling",
            photo = R.drawable.sololeveling
        ),
        AnimeList(
            id = 5,
            title = "Tokyo Ghoul",
            photo = R.drawable.tokyoghoul
        ),
        AnimeList(
            id = 6,
            title = "Dr.Stone",
            photo = R.drawable.drstone
        ),
        AnimeList(
            id = 7,
            title = "Tsukimichi",
            photo = R.drawable.tsukimichi
        ),
        AnimeList(
            id = 8,
            title = "Naruto",
            photo = R.drawable.naruto
        ),
        AnimeList(
            id = 9,
            title = "Tokyo Revenger",
            photo = R.drawable.tokyorevenger
        ),
        AnimeList(
            id = 10,
            title = "Mushoku Tensei",
            photo = R.drawable.mushoku
        )
    )
}