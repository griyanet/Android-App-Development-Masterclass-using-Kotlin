import jdk.nashorn.internal.runtime.JSType.toDouble
import kotlin.math.pow

fun main(Args: Array<String>){

    val troll = Troll("Gargamel")
    println(troll)
    troll.takeDamage(30)
    println(troll)

    println("=======================")

    val vlad = Vampire("Vlad")
    vlad.takeDamage(9)
    println(vlad)
}
