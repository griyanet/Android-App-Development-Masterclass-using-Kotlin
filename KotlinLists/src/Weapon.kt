class Weapon (var name: String, var damage: Int){
    override fun toString(): String {
        return "$name inflicts $damage points of damage."
    }
}