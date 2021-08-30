package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    nome :String,
    cpf: String,
    email: String,
    val salario: BigDecimal,
) : Pessoa(nome, email, cpf) {
    abstract fun calculaBonus();
}