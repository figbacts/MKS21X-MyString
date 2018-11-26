public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int l = 0; l < s.length(); l++){
      data[l] = s.charAt(l);
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
public int compareTo(CharSequence string){
  int dlen = data.length;
  int slen = string.length();
  int small= 0;
  if (dlen > slen){
    small = slen;
  }
  else{
    small = dlen;
  }
  for (int j = 0; j < small; j++){
    if (data[j] > string.charAt(j)){
      return 1;
    }
    if (data[j] < string.charAt(j)){
      return -1;
    }
  }
  if (dlen > slen){
    return 1;
  }
  if (dlen < slen){
    return -1;
  }

return 0;
}

}
