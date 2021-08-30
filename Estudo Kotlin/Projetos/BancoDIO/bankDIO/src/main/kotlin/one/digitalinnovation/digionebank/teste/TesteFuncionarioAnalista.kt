package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main(){

    val cleitin = Analista("Cleiton Martinez" , "1231231232" , "cleitinmartinez@gmail.com", 2000.00)
    imprimeDadosFuncionario(cleitin)
}

fun imprimeDadosFuncionario(funcionario: Funcionario) = println(funcionario.toString())