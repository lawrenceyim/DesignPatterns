fun main() {
    var mallard: Duck = MallardDuck()
    mallard.performFly()
    mallard.performQuack()
    mallard.flyBehavior = FlyNoWay()
    mallard.performFly()

}