package src.View;
// 1. view란

import src.Model.StudentVO;

import java.util.Scanner;

public class StudentView {
  public int act;
// 2. act 변수

  private int startNum = 1;
  // 5. private start/ end 거는 이유

  private int endNum = 2; // 주석 추천! 기능이 추가된다면 마지막 번호로 변경할 것!

  public void StartView() {
    Scanner sc = new Scanner(System.in);
    while (true) {
      // 4. 유효성 검사 걸기 while
      System.out.println("학생부 프로그램입니다.");
      System.out.println("1. 이름 출력 2. 종료");
      System.out.print("입력) ");
      this.act = sc.nextInt();
      // 2. act 변수 >> this.act쓰는 이유

      if (startNum <= act && act <= endNum) {
        // 만약 정상적으로 누른다면 break
        break;
      }
      System.out.println("번호 확인 후 다시 입력해주세요");
    } // while

// 3. 다른 생성자 필요?

// 4. 유효성 검사 while

  }// 스타트 뷰

  public void func1(StudentVO vo) {
    // 6. 학생의 이름을 파라미터로 받아야 헀고
    System.out.println("학생 이름 : " + vo.getName());
    System.out.println("점수 : "+vo.getScore());
  }// 기능 1
  public void func2(StudentVO vo){
    System.out.println("시스템이 종료가 됩니다.");
  }
}