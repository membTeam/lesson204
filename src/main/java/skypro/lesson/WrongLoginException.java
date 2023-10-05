package skypro.lesson;

class WrongLoginException extends RuntimeException {
    public WrongLoginException(String err){
        super(err);
    }
}
