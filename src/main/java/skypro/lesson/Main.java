package skypro.lesson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final List<Authorisation> lsAuthorisation;

    static {
        lsAuthorisation = new ArrayList<>();
        final String COMMA_DELIMITER = ";";

        try (var br = new BufferedReader(new FileReader("csvData/authorisation.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);

                var login = values[0];
                var password = values[1];
                var confirmPassword = values[2];

                var authorization = new Authorisation(login, password, confirmPassword);

                lsAuthorisation.add(authorization);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());            
        }
    }

    public static void main(String[] args) {
        System.out.println("Домашнее задание: Работа с исключениями");
        System.out.println();

        for (var item : lsAuthorisation) {

            System.out.println("verifing: " + item.getLogin());
            try{
                Authorisation.verifyData(item);
            } catch (WrongPasswordException | WrongLoginException ex){
                System.out.println("\t" + ex.getMessage());
            }
        }

    }
}
