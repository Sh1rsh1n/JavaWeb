package shirshin.homework_4.exceptions;

public class AmountException extends ShopServiceException {

    public AmountException(String msg, int amount) {
        super(msg + " " + amount);
    }
}
