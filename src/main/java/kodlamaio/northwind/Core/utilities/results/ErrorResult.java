package kodlamaio.northwind.Core.utilities.results;

public class ErrorResult extends Result{
    public ErrorResult(String message) {
        super(false, message);
    }
}
