package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Gerente

fun main(){

    val flavia = Gerente("Flavia Cardoso" , "4565567452" , "flaviacardoso21@gmail.com", 5800.00, "#kotlinDIO")
    imprimeDadosFuncionario(flavia)

    TesteAutenticacao().autentica(flavia)
}