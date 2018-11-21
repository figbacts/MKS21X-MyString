public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int l = 0; l < s.length(); l++){
      data[l] = charAt(l);
    }
  }
  public char charAt(int index){
    try{
    return data[index];}
    catch(IndexOutOfBoundsException e){
      System.out.println("Bad index using charAt");
      System.exit(1);
    }
  }
  public int length(){
    return data.length;
  }
  public String subSequence(int start, int end){
    if (start < 0 || end < 0 || end > data.length){
      System.out.println("Bad index using subSequence");
      System.exit(1);
    }
    String ans = "";
    for (int l = 0; l < s.length(); l++){
      ans = data[l];
  }
}
  public String toString(){
    String ans = "";
    for (int l = 0; l < s.length(); l++){
    ans = ans + charAt(l);
  }
  return ans;
}

}
