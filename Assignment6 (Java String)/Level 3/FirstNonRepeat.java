public class FirstNonRepeat {
    static char firstNonRepeat(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;
        for (int i = 0; i < s.length(); i++)
            if (freq[s.charAt(i)] == 1)
                return s.charAt(i);
        return '-';
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeat(new java.util.Scanner(System.in).next()));
    }
}
