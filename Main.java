public class Main {
  public static void main (String[] args){
    if (args.length>0) {
      String fullname="";
      for (String arg : args) {
        fullname=fullname+" "+arg;
      }
      System.out.println("hello"+fullname);
    }
    else{
      System.out.println("hello world");
    }
  }
}
