package src.Controller;

import src.Model.StudentVO;
import src.View.StudentView;

public class StudentController {
  // 1. import
  StudentVO vo;
  StudentView view;

  public void StartController() {
    // 2.1 load
    view = new StudentView();
    vo = new StudentVO();

    vo.StartModel(); // 2.2 load (db데이터)

  } // 스타트 컨트롤

  public void StartAPP() {
    // 3. StartAPP
    while (true) {
      view.StartView();
      if (view.act == 1) {
//        view.1에 대한 화면출력기능이 x
        view.func1(vo); // db 데이터를 인자로 주기
        // db데이터를 v파트로 옮기는 것(인자로 전달하는 것)은 c의 몫이다
      } else if (view.act == 2) {
        view.func2(vo);
        break;
      }
    }// 스타트 앱
  }
}