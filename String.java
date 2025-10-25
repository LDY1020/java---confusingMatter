package test.ex1;

public class String {

    public static void main(java.lang.String[] args) {
        java.lang.String text = "   Java   backend  spring ";

        text = text.trim(); // 앞뒤 공백 제거
        java.lang.String[] words = text.split("\\s+"); // 공백 여러 개도 한 번에 처리

        int count = words.length;
        System.out.println("단어 개수: " + count);
    }
}

