import java.util.*;
import java.util.ArrayList;

class Control {
  
  static ArrayList<Student> St = new ArrayList<Student>();
  
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    
    Quote   q = new Quote();
    Admin   a = new Admin();
    Finder  f = new Finder();
    Courses c = new Courses();
    Student r;
    a.saveUser();
    a.savePass();
    System.out.println("\n <><><><><><><>    ACADEMIC PANEL    <><><><><><><><><> ");
    System.out.println("\n *** enter 1 to log in as admin *** \n *** enter 2 to log in as student *** \n");
    while(sc.hasNext()){
      if(sc.nextLine().equals("1")) {
        System.out.print("\n *** enter user id : - ");
        int l1 = 0;
        while(!sc.nextLine().equals(a.getUser())){ 
          System.out.println(" *** wrong user id \n *** enter correctly *** \n *** enter 1 to retype, enter 0 to go back *** \n ");
          if(sc.nextInt()==0) {
            l1 = 1;
            break;
          }
        }
        if(l1==0){
          System.out.print(" ** enter password : - ");
          int l = 0;
          while(!sc.nextLine().equals(a.getPass())){
            System.out.println(" *** you have entered wrong password *** \n *** enter 1 to retype, enter 0 to go back *** \n");
            if(sc.nextInt()==0){
              l=1;
              break;
            }
          }
          if(l==0){
            System.out.println("\n *** you are in the admin panel *** \n");
            System.out.println("\n *** check enroll students enter 1, else to log out *** \n");
            while(sc.nextInt()==1){
              c.CourseList();
              System.out.println("\n *** enter 1 - enrolled students for a course *** \n\n *** enter 2 - student's taken course *** \n");
              if(sc.nextInt()==1){
                System.out.println("\n *** enter course sequence to see enrolled students for a particular course *** \n");
                c.Enrolled(sc.nextInt(),c);
              }
              else {
                System.out.println("\n *** enter student's students id *** \n");
                int in;
                in = f.Find2(St,sc.nextLine());
                while(in==-1) {
                  System.out.println("\n *** enter valid student id ***\n");
                  in = f.Find2(St,sc.nextLine());
                }
                System.out.println("\n *** enter 0 to log out, else to continue *** \n");
                while(sc.nextInt()!=0) {
                  System.out.println("\n *** enter 1 to add course, else to drop *** \n");
                  if(sc.nextInt()==1){
                    if(St.get(in).totCourse()==7) System.out.println("\n *** you can't add more than 7 courses *** \n");
                    else {
                      c.CourseList();
                      System.out.println("\n *** enter course sequence from the list *** \n");
                      int t;
                      t = sc.nextInt();            
                      while(f.Find3(St.get(in).Send(),c.CourseName(t),false)){
                        System.out.println("\n *** you have already taken this course *** \n");
                        t = sc.nextInt();
                      }             
                      St.get(in).addCourse(c.CourseName(t));
                      St.get(in).ShowCourses();  
                    }
                  }
                  else {
                    if(St.get(in).totCourse()==0) System.out.println("\n *** you have no course left to drop *** \n");
                    else {
                      St.get(in).ShowCourses();
                      System.out.println("\n *** enter course sequence from your course list *** \n");
                      St.get(in).dropCourse(sc.nextInt());
                      St.get(in).ShowCourses();
                    }
                  }
                }
                System.out.println("\n *** enter 0 to log out, else to continue *** \n");
              }
            }
            System.out.println("\n *** check enroll students enter 1, else to log out *** \n");
          }
        }
      }
      
      else {
        System.out.println(q.Begin());
        if(sc.nextLine().equals("1")) {
          if(St.size() > 0){
            
            System.out.print(q.User());
            int ind = f.Find(St, sc.nextLine());
            
            if(ind!=-1){
              System.out.print(q.Pass());
              while(!sc.nextLine().equals(St.get(ind).getPass())){
                System.out.println(q.Wrong()+"\n "+q.Command());
              }
              System.out.println(q.Dash());
              if(St.get(ind).CourseTaken() > 0){
                System.out.println("\n Courses you have taken are : ");
                St.get(ind).ShowCourses();
                c.CourseList();
                System.out.print(q.Command2());
                while(sc.nextInt()!=0){
                  System.out.println("\n *** show course list - enter 1, else to avoid *** \n");
                  if(sc.nextInt()==1) c.CourseList();
                  System.out.println("\n *** add course - enter 1 \n *** drop course - enter 2 *** \n");
                  if(sc.nextInt()==1){
                    if(St.get(ind).totCourse() < 7){
                      System.out.println("\n *** to add, enter course sequence number from the list *** \n");
                      int sq = sc.nextInt();
                      while(f.Find3(St.get(ind).Send(),c.CourseName(sq),false)){
                        System.out.println("\n *** you have already taken this course *** \n");
                        System.out.println("\n *** to add, enter course sequence number from the list *** \n");
                        sq = sc.nextInt();
                      }
                      St.get(ind).addCourse(c.CourseName(sq));
                      St.get(ind).ShowCourses();
                    }
                    else System.out.println("\n *** you can't take more than 7 courses *** \n");
                  }
                  else {
                    if(St.get(ind).totCourse()==0) System.out.println("\n *** you have no course left to drop *** \n");
                    else {
                      St.get(ind).ShowCourses();
                      System.out.println("\n *** to drop, enter course number from the list *** \n");
                      int cq = sc.nextInt();
                      St.get(ind).dropCourse(cq);
                    }
                  }
                  System.out.print("\n *** log out - enter 0, else to continue *** \n");
                }
              }
              
              else {
                System.out.println("\n *** you have taken no courses \n *** you can take courses now *** \n");
                c.CourseList();
                System.out.println("\n *** enter 1 to add course, 0 to log out *** \n ");
                while(!sc.nextLine().equals("0")) {
                  System.out.println("\n *** enter sequence number to add course *** \n");
                  int e = sc.nextInt();
                  if(e<1 || e>10) System.out.println(" *** wrong input  *** ");
                  else {
                    if(St.get(ind).totCourse()==7) {
                      System.out.println("\n *** you can't take more courses *** \n");
                      break;
                    }
                    else {
                      while(f.Find3(St.get(ind).Send(),c.CourseName(e),false)){
                        System.out.println("\n *** you have already taken this course *** \n");
                        e = sc.nextInt();
                      }
                      St.get(ind).addCourse(c.CourseName(e));
                      c.addMem(e,St.get(ind).getName());
                      System.out.println("\n *** course/s you have taken *** \n");
                      St.get(ind).ShowCourses();
                    }
                  }
                  System.out.println("\n *** enter 0 to log out, else to continue *** \n");
                  if(sc.nextLine().equals("0")) break;
                }
              }
            }
            else System.out.println("\n *** no such user found, enter correctly *** \n");
          }
          
          else {
            System.out.println("\n *** no user found *** \n *** try sign up *** \n\n ");
          }
        }
        
        
        else {
          
          r = new Student();
          
          System.out.print("\n *** enter full name : - ");
          r.setName(sc.nextLine());
          
          System.out.print(" *** enter student id : - ");
          r.setStid(sc.nextLine());
          
          System.out.print(" *** enter user id : - ");
          r.setUser(sc.nextLine());
          
          System.out.print(" *** enter password : - ");
          r.setPass(sc.nextLine());
          
          St.add(r);
          
          System.out.println("\n *** your user account has been successfully created *** \n");
        }
      }
      
      System.out.println("\n *** enter 1 to log in as admin *** \n *** enter 2 to log in as student *** \n");
    }
  }
}




