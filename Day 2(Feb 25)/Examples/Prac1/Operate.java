package Examples.Prac1;

public class Operate {
    public static void main(String[] args) {
//        Calculator cal = (x,y) -> (int)Math.pow(x,y);
//        System.out.println(cal.calculate(2,3));

//        Calculator cal = (s) -> {
//            StringBuilder sb = new StringBuilder();
//            for (int i =0; i < s.length();i++){
//                sb.append(s.charAt(i));
//                if (i != s.length()-1)
//                    sb.append(" ");
//            }
//            return sb.toString();
//        };
//
//        System.out.println(cal.space("CG"));

        Calculator cal = (u, p) -> u.equals("Sadiq") && p.equals("123");
        System.out.println(cal.auth("Sadiq","123"));
    }
}
