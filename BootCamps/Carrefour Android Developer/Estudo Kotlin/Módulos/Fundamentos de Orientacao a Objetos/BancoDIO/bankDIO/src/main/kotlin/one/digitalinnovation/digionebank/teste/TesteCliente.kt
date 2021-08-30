package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.TipoCliente

fun main(){
    val maria = Cliente(
        nome = "Maria da Graça",
        cpf = "4556565465",
        email = "mariadagraca2021@outlook.com",
        clienteTipo = TipoCliente.Pf,
        senha = "1232456")

    println(maria)
    TesteAutenticacao().autentica(maria)
}