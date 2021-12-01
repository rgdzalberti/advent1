import java.io.File

fun main() {

    var file: File = File("C:\\Users\\Ricar\\Desktop\\Nueva carpeta\\input.txt")
    var contador: Int = 0;
    var contador2: Int = 1;
    var resultado: Int = 0
    val listaNumeros = mutableListOf<Int>()

    file.forEachLine { listaNumeros.add(it.toInt()) }
    try { for (i in 0..listaNumeros.size) { if (listaNumeros[contador] < listaNumeros[contador2]) { contador++;contador2++;resultado++ } else { contador++;contador2++ } } }
    catch (e: IndexOutOfBoundsException) { println(resultado) }
}