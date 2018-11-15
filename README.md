# university
consist of 4 classes:
Student:
  fields:
    float meanMark - represent mean of 3 integers wich are Student marks inputed by user
    (only 1-5 posstive ints are expected).
    boolean presence - represent presence of Student (only true or false values expected).
    int id - represnt id of Student (unique only in one group).
    int groupId - represent id of group for wich Student is belong.
    
  methods:
    Student - Constructor. Set meanMark, presence, id, goupId.
    geters for meanMark and Presence.
    toString.
    
Group:
  fields:
     int - represent id of group.
     int hmanIndex - index of headman in students array.
     Student[] students - array of students.
  
  methods:
    Student hmanElect - method wich elect a headmen for Group by bigest meanMark from students array, set hmanIndex and 
    return headman Student.
    getters for hmanIndex and students array and setter for students array.
    toString.
    
Professor:
  methods:
    void countStudents(Student[] students) - method wich chek the presence field in each Student (if presence set to
    false, student get into absent list) and printout the absent list.

univerDemo: test class.
    
