fun main(Arg: Array<String>){
    var PierreSalary: Int = 120000
    var monthly: Int = PierreSalary/12
    var weekly: Int = PierreSalary/52
    println("String concatenation")
    println("Yearly: \t$" + PierreSalary +"\nMonthly: \t$"+monthly+"\nWeekly: \t$"+weekly+"\n")

    println("String Interpolation")
    println("Yearly: \t$ ${PierreSalary}  \nMonthly: \t$ $monthly \nWeekly: \t$ $weekly \n")

    println("To properly divide in Kotlin, use a double to get the product of two integers that do not factor evenly\n" +
            "***Note: be sure to use a double in the denominator ***\n")
    val weeks: Int = 130
    val years: Double = weeks/52.0
    println("String concatenation")
    println("There are "+years+" years in "+weeks+" weeks.")

    println("String Interpolation")
    println("There are $years years in $weeks weeks.")
}