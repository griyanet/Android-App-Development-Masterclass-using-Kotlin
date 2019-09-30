fun main(Args: Array<String>){
    val Pierre = Players("Pierre")
    println("Level: ${Pierre.levels}\nLives: ${Pierre.lives}\nScore: ${Pierre.score}")
    Pierre.show()

    val mokonen = Players("Mokonen")
    mokonen.levels = 5
    mokonen.show()

    var Goldstein = PlayerDefault("Goldstein")
    Goldstein.show()
    Goldstein.levels = 20
    Goldstein.lives = 100
    Goldstein.score = 9000
    Goldstein.show()

    var John = PlayerDefault("John", 5, 5, 200)
    var Anna = John
    John.show()
    println("Weapon: ${Goldstein.weapon.name.toUpperCase()}\nDamage: ${Goldstein.weapon.damagedInflicted}")
    val axe = Weapons("Axe", 12)
    Goldstein.weapon = axe
    println("Weapon: ${Goldstein.weapon.name.toUpperCase()}\nDamage: ${Goldstein.weapon.damagedInflicted}")
    axe.damagedInflicted = 24
    println("Weapon: ${Goldstein.weapon.name.toUpperCase()}\nDamage: ${Goldstein.weapon.damagedInflicted}")

    Goldstein.weapon = Weapons("Sword", 10)
    println(Goldstein.weapon.name)

    Goldstein.weapon = Weapons("Spear", 14)
    println(Goldstein.weapon.name)

    println(Anna.weapon.name)
}