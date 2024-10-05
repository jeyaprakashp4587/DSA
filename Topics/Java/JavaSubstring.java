public class JavaSubstring {
    public static void main(String[] args) {
        String s = "HelloWorld";
        StringBuffer stringBuffer = new StringBuffer();
        int start = 3;
        int end = 7;
        System.out.println(stringBuffer);
        for (int i = start; i < end; i++) {
            stringBuffer.append(s.charAt(i));
        }
        System.out.println(stringBuffer);
    }

}
