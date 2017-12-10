fun ClousureMaker(): () -> Unit {
    var num = 0
    return { println(num++)}
}

fun main(args: Array<String>){
    val count1 = ClousureMaker()
    val count2 = ClousureMaker()

    count1()
    count1()
    count2()
    count2()
}
