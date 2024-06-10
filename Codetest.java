public class Codetest {
  public static void main(String[] args) {

    static String repeatChar(String str){
      String result = "";

      for(int i=0; i < str.length(); i++){
        char theChar = str.charAt(i);
        result += "" + theChar + theChar;
      }

      return result;

    }
  }
}
/*강사님

static String printAt(String str){

        if(str.length() <= 1){
            return str;
        }

        return str.charAt(0)+"@"+printAt(str.substring(1));

// while 문으로  변형
 static String printAt(String str){

        int i=0;
        String result = "";

        if(str.length() <= i){
            return str;
        }

        while(i < str.length()-1){
            result += str.charAt(i) + "@";
            i++;
        }

        result += str.charAt(i);

        return result;


//        if(str.length() <= 1){
//            return str;
//        }
//
//        return str.charAt(0)+"@"+printAt(str.substring(1));

    }
    }

    static int speedRacer(int speed, boolean isHoliday){
        //휴일인 경우
        if(isHoliday == true && speed > 65 && speed <= 85   ){
            return 100;
        }
        if(isHoliday == true && speed >= 86 ){
            return 200;
        }
        if(isHoliday == true && speed <= 65){
            return 0;
        }

        // 휴일이 아닌 경우
        if(speed > 60 && speed <= 80   ){
            return 100;
        }
        if(speed >= 81 ) {
            return 200;
        }else{
            return 0;
        }
    }

    static int speedRacer(int speed, boolean isHoliday){
      int safeSpeed = 60;
      int dangerSpeed = 80;
      int tax = 0;

      if(isHoliday){
          safeSpeed += 5;
          dangerSpeed += 5;
      }
      if(speed > dangerSpeed){
          tax = 200;
      }
      if(speed <= safeSpeed){
          tax = 0;
      }
      if(speed > safeSpeed && speed <= dangerSpeed){
          tax = 100;
      }
      return tax;
    }

    public static boolean twoSumOne(int a, int b, int c) {
        return (a + b == c) || (a + c == b) || (b + c == a);
    }

        public static boolean isOrdered(int first, int second, int third, boolean opt) {
//        if(opt){
//            return second < third;
//        }
//        return (first < second) && (second < third);

        return opt ? second < third : (first < second) && (second < third);
    }

            System.out.println(twoSumOne(1, 2, 3)); // true
    System.out.println(twoSumOne(3, 1, 2)); // true
    System.out.println(twoSumOne(3, 2, 2)); // false
  }

  public static boolean twoSumOne(int a, int b, int c) {
    return a + b == c || a + c == b || b + c == a;

    System.out.println(secomDalcom(1)); // "1!"
    System.out.println(secomDalcom(2)); // "2!"
    System.out.println(secomDalcom(3)); // "새콤!"
    System.out.println(secomDalcom(5)); // "달콤!"
    System.out.println(secomDalcom(15)); // "새콤달콤!"
    System.out.println(secomDalcom(13)); // "13!"
  }

          boolean secom = n % 3 == 0;
        boolean dalcom = n % 5 == 0;

        if(secom && dalcom) return "새콤달콤";
        if(secom) return "새콤!";
        if(dalcom) return "달콤!";
        return n+"!";
    }

        public static int sumUnique(int a, int b, int c) {
//        3개의 정수 인자 a, b, c가 주어졌을 때, 이들의 합을 반환하세요.
//        하지만, 인자 중 하나가 다른 인자와 동일하면, 그 숫자는 합산에서 제외합니다.
//                기본적으로 중복되지 않는 숫자만 합산합니다.
        if( a == b && b == c) return 0;
        if(a == b) return c;
        if(a == c) return b;
        if(b == c) return a;
        return a + b + c;
    }

    static String repeatChar(String str){
        String result = "";

        for(int i=0; i < str.length(); i++){
            char theChar = str.charAt(i);
            result += "" + theChar + theChar;
        }

        return result;

    }
    ----------
        System.out.println(printAt("hello")); // "h@e@l@l@o"
  }

  public static String printAt(String str) {
    // 종료: 문자열의 길이가 1 이하인 경우, 그대로 반환
    if (str.length() <= 1) {
      return str;
    }

    // 첫 문자와 재귀결과를 더해서 출력
    return str.charAt(0) + "@" + printAt(str.substring(1));

      System.out.println(money(60, false)); // 출력: 0
    System.out.println(money(61, false)); // 출력: 100
    System.out.println(money(81, false)); // 출력: 200
    System.out.println(money(65, true)); // 출력: 0
    System.out.println(money(66, true)); // 출력: 100
    System.out.println(money(86, true)); // 출력: 200
  }

  public static int money(int speed, boolean isHoliday) {
    int limit = 60;

    if (isHoliday) {
      limit += 5;
    }

    if (speed <= limit) {
      return 0;
    } else if (speed <= limit + 20) {
      return 100;
    } else {
      return 200;
    }
  }

    System.out.println(isCool(22)); // true (11의 배수)
    System.out.println(isCool(23)); // true (11의 배수보다 1 큼)
    System.out.println(isCool(24)); // false (11의 배수도 아니고, 11의 배수보다 1 크지도 않음)
  }

  public static boolean isCool(int n) {
    return n % 11 == 0 || n % 11 == 1;

        System.out.println(secomDalcom(1)); // "1!"
    System.out.println(secomDalcom(2)); // "2!"
    System.out.println(secomDalcom(3)); // "새콤!"
    System.out.println(secomDalcom(5)); // "달콤!"
    System.out.println(secomDalcom(15)); // "새콤달콤!"
    System.out.println(secomDalcom(13)); // "13!"
  }

  public static String secomDalcom(int n) {
    if (n % 3 == 0 && n % 5 == 0) {
      return "새콤달콤!";
    } else if (n % 3 == 0) {
      return "새콤!";
    } else if (n % 5 == 0) {
      return "달콤!";
    } else {
      return n + "!";
    }
  }
}

    System.out.println(sumUnique(1, 2, 3)); // 6
    System.out.println(sumUnique(3, 2, 3)); // 2
    System.out.println(sumUnique(3, 3, 3)); // 0
  }

  public static int sumUnique(int a, int b, int c) {
    int sum = 0;

    if (a != b && a != c) {
      sum += a;
    }

    if (b != a && b != c) {
      sum += b;
    }

    if (c != a && c != b) {
      sum += c;
    }

    return sum;
  }

      System.out.println(repeatChar("The")); // "TThhee"
    System.out.println(repeatChar("AAbb")); // "AAAAbbbb"
    System.out.println(repeatChar("Hi-There")); // "HHii--TThheerree"
  }

  public static String repeatChar(String input) {
    StringBuilder result = new StringBuilder();

    for (char c : input.toCharArray()) {
      result.append(c).append(c);
    }

    return result.toString();
  }
*/
