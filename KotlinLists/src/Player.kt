class Player (val name: String, var lives: Int = 3, var level: Int = 1, var score: Int = 0){
    var weapon: Weapon = Weapon("Fist", 1)
    private val inventory = ArrayList<Loot>()
//    fun show(){
//        println("""
//            Name: $name
//            Lives: $lives
//            Level: $level
//            Score: $score
//        """.trimIndent())
//    }
    fun show(){
          if(lives > 0){
              println("$name is alive")
          }else{
              println("$name never dies!")
          }
    }

    override fun toString(): String {
        return("""
            Name: $name
            Lives: $lives
            Level: $level
            Score: $score
            Weapon: ${weapon}
        """.trimIndent())
    }
    fun getLoot(item: Loot){
        inventory.add(item)
    }
    fun dropLoot(item:Loot): Boolean{
        return if(inventory.contains(item)){
            inventory.remove(item)
            true
        }else{
            false
        }
    }
    fun dropLoot(name: String): Boolean{
        println("$name will be dropped")
        return inventory.removeIf{ it.name == name }
    }
    fun showInventory(){
        var total:Double = 0.0
        println("$name's Inventory")
        for(item in inventory){
            println(item)
            total+=item.value
        }
        println("====================")
        println("Total score is: $total")
        println("====================")
    }
}