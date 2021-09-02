package exercicio.exercicio3KotlinDio

fun main() {

    fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')

    val renda = readLine()!!.toFloat()
    var imposto = 0.0
    val dif: Double

    //se a renda ultrapassar os R$3000,00, sera cobrado 8% sobre o excedente de R$2000,00, 18% sobre o excedente de R$3000,00 e 28% sobre o excedente de R$4500,00
    if(renda > 4500){
        imposto = ((1000 * 0.08) + (1500 * 0.18))
        dif = (renda - 4500.00)
        imposto += dif * 0.28
    }
    //se a renda ultrapassar os R$3000,00, sera cobrado 8% sobre o excedente de R$2000,00 e 18% sobre o excedente de R$3000,00
     else if (renda > 3000.00){
            imposto = 1000 * 0.08
            dif = renda - 3000.00
            imposto += dif * 0.18
    }
    //se a renda ultrapassar os R$2000,00, sera cobrado 8% sobre o excedente de R$2000,00
    else if (renda > 2000.00){
        dif = (renda - 2000.00)
        imposto = dif * 0.08
    }
    //se a renda for menor que R$2000.00, sera isento de impostos
    if (imposto == 0.0) println("Isento") else println("R$ ${imposto.format(2)}")
}