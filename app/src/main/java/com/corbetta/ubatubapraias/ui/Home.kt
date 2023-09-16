package com.corbetta.ubatubapraias.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.corbetta.ubatubapraias.R
import com.corbetta.ubatubapraias.data.todasAtracoes
import com.corbetta.ubatubapraias.data.todascachoeiras
import com.corbetta.ubatubapraias.data.todaspraias
import com.corbetta.ubatubapraias.ui.theme.UbatubaPraiaTheme



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(modifier: Modifier = Modifier, homeViewModel : HomeViewModel = viewModel() ) {

val estadoDasCoisas by homeViewModel.coisasSelecionada.collectAsState()


    UbatubaPraiaTheme {

        Column(

            modifier = Modifier
                .background(color = MaterialTheme.colorScheme.surface)
        ) {


                CenterAlignedTopAppBar(
                    modifier = Modifier.background(MaterialTheme.colorScheme.primaryContainer),
                    title = {
                        Text(
                            text = "Ubatuba Paradise",
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,

                            )
                    }, navigationIcon = {
                        IconButton(
                            onClick = {}) {
                            Icon(
                                imageVector = Icons.Filled.Home,
                                contentDescription = null
                            )
                        }
                    },
                    actions = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.Favorite,
                                contentDescription = null
                            )
                        }
                    },

                )
            Spacer(modifier = Modifier
                .height(2.dp)
                .fillMaxWidth(1f)
                .background(color = MaterialTheme.colorScheme.primaryContainer))


        Row( modifier = Modifier
            .fillMaxWidth(1f)
            .padding(8.dp),
         horizontalArrangement = Arrangement.SpaceAround
        ) {
            Column(
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(id = R.drawable.pa_home),
                    contentDescription = "praias de Ubatuba",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(82.dp)

                        .padding(8.dp)
                        .clip(CircleShape)
                        .clickable {
                            homeViewModel.updatePraias()

                        }
                )
                Text(text = "Praias")
            }
            Column(
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(id = R.drawable.pa_caho),
                    contentDescription = "cachoeiras de Ubatuba",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(82.dp)

                        .padding(8.dp)
                        .clip(CircleShape)
                        .clickable {
                            homeViewModel.updateCachoeiraSelected()
                        }
                )
                Text(text = "Cachoeiras")
            }
            Column(
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(id = R.drawable.pa_atra),
                    contentDescription = "atrações de Ubatuba",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(82.dp)
                        .padding(8.dp)
                        .clip(CircleShape)
                        .clickable {
                            homeViewModel.updateAtracoesSelected()
                        }
                )
                Text(text = "Atrações")
            }
        }

            Spacer(modifier = Modifier
                .height(2.dp)
                .fillMaxWidth(1f)
                .background(color = MaterialTheme.colorScheme.primaryContainer))


            val itensDaLista = when {
                estadoDasCoisas.praiasSelecionadas.equals(true) -> todaspraias
                estadoDasCoisas.cachoeirasSelecionada.equals(true) -> todascachoeiras
                else -> todasAtracoes
            }

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
                .padding(vertical = 4.dp) ) {
                items(itensDaLista) { item ->
                    ListasDasCoisas(item.drawable, item.text, modifier.height(20.dp))
                }
            }


        }
    }
}



@Preview()
@Composable
fun HomeP(){
    Home()
}

