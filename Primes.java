public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        boolean arr [] = new boolean[N+1];
        for (int i = 2; i <= N; i++) {
            arr[i] = true;
        }
        int p = 2;

        while (p < N) {
            if (arr[p] == true) {
            int j = p * p;
            while (j <= N) {
                arr[j] = false;
                j += p;
            }
            }
            p++;
        }
        int count = 0;

        System.out.println("Prime numbers up to " + N + ":");
        for (int k = 2; k <= N; k++) {
            if (arr[k] == true) {
                count++;
                System.out.println(k);
            }
        }

        int percentage = (count * 100) / N;
        System.out.println("There are " + count + " primes between 2 and " + N + " (" + percentage + "% are primes)");


    }
}