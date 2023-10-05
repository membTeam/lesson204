package skypro.lesson;

class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String err){
        super(err);
    }
}
