package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    email: String,
    salario: Double,
    val senha: String)

    : Funcionario(nome = nome, cpf = cpf, email = email, salario = salario), Acesso {
    override fun calculaBonus(): Double = salario * 0.4
    override fun login(): Boolean = "#kotlinDIO" == senha
}