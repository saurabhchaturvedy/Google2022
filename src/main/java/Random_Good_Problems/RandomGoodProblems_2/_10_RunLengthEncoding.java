package main.java.Random_Good_Problems.RandomGoodProblems_2;

public class _10_RunLengthEncoding {


    public String encode(String str) {
        int len = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int count = 1;

            while (i < len - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            sb.append(str.charAt(i) + "" + count);
        }
        return sb.toString();

    }


    public static void main(String[] args) {

        _10_RunLengthEncoding runLengthEncoding = new _10_RunLengthEncoding();
        System.out.println(runLengthEncoding.encode("sssttwwwwff"));
    }
}
