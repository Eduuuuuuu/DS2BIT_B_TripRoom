package br.senai.sp.jandira.imc3

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imc3.ui.theme.IMC3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IMC3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(color = Color(0xFFEC165B))
        ){
            Image(
                modifier = Modifier
                    .height(70.dp)
                    .padding(top = 10.dp),
                painter = painterResource(id = R.drawable.imc),
                contentDescription = ""
            )
            Text(
                text = "Calculadora IMC",
                color = Color.White,
                fontSize = 28.sp,
                modifier = Modifier
                    .padding(15.dp)
            )
        }
        Card(
            modifier = Modifier
                .width(280.dp)
                .height(382.dp)
                .offset(x = 60.dp, y = -36.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFE9E7E7)),
            elevation = CardDefaults.cardElevation(8.dp)
        ) {
            Text(
                text = "Seus dados",
                color = Color(0xFFEC165B),
                fontSize = 24.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .offset(x = 70.dp, y = 40.dp)
            )
            Text(
                text = "Seu peso:",
                color = Color(0xFFEC165B),
                fontSize = 15.sp,
                modifier = Modifier
                    .offset(x = 24.dp, y = 60.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .width(230.dp)
                    .height(50.dp)
                    .offset(x = 25.dp, y = 70.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xFFEC165B),
                    unfocusedTextColor = Color(0xFFAFA9A9),
                    focusedTextColor = Color(0xFFAFA9A9)
                ),
                placeholder = {
                    Text(
                        text = "Seu peso em Kg",
                        fontSize = 12.sp
                    )
                }
            )
            Spacer(modifier = Modifier
                .height(90.dp)
            )
            Text(
                text = "Sua altura:",
                color = Color(0xFFEC165B),
                fontSize = 15.sp,
                modifier = Modifier
                    .offset(x = 25.dp, y = 0.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .width(230.dp)
                    .height(50.dp)
                    .offset(x = 25.dp, y = 10.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xFFEC165B),
                    unfocusedTextColor = Color(0xFFAFA9A9),
                    focusedTextColor = Color(0xFFAFA9A9)
                ),
                placeholder = {
                    Text(
                        text = "Sua altura em cm",
                        fontSize = 12.sp
                    )
                }
            )
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .width(230.dp)
                    .height(50.dp)
                    .offset(x = 25.dp, y = 45.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEC165B))
            ) {
                Text(
                    text = "CALCULAR",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 15.sp
                )
            }
        }
        Card(
            modifier = Modifier
                .width(280.dp)
                .height(97.dp)
                .offset(x = 60.dp, y = -10.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFF329F6B)),
            border = BorderStroke(width = 1.dp, color = Color(0xFFEC165B)),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Text(
                text = "Resultado",
                color = Color.White,
                fontSize = 14.sp,
                modifier = Modifier
                    .offset(x = 33.dp, y = 25.dp)
            )
            Text(
                text = "Peso Ideal",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier
                    .offset(x = 18.dp, y = 28.dp)
            )
            Text(
                text = "21.3",
                color = Color.White,
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .offset(x = 170.dp, y = -16.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    IMC3Theme {
        Greeting()
    }
}