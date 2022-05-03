package kodlamaio.northwind.Core.utilities.results;

public class Result {
    private boolean success;
    private String message;

    public Result(boolean success,String message) {
        this.success= success;
        this.message = message;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public String getMessage() {
        return this.message;
    }
}
