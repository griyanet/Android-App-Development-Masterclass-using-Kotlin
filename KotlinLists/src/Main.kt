import jdk.nashorn.internal.runtime.JSType.toDouble
import kotlin.math.pow

fun main(Args: Array<String>){
//    var pierre: Player = Player("Pierre", 3, 1, 0)
//    pierre.show()
//
//    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
//    pierre.inventory.add(redPotion)
//    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.00)
//    pierre.inventory.add(chestArmor)
//
//    pierre.weapon.name = "LongSword"
//    pierre.weapon.damage = 100
//    val ringOfProtection = Loot("Ring of Protection +2", LootType.RING, 40.25)
//    val invisibilityPotion = Loot("Invisibilty Potion", LootType.POTION, 35.95)
//    pierre.inventory.add(ringOfProtection)
//    pierre.inventory.add(invisibilityPotion)
//    pierre.showInventory()
//    println(pierre)
    for(i in 1..10){
        println("$i squared is ${toDouble(i).pow(2)}")
    }
    println("====================")
    for(i in 10 downTo 0){
        println("$i squared is ${toDouble(i).pow(2)}")
    }
    println("====================")
    for(i in 10 downTo 0 step 2){
        println("$i squared is ${toDouble(i).pow(2)}")
    }
    println("====================")
    for(value in 3..100 step 3){
        if(value% 5 == 0){
            println(value)
        }
    }
}