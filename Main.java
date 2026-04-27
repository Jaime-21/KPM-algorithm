public class Main {

    public static int[] buildFailureFunction(String pattern) {
        int n = pattern.length();
        int[] f = new int[n];
        int j = 0;

        for (int i = 1; i < n; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = f[j - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            f[i] = j;
        }

        return f;
    }

    public static boolean kmpSearch(String text, String pattern) {
        int[] f = buildFailureFunction(pattern);
        int s = 0;

        for (int i = 0; i < text.length(); i++) {

            while (s > 0 && text.charAt(i) != pattern.charAt(s)) {
                s = f[s - 1];
            }

            if (text.charAt(i) == pattern.charAt(s)) {
                s++;
            }

            if (s == pattern.length()) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        String pattern = "ababaa";

        String textA = "abababaab";
        String textB = "abababbaa";

        System.out.println("Caso a: " + kmpSearch(textA, pattern));
        System.out.println("Caso b: " + kmpSearch(textB, pattern));
    }
}