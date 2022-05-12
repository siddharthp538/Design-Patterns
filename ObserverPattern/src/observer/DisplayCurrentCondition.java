package observer;

import subject.WheatherData;

public class DisplayCurrentCondition implements DisplayScreen , Observer{

    WheatherData wheatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public DisplayCurrentCondition(WheatherData wheatherData){
        this.wheatherData = wheatherData;
        wheatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Current Conditions are Temperature : " + temperature + "  Humidity: " + humidity + " Pressure: " + pressure);
    }
}
