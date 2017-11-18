
interface actions{
    fun closeWindows()
    fun openWindows()
    fun browswerInternet()
}

class Dimitri: actions{
    override fun closeWindows() {
         println("Dima is closing the windows")
        }

    override fun openWindows() {
        openWindows(){
            println("")
        }
    }

    override fun browswerInternet() {
        super.browswerInternet()
    }
}



fun main(args: Array<String>) {

   var  n = Dimitri()
    n.closeWindows()


}