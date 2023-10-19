package com.corbetta.ubatubapraias.ui




import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import com.corbetta.ubatubapraias.ui.states.IdUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


class InformacoesViewModel(): ViewModel( ) {


    private var _itemselecionado =  MutableStateFlow(1)
    //private var _itemselecionado =  MutableStateFlow(IdUiState())
    //val itemselecionado: StateFlow<IdUiState> = _itemselecionado.asStateFlow()
    val itemselecionado: StateFlow<Int> = _itemselecionado.asStateFlow()





    fun onItemClick(itemId: Int) {
        _itemselecionado.value = itemId
    }
//        _itemselecionado.update { idUiState ->
//            idUiState.copy(
//                id = itemId
//            )
//        }
//
//    }
}
