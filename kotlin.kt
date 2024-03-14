
fun main() {

    val kiko = Musico("Jonas")
    val gabi = Musico("robert Carl")

    val isntruA = Guitarra("guitara")
    val isntruB = Violoino("Violino")

    tocar(isntruA,kiko)
    tocar(isntruB,gabi)





    }

fun tocar(instrumento: Instrumento, musico: Musico){
    instrumento.tocar(musico)
}


class Musico(var name: String)


abstract class Instrumento(var name:String){

    abstract fun afinar():Boolean


    fun tocar(musico: Musico) {
        if (afinar()) {
            println("${musico.name} vc ja pode tocar o instrumento: $name ")
        }else{
            println("vc ainda nao afinou a/o $name")

        }    }
    }

abstract class InstrumentoDeCorda(name:String):Instrumento(name){

}

class Guitarra(name:String):InstrumentoDeCorda(name){
    override fun afinar():Boolean {
       return false
    }

}

class Violoino(name:String):Instrumento(name){
    override fun afinar():Boolean {
        println("ifinar com C")
        return true
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