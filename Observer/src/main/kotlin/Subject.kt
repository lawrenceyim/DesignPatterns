interface Subject {
    fun registerObserver(o: Observer)
    fun removeObject(o: Observer)
    fun notifyObservers()
}