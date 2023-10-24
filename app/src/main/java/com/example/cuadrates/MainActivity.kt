package com.example.cuadrates

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cuadrates.ui.theme.CuadratesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadratesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .weight(1f)
        ) {
            Cuadrante(
                modifier = Modifier
                    .weight(1f),
                color = colorResource(id = R.color.purple_200),
                titulo = stringResource(id = R.string.titulo_1),
                cuerpo = stringResource(id = R.string.cuerpo_1),
                icon = Icons.Filled.Call
            )
            Cuadrante(
                modifier = Modifier
                    .weight(1f),
                color = colorResource(id = R.color.purple_500),
                titulo = stringResource(id = R.string.titulo_2),
                cuerpo = stringResource(id = R.string.cuerpo_2),
                icon = Icons.Filled.MailOutline
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .weight(1f)
        ) {
            Cuadrante(
                modifier = Modifier
                    .weight(1f),
                color = colorResource(id = R.color.purple_500),
                titulo = stringResource(id = R.string.titulo_3),
                cuerpo = stringResource(id = R.string.cuerpo_3),
                icon = Icons.Filled.AccountBox
            )
            Cuadrante(
                modifier = Modifier
                    .weight(1f),
                color = colorResource(id = R.color.purple_200),
                titulo = stringResource(id = R.string.titulo_4),
                cuerpo = stringResource(id = R.string.cuerpo_4),
                icon = Icons.Filled.Info
            )
        }
    }
}

@Composable
fun Cuadrante(
    color: Color,
    titulo: String,
    cuerpo: String,
    icon: ImageVector,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = color)
            .padding(all = 12.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon (
            imageVector = icon,
            contentDescription = "Icono",
            tint = Color.White,
            modifier = Modifier
                .size(45.dp)

        )
        Text(
            text = titulo,
            fontSize = 22.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            text = cuerpo,
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(
    showSystemUi = true,
    name = "Pantalla Principal"
)

@Composable
fun AppPreview() {
    App()
}

