package com.corbetta.ubatubapraias.data

import com.corbetta.ubatubapraias.R

data class Atrativo(
    val id: Int,
    val imagem: Int,
    val name: Int
)

val todaspraias = listOf(
    Atrativo(
        id = 1,
        imagem = R.drawable.pa_01,
        name = R.string.pa_01
    ),
    Atrativo(
            id = 2,
            imagem = R.drawable.pa_02,
            name = R.string.pa_02
    ),
    Atrativo(
        id = 3,
        imagem = R.drawable.pa_03,
        name = R.string.pa_03
    ),
    Atrativo(
        id = 4,
        imagem = R.drawable.pa_04,
        name = R.string.pa_04
    ),
    Atrativo(
        id = 5,
        imagem = R.drawable.pa_05,
        name = R.string.pa_05
    ),
    Atrativo(
        id = 6,
        imagem = R.drawable.pa_06,
        name = R.string.pa_06
    ),
    Atrativo(
        id = 7,
        imagem = R.drawable.pa_07,
        name = R.string.pa_07
    ),
    Atrativo(
        id = 8,
        imagem = R.drawable.pa_08,
        name = R.string.pa_08
    )
)

val todascachoeiras = listOf(
    Atrativo(
        id = 9,
        imagem = R.drawable.ca_01,
        name = R.string.ca_01
    ),
    Atrativo(
        id = 10,
        imagem = R.drawable.ca_02,
        name = R.string.ca_02
    ),
    Atrativo(
        id = 11,
        imagem = R.drawable.ca_03,
        name = R.string.ca_03
    ),
    Atrativo(
        id = 12,
        imagem = R.drawable.ca_04,
        name = R.string.ca_04
    ),
    Atrativo(
        id = 13,
        imagem = R.drawable.ca_05,
        name = R.string.ca_05
    ),
    Atrativo(
        id = 14,
        imagem = R.drawable.ca_06,
        name = R.string.ca_06
    ),
    Atrativo(
        id = 15,
        imagem = R.drawable.ca_07,
        name = R.string.ca_07
    ),
    Atrativo(
        id = 16,
        imagem = R.drawable.ca_08,
        name = R.string.ca_08
    )
)

val todasAtracoes = listOf(
    Atrativo(
        id = 17,
        imagem = R.drawable.at_01,
        name = R.string.at_01
    ),
    Atrativo(
        id = 18,
        imagem = R.drawable.at_02,
        name = R.string.at_02
    ),
    Atrativo(
        id = 19,
        imagem = R.drawable.at_03,
        name = R.string.at_03
    ),
    Atrativo(
        id = 20,
        imagem = R.drawable.at_04,
        name = R.string.at_04
    ),
    Atrativo(
        id = 21,
        imagem = R.drawable.at_05,
        name = R.string.at_05
    ),
    Atrativo(
        id = 22,
        imagem = R.drawable.at_06,
        name = R.string.at_06
    ),
    Atrativo(
        id = 23,
        imagem = R.drawable.at_07,
        name = R.string.at_07
    ),
    Atrativo(
        id = 24,
        imagem = R.drawable.at_08,
        name = R.string.at_08
    )
)




// val todaspraias = listOf(
//    R.drawable.pa_01 to R.string.pa_01,
//    R.drawable.pa_02 to R.string.pa_02,
//    R.drawable.pa_03 to R.string.pa_03,
//    R.drawable.pa_04 to R.string.pa_04,
//    R.drawable.pa_05 to R.string.pa_05,
//    R.drawable.pa_06 to R.string.pa_06,
//    R.drawable.pa_07 to R.string.pa_07,
//    R.drawable.pa_08 to R.string.pa_08,
//).map { DrawableStringPair(it.first, it.second) }

// val todascachoeiras = listOf(
//    R.drawable.ca_01 to R.string.ca_01,
//    R.drawable.ca_02 to R.string.ca_02,
//    R.drawable.ca_03 to R.string.ca_03,
//    R.drawable.ca_04 to R.string.ca_04,
//    R.drawable.ca_05 to R.string.ca_05,
//    R.drawable.ca_06 to R.string.ca_06,
//    R.drawable.ca_07 to R.string.ca_07,
//    R.drawable.ca_08 to R.string.ca_08,
//).map { DrawableStringPair(it.first, it.second) }

//val todasAtracoes = listOf(
//    R.drawable.at_01 to R.string.at_01,
//    R.drawable.at_02 to R.string.at_02,
//    R.drawable.at_03 to R.string.at_03,
//    R.drawable.at_04 to R.string.at_04,
//    R.drawable.at_05 to R.string.at_05,
//    R.drawable.at_06 to R.string.at_06,
//    R.drawable.at_07 to R.string.at_07,
//    R.drawable.at_08 to R.string.at_08,
//).map { DrawableStringPair(it.first, it.second) }