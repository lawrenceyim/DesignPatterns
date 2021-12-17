class SnowGlobes(tree: ChristmasTree) : TreeDecorator(tree) {
    override fun decorate(): String {
        return super.decorate() + decorateWithSnowGlobes()
    }

    private fun decorateWithSnowGlobes(): String {
        return " with Snow Globes"
    }
}