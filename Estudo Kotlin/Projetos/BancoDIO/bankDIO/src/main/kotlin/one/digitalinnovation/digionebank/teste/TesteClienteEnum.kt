package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.TipoCliente

fun main() {
    TipoCliente.values().forEach { elemento ->
    println("${elemento.name} - ${elemento.descricao}")
    }
}