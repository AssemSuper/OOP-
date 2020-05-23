
class Student {
  String  name;
  String  id;
  double yearOfStudy=1;
 Student(String i,String j){
    name=i;
    id=j;
  }
  String accessName (){
    return name;
  }
  String accessId(){
    return id;
  }
  public void  incrementYearOfStudy() {
     yearOfStudy++;
   }
}