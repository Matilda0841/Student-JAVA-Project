package src.Model;
// 학생부 Ver1
// 이름 점수 필요


// 데이터 공간 있는 거 자바로 어떻게 가져올지 고민한다고
// 1. vo(value Object)!
public class StudentVO {

  private int num;
  // 2.pk
  private String name;
  private int score;


  // 3. 게터세터 거는 이유
  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  @Override
  // 4. toString 이유
  public String toString() {
    return "StudentVO{" + "num=" + num + ", name='" + name + '\'' + ", score=" + score + '}';
  }

  // 5. Start Model 만든 이유?
  public void StartModel() {
    this.name = "홍길동";
    this.num = 1001;
    this.score = 90;
  }
}