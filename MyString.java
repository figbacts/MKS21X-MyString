public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int l = 0; l < s.length(); l++){
      data[l] = charAt(l);
    }
  }
  public char charAt(int index){
    if (index < 0 || index >= data.length){
      throw new IndexOutOfBoundsException("Bad index at charAt(index)");
    }
    return data[index];
  }
  public int length(){
    return data.length;
  }
  public String subSequence(int start, int end){
    if (start < 0 || end < 0 || end > data.length){
    throw new IndexOutOfBoundsException("Bad index at subSequence(start,end)");
  }
    String ans = "";
    for(int j = start; j < end; j++){
      ans = ans + data[j];
  }
  return ans;
}
  public String toString(){
    String ans = "";
    for(int j = 0; j < data.length; j++){
    ans = ans + data[j];
  }
  return ans;
}

}
