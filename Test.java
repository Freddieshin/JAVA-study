import javax.naming.Name;

public class Test {
  public static void main(String[] args) {

    int count = 1;

    while (true) {
      System.out.println("Count: " + count);

      if (count == 10000) {
        System.out.println("Count 10,000. Stop");
        break;
      }

      count++;
    }
  }
}

/*
    int i = 1;

    while (i <= 5) {
    System.out.println("현재 i의 값: " + i);
    i++;
}

    int i = 10;
    while (i >= 0) {
      System.out.println("현재 카운트 :" + i);
      i--;
    }
    System.out.println("카운트 종료");

        int n = 100;
    int sum = 0;
    int i = 1;

    while (i <= n) {
      sum += i;
      i++;
    }
    System.out.println(sum);
    // 퀴즈

    int sum = IntStream.rangeClosed(1, 100).sum();

    System.out.println(sum);

    int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
    int i = 0;
    int sum = 0;
    while (i < numbers.length) {
      sum += numbers[i];
      i++;
    }
    System.out.println(sum / numbers.length);
    // 퀴즈

    int i = 0;
    while (i <= 300) {
    if (i % 3 == 0) // 3배수만 출력하기
    System.out.println(i);
    i++;
    }

        int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};

      int max = numbers[0];
      int i = 1;
      while(i<numbers.length){
        if (numbers[i] > max) {
          max = numbers[i];
        }
        i++;
      }
      System.out.println(max);

      int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
      int positiveSum = 0;
      int negativeSum = 0;
      int i = 0;
      while (i < numbers.length) {
      if (numbers[i] > 0) {
      positiveSum += numbers[i];
      } else {
      negativeSum += numbers[i];
      }
      i++;
      }
      System.out.println(positiveSum);
      System.out.println(negativeSum);

      for(int i=1;i<=5;i++){ //초기식,조건식,증감식
      System.out.println("현재 i의 값은="+i);

       int sum = 0;
      for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
      sum += 1;
      }
      System.out.println(sum);
    }

    // 피보나치 이론
    int n = 10;
    int[] fibArray = new int[n];

    // 피보나치 수열의 첫 번째와 두 번째 항을 초기화
    fibArray[0] = 1;
    fibArray[1] = 1;

    // for문을 사용하여 피보나치 수열을 계산하고 배열에 저장
    for (int i = 2; i < n; i++) {
      fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
    }

    // 피보나치 수열이 저장된 배열 출력
    System.out.print("피보나치 수열의 첫 " + n + "개 항: ");
    for (int i = 0; i < n; i++) {
    System.out.print(fibArray[i] + " ");

    // 피보나치 배열의 또다른 방법 Arrays.setAll(arr, i -> (i < 2) ? 1 : arr[i - 1] + arr[i - 2]);

    for (int i = 1; i < 10; i++)
    for (int j = 1; j < 10; j++)
    System.out.println("<" + i + "> x <" + j + "> = <" + i * j + ">");
    // 구구단 만들기

    for (int i = 19; i > 0; i--) {
    for (int j = 19; j > 0; j--) {
    System.out.printf("%d * %d = %d%n", i, j, i * j);
    }
    }
    // 역방향 구구단
    }

    int number = 0;
    while (number < 10) {
    System.out.println("현재숫자:" + number);
    if (number == 5) {
    System.out.println("5가 되었습니다.");
    break;
    }
    number++;
    }
    for (int i = 0; i < 10; i++) {
    System.out.println("현재 i의 값은 = " + i);
    for (int j = 0; j < 10; j++) {
    System.out.println("현재 j의 값은 =" + j);
    if (j == 5) {
    break;
    }
    }
    }

    for (int i = 1; i <= 100; i++){
    System.out.println("현재 i의 값은 = "+ i);
    }
    if (i == 50)
    break;
    for (int j = 2; i <= 100; j++){
    ("현재 j의 값은 =" + j)
    }
    if (j == 80)
    break;

    int number = 0;

    while (number < 10) {
    number++;
    if (number == 3) {
    continue; // else 대신에 바로 continue 사용가능.
    } else {
    System.out.println("현재 숫자 : " + number);
    }
    }
    // 퀴즈

    int [] scores = {1,2,3,4,5,6};
    int sum = 0;
    double avg;
    for (int i : scores){
    sum += i;
    }
    avg = (double) sum / scores.length;
    System.out.println("점수" + sum);
    System.out.println("평균" + avg);

    String[] arr = {"okay2", "asbds", "good2", "ormiiiii", "abcde"};

    for (String str : arr) {
    if (str.length() >= 5) {
    System.out.println(str);
    }
    }
    // 퀴즈
 */
