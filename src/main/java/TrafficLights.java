public class TrafficLights {

    public static String updateLight(String current) {
        switch (current){
            case ("green"):
                return "yellow";
            case ("red"):
                return "green";
            case ("yellow"):
                return "red";
        }
        return "";
    }
}
