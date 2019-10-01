import jdk.nashorn.internal.runtime.JSType.toDouble
import kotlin.math.pow

fun main(Args: Array<String>){
    var pierre: Player = Player("Pierre", 3, 1, 0)
    pierre.show()

    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    pierre.getLoot(redPotion)
    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.00)
    pierre.getLoot(chestArmor)

    pierre.weapon.name = "LongSword"
    pierre.weapon.damage = 100
    val ringOfProtection = Loot("Ring of Protection +2", LootType.RING, 40.25)
    val invisibilityPotion = Loot("Invisibilty Potion", LootType.POTION, 35.95)
    pierre.getLoot(ringOfProtection)
    pierre.getLoot(invisibilityPotion)
    pierre.showInventory()
    if(pierre.dropLoot(redPotion)){
        pierre.showInventory()
    }else{
        println("you don't have a ${redPotion.name}")
    }
    val bluePotion = Loot("Blue Potion", LootType.POTION, 6.00)
    if(pierre.dropLoot((bluePotion))){
        pierre.showInventory()
    }else{
        println("you don't have a ${bluePotion.name}")
    }
    println(pierre)
    if (pierre.dropLoot("Invisibilty Potion")){
        pierre.showInventory()
    }else{
        println("you don't have a \"Invisibilty Potion\"")
    }
    pierre.showInventory()
}