package com.corbetta.ubatubapraias.data

import com.corbetta.ubatubapraias.R

data class Lugares (
    val id: Int,
    val imagem: Int,
    val titulo: String,
    val descricao: String,
    val informacoes: String
)

val Praia = listOf(
    Lugares(
        id = 0,
        imagem = R.drawable.at_01,
        titulo = "Praia Dura",
        descricao = "Praia Bonita",
        informacoes = "Perigo"
    )
)