
fun main(){


    val musc = Guitarra("name")
    musc.afinar()
}



abstract class Instrumento(var name:String){

    abstract fun afinar()
}


class Guitarra(name:String):Instrumento(name){
    override fun afinar() {
        println("finar em E")
    }

}

class Violoino(name:String):Instrumento(name){
    override fun afinar() {
        println("ifinar com C")
    }

}








/*
open class Pessoa(var nome:String, var enderoco:String){
     //  Protected -> somente class filha pode n pegar uma variavel protected
     //  Private -> somente as class atual poden acessar as propriedades
     protected var biblioteca:Boolean = false
    fun descricao(){
        println("Meu nome é $nome meu enderoco é $enderoco, o nivel de acesso  $biblioteca")
    }
}

class Professor(nome :String , enderoco :String): Pessoa(nome, enderoco){
    init {
        biblioteca = true
    }
}

class Aluno(nome :String , enderoco :String,var matriculaId:Int): Pessoa(nome, enderoco) {

}*/