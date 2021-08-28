package one.digitalinnovation.digionebank

class Pessoa {
    val nome:String = "Guilherme"
    val cpf:String  = "456.598.678.71"
    val email:String = "guimontero.rodrigues@gmail.com"
}

fun main(){
    var cliente = Pessoa()
    println(cliente.nome)
    println(cliente.cpf)
    println(cliente.email)
}