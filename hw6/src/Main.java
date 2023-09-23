
public class Main {

    public static void main(String[] args) {
        SerialExperimentsString ses = new SerialExperimentsString();
        System.out.println(ses.findSymbolOccurance("aaaaadfghjkdfghjkdfghjdfghj", 'f'));
        System.out.println(ses.findWordPosition("fgiuf aff fdoipsfj", "aff"));
        System.out.println(ses.findWordPosition("dhsfghsdfjh", "rrr"));
        System.out.println(ses.stringReverse("Hello"));
        System.out.println(ses.stringReverse("dcvyguhfidnjvsiajfhnsduifsodf"));
        System.out.println(ses.isPalindrome("olo"));
        System.out.println(ses.isPalindrome("Olo"));
        System.out.println(ses.isPalindrome("fgh"));
        ses.wordGame();
    }

}
