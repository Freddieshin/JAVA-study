public class Student {

  // ---새로운 객체를 만들기

  // 멤버 변수
  int javalevel;

  // 생성자
  public Student() {
    this.javalevel = 0;
  }

  //---객체 상호작용 시키기---
  // 객체 메서드
  public void beforestudy(Student student) {
    student.level();
  }
  public void study(Student student){
    student.levelup();
  }

  public void notstudy(Student student){
    student.leveldown();
  }
  public void level() {
    javalevel=0;
    System.out.println("현재 레벨은 0입니다");
  }
  public void levelup() {
    javalevel++;
    System.out.println("공부해서 레벨1이 올랐습니다!");
  }
  public void leveldown() {
    if (javalevel <= 1) {
      javalevel--;
    }
    System.out.println("레벨이 1감소 했습니다.");
    System.out.println("현재 레벨은 = " + 0 + "입니다ㅠ 공부하세 레벨업하세요!");
  }
}

/*
int level; //멤버 변수

// 생성자
public Student() {
  this.level = 1;
}

//메서드 (기능)
public void levelUp() {
  level++;
  System.out.println("레벨이 1 상승했습니다!");
}

public void levelDown() {
  level--;
  System.out.println("레벨이 1감소 했습니다.");
  System.out.println("현재 레벨은 " + level +" 입니다.");

  if (level > 1) {
    level--;
  }
  System.out.println("레벨이 1감소 했습니다.");
  System.out.println("현재 레벨은 = " + level + "입니다.");
  */
