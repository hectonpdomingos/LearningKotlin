/*
you can instantiate abstract classes but only the classes that inherent the
abstract class
 */
abstract class GraphicObject{

   fun moveTo(newX: Int, newY: Int){
       println("Moved  x and y")
   }

    abstract fun draw()
    abstract fun resize()

}

class Circle: GraphicObject() {
    override fun draw() {
println("Drawing circle")
    }

    override fun resize() {
        println("Resizing circle")
    }

}


fun main(args: Array<String>) {

    // you can do it
    // var circle = GraphicObject

    //you need to instantiate like it
    var Circle = Circle()
    Circle.draw()

}