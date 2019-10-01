class Player (val name: String, var lives: Int, var level: Int, var score: Int){
    var weapon: Weapon = Weapon("Fist", 1)
    val inventory = ArrayList<Loot>()
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

    fun showInventory(){
        println("$name's Inventory")
        for(item in inventory){
            println(item)
        }
        println("====================")
    }
}