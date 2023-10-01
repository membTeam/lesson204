package skypro.lesson;

public class Authorisation {
    private final String login;
    private final String password;
    private final String confirmPassword;

    public Authorisation(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public static void verifyData(Authorisation authorisation) throws WrongLoginException, WrongPasswordException {

        String matches = "[a-zA-Z0-9_]+";
        var login = authorisation.getLogin();
        var passowrd = authorisation.getPassword();
        var confirmPassword = authorisation.getConfirmPassword();

        var errLength = "длина %s не менее 5 и не более 20";
        var err = "%s только латинские символы, цифры и знак _";

        if (login.length() < 5 || login.length() > 20 ){
            throw new WrongLoginException(String.format(errLength, "лонига"));
        }

        if (passowrd.length() < 5 || passowrd.length() > 20 ) {
            throw new WrongPasswordException(String.format(errLength, "пароля"));
        }

        if (!login.matches(matches)) {
            throw new WrongLoginException(String.format(err, "Логин"));
        }

        if (!passowrd.matches(matches)) {
            throw new WrongPasswordException(String.format(err, "Пароль"));
        }

        if (!passowrd.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }

    }

}
