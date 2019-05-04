package State;

import Forms.SignInWindow;

public class WorkerState implements State {

    @Override
    public void execute(SignInWindow SW) {
        SW.setVisible(false);
        SW.openWorkerUI();
    }

}
