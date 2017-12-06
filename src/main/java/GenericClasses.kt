
fun <T: Comparable<T>> max(param1: T, param2: T): T{
    val results = param1.compareTo(param2)
    return if(results > 0) param1 else param2
}

class Login<T>(name: T, password: T){
    init{
        println("Name: $name password: $password")
    }
}
class Box<T>(t: T){
    var t: T? = null
    init{
        this.t = t
        println(this.t)
    }
    var value = t
}


fun main(args: Array<String>) {

    //
    val maxInt: Int = max(42, 99)
    val maxLong: Long = max(1234567L, 999999999L)
    val maxByte: Byte = max((-128).toByte(), (127).toByte())
    val maxString: String = max("Beta", "Alpha")
    println("The max Int = $maxInt")
    println("The maxLong = $maxLong")
    println("The max Byte = $maxByte")
    println("The max String = $maxString")
    //
    val box: Box<Int> = Box<Int>(2)
    println(box)
    var login = Login<String>("Hecton", "myPasword")
    var login2 = Login<Int>(12, 12)
    var login3 = Login<Boolean>(true, false)


    var login4 = Login<String>("oi", "")
}