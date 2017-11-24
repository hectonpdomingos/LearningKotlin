
package LearningKotlin

open class Usuario() {
    var nome: String? = null
    var idade: Int? = null


    constructor(name: String, idade: Int) : this(){
        this.nome = nome
        this.idade = idade

        println("Seu nome é: " + this.idade.toString() + " e sua idade é: " + this.idade)
    }



    fun setUsuario(nome: String, idade: Int){
        this.nome = nome
    }
}