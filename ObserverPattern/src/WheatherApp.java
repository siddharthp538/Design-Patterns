import observer.DisplayAverageCondition;
import observer.DisplayCurrentCondition;
import observer.DisplayForecast;
import subject.WheatherData;

public class WheatherApp {
    public static void main(String[] args) {
        WheatherData wheatherData = new WheatherData(); // subject
        DisplayForecast displayForecast  = new DisplayForecast(wheatherData);
        DisplayCurrentCondition displayCurrentCondition = new DisplayCurrentCondition(wheatherData);
        DisplayAverageCondition displayAverageCondition = new DisplayAverageCondition(wheatherData);
        // the above 3 display screens are the observers
        wheatherData.setMeasurements(98.7f, 30.2f , 56.2f);
        wheatherData.setMeasurements(97.9f, 31.2f , 55.2f);
        wheatherData.setMeasurements(99.7f, 32.2f , 56.3f);


    }
}
