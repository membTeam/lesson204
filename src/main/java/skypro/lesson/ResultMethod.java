package skypro.lesson;

class ResultMethod {
    private final boolean result;
    private final String message;

    public ResultMethod(String message) {
        this.result = false;
        this.message = message;
    }

    public ResultMethod() {
        this.result = true;
        this.message = "ok";
    }

    public boolean isResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }
}
