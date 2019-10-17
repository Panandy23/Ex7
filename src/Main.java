public class Main {

    public static void main(String[] args) {

    int i =1;
    int sum =0;


        for (i = 1; i <= 100 ; i++) {

        if (i%2 != 0) {
            sum = sum + i;
        }

        }
        System.out.println("Suma liczb nieparzystych z przedziału 1 - 100 wynoszą: " + sum);
    }
}
