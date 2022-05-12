package observer;

import subject.WheatherData;

public class DisplayForecast implements DisplayScreen , Observer  {
    WheatherData wheatherData;
    private float temperature;
    private float humidity;
    private float pressure;


    public DisplayForecast(WheatherData wheatherData){
        this.wheatherData = wheatherData;
        wheatherData.registerObserver(this);

    }

    @Override
    public void display() {
        System.out.println("Displaying Forecasting Conditions " + temperature + " " + humidity + " " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temp;
        display();
    }
}
