package one.digitalinnovation.collection
// criar um IntArray
fun main() {
    val values = IntArray(5) //tem 5 posiçoes

    values[0] = 1 // todas as posições
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2
  for (valor in values) { //para ver os valores usamos o "for" (valor "variaveis" in values "meu array")
      println(valor)
  }
    values.forEach {
        println(it)//ele esta usando o recurso de lambda, o Each faz o papel do nosso valor
    }

    values.forEach { valor ->
        println(valor)
            } // tambem pode ser impresso assim, mas perde o recurso do (it)


    for (index in values.indices) {
        println(values[index])
    } //outra opçao, intermaos sobre os indices do nosso array, nao estamos interados no valor contido em cada indice.

    println("__________________________")
    values.sort() //antes de iniciar a impressão, chamamos um recurso antes do array e ele coloca do menor ao maior
    for (valor in values) {
        println(valor)
    }

}