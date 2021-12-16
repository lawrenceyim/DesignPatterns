class CurrentConditionsDisplay: Observer, DisplayElement {
    private var temperature: Float = 0F
    private var humidity: Float = 0F
    private var weatherData = WeatherData()

    constructor(weatherData: WeatherData) {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("Current conditions: ${temperature}F degrees and ${humidity}% humidity")
    }


}