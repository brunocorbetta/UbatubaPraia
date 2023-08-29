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
import androidx.compose.foundation.layout.Box



import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarScrollBehavior

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.corbetta.ubatubapraias.ui.theme.UbatubaPraiaTheme
import kotlin.math.round


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(modifier: Modifier = Modifier) {
    UbatubaPraiaTheme {

        Column(

            modifier = Modifier
                .background(color = MaterialTheme.colorScheme.onPrimary)
        ) {


                CenterAlignedTopAppBar(
                    modifier = Modifier.background(MaterialTheme.colorScheme.secondaryContainer),
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




                Image(painter = painterResource(id = R.drawable.pa_home),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(100.dp)
                        .shadow(36.dp, CircleShape)
                        .padding(8.dp)
                        .clip(CircleShape)
                        .align(CenterHorizontally)
                    )
            Spacer(modifier = Modifier .height(2.dp) .fillMaxWidth(1f) .background(color = MaterialTheme.colorScheme.primaryContainer))

            LazyColumn(modifier = modifier.padding(vertical = 4.dp) ) {
                items(todaspraias) { item -> Praias(item.drawable, item.text, modifier.height(20.dp))
                }
            }
        }
    }
}

    @Composable
    fun Praias(
        @DrawableRes drawable: Int,
        @StringRes text: Int,
        modifier: Modifier = Modifier
    ) {
        var expanded by remember { mutableStateOf(false) }

        Column {

            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 36.dp,
                ),
                        modifier = Modifier
                            .height(136.dp)
                            .padding(4.dp)
                            .animateContentSize(
                                animationSpec = spring(
                                    dampingRatio = Spring.DampingRatioMediumBouncy,
                                    stiffness = Spring.StiffnessLow

                                )
                            )
            ) {


                Box(



                ) {

                    Image(
                        painter = painterResource(drawable),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                expanded = !expanded
                            }



                    )
                    Text(
                        text = stringResource(text),
                        fontSize = 30.sp,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Clip,
                        fontStyle = FontStyle(12)

                    )

                }
            }

            if (expanded) {

                Text(
                    text = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old.",
                    //     color = Color.Black,
                    fontSize = 22.sp,
                    color = MaterialTheme.colorScheme.onBackground,
                )

            }
        }
    }


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

private data class DrawableStringPair(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)

@Preview()
@Composable
fun HomeP(){
    Home()
}

