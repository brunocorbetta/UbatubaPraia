package com.corbetta.ubatubapraias.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.corbetta.ubatubapraias.R
import com.corbetta.ubatubapraias.ui.theme.UbatubaPraiaTheme

@Composable
fun Informacoes(
    onclickVolta: () -> Unit = {},
    modifier: Modifier = Modifier) {

    UbatubaPraiaTheme {

        Column(modifier = Modifier
            .background(color = MaterialTheme.colorScheme.surface)
            .padding(6.dp)
            .fillMaxHeight()
        )
        {

        ElevatedCard(
            elevation = CardDefaults.cardElevation(

                hoveredElevation = 52.dp
            ),
            modifier = Modifier
                .height(260.dp)
        ) {


            Box(

            ) {

                Image(
                    painter = painterResource(id = R.drawable.pa_01),
                    contentDescription = "Informações",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()

                )
                IconButton(onClick = {
                    onclickVolta()
                }) {
                    Icon(Icons.Outlined.ArrowBack, contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(26.dp)


                        )
                }
            }
        }
            Spacer(modifier = Modifier
                .height(2.dp)
                .fillMaxWidth(1f)
                .padding(4.dp)
                .background(color = MaterialTheme.colorScheme.primaryContainer))

            Column(
            ) {

                    Text(text = "Praia Dura",
                        fontSize = 38.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 22.dp)

                    )


                Text(text = "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic",
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(top = 12.dp, start = 4.dp, end = 4.dp)
                    )

                Spacer(modifier = Modifier
                    .height(2.dp)
                    .fillMaxWidth(1f)
                    .padding(4.dp)
                    .background(color = MaterialTheme.colorScheme.primaryContainer))

                Text(text = "Informações Importantes",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 12.dp, end = 8.dp)

                )

                Text(text = "Não Tem Quisosques e nem restaurante perto",
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(top = 8.dp)
                    )

            }
        }
    }
}

@Preview()
@Composable
fun infoTela(){
    Informacoes()
}