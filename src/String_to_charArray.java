public class String_to_charArray {
    public static void main(String[] args) {
        String s = "kokolino";
        //konwertuje String to []char
        char[]s_char = s.toCharArray();

        for(char c : s_char)
            System.out.print(c);
        System.out.println("\nindeks 1 ma wartosc " + s_char[1]);


        konwert_to_char();
    }
//konwertuje stringa do char przez streama
    public static void konwert_to_char() {
        String s = "kaklasksdfsdfsd";

        s.chars()
                .mapToObj(sk -> (char) sk)
                .forEach(System.out::print);

    }
}
