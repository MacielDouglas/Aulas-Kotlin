package one.digitalinnovation.collection

fun main(){
    val nomes = Array(3) {""} //uma maneira menos verbosa
    nomes[0] = "Maria"
    nomes[1] = "Zaza"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    println("______________________") //imprime de maneira ordenada
    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Maria", "Pedro", "Carlos")
    nomes2.sort()
    nomes2.forEach { println(it) }
}