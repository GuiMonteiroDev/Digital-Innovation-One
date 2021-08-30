package one.digitalinnovation.digionebank

class Cliente(nome: String,
              email: String,
              cpf: String,
              val clienteTipo: TipoCliente,
              val senha: String)

    : Pessoa(nome, email, cpf, ), Acesso  {
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Email: $email
        Cliente: ${TipoCliente.Pf.descricao}
    """.trimIndent()
}