fun main() {
    val weatherData = WeatherData()
    val currentDisplay = CurrentConditionsDisplay(weatherData)

    weatherData.setMeasurementsChanged(80F, 65F, 30.4F)
    weatherData.measurementsChanged()
}