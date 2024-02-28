package print;

public class StringReverse {

  public static void main(String[] args) {
    String a = "123456789";
    String b = "";
    StringBuilder sb = new StringBuilder();
    for (int i = a.length() -1; i >=0; i--){
      b = sb.append(a.charAt(i)).toString();
    }
    System.out.println(b);
  }

}
