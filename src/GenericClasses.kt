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

    val box: Box<Int> = Box<Int>(2)
    println(box)
    var login = Login<String>("Hecton", "myPasword")
    var login2 = Login<Int>(12, 12)
    var login3 = Login<Boolean>(true, false)


    var login4 = Login<String>("oi", "")
}