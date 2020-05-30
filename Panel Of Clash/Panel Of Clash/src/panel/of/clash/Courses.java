import java.util.ArrayList;

class Courses {
  
  
  ArrayList<String> CSE201 = new ArrayList<String>();
  ArrayList<String> CSE211 = new ArrayList<String>();
  ArrayList<String> CSE303 = new ArrayList<String>();
  ArrayList<String> CSE313 = new ArrayList<String>();
  ArrayList<String> CSE317 = new ArrayList<String>();
  ArrayList<String> CSE403 = new ArrayList<String>();
  ArrayList<String> CSE420 = new ArrayList<String>();
  ArrayList<String> CSE421 = new ArrayList<String>();
  ArrayList<String> CSE428 = new ArrayList<String>();
  ArrayList<String> CSE451 = new ArrayList<String>();
  
  
  
  void CourseList(){
    
    System.out.println("\n *** these are the available courses *** ");
    System.out.println(" #1  CSE201 - Discrete Mathematics ");
    System.out.println(" #2  CSE211 - Data Structure ");
    System.out.println(" #3  CSE303 - Database Management ");
    System.out.println(" #4  CSE313 - Compiler Construction ");
    System.out.println(" #5  CSE317 - Data Communication ");
    System.out.println(" #6  CSE403 - Network Management ");
    System.out.println(" #7  CSE420 - Image Processing ");
    System.out.println(" #8  CSE421 - Machine Learning "); 
    System.out.println(" #9  CSE428 - Pattern Recognition ");
    System.out.println(" #10 CSE451 - Artificial Intelligence \n");
    
  }
  
  
  String CourseName(int i){
    
    if(i==1) return "CSE201 - Discrete Mathematics";
    else if(i==2) return "CSE211 - Data Structure";
    else if(i==3) return "CSE303 - Database Management";
    else if(i==4) return "CSE313 - Compiler Construction";
    else if(i==5) return "CSE317 - Data Communication";
    else if(i==6) return "CSE403 - Network Management";
    else if(i==7) return "CSE420 - Image Processing";
    else if(i==8) return "CSE421 - Machine Learning";
    else if(i==9) return "CSE428 - Pattern Recognition";
    else return "CSE451 - Artificial Intelligence";
    
  }
  
  
  void addMem(int i, String s) {
    
    s=s.toUpperCase();
    if(i==1) CSE201.add(s);
    else if(i==2) CSE211.add(s);
    else if(i==3) CSE303.add(s);
    else if(i==4) CSE313.add(s);
    else if(i==5) CSE317.add(s);
    else if(i==6) CSE403.add(s);
    else if(i==7) CSE420.add(s);
    else if(i==8) CSE421.add(s);
    else if(i==9) CSE428.add(s);
    else if(i==10) CSE451.add(s);
    
  }
  
  void Enrolled(int i, Courses c1){
    System.out.println(" \n *** "+c1.CourseName(i)+" ENROLLED STUDENTS *** \n");
    if(c1.Counter(i)==0) System.out.println("\n *** no student has been enrolled *** \n");
    else{
      if(i==1) for(int j = 0; j < CSE201.size(); j++) System.out.println("#"+(j+1)+" "+CSE201.get(j));
      else if(i==2) for(int j = 0; j < CSE211.size(); j++) System.out.println("#"+(j+1)+" "+CSE211.get(j));
      else if(i==3) for(int j = 0; j < CSE303.size(); j++) System.out.println("#"+(j+1)+" "+CSE303.get(j));
      else if(i==4) for(int j = 0; j < CSE313.size(); j++) System.out.println("#"+(j+1)+" "+CSE313.get(j));
      else if(i==5) for(int j = 0; j < CSE317.size(); j++) System.out.println("#"+(j+1)+" "+CSE317.get(j));
      else if(i==6) for(int j = 0; j < CSE403.size(); j++) System.out.println("#"+(j+1)+" "+CSE403.get(j));
      else if(i==7) for(int j = 0; j < CSE420.size(); j++) System.out.println("#"+(j+1)+" "+CSE420.get(j));
      else if(i==8) for(int j = 0; j < CSE421.size(); j++) System.out.println("#"+(j+1)+" "+CSE421.get(j));
      else if(i==9) for(int j = 0; j < CSE428.size(); j++) System.out.println("#"+(j+1)+" "+CSE428.get(j));
      else if(i==10)for(int j = 0; j < CSE451.size(); j++) System.out.println("#"+(j+1)+" "+CSE451.get(j));
    }
  }
  
  int Counter(int i){
    if(i==1) return CSE201.size();
    else if(i==2) return CSE211.size();
    else if(i==3) return CSE303.size();
    else if(i==4) return CSE313.size();
    else if(i==5) return CSE317.size();
    else if(i==6) return CSE403.size();
    else if(i==7) return CSE420.size();
    else if(i==8) return CSE421.size();
    else if(i==9) return CSE428.size();
    else if(i==10)return CSE451.size();
    else return -1;
  }
}


