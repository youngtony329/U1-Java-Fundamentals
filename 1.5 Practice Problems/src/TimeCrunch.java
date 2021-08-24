import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */
    public static void main(String[] args) {
        int totalSeconds = 10000060;

        int hours =  totalSeconds /3600;
        hours = hours % 3600;

        int minutes = hours / 60;


        int seconds = minutes % 60;

        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
    }

}
