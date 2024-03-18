import android.text.style.BackgroundColorSpan
import android.webkit.WebView.HitTestResult

fun main() {

    val btn = Button("Ligar",454545, Pair(20,40))
    btn.render()
    val url = Link("live",Pair(50,59))
    url.render()
}
abstract class Component{
    abstract fun position() : Pair<Int,Int>

    open fun render(){
        println("desenhando na tela ${position().first} | ${position().second}")
    }
}

abstract class Text(val text:String): Component() {
    override fun render() {
        super.render()
        println("desenhado o texto $text")
    }
}

class Button( text :String , val backgroundColor :Int, val pos :Pair<Int,Int>) :Text(text){
    override fun position(): Pair<Int, Int> {
        return pos
    }

    override fun render() {
        super.render()
        println("desenhado o button na cor  -> $backgroundColor")
    }
}

class Link(text:String , val pos : Pair<Int,Int>):Text(text){
    override fun position(): Pair<Int, Int> {
        return pos
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