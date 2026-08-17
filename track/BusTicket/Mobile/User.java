
class Mobile {

    void enterPin(Pin p) {
        System.out.println("PIN entered");
    }

    Screen unlock() {
        Screen s = new Screen();
        System.out.println("Mobile unlocked");
        return s;
    }
}

class Pin {

}

class Screen {

}

class User {

    public static void main(String[] args) {

        Mobile m = new Mobile();
        Pin p = new Pin();

        m.enterPin(p);

        Screen s = m.unlock();

        System.out.println(s);

        if (s != null) {
            System.out.println("Mobile is Ready to use");
        }
    }
}
