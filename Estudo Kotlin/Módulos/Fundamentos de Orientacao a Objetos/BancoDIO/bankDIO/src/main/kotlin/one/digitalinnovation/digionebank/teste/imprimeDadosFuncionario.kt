package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Funcionario

class imprimeDadosFuncionario{
    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}