package one.digitalinnovation.digionebank

abstract class Funcionario(
    nome :String,
    cpf: String,
    email: String,
    val salario: Double,
) : Pessoa(nome, email, cpf) {
    protected abstract fun calculaBonus(): Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salario: $salario
        Auxilio: ${calculaBonus()}
    """.trimIndent()
}