open class Enemy(val name: String, var hitPoints: Int, var lives: Int){
    open fun takeDamage(damage: Int){
        val remainingHitPoint = hitPoints - damage
        if(remainingHitPoint > 0){
            hitPoints = remainingHitPoint
            println("$name took $damage points of damage, and has $hitPoints left")
        } else {
            lives-=1
            if(lives > 0){
                println("#name lost a life")
            }
            println("$name is dead.")
        }
    }

    override fun toString(): String {
        return "Name: $name\nHitpoints: $hitPoints\nLives: $lives"
    }
}