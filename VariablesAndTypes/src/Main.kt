fun main(args: Array<String>){
    println("\"var\" is used to assign a mutable variable while \"val\" is read only.")
    println("To create variables, the type must be declared before giving a value.\n")
    val Pierre: String
    Pierre = "Pierre Goldstein"
    println("String Literal:  "+Pierre)
    println("Length: "+Pierre.length)
    println("Compare:  "+Pierre.compareTo("Pierre Goldstein"))
    println("Equals:  "+Pierre.equals("Pierre Goldstein"))
    println("Get:  "+Pierre.get(8));
    println("Hash Code:  "+Pierre.hashCode())
    var First: String = Pierre.subSequence(0,7) as String
    var Last: String = Pierre.subSequence(7, Pierre.length) as String
    println("Plus and Subsequence:  "+First.plus(Last))
    println("toString:  "+ 123.toString())
    
}