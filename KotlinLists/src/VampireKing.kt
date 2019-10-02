class VampireKing(name: String):Vampire(name) {
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage/2)
    }

    init{
        hitPoints = 140
    }
}