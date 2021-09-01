package exercicio.exercicio1KotlinDio

import kotlin.math.pow

fun main(){
    print("Entrada: ")
    val input = 1..(readLine() ?:return).toInt()
    println("Saída: ")
    input.forEach{
        println("$it ${(it.toDouble().pow(2)).toInt()} ${(it.toDouble().pow(3).toInt())}")
        println("$it ${(it.toDouble().pow(2).toInt() + 1)} ${(it.toDouble().pow(3).toInt() + 1)}")
    }
}