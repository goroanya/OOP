package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TokenPassenger implements IPassenger {
    List<Integer> tokens ;

    public TokenPassenger(List<Integer> tokens) {
        this.tokens = tokens;
    }

    public TokenPassenger() {
        this.tokens = new ArrayList<>(Arrays.asList(8,8,8));
    }

    @Override
    public boolean payForTransit()
    {
        if (tokens.size() > 0)
        {
            tokens.remove(0);
            return true;
        }
        return false;
    }
}
