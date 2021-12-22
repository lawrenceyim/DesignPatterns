fun main() {
    val coffee = Mocha(Espresso())
    val beverage = coffee.decorate()
    println(beverage)
    println(coffee.cost())

    val coffee1 = Marshmallows(Mocha(HouseBlend()))
    println(coffee1.decorate())
    println(coffee1.cost())
}