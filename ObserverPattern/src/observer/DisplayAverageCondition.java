package observer;

import subject.WheatherData;

public class DisplayAverageCondition implements DisplayScreen , Observer{
    WheatherData wheatherData;
    float min;
    float max;
    float avg;


    public DisplayAverageCondition(WheatherData wheatherData){
        this.wheatherData = wheatherData;
        wheatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Displaying Average, + " + avg + " Min " + min + " and avg " + avg );
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.min = temp;
        this.max = max;
        this.avg = pressure;
        display();
    }
}
