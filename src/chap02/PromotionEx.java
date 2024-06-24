package chap02;

public class PromotionEx {
    public static void main(String[] args) {
        //타입 변환은
        //1.자동 타입 변환 (묵시적 형변환)
        //
        byte byteValue=10;
        int intValue=byteValue;
        int result=intValue +10;
        //큰 허용범위 타입의 변수에 작은 허용범위 변수를 집어넣으면 자동으로 변환한다.
        //2.강제 타입 변환 (명시적 형변환)

        //작은 허용범위 타입의 변수에 큰 허용범위 변수를 집어넣으려고 하면
        //그냥은 할수없고
        //개발자가 직접 형변환에 대해 책임지겠다는 문구를 넣어줘야 가능하다.
        //강제 형변환은 데이터에 소실이 일어날 수 있다.

        int intValue2=1000000000;
        byte byteValue2=(byte)intValue2;

        System.out.println(byteValue2+" : " +intValue2);

        //강제 타입변환 예시
        int var1=10;
        byte var2= (byte)var1;
        System.out.println(var2);

        double var3=3.14;
        int var4= (int)var3;
        System.out.println(var4);

        byte res =10+20 ; //컴파일 단계에서 연산을 마치고 저장됨.(res = 30)
        //실행시 덧셈 연산에 있어 실행 성능 향상.

        System.out.println(res);


    }
}
