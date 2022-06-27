public class Client {
    //https://gre-eny.tistory.com/166 참고
    public static void main(String[] args) {

        Subject weatherData = new WeatherData();
        weatherData.notifyObservers();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        conditionsDisplay.update(20, 30 ,10);

    }
}
