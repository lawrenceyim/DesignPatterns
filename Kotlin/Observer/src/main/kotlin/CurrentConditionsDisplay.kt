class CurrentConditionsDisplay(private var weatherData: WeatherData) : Observer, DisplayElement {
    private var temperature: Float = 0F
    private var humidity: Float = 0F

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        this.temperature = weatherData.getTemperature()
        this.humidity = weatherData.getHumidity()
        display()
    }

    override fun display() {
        println("Current conditions: ${temperature}F degrees and ${humidity}% humidity")
    }


}