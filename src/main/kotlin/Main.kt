import java.io.File

fun main() {

    var file: File = File("C:\\Users\\usuarioT\\Desktop\\fnf\\input.txt")
    var contador: Int = 0;
    val listaNumeros = mutableListOf<Int>()

    file.forEachLine { listaNumeros.add(it.toInt()) }
    listaNumeros.forEach {if (it>it.previous()) {contador++} }
    println(contador)

}