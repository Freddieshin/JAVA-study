import javax.naming.Name;

public class Test {
  public static void main(String[] args) {
    double[] a = {100};
    System.out.println(100);
  }
}
//데일리 퀴즈 구현하기

/*  String firstname = "jae min";
    String secondName = "jae min";
    String phone = "nothing";
    String status = "chaos";
    System.out.println(firstname==secondName);
    / ==연산자를 이용한 퀴즈

    String a = "hello";
    String b = new String("hello");

    System.out.println(a.equals(b)); // true
    System.out.println(a == b); // false

    String a = "Hello World!";
    System.out.println(a.indexOf("!"));

    String a = "Hello World!";
    String b = "estsoft";
    System.out.println(b.contains("soft"));
    / SOFT를 포함한 예제만들기

    String findChar = "What is your hobby";
    System.out.println(
            findChar.charAt(12)  + ""
                    + findChar.charAt(13)
                    + ""
                    + findChar.charAt(14)
                    + ""
                    + findChar.charAt(15)
                    + ""
                    + findChar.charAt(16));
    / 특정위치를 통한 hobby 출력하기

    String a = "Hello World! Hello World! Hello World! Hello World!";
    System.out.println(a.replaceAll("World", "java"));

    String a = "WEEEE ASKE ;ND";
    System.out.println(a.substring(0,3) + a.substring(8,10)+ a.substring(12,14));
    / WEEKEND 뽑아내기

    //a.split에서 커서찍고 Alt+Enter

    String a = "a:b:c:d";
    String[] split = a.split();

    String result = "Hello";
    System.out.println(result.concat("!"));   // 결과 : Hello!
    result = result + "!"; // 결과 : Hello! (동일)
    //콘캣과 + 연산은 동일 결과

    String name1 = "Tim";
    int age1 = 30;

    String name2 = "Anna";
    int age2 = 45;

    String d1 = String.format("%s의 나이는 %s세 입니다", name1, age1);
    String d2 =  String.format("%s의 나이는 %s세 입니다", name2, age2);
    System.out.println(d1);
    System.out.println(d2);

    String result = " ";
    result += "hello";
    result += "java";
    result += "world";
    System.out.println(result);

    StringBuilder sb = new StringBuilder();
    sb.append("hello");
    sb.append("java");
    sb.append("world");
    System.out.println(sb);

    StringBuffer sf = new StringBuffer();
    sf.append("hello");
    sf.append("java");
    sf.append("world");
    System.out.println(sf);

    StringBuffer sb = new StringBuffer();
    sb.append("hello");
    sb.insert(0, "world");
    sb.insert(0, "world");
    sb.insert(0, "world");
    sb.insert(0, "world");
    System.out.println(sb);

    String[] arr2 = new String [1000];
    System.out.println(arr2[0]);
    / 1000의 값을 가진 배열 만들기

    int positive = 10;
    int negative = 10;

    System.out.println("양의 부호 연산자 적용: "+(positive));
    System.out.println("음의 부호 연산자 적용: "+(-positive));
    System.out.println("음의 부호 연산로 부호 반전: "+(+negative));
    System.out.println("음의 부호 연산자 다시 부호 반전: "+(-negative));

    int x = 5;
    int y = 5;

    System.out.println("전위 증가 연산자: "+ (++x));
    System.out.println("후위 증가 연산자: "+ (y++));
    System.out.println("==========");
    System.out.println("x는"+x);
    System.out.println("y는"+y);

    int a = 100;
    int b = 100;

    System.out.println("전위 감소 연산자: "+ (--a));
    System.out.println("후위 감소 연산자: "+ (b--));
    System.out.println("전위 감소 연산자: "+ (--a));
    System.out.println("후위 감소 연산자: "+ (b--));
    System.out.println("전위 감소 연산자: "+ (--a));
    System.out.println("후위 감소 연산자: "+ (b--));
    /전위,후위 연산자 퀴즈

    boolean  israining = true;

    if(israining){
      System.out.println("하늘에서 비가와요");
    }
    if(!israining){
      System.out.println("하늘이 맑아요");
    }
    boolean issunuy = false;

    if(!issunuy){
      System.out.println("날씨가 맑아요");
    }
    else{
      System.out.println("집에서 쉬어야죠");
    }

        boolean  israining = true;

    if(israining){
      System.out.println("하늘에서 비가와요");
    }
    if(!israining){
      System.out.println("하늘이 맑아요");
    }
    boolean issunuy = false;

    if(!issunuy){
      System.out.println("날씨가 맑아요");
    }
    else{
      System.out.println("집에서 쉬어야죠");
      /블룬 예제
 */
