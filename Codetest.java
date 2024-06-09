public class Codetest {
  public static void main(String[] args) {

    System.out.println(arry(new int[] {1, 2, 3, 4, 5}, 5)); // 출력: 4
    System.out.println(arry(new int[] {1, 2, 3, 4, 5}, 6)); // 출력: -1
  }

  static int arry(int[] number, int target) {
    for (int i = 0; i < number.length; i++) {
      if (number[i] == target) {
        return i;
      }
    }
    return -1;
  }
}

/*강사님
      static String getMiddleThree(String str){
        String result = str;
        // Monitor
//        "Monitor".length()/2
//        "hellowolr".length()/2
        // substring()
        if(str.length() >= 3){
          int midIdx = str.length()/2;

          result = str.substring(midIdx-1, midIdx+2);
        }

        return result;

//        if(barking && (hour < 7 || hour > 20)){
//            return "짖으면 안돼!!";
//        }else{
//            return "든든하군!";
//        }

        return barking && (hour < 7 || hour > 20) ? "짖으면 안돼!!" : "든든하군!";

         int i =0;
        while(true){
            // i 의 값이 업데이트 되면서 해당 인덱스의 문자열을 탐색합니다.
            int idx = str.indexOf("category:", i);
            if(idx == -1){
                break;
            }

            int startIdx = idx + 9;
            int endIdx = str.indexOf(',', startIdx);

            System.out.println(str.substring(startIdx, endIdx));

            i = endIdx+1;
        }
    }
        System.out.println(arry(new int[] {1, 2, 3, 4, 5}, 5)); // 출력: 4
    System.out.println(arry(new int[] {1, 2, 3, 4, 5}, 6)); // 출력: -1
  }

  static int arry(int[] number, int target) {
    for (int i = 0; i < number.length; i++) {
      if (number[i] == target) {
        return i;
      }
    }
    return -1;
--------------
        public static String getMiddleThreeChars(String str) {
      int length = str.length();

      // 문자열 길이가 3보다 작으면 문자열 자체를 반환하고
      if (length < 3) {
        return str;
      }

      // 문자열 길이가 홀수인지 확인
      else if (length % 2 != 0){
        int middleIndex = length / 2;
        return str.substring(middleIndex - 1, middleIndex + 2);
      }
      return str;
      }

    // static ==> 클래스 레벨의 필드와 메서드를 정의할때 사용하는 키워드
    // 클래스레벨 ==> 인스턴스에 속하지 X

    System.out.println(dogsound(true, 6)); // "짖으면 안돼!!"
    System.out.println(dogsound(true, 7)); // "든든하군!"
    System.out.println(dogsound(false, 5)); // "든든하군!"
  }

  public static String dogsound(boolean barkingDog, int hour) {
    if (barkingDog && (hour < 7 || hour > 20)) {
      return "짖으면 안돼!!";
    } else {
      return "든든하군!";
    }
    // 변수 선언
        String text =
        "When organizing items, always label each group with the appropriate "
            + "category. category: books, category: electronics, category: clothing, category: kitchenware, and so on.";
    // 카테고리 문자열 찾기
    Categories(text);
  }

  public static void Categories(String text) {
    String target = "category: ";
    int index = text.indexOf(target);

    while (index != -1) {
      int start = index + target.length();
      int end = text.indexOf(",", start);
      if (end == -1) {
        end = text.indexOf(".", start);
      }
      if (end == -1) {
        end = text.length();
      }

      String category = text.substring(start, end).trim();
      System.out.println(category);

      index = text.indexOf(target, start);
    }
  }

    String quiz = "물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.";

    // 문자열 순서대로 출력
    for (int i = 0; i < quiz.length(); i++) {
      System.out.println(quiz.charAt(i));
    }

    System.out.println("\n반대로:");

    // 문자열 거꾸로 출력
    for (int i = quiz.length() - 1; i >= 0; i--) {
      System.out.println(quiz.charAt(i));
    }*/
