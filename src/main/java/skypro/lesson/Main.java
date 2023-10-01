package skypro.lesson;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static final List<Authorisation> lsAuthorisation;

    static {
        lsAuthorisation = Arrays.asList(
                new Authorisation("Логин","password","password"),
                new Authorisation("login_Мой","password","password"),
                new Authorisation("login","passord","passord"),
                new Authorisation("any_Login","secren_passord","secren_passord"),
                new Authorisation("any_LoginNext","secret_passord","secren_passord"),
                new Authorisation("any_Login159","secret_passord","secret_passord"),
                new Authorisation("any_ExtendedLogin1590","secret_passord","secret_passord"),
                new Authorisation("my login","secren","secren")
        );
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