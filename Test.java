import javax.naming.Name;

public class Test {
  public static void main(String[] args) {

    char grade = 'A';
    switch (grade) {
      case 'A':
        System.out.println("Excellent");
        break;
      case 'B':
        System.out.println("Good");
        break;
      case 'C':
        System.out.println("Average");
        break;
      case 'D':
        System.out.println("Below Average");
        break;
      case 'F':
        System.out.println("Fail");
        break;
    }

    char operator = '+';
    int num1 = 1, num2 = 2;
    switch (operator) {
      case '+':
        System.out.println(num1 + num2);
        break;
      case '-':
        System.out.println(num1 - num2);
        break;
      case '*':
        System.out.println(num1 * num2);
        break;
      case '/':
        System.out.println(num1 / num2);
        break;
    }

    String color = "red"; // String은 "쌍따옴표"
    switch (color) {
      case "red":
        System.out.println("Apple");
        break;
      case "green":
        System.out.println("Grass");
        break;
      case "blue":
        System.out.println("Sky");
        break;
    }

    int score = 100;
    switch (score / 10) {
      case 10:
        System.out.println('A');
        break;
      case 9:
        System.out.println('A');
        break;
      case 8:
        System.out.println('B');
        break;
      case 7:
        System.out.println('C');
        break;
      case 6:
        System.out.println('D');
        break;
      default:
        System.out.println('F');
    }

    String programing = "java";
    switch (programing) {
      case "java":
        System.out.println("java is");
        break;
      case "Python":
        System.out.println("Python is");
        break;
      case "C++":
        System.out.println("C++ is");
        break;
      case "javascript":
        System.out.println("javascript is");
        break;
        // 퀴즈 실습
    }
  }
}

/*
int number1 = 10;
int number2 = 3;

int sum = number1 + number2;
int diff1 = number1 - number2;
int diff2 = number1 - number2;

int product = number1 * number2;
int quotient = number1 / number2;
int remainder = number1 % number2;
//int가 정수타입이므로 실수가 아닌 정수가 출력됨

System.out.println("덧셈: " + sum);
System.out.println("뺄셈1: " + diff1);
System.out.println("뺄셈2: " + diff2);
System.out.println("곱셈: " + product);
System.out.println("나눗셈: " + quotient);
System.out.println("나머지: " + remainder);

byte a = 1;
byte b = 1;
byte c = a + b; // 에러. byte는 int로 변환 후 연산되기 때문
int c = a + b;

int a = 10;
int b = 4;
int c = a / b;  // 2
double d = (double) a / b;   // 2.0

System.out.println(d);

char c1 = 'A' + 1;   // 'B' (유니코드 66은 문자 B)
char c2 = 'A';
char c3 = c2 + 1;   // 에러

String str1 = "안녕하세요";
String str2 = str1 + "반나서 반갑습니다.";
String str3 = str1 + str2;

System.out.println(str3);

// 문자열 "Hello"와 123이 먼저 연산되어 "Hello123"이 되고,
// 이것을 다시 456과 연산하여 "Hello123456"이 됩니다.
System.out.println("Hello" + 123 + 456); // Hello123456

// 숫자 123과 456이 먼저 연산되어 579가 되고,
// 이것을 문자열 "Hello"와 연산하여 "579Hello"가 됩니다.
System.out.println(123 + 456 + "Hello"); // 579Hello
// 왼쪽부터 오른쪽으로 출력 그러니까 숫자 부터 계산이 됨.
StringBuilder sb = new StringBuilder();
sb.append(123);
sb.append(456);
sb.append("Hello");
System.out.println(sb);

int number = 10;
int number2 = 30;

System.out.println(number2==number);

/*System.out.println(number > number2);
System.out.println(number2 > number);
System.out.println(number >=number2);
System.out.println(number>= number2);

String a = new String();
String b = new String();

System.out.println(a.equals(b));
// String은 참조타입으로 각기 다른 주소값을 가지고 있으므로, 이퀄을써서 비교해야함

// ! 중요 String의 hip 개념
String str1 = "Hello";
String str2 = "Hello";
// str 1과 2는 동일한 "문자열 Hello"를 가지고 있어 바라보는 객체가 같음.
String str3 = new String("Hello");
// str3는 문자열이 틀리므로 1,2가 다른 주소값을 가짐.
System.out.println(str1 == str2); // true
System.out.println(str1 == str3); // false

System.out.println(true && false);
System.out.println(true && false);
System.out.println(false && true);
System.out.println(false && false);
// AND
System.out.println(true || false);
System.out.println(true || false);
System.out.println(false || true);
System.out.println(false || false);
// OR

System.out.println(true ^ !false);
System.out.println(true ^ !false);
System.out.println(false ^ !true);
System.out.println(false ^ !false);

//  x는 5보다 크고 13보다 작다.
x > 5 && x < 13
//  i는 2의 배수이면서 3의 배수이다.
i% 2 == 0 && i% 3 == 0
//  x는 30의 배수이면서 2의 배수이다.
x% 30 == 0 && x% 2 ==0 || x% 5 ==0 , (x % 30 == 0) && ((x % 2 ==0 ) || (x%5==0))

System.out.println(1|1);
System.out.println(1|0);
System.out.println(0|0);
System.out.println(1^~1);
System.out.println(1^~0);
System.out.println(0^~0);

int score = 95;
char grade = (score > 90) ? 'A' : 'B';
System.out.println(grade);

// Score는 95점 이고, 5의 배수이면 "good"을 아니라면, "bad"를 출력하세요
int score = 95;
String grade = (score == 95) && (score % 5 == 0) ? 'good' : 'bad';
System.out.println(grade);


    int score = 95;
    char grade;
    if (score > 90) {
      grade = 'A';
    } else {
      grade = 'B';
    }

    System.out.println("당신의 학점은 : " + grade);
    //    간단한 조건문은 삼항연산자로 가능하지만 길고 복잡하면 if문 사용


    int a =10;
    int b =9;
    if(a>b){
      System.out.println("a is greater than b");
    }
    else if (a==b){
      System.out.println("a and b are equal");
    }
    else {
    System.out.println("a is less than b");
    // 실습
    System.out.println(a>b ? "a is greater than b" : (a < b) ? "a is less than b" : "a and b are equal";
    // 삼항연산자로 변환

   // 퀴즈
    int x = 10;
    if (x > 0) {
      System.out.println("x는 양수입니다");
    } else if (x < 0) {
      System.out.println("x는 음수입니다.");
    } else {
      System.out.println("x는 0입니다");
    }
    System.out.println(x > 0 ? "x는 양수입니다" : x < 0 ? "x는 음수입니다." : "x는 0입니다");

    int score = 75;
    if (score >= 90) {
      System.out.println("A");
    } else if (score >= 80) {
      System.out.println("B");
    } else if (score >= 70) {
      System.out.println("C");
    } else if (score >= 60) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }

    int year = 2023;
    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
      System.out.println("윤년 입니다.");
    } else {
      System.out.println("윤년이 아닙니다.");
    }

    int a = 10, b = 20, c = 30;
    if (a >= b) {
      if (a >= c) {
        System.out.println(a);
      } else {
        System.out.println(c);
      }
    } else {
      if (b >= c) {
        System.out.println(b);
      } else {
        System.out.println(c);
      }
    }

    int passScore = 60;
    int myScore = 75;
    if(myScore >= passScore){
      System.out.println("합격");
    } else{
      System.out.println("불합격");
    }
    System.out.println(myScore >= passScore ? "합격" : "불합격");
    // 퀴즈 실습


    int a = 10;
    int b = 5;

    boolean result1 = (a > 5) && (b < 10); // true && true -> true
    boolean result2 = (a > 5) || (b > 10); // true || flase -> true
    boolean result3 = !(a > 5); // !true -> flase

    int three = 3;
    int five = 5;
    int tow = 2;

    boolean result = (five > three) || (five < tow) && (five < three);
    // true || flase && flase -> ture // OR는 하나라도 true가 있으면 트루
    // && 와 ||중에는 &&가 우선처리순서를 가진다.

    boolean x = true;
    boolean y = false;
    boolean z = true;

    if (x && !y) {
      System.out.println("조건 1 충족");
    }
    if ((x && !y) || (!x && y)) {
      System.out.println("조건 2 충족");
    }
    if (x || y || z) {
      System.out.println("적어도 하나는 참");
    }
    if (!x && !y && !y) {
      System.out.println("모두 거짓");
    }
    // 퀴즈 실습

        String date = "수요일"

    switch (weekend) {
      case "월"
        System.out.println("java");
        break;
      case "화"
        System.out.println("java");
        break;
      case "수"
        System.out.println("java");
        break;
      case "목"
        System.out.println("java");
        break;
      case "금"
        System.out.println("java");
        break;
      }
      //퀴즈 실습
 */
