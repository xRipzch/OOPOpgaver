package TrafficLight;

public class TrafficLight2 {
   private TrafficLightColor trafficLightColor;

    TrafficLight2(TrafficLightColor trafficLightColor) {  // constructor
        this.trafficLightColor = trafficLightColor;


    }

    public void setTrafficLightColor(TrafficLightColor trafficLightColor) {   //
        this.trafficLightColor = trafficLightColor;
    }

    public TrafficLightColor getTrafficLightColor() {
        return trafficLightColor;
    }

    @Override
    public String toString() {
        return "TrafficLight.TrafficLight2{" +
                "trafficLightColor="+ ConsoleColors.RED + trafficLightColor + ConsoleColors.RESET +
                '}';
    }
}
