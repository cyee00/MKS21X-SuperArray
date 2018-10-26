public class SuperArray {
  private String[] data;
  private String[] newData;
  private int size;
  public SuperArray() {
    data = new String[10];
    size=0;
  }
  public void clear() {
    data = new String[10];
    size = 0;
  }
  public int size() {
    return size;
  }
  public boolean isEmpty() {
    return (size==0);
  }
  public boolean add(String str) {
    if (size<data.length){
      data[size]=str;
      size++;
      return true;
    }
    return false;
  }
  public String toString() {
    String ans = "[";
    if (size==0){
      return "[]";
    }
    for (int i=0;i<size-1;i++){
      ans=ans+data[i]+", ";
    }
    return ans+data[size-1]+"]";
  }
  public String toStringDebug() {
    String ans = "[";
    for (int i=0;i<size;i++){
      ans=ans+data[i]+", ";
    }
    for (int i=size;i<data.length-1;i++){
      ans=ans+"null"+", ";
    }
    if (size==data.length){
      return ans+data[size-1]+"]";
    } else {
      return ans+"null"+"]";
    }
  }
  public String get(int index) {
    if (index<0||index>=size){
      System.out.println("Error: index out of range.");
      return null;
    }
    return data[index];
  }
  public String set(int index, String str){
    if (index<0||index>=size) {
      System.out.println("Error: index out of range.");
      return null;
    }
    String ans = data[index];
    data[index]=str;
    return ans;
  }
  private void resize() {
    newData = new String[data.length];
    for (int i=0;i<size;i++){
      newData[i]=data[i];
    }
    data = new String[newData.length+10];
    for (int i=0;i<size;i++){
      data[i]=newData[i];
    }
  }
  public boolean contains(String target) {
    for (int i=0;i<size;i++){
      if (data[i].equals(target)){
        return true;
      }
    }
    return false;
  }
}
