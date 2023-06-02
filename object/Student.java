package object;

public class Student {
	int studentID;
	String name;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	public String toString(){
		return studentID + "," + name;
	}
	
	//equals() �޼��� �������ϱ� ===========
		@Override
		public boolean equals(Object obj){
			if(obj instanceof Student){
				Student std = (Student)obj;
				
				if(this.studentID == std.studentID){
					return true;
				}//�������� equals()�޼���� �л��� �й��� ������ true
			}else{
				return false;
			}
			return false;
		}//equals() �޼��� �������ϱ� ===========
		
		@Override//hashCode() �޼��� �������ϱ�==========
		public int hashCode(){
			return studentID;
		}
	
	
	
}
