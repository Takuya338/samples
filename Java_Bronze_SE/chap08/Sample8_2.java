abstract class X {                // ΫNX
  protected abstract void methodA();     
}
abstract class Y extends X { }    // ΫNX
class Z extends Y {               // οΫNX
  protected void methodA() { } 
  //public void methodA() { }     // publicCόqΕΰOK
  //void methodA() { }            // CόqΜwθΘ΅ΝNG 
}
