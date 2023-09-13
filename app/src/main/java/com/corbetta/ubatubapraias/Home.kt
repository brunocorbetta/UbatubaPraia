package com.corbetta.ubatubapraias


import android.graphics.Color
import android.graphics.Paint
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box



import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.corbetta.ubatubapraias.ui.theme.UbatubaPraiaTheme



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(modifier: Modifier = Modifier) {


    var cachoeiraSelected by remember { mutableStateOf(false) }
    var atracoesSelected by remember { mutableStateOf(false) }

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
                        .clickable { cachoeiraSelected = false
                                    atracoesSelected = false}
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
                        .clickable { cachoeiraSelected = true
                                     atracoesSelected = false}
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
                        .clickable { cachoeiraSelected = false
                        atracoesSelected= true}
                )
                Text(text = "Atrações")
            }
        }



            Spacer(modifier = Modifier
                .height(2.dp)
                .fillMaxWidth(1f)
                .background(color = MaterialTheme.colorScheme.primaryContainer))

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
                .padding(vertical = 4.dp) ) {

                val itemsToShow = when {
                    cachoeiraSelected -> todascachoeiras
                    atracoesSelected -> todasAtracoes
                    else -> todaspraias
                }
                items(itemsToShow) { item ->
                    ListasDasCoisas(item.drawable, item.text, modifier.height(20.dp))
                }
            }


        }
    }
}



private data class DrawableStringPair(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)

private val todaspraias = listOf(
    R.drawable.pa_01 to R.string.pa_01,
    R.drawable.pa_02 to R.string.pa_02,
    R.drawable.pa_03 to R.string.pa_03,
    R.drawable.pa_04 to R.string.pa_04,
    R.drawable.pa_05 to R.string.pa_05,
    R.drawable.pa_06 to R.string.pa_06,
    R.drawable.pa_07 to R.string.pa_07,
    R.drawable.pa_08 to R.string.pa_08,
).map { DrawableStringPair(it.first, it.second) }

private val todascachoeiras = listOf(
    R.drawable.ca_01 to R.string.ca_01,
    R.drawable.ca_02 to R.string.ca_02,
    R.drawable.ca_03 to R.string.ca_03,
    R.drawable.ca_04 to R.string.ca_04,
    R.drawable.ca_05 to R.string.ca_05,
    R.drawable.ca_06 to R.string.ca_06,
    R.drawable.ca_07 to R.string.ca_07,
    R.drawable.ca_08 to R.string.ca_08,
).map { DrawableStringPair(it.first, it.second) }

private val todasAtracoes = listOf(
    R.drawable.at_01 to R.string.at_01,
    R.drawable.at_02 to R.string.at_02,
    R.drawable.at_03 to R.string.at_03,
    R.drawable.at_04 to R.string.at_04,
    R.drawable.at_05 to R.string.at_05,
    R.drawable.at_06 to R.string.at_06,
    R.drawable.at_07 to R.string.at_07,
    R.drawable.at_08 to R.string.at_08,
).map { DrawableStringPair(it.first, it.second) }

@Preview()
@Composable
fun HomeP(){
    Home()
}

