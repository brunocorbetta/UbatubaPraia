package com.corbetta.ubatubapraias.data

import com.corbetta.ubatubapraias.R

data class Atrativo(
    val id: Int,
    val imagem: Int,
    val name: Int,
    val descricao: Int,
    val informacoes: Int
)

val todaspraias = listOf(
    Atrativo(
        id = 1,
        imagem = R.drawable.pa_01,
        name = R.string.pa_01,
        descricao = R.string.Dpa_01,
        informacoes = R.string.Ipa_01
    ),
    Atrativo(
            id = 2,
            imagem = R.drawable.pa_02,
            name = R.string.pa_02,
        descricao = R.string.Dpa_02,
        informacoes = R.string.Ipa_02
    ),
    Atrativo(
        id = 3,
        imagem = R.drawable.pa_03,
        name = R.string.pa_03,
        descricao = R.string.Dpa_03,
        informacoes = R.string.Ipa_03
    ),
    Atrativo(
        id = 4,
        imagem = R.drawable.pa_04,
        name = R.string.pa_04,
        descricao = R.string.Dpa_04,
        informacoes = R.string.Ipa_04
    ),
    Atrativo(
        id = 5,
        imagem = R.drawable.pa_05,
        name = R.string.pa_05,
        descricao = R.string.Dpa_05,
        informacoes = R.string.Ipa_05
    ),
    Atrativo(
        id = 6,
        imagem = R.drawable.pa_06,
        name = R.string.pa_06,
        descricao = R.string.Dpa_06,
        informacoes = R.string.Ipa_06
    ),
    Atrativo(
        id = 7,
        imagem = R.drawable.pa_07,
        name = R.string.pa_07,
        descricao = R.string.Dpa_07,
        informacoes = R.string.Ipa_07
    ),
    Atrativo(
        id = 8,
        imagem = R.drawable.pa_08,
        name = R.string.pa_08,
        descricao = R.string.Dpa_08,
        informacoes = R.string.Ipa_08
    )
)

val todascachoeiras = listOf(
    Atrativo(
        id = 9,
        imagem = R.drawable.ca_01,
        name = R.string.ca_01,
        descricao = R.string.Dca_01,
        informacoes = R.string.Ica_01
    ),
    Atrativo(
        id = 10,
        imagem = R.drawable.ca_02,
        name = R.string.ca_02,
        descricao = R.string.Dca_02,
        informacoes = R.string.Ica_02
    ),
    Atrativo(
        id = 11,
        imagem = R.drawable.ca_03,
        name = R.string.ca_03,
        descricao = R.string.Dca_03,
        informacoes = R.string.Ica_03
    ),
    Atrativo(
        id = 12,
        imagem = R.drawable.ca_04,
        name = R.string.ca_04,
        descricao = R.string.Dca_04,
        informacoes = R.string.Ica_04
    ),
    Atrativo(
        id = 13,
        imagem = R.drawable.ca_05,
        name = R.string.ca_05,
        descricao = R.string.Dca_05,
        informacoes = R.string.Ica_05
    ),
    Atrativo(
        id = 14,
        imagem = R.drawable.ca_06,
        name = R.string.ca_06,
        descricao = R.string.Dca_06,
        informacoes = R.string.Ica_06
    ),
    Atrativo(
        id = 15,
        imagem = R.drawable.ca_07,
        name = R.string.ca_07,
        descricao = R.string.Dca_07,
        informacoes = R.string.Ica_07
    ),
    Atrativo(
        id = 16,
        imagem = R.drawable.ca_08,
        name = R.string.ca_08,
        descricao = R.string.Dca_08,
        informacoes = R.string.Ica_08
    )
)

val todasAtracoes = listOf(
    Atrativo(
        id = 17,
        imagem = R.drawable.at_01,
        name = R.string.at_01,
        descricao = R.string.Dat_01,
        informacoes = R.string.Iat_01
    ),
    Atrativo(
        id = 18,
        imagem = R.drawable.at_02,
        name = R.string.at_02,
        descricao = R.string.Dat_02,
        informacoes = R.string.Iat_01
    ),
    Atrativo(
        id = 19,
        imagem = R.drawable.at_03,
        name = R.string.at_03,
        descricao = R.string.Dat_03,
        informacoes = R.string.Iat_01


    ),
    Atrativo(
        id = 20,
        imagem = R.drawable.at_04,
        name = R.string.at_04,
        descricao = R.string.Dat_04,
        informacoes = R.string.Iat_01
    ),
    Atrativo(
        id = 21,
        imagem = R.drawable.at_05,
        name = R.string.at_05,
        descricao = R.string.Dat_05,
        informacoes = R.string.Iat_01
    ),
    Atrativo(
        id = 22,
        imagem = R.drawable.at_06,
        name = R.string.at_06,
        descricao = R.string.Dat_06,
        informacoes = R.string.Iat_01
    ),
    Atrativo(
        id = 23,
        imagem = R.drawable.at_07,
        name = R.string.at_07,
        descricao = R.string.Dat_07,
        informacoes = R.string.Iat_01
    ),
    Atrativo(
        id = 24,
        imagem = R.drawable.at_08,
        name = R.string.at_08,
        descricao = R.string.Dat_08,
        informacoes = R.string.Iat_01
    )
)

val listafull = todaspraias + todascachoeiras + todasAtracoes


