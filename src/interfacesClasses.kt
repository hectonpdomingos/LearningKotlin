
interface actions{
    fun closeWindows()
    fun openWindows()
    fun browswerInternet()
}

class Dimitri: actions{
    override fun openWindows() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun browswerInternet() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun closeWindows() {
         println("Dima is closing the windows")
        }


}



fun main(args: Array<String>) {

   var  n = Dimitri()
    n.closeWindows()


}