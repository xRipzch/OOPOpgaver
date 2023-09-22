package TrafficLight;

public class Run {
    public static void main(String[] args) {
        new Run().run() ;
    }

    private void run() {
        TrafficLight2 trafficLight2 = new TrafficLight2(TrafficLightColor.RED);
        TrafficLight2 trafficLight1 = new TrafficLight2(TrafficLightColor.GREEN);
        System.out.println(trafficLight2);
        trafficLight2.setTrafficLightColor(TrafficLightColor.YELLOW);
        System.out.println(trafficLight2);
        trafficLight2.setTrafficLightColor(TrafficLightColor.GREEN);
        System.out.println(trafficLight2);
        System.out.println(trafficLight1.getTrafficLightColor());
    }
}
