package com.corbetta.ubatubapraias.ui

import androidx.lifecycle.ViewModel
import com.corbetta.ubatubapraias.ui.states.CoisasUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class HomeViewModel : ViewModel() {

    private val _coisaSelecionada = MutableStateFlow(CoisasUiState())
    val coisasSelecionada: StateFlow<CoisasUiState> = _coisaSelecionada.asStateFlow()



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
//    private val _cachoeiraSelected = mutableStateOf(false)
//    val cachoeiraSelected get() = _cachoeiraSelected
//
//    private val _atracoesSelected = mutableStateOf(false)
//    val atracoesSelected get() = _atracoesSelected
//
//    // Funções para atualizar o estado.
//    fun updateCachoeiraSelected(selected: Boolean) {
//        _cachoeiraSelected.value = selected
//    }
//
//    fun updateAtracoesSelected(selected: Boolean) {
//        _atracoesSelected.value = selected
//    }
