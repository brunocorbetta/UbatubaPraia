package com.corbetta.ubatubapraias.ui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.input.key.Key.Companion.T
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModel
import com.corbetta.ubatubapraias.ui.states.CoisasUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.drop
import kotlinx.coroutines.flow.update

class HomeViewModel : ViewModel() {

    private val _coisaSelecionada = MutableStateFlow(CoisasUiState())
    val coisasSelecionada: StateFlow<CoisasUiState> = _coisaSelecionada.asStateFlow()

   private  var _itemselecionado: MutableState<Int> = mutableStateOf(6)
    var itemselecionado: Int = _itemselecionado.value

    

    fun onItemClick(itemId: Int) {
         _itemselecionado.value = itemId
    }

    fun updatePraias() {
        _coisaSelecionada.update {
                coisasUiState -> coisasUiState.copy(
            cachoeirasSelecionada = false,
            atracoesSelecionadas = false,
            praiasSelecionadas = true
        )
        }
        }


    // Funções para atualizar o estado.
    fun updateCachoeiraSelected() {
        _coisaSelecionada.update {
            coisasUiState -> coisasUiState.copy(
                cachoeirasSelecionada = true,
                atracoesSelecionadas = false,
                praiasSelecionadas = false
            )
        }

    }

    fun updateAtracoesSelected() {
        _coisaSelecionada.update {
                coisasUiState -> coisasUiState.copy(
            cachoeirasSelecionada = false,
            atracoesSelecionadas = true,
            praiasSelecionadas = false
        )
        }
    }


}

