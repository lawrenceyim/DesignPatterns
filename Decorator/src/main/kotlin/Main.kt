fun main() {
    val christmasTree = SnowGlobes(BubbleLights(PineChristmasTree()))
    val decoratedChristmasTree = christmasTree.decorate()
    println(decoratedChristmasTree)

    val fakeChristmasTree = SnowGlobes(PlasticChristmasTree())
    val decoratedChristmasTree1 = fakeChristmasTree.decorate()
    println(decoratedChristmasTree1)
}