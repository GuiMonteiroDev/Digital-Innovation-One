package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Guilherme"
    var email:String = "guimontero.rodrigues@gmail.com"
    var cpf:String  = "456.598.678-71"
    private set

    constructor()

    fun uneInfos() = "$nome, $email, $cpf"
}

fun main(){
    val cliente = Pessoa()
    println(cliente.uneInfos())
}