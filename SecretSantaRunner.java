import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SecretSantaRunner {
    public static void main(String args[]) {
      List<String> lista = Arrays.asList("Monika", "Ola", "Paweł", "Bogusia", "Ania", "Szymon", "Bartek", "Natka", "Piotrek");
      
      System.out.println(lista);
      
      Collections.shuffle(lista);
      
      System.out.println(lista);
    }
}
