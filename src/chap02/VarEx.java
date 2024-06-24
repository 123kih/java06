package chap02;

/**
 * @author : it
 * @fileName : VarEx
 * @since : 24. 6. 24.
 **/
public class VarEx {
    /* 컴퓨터 메모리(RAM)은 수많은 번지로 구성되어 있다.
    * 데이터를 어디에 어떤방식으로 저장할지 정해져 있지 않으면 관리가 어렵다
    * 이를 해결하기 위해 변수 사용
    * 변수는 메모리 번지에 붙어진 이름이다.
    * 변수 = 그릇
    * 변수는 선언할 때 어떤 타입의 데ㅣ터를 담을지 변수의 자료형을 지정해줘야한다
    *
    * 클래스 파일 생성시에는
    * PascalCase
    *
    * 패키지 생성시에는
    * 항상 소문자
    *
    * 변수나 기타 상황에서는
    * camelCase
    *
    * 대입 연산자
    * 오른쪽의 값을 왼쪽의 변수에 넣어라
    * */
    public static void main(String[] args) {
        int score; // 변수를 선언하면 저장되는 값의 타입 변수의 이름만 결정된 상태(메모리에 할당된 상태가 아님)
        score=90;
        //값을 대입하게 되면 변수 초기화 라고 하고,90은 초기값
        //대입할 때 메모리에 할당한다

        int value= 30;
        int result = value+ 10;

        int x=10;
        int y=x; // 변수 y에 변수 x값 대입
        int z=10;

        int x1=3;
        int y1=5;
        System.out.println("x1 :" +x1 + " y1 =" +y1);

        int temp=x1;
        x1=y1;
        y1=temp;

        System.out.println("x1 :" +x1 + " y1 =" +y1);

        System.out.println(result);
    }
}
