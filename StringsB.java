public class StringsB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Rajat");

        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        sb.insert(0,'B');
        System.out.println(sb);
    }
}
