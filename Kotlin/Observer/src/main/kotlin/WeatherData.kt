// Override the file type to Kotlin
class WeatherData: Subject {
    private var observers = mutableListOf<Observer>()
    private var temperature: Float = 0F
    private var humidity: Float = 0F
    private var pressure: Float = 0F

    fun getTemperature(): Float {
        return temperature
    }

    fun getHumidity(): Float {
        return humidity
    }

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObject(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update()
        }
    }

    fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurementsChanged(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
    }

}