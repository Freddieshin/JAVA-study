public class Person {

  //---나를 추상화하기---

  // 멤버 변수
  String name;
  String mbti;
  int age;

  // 생성자
  public Person(String name, String mbti, int age) {
    this.name = name;
    this.mbti = mbti;
    this.age = age;
  }
  // 메서드
  public void name() {
    System.out.println("제이름은" + name + "입니다");
  }
  public void mbti() {
    System.out.println("mbti는" + mbti + "이고");
  }
  public void age() {
    System.out.println("나이는" + age + "입니다");
  }
}

/*
  String name;
    int phonenumber;
    int money;
    int age;

    //생성자
    public Person(String name, int phonenumber, int money, int age) {
      this.name = name;
      this.phonenumber = phonenumber;
      this.money = money;
      this.age = age;
    }
    public void sayhello(){
      System.out.println("my name is" + name);
    }
    public void saymoney(){
      System.out.println("내가 가진돈은" + money);
    }

    public void teaching(Student student) {
      student.levelUp();
      }
      public void cheating(Student student){
        student.levelDown();
        */
