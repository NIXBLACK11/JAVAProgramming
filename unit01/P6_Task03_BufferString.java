package unit01;

public class P6_Task03_BufferString {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello");
        System.out.println(s);
        s.append("yo");
        System.out.println(s);
        s.insert(1, "Java");
        System.out.println(s);
        s.replace(1, 3, "B");
        System.out.println(s);
        s.delete(1, 3);
        System.out.println(s);
    }
}
