import javafx.scene.paint.Color

//Fixed or static info. Collection of information
//  InKotlin, enum isa so-called soft keyword:
enum class Suits{
    HEARTS,
    SPADES,
    DIAMONDS,
    CLUBS
}

fun main(args: Array<String>) {

    var player = Suits.DIAMONDS
    if(player == Suits.DIAMONDS) println("ok")

    println(getMnemonic(Color.BLUE))
}

fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
            else -> {
                println("Select the right color")
            }
        }
