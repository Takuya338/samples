class A {
  final void x() {  //�I����C
    System.out.println("A:x()");
  }
  public void y() {  //�I����D
    System.out.println("A:y()");
  }
}
class B extends A { }
class Test {
  public static void main(String[] args) {
    B obj = new B();
    obj.x();
    obj.y();
  }
}
