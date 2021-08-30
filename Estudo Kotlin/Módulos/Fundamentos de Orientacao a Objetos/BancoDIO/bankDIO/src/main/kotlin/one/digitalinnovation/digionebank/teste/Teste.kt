package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Banco


fun main(){
    val digiOneBank = Banco(nome = "Digi", codigo = 23)

    println(digiOneBank.nome)
    println(digiOneBank.codigo)
}