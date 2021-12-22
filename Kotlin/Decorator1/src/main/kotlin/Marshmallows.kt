class Marshmallows(beverage: Beverage) : CondimentDecorator(beverage) {
    override fun decorate(): String {
        return super.decorate() + decorateWithMarshmallows()
    }

    private fun decorateWithMarshmallows(): String {
        return " with Marshmallows"
    }

    override fun cost(): Double {
        return super.cost() + .30
    }
}