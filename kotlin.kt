import android.text.style.BackgroundColorSpan
import android.webkit.WebView.HitTestResult

fun main() {

    val a  = mutableListOf("jonas","feliep", "oliveira")
    val b =  listOf("karol","pamela")

    b.filterTo(a ,{ it.contains("a") })

 //     println(a)

   val c = listOf("a","b")
   val d = listOf("c","d")

   val all = listOf(c , d)

   println(all.flatten())


   println()
}


 
























/*










*/
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