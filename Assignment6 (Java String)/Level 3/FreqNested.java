public class FreqNested {
    static void freq(String s) {
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '0') continue;
            int c = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    c++;
                    a[j] = '0';
                }
            }
            System.out.println(a[i] + " " + c);
        }
    }

    public static void main(String[] args) {
        freq(new java.util.Scanner(System.in).next());
    }
}
