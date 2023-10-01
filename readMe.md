# Работа с исключениями

# Структура проекта
## Пользовательские исключения 
WrongLoginException & WrongPasswordException

## class Authorisation
Для сокращения программного кода
Включает поля (согласно домашнего задания): 
- login
- password
- confirmPassword

### method verifyData
Статический метод верификации данных

## method main
для наглядности использована коллекция List<Authorisation>
```dtd
static {
        lsAuthorisation = Arrays.asList(
                new Authorisation("Логин","password","password"),
                new Authorisation("login_Мой","password","password"),
                new Authorisation("login","passord","passord"),
                new Authorisation("any_Login","secren_passord","secren_passord"),
                new Authorisation("any_LoginNext","secret_passord","secren_passord"),
                new Authorisation("any_Login159","secret_passord","secret_passord"),
                new Authorisation("my login","secren","secren")
        );
    }
```
~~~~
# Данные из консоли
```dtd
Домашнее задание: Работа с исключениями

verifing: Логин
	Логин только латинские символы, цифры и знак _
verifing: login_Мой
	Логин только латинские символы, цифры и знак _
verifing: login
verifing: any_Login
verifing: any_LoginNext
	Пароли не совпадают
verifing: any_Login159
verifing: my login
	Логин только латинские символы, цифры и знак _

Process finished with exit code 0

```
