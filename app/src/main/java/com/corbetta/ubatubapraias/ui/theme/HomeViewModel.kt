package com.corbetta.ubatubapraias.ui.theme

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _cachoeiraSelected = mutableStateOf(false)
    val cachoeiraSelected get() = _cachoeiraSelected

    private val _atracoesSelected = mutableStateOf(false)
    val atracoesSelected get() = _atracoesSelected

    // Funções para atualizar o estado.
    fun updateCachoeiraSelected(selected: Boolean) {
        _cachoeiraSelected.value = selected
    }

    fun updateAtracoesSelected(selected: Boolean) {
        _atracoesSelected.value = selected
    }
}