fun main(Args: Array<String>){
    var pierre: Player = Player("Pierre", 3, 1, 0)
    pierre.show()

    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    pierre.inventory.add(redPotion)
    pierre.showInventory()
    println(pierre)
}