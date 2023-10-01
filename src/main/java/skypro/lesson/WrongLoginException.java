package skypro.lesson;

class WrongLoginException extends Exception {
    public WrongLoginException(String err){
        super(err);
    }
}
