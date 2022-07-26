public class Concating {
    public String concat(String s1, String s2) {

        String s = s1;
        int L = s2.length();
        while (L > 0) {
            String common = s2.substring(0, L);
            if (s1.endsWith(common)) {
                s = s1+common+s2.substring(L);
                break;
            }
            L--;
        }

        return s;
    }

    public static void main(String[] args) {
        Concating c = new Concating();
        System.out.println(c.concat("vishal", "vishnu")+"|expected:vishalnu");
        System.out.println(c.concat("concat", "catalyst")+"|expected:concatalyst");
    }
}