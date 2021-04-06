package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("_____________________") //filtros de salario
    println("Maior salario: ${salarios.max()}") //esta expressao esta depreciada o correto seria usar "maxOrNull"
    println("Menor salario: ${salarios.min()}") // tbm depreciado, o correto seria "minOrNull"
    println("Media salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500 }
    println("__________")
    salariosMaiorQue2500.forEach { println(it) }

    println("_____________________") //quantos salarios esta entre range ou entre dois valores
    println(salarios.count { it in 2000.0..5000.0}) // uma expressao para contar quando é verdade. o Range vai de 2000 a 5000


    println("_____________________") //imprimir igual a 2250 filtro saber um valor especifico
    println(salarios.find { it in 2000.0..5000.0})

    println("_____________________") //este server para saber um valor especico
    println(salarios.find { it == 2250.0})
    println(salarios.find { it == 5000.0}) //neste caso ele nao achou, assim imprimiu null

    println("_____________________")  //"any" ele encontrar a expressao em qual o elemento seja verdadeira
    println(salarios.any { it == 1000.0})
    println(salarios.any { it == 500.0})




}