import java.io.File

val listaNumeros = mutableListOf<Int>()
val TriplelistaNumeros = mutableListOf<Int>()
val newList = mutableListOf<Int>()

fun Incremento(listaNumeros: List<Int>): Int{
    var resultado = 0;
    try {for (i in 0..listaNumeros.size) { if (listaNumeros[i] < listaNumeros[i + 1]) {resultado++}  } } catch (e: IndexOutOfBoundsException) { }
    return resultado
}


fun main() {

    var file: File = File("C:\\Users\\Ricar\\Desktop\\Nueva carpeta\\input.txt")


    file.forEachLine { listaNumeros.add(it.toInt())}
    file.forEachLine { TriplelistaNumeros.add(it.toInt())}

    println(Incremento(listaNumeros))

    try { for (i in 0..TriplelistaNumeros.size) { val value = TriplelistaNumeros[i] + TriplelistaNumeros[i + 1] + TriplelistaNumeros[i + 2]; newList.add(value)} } catch (e: IndexOutOfBoundsException) { }
    println(Incremento(newList))





}