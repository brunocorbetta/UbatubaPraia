package com.corbetta.ubatubapraias.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.corbetta.ubatubapraias.R
import com.corbetta.ubatubapraias.data.listafull
import com.corbetta.ubatubapraias.ui.theme.UbatubaPraiaTheme

@Composable
fun Informacoes(
    navController: NavHostController,
    id: String?,
    modifier: Modifier = Modifier
    ) {
val Id = id?.toInt()



    fun findImageById(id: Int?): Int {
        val atrativo = listafull.find { it.id == id }
        return atrativo?.imagem ?: R.drawable.pa_01
    }

    val name = listafull[Id!! -1].name
    val descricao = listafull[Id -1].descricao
    val informacoes = listafull[Id -1].informacoes

    UbatubaPraiaTheme {

        Column(
            modifier = modifier
                .background(color = MaterialTheme.colorScheme.surface)
                .padding(6.dp)
                .fillMaxHeight()

        )
        {
            ElevatedCard(
                elevation = CardDefaults.cardElevation(

                    hoveredElevation = 52.dp
                ),
                modifier = modifier
                    .height(260.dp)
            ) {


                Box(

                ) {


                    Image(
                        painter = painterResource(findImageById(Id)),
                        contentDescription = "Informações",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()


                    )

                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(
                            Icons.Outlined.ArrowBack, contentDescription = null,
                            tint = Color.Black,
                            modifier = Modifier.size(26.dp)


                        )
                    }
                }
            }

            Spacer(
                modifier = modifier
                    .height(2.dp)
                    .fillMaxWidth(1f)
                    .padding(4.dp)
                    .background(color = MaterialTheme.colorScheme.primaryContainer)
            )

            Column(
            ) {

                Text(
                    text = stringResource(id = name),
                    fontSize = 38.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(top = 22.dp)

                )


                Text(
                    text = stringResource(id = descricao),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .padding(top = 12.dp, start = 4.dp, end = 4.dp)
                )

                Spacer(
                    modifier = modifier
                        .height(2.dp)
                        .fillMaxWidth(1f)
                        .padding(4.dp)
                        .background(color = MaterialTheme.colorScheme.primaryContainer)
                )

                Text(
                    text = "Informaçoes Impostantes!",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(top = 12.dp, end = 8.dp)

                )

                Text(
                    text = stringResource(id = informacoes),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .padding(top = 8.dp)
                )

            }
        }
    }
}

