//Fixed or static info. Collection of information

enum class Suits{
    HEARTS,
    SPADES,
    DIAMONDS,
    CLUBS
}

fun main(args: Array<String>) {

    var player = Suits.DIAMONDS
    if(player == Suits.DIAMONDS) println("ok")

}