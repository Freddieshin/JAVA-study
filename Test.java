public class Test {
  public static void main(String[] args) {

    //나를 추상화 하기
    Person person = new Person("신재민", "ISTJ", 33);
    person.name();
    person.mbti();
    person.age();

    // 객체를 상호작용시키기
    Student student = new Student();
    student.beforestudy(student);
    System.out.println(student.javalevel);

    student.study(student);
    System.out.println(student.javalevel);

    student.notstudy(student);
    System.out.println(student.javalevel);
  }
}

  /*

   static int add(int a, int b) {
      return a + b;
    }
    static int sub(int a, int b) {
      return a - b;
    }
    static int mul(int a, int b) {
      return a * b;
    }
    static int div(int a, int b) {
      return a / b;
// 함수실습
      static void login(String email, String password) {
// 파라미터 아규먼트 실습
    }

  test2 test2 = new test2();
     System.out.println(test2.b);
     System.out.println(test2.good());
     //  b는 test2에서 변수로 선언되어 ()를 않써도됨.
//외부클래스 사용
   test2.call();
 // static 사용

     test2.quiz();

    System.out.println(test2.add(1, 2));
    System.out.println(test2.sub(1, 2));

        Person person1 = new Person("신재민", 01044866624, 100, 33);
    Person person2 = new Person("Freddie", 01012346624, 100, 33);
    Person person3 = new Person("김승조", 01012346624, 1, 40);
    Person person4 = new Person("한재현", 01012346624, 2, 40);

        Person person3 = new Person("김승조", 01012346624, 1, 40);
    person3.sayhello();
    person3.saymoney();

    Student student = new Student();
    person3.teaching(student);
    person3.cheating(student);
   */
