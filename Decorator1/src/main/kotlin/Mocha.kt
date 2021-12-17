class Mocha(beverage: Beverage) : CondimentDecorator(beverage) {
    override fun decorate(): String {
        return super.decorate() + decorateWithMocha()
    }

    private fun decorateWithMocha(): String {
        return " with Mocha"
    }

    override fun cost(): Double {
        return super.cost() + .20
    }
}