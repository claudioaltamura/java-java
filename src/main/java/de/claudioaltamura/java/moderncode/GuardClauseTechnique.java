package de.claudioaltamura.java.moderncode;

public class GuardClauseTechnique {

    private final boolean wifi = false, login = false, admin = true;

    public void aFunction() {
        if(!wifi) {
            return;
        }
        if(!login) {
            return;
        }
        if(!admin) {
            return;
        }
        callService();
    }

    private void callService() {
        System.out.println("call service");
    }
}
