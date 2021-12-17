fun main() {
    val coffee = Mocha(Espresso())
    val beverage = coffee.decorate()
    println(beverage)

    val coffee1 = Marshmallows(Mocha(HouseBlend()))
    println(coffee1.decorate())
}