fun main(Args: Array<String>){
    val lives = 3
    if(lives < 1){
        println("Game over!")
    } else{
        println("You're still alive")
    }

    var isStillAlive= (lives < 1)

    var leftLives = if(isStillAlive) "game over" else "still alive"
    println(leftLives)
    println(isStillAlive)

    println("\nHow old are you?")
    val age = readLine()!!.toInt()
    println("Age is $age")

    val message: String
    if(age < 18){
        message = "You are to young to vote"
    }else if(age == 100){
        message ="Congratulations"
    }else{
        message ="Go vote!"
    }
    println(message)

    val vote: String = if(age < 18){
        "You are to young to vote"
    }else{
        "Go vote!"
    }
    println(vote)

    val lastMessage: String
    lastMessage = when{
        age < 18 -> "You;re too young"
        age == 100 -> "Congratulations"
        else -> "Go vote you hole!"
    }
    println(lastMessage)
}
