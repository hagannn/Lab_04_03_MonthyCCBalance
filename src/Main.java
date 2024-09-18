public class Main {
    public static void main(String[] args) {
        float interest = 0.17f;
        float balance = 5000f;

        String[] seasons = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i < 12; i++) {
            balance = balance * (interest/12 + 1);
            System.out.println(seasons[i] + " bill: " + balance);
        }

    }
}
