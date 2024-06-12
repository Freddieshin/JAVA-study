public class Car {
  private int speed;

  private int gear;
  private String wheel;
  private int cc;
  private String logo;
  private String engine;

  // Getter 는 객체의 데이터를 가져오는 것. Setter 객체의 데이터를 설정하는 것.
  public double getSpeed() {
    double km = speed * 1.6;
    return km;
  }

  public void setGear(int gear) {
    this.gear = gear;
  }

  public void setWheel(String wheel) {
    this.wheel = wheel;
  }

  public void setCc(int cc) {
    this.cc = cc;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public void setSpeed(int speed) {
    this.speed = speed < 0 ? 0 : speed;

    /* if (speed < 0) {
           this.speed = 0;
       } else {
           this.speed = speed;
       }

    public void setSpeed(int speed) {
       if (speed < 0) {
         this.speed = 0;
       } else {
         this.speed = speed;
       }

       if (this.speed <= 30) {
         this.gear = 1;
       } else if (this.speed <= 70) {
         this.gear = 2;
       } else {
         this.gear = 3;
       }
       // 퀴즈
         public void setSpeed(int speed) {
       if (speed < 0) {
         this.speed = 0;
         return;
       }
       this.speed = speed;

       if (speed <= 30) {
         this.gear = 1;
       } else if (speed <= 70) {
         this.gear = 2;
       } else {
         this.gear = 3;
       }
       //강사님코드
     }
     */
  }
}
