class Employee {
  private int id;  //�C���X�^���X�ϐ���private���w��
  public Employee(int i) { id = i; } //�R���X�g���N�^��public���w��
  public int getId() { return id; }  //���\�b�h��public���w��
}
public class Sample6_8 {
  public static void main(String[] args) {
    Employee emp = new Employee(100);
    //private �w�肳�ꂽ�����o�́A���N���X����A�N�Z�X�s��
    //System.out.println(
    // "private �w��̃C���X�^���X�ϐ��փA�N�Z�X : " + emp.id);
    //public�w�肳�ꂽ�����o�́A���N���X����A�N�Z�X��
    System.out.println(
      "public�w��̃��\�b�h�փA�N�Z�X : " + emp.getId());
  }
}
