package task2;

public class CardPassenger implements IPassenger {
    private int _cardsum;

    public CardPassenger(int cardsum) {
        this._cardsum = cardsum;
    }

    public CardPassenger() {
        this._cardsum = 100;
    }

    @Override
    public boolean payForTransit() {
        if (_cardsum >= 8) {
            _cardsum -= 8;
            return true;
        }
        return false;
    }

}
