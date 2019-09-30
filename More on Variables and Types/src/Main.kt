fun main(arg: Array<String>){
    println("Hello World")
    println("My First Kotlin Program")

    var Pierre: String
    Pierre = "Pierre Goldstein"
    println(Pierre)

    var PierreSalary: Int = 120000
    var monthly: Int = PierreSalary/12
    var weekly: Int = PierreSalary/52
    println("Yearly: \t$" + PierreSalary +"\nMonthly: \t$"+monthly+"\nWeekly: \t$"+weekly)

    println("To properly divide in Kotlin, use a double to get the product of two integers that do not factor evenly\n" +
            "***Note: be sure to use a double in the denominator ***")
    val weeks: Int = 130
    val years: Double = weeks/52.0

    println("There are "+years+" years in "+weeks+" weeks.")
}