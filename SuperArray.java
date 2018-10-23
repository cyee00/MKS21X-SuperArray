public class SuperArray {
  private String[] data;
  private int size;
  public SuperArray() {
    String[] data = new String[10];
  }
  public void clear() {
    size = 0;
  }
  public int size() {
    return size;
  }
  public boolean isEmpty() {
    return (size==0);
  }
  public boolean add(String str) {
    data[size]=str;
    return true;
  }
  public String toString() {
    String ans = "[";
    for (int i=0;i<size-1;i++){
      ans=ans+data[i]+", ";
    }
    return ans+data[size-1]+"]";
  }
}
