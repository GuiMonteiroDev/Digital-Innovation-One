package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Conta {
    val agencia:String = "1453",
    val contacorr:String = "146635",
    val digito:String = "x",

    val saldo:BigDecimal
}

fun deposito(valor:BigDecimal){}

fun saque(valor:BigDecimal){}