sealed class programmingLanguage{

    class kotlin : programmingLanguage()
    class cplusplus : programmingLanguage()
    class ccharp : programmingLanguage()
    class nodejs : programmingLanguage()

}

fun main(args: Array<String>) {
    val myObject: programmingLanguage = programmingLanguage.kotlin()

    val output = when (myObject){
        is programmingLanguage.kotlin -> "Kotlin"
        is programmingLanguage.ccharp -> "Ccharp"
        is programmingLanguage.cplusplus -> "C++"
        is programmingLanguage.nodejs -> "Node JS"
    }
}