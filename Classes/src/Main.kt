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
    John.show()
}