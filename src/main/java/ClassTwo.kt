package LearningKotlin
import LearningKotlin.Usuario
import LearningKotlin.meuArray

fun main(args: Array<String>) {

   Usuario("Hecton", 31)

    var arr = meuArray()

    for (item in arr.){
        print(item)

    }

}