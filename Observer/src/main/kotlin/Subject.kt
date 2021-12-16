// Override file type to Kotlin in order to make the project work
interface Subject {
    fun registerObserver(o: Observer)
    fun removeObject(o: Observer)
    fun notifyObservers()
}