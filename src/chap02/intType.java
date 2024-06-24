package chap02;

public class intType {
    public static void main(String[] args) {
        //자바의 데이터 타입
        //기본 타입(Primitive Type) , 참조 타입(Reference Type)
        //기본타입 8가지 자료형
        //정수형 : int ,char , short ,byte ,long
        //실수형 : float, double
        //논리 : boolean

        byte b01 = -128;
        byte b02 = -127;
        // byte b03= 128; 변수는 해당 자료형이 가지는 범위를 벗어나지 못한다
        // byte b01=222; 변수 재선언 불가능

        b01 = 122; // 재할당은 가능

        //자바는 정적 자료형
        //처음 선언할 때의 자료형이 달라질수 없음
        //b01= true;

        long l01=1000000000; //컴파일러는 int로 간주함
        long l02=10_000_000_000_000L; // 자릿수 구분을 돕기위해 _사용가능

        System.out.println(l02);

        //final 키워드
        final int NUM=1;
        //NUM=2; final 키워드는 변수의 값을 바꾸지 못한다
        //final이 붙은 변수는 상수취급을 받는다.
        //상수는 보통 대문자로 변수명을 지정한다.

        //문자 타입
        //' ' 작은 따음표로 감싼 하나의 문자
        // 문자 리터럴은 유니코드로 변환되어 저장된다.
        char c01='A'; // 유니코드 값 65
        char c02='가'; // 유니코드 값 44032
        char c03=' '; //' ' 사이 빈칸은 오류남

        //실수 타입 float double
        //double 범위도 크고 정밀도도 높다

        float f01=0.1234F;
        double d01 =1234E-4;

        //논리타입
        boolean a=true;
        boolean b= 10 > 0;

    }
}
