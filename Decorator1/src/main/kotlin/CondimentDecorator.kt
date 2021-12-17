abstract class CondimentDecorator (private val beverage: Beverage) : Beverage {
    override fun decorate(): String {
        return beverage.decorate()
    }

    override fun cost(): Double {
        return beverage.cost()
    }
}