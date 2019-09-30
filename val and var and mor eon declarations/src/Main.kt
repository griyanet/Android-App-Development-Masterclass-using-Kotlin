import java.lang.Exception

fun main(Args: Array<String>){
    println("Var is Mutable, stands for variable.\nVal is Immutable, stands for value.")
    val valName: String = "Pierre"
    var varName: String = "Pierre"

    var number = 25



    try {
        //The line below will not compile due to val being immutable
        //valName+=" Goldstein"
        varName+=" Goldstein"
    }catch (e: Exception){
        println(e.stackTrace)
    }
    println("My name is $varName");

    println("\nKotlin uses Type Inference, so if you forget to type the 'type' for a var or val, Kotlin will infer what it is, E.g:")
    var first = "Pierre"
    val last = "Goldstein"
    val fullName = first +" "+last
    println(fullName)
}