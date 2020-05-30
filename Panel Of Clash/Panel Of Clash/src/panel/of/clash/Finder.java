import java.util.ArrayList;

class Finder {
  
  int Find (ArrayList <Student> a, String b) {
    
    int i = -1;
    
    for(int j = 0; j < a.size(); j++){
      if(a.get(j).getUser().equals(b)) i = j;
    }
    return i;
  }
  
  int Find2 (ArrayList <Student> a1, String b) {
    
    int i = -1;
    
    for(int j = 0; j < a1.size(); j++){
      if(a1.get(j).getStid().equals(b)) i = j;
    }
    return i;
  }
  
  boolean Find3 (ArrayList<String> a3, String b, boolean f){
    for(int i = 0; i < a3.size(); i++){
      if(a3.get(i).equals(b)) f=true;
    }
    return f;
  }
}