package src.client;
// 클라이언트

import src.Controller.StudentController;

public class Client {
//1. main가지는 이유

  public static void main(String[] args) {
    StudentController APP = new StudentController();

    APP.StartController();
//2. 왜 nullPoint가 일어났을까?
    APP.StartAPP();
  }
}