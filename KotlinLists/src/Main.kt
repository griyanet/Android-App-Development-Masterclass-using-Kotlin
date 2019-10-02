import jdk.nashorn.internal.runtime.JSType.toDouble
import kotlin.math.pow

fun main(Args: Array<String>){

//    val troll = Troll("Gargamel")
//    println(troll)
//    troll.takeDamage(30)
//    println(troll)
//
//    println("=======================")
//
//    val vlad = Vampire("Vlad")
//    vlad.takeDamage(9)
//    println(vlad)
//
//    println("=======================")
//
    for(i in 1..10){
        val dracula = VampireKing("Dracula")
        println(dracula)

        while(dracula.lives > 0){
            if(dracula.Dodge()){
                continue
            }
            if(dracula.runAway()){
                println("Dracula ran away")
                break
            }else{
                dracula.takeDamage(80)
            }
        }
        println("=====================")
    }

//    val conan = Player("Conan")
//    conan.getLoot(Loot("Invisibilty", LootType.POTION, 4.0))
//    conan.getLoot(Loot("Mithril", LootType.ARMOR, 183.0))
//    conan.getLoot(Loot("Ring of Speed", LootType.RING, 25.0))
//    conan.getLoot(Loot("Red Potion", LootType.POTION, 2.0))
//    //conan.getLoot(Loot("Cursed Shield", LootType.ARMOR, -8.0))
//    conan.getLoot(Loot("Brass Ring", LootType.RING, 1.0))
//    conan.getLoot(Loot("Chain Mail", LootType.ARMOR, 4.0))
//    conan.getLoot(Loot("Gold ring", LootType.RING, 12.0))
//    conan.getLoot(Loot("Health Potion", LootType.POTION, 3.0))
//    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
//    conan.showInventory()

}
