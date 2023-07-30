class Singleton {
    private Singleton() {
    }

    static Singleton instance = null;

    static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}

public class SingletonDesign {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2) {
            System.out.println("Singleton successful");
        }
    }
}
