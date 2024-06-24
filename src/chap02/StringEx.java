package chap02;

public class StringEx {
    public static void main(String[] args) {
        //string: 문자열 자료형
        //char ='' , String= ""

//        char c01="a";
//        String s01='a';

        //리터럴로 생성시에는 String Constant pool 이라는 곳에 중복없이 저장된다.
        String s01= "Hello World";
        String s02= ""; //빈 문자열도 선언 가능

        //인스턴스로 생성 시 매번 새로 생성되어서 가자 메모리 차지
        String h1="Hello";
        String h2="Hello";
        String h3= new String("Hello");
        System.out.println(h1+ " : "+h2+" : "+h3);

        boolean b01= h1==h2;
        boolean b02= h1==h3;
        boolean b03= h1.equals(h3); //String 비교할때에는 ==.equals 메소드 사용

        System.out.println(b01);
        System.out.println(b02);
        System.out.println(b03);


        //이스케이프 문자

        String name="홍길동";
        String job="프로그래머";

        String str=" \"자바\" ";
        System.out.println(str);
        str="번호 \t 이름 \t 작업";
        System.out.print(str);
        System.out.print("나는 \n");
        System.out.print("자바를 \n");
        System.out.print("배웁니다. \n");

        String block= """
                내가원하는 내용을
                작성하면
                그대로 표현 "" 해준다??
                        ㅁ니ㅓㅏ움ㄴㅇ
                        
                """;
        System.out.println(block);
    }
}
