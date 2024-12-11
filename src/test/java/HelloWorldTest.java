import com.serenitydojo.HelloWorldWriter;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void shouldWriteHelloWorldTOTheConsole(){
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }
    @Test
    public void demo(){
       int ageThisYear = 42;
        int ageNextYear = ageThisYear + 1;
        System.out.println("age = " + ageNextYear);
    }
    @Test
    public void nameDemo(){
        String firstName = "Ola";
        String lastName = "Oladele";

        String upperCaseFirstName = firstName.toUpperCase();
        String lowerCaseLastName = lastName.toUpperCase();
        System.out.println(lowerCaseLastName);
        System.out.println(upperCaseFirstName);
    }

}
