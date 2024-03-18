
fun main() {

val nicole = Mussico("Nicole")
val pericles = Mussico("Pericles")
val roberto = Mussico("RobertoCarlos")


val musc1 = Guitarra("Guitarra",5)
val musc2 = Flauta("Flauta")
val musc3 = Violino("violino",5)


tocar(musc1,nicole)
tocar(musc2,pericles)
tocar(musc3,roberto)




}

fun tocar(instrumento: Instrumento, mussico: Mussico){
    instrumento.tocar(mussico)
}

class Mussico(var nome:String)


abstract class Instrumento(var nome: String){

    abstract fun afinar() : Boolean

    fun tocar(mussico: Mussico){
        if (afinar()){
            println(" o instrumento $nome esta sendo tocado ${mussico.nome}")
        }else{
            println("Por favor ${mussico.nome}  afine seu instrumento")
        }
    }
}

abstract class InstrumnetoDeCordas(nome:String,var cordas:Int):Instrumento(nome){

    }


class Flauta(nome:String):Instrumento(nome){
    override fun afinar(): Boolean {
        println("afinar em c")
        return true
    }

}

class Violino(nome:String, cordas: Int):InstrumnetoDeCordas(nome, cordas) {
    override fun afinar(): Boolean {
        println("afinar em d")
        return true
    }

}

class Guitarra(nome:String,cordas: Int):InstrumnetoDeCordas(nome, cordas){
    override fun afinar(): Boolean {
        return false
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