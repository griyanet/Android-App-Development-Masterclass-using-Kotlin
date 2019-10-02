import kotlin.random.Random

class VampireKing(name: String):Vampire(name) {
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage/2)
    }

    init{
        hitPoints = 140
    }
    fun runAway(): Boolean {
        return lives < 2
    }
    fun Dodge():Boolean{
        val rand = Random
        val chance = rand.nextInt(6)
        if(chance > 3){
            println("Dracula dodges")
            return true
        }else{
            return false
        }

    }
}