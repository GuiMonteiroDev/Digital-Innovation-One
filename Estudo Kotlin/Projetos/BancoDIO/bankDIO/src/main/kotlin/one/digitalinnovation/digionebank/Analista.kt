package one.digitalinnovation.digionebank

class Analista(nome: String,
               cpf: String,
               email: String,
               salario: Double)

    : Funcionario(nome, cpf, email, salario){
    override fun calculaBonus() = salario * 0.1
}