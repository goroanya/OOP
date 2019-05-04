package State;

import Forms.SignInWindow;


public class CustomerState implements State {

    @Override
    public void execute(SignInWindow SW) {
        SW.setVisible(false);
        SW.openCustomerUI();
    }
}
