package com.example.pdm0126.taller1_00081523

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    AndroidPediaApp()
                }
            }
        }
    }
}

@Composable
fun AndroidPediaApp() {
    var currentScreen by remember { mutableIntStateOf(0) }
    var currentIndex by remember { mutableIntStateOf(0) }
    var score by remember { mutableIntStateOf(0) }

    when (currentScreen) {
        0 -> WelcomeView(onStart = { currentScreen = 1 })
        1 -> QuizView(
            currentIndex = currentIndex,
            onAnswer = { isCorrect -> if (isCorrect) score++ },
            onNext = {
                if (currentIndex < quizQuestions.size - 1) currentIndex++
                else currentScreen = 2
            }
        )
        2 -> ResultView(score = score, onRestart = {
            currentScreen = 0
            currentIndex = 0
            score = 0
        })
    }
}

@Composable
fun WelcomeView(onStart: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("AndroidPedia", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        Text("¿Cuánto sabes de Android?", modifier = Modifier.padding(bottom = 24.dp))
        Text("Omar Ernesto Quintanilla Aguilar")
        Text("00112233", modifier = Modifier.padding(bottom = 24.dp))
        Button(onClick = onStart) { Text("Comenzar Quiz") }
    }
}

@Composable
fun QuizView(currentIndex: Int, onAnswer: (Boolean) -> Unit, onNext: () -> Unit) {
    val question = quizQuestions[currentIndex]
    var selectedOption by remember(currentIndex) { mutableStateOf<String?>(null) }
    val isAnswered = selectedOption != null

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Pregunta ${currentIndex + 1} de ${quizQuestions.size}", fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        Card(modifier = Modifier.fillMaxWidth()) {
            Text(question.question, modifier = Modifier.padding(16.dp), fontSize = 18.sp)
        }
        Spacer(modifier = Modifier.height(16.dp))

        question.options.forEach { option ->
            val color = when {
                !isAnswered -> ButtonDefaults.buttonColors().containerColor
                option == question.correctAnswer -> Color(0xFF4CAF50)
                option == selectedOption -> Color(0xFFF44336)
                else -> Color.LightGray
            }
            Button(
                onClick = { if (!isAnswered) { selectedOption = option; onAnswer(option == question.correctAnswer) } },
                colors = ButtonDefaults.buttonColors(containerColor = color, disabledContainerColor = color),
                enabled = !isAnswered,
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
            ) { Text(option) }
        }

        if (isAnswered) {
            Text("Dato: ${question.funFact}", modifier = Modifier.padding(top = 16.dp), textAlign = TextAlign.Center)
            Button(onClick = onNext, modifier = Modifier.align(Alignment.End)) {
                Text(if (currentIndex == quizQuestions.size - 1) "Resultados" else "Siguiente")
            }
        }
    }
}

@Composable
fun ResultView(score: Int, onRestart: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize(), Arrangement.Center, Alignment.CenterHorizontally) {
        Text("Resultado Final", fontSize = 28.sp)
        Text("Puntaje: $score de ${quizQuestions.size}", fontSize = 20.sp)
        Button(onClick = onRestart, modifier = Modifier.padding(top = 20.dp)) { Text("Reiniciar") }
    }
}