class Players(val name: String) {
    var lives = 3
    var score = 0
    var levels = 1

    fun show(){
        println("""
        name: $name
        lives: $lives
        level: $levels
        score: $score
        """.trimIndent())
    }
}