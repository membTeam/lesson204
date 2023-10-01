package skypro.lesson;

class WrongPasswordException extends Exception {
    public WrongPasswordException(String err){
        super(err);
    }
}
