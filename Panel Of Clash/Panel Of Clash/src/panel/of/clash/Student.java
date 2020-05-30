import java.util.ArrayList;

class Student {
  
  String name;
  String stid;
  String pass;
  String user;
  
  ArrayList<String> obj = new ArrayList<String>();
  
  
  void setStid(String id){
    stid = id;
  }
  
  void setName(String n){
    name = n;
  }
  
  void setUser(String u){
    user = u;
  }
  
  void setPass(String p){
    pass = p;
  }
  
  String getName(){
    return name;
  }
  
  String getUser(){
    return user;
  }
  
  String getPass(){
    return pass;
  }
  
  String getStid(){
    return stid;
  }
  
  void addCourse(String c){
    obj.add(c);
  }
  
  void dropCourse(int i){
    obj.remove(i-1);
  }
  
  void ShowCourses(){
    if(obj.size()==0) System.out.println("\n *** no courses found *** \n");
    else for(int i = 1; i <= obj.size(); i++) System.out.println(" #"+i+" "+obj.get(i-1));
  }
  
  int CourseTaken (){
    return obj.size();
  }
  
  int totCourse(){
    return obj.size();
  }
  
  ArrayList<String> Send(){
    return obj;
  }
}

