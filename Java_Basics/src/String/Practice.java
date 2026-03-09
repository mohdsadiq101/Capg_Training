package String;

public class Practice {

    // 17. add a character at given index
    static void P16(String str, char ch, int i){
        StringBuilder sb = new StringBuilder();
        int j = 0;
        while (j < str.length()){
            if (j == i)
                sb.append(ch);
            sb.append(str.charAt(j));
            j++;
        }
        System.out.println(sb);
    }

    // 18. reverse each word
    static void P17(String str){}

    public static void main(String[] args) {
        P16("Sadque",'i',3);
    }
}
