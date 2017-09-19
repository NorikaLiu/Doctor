
public class ChildPatient extends Patient  {
 String ParentName;
	

	public ChildPatient(String name, int age, String ParentName) {
		super(name, age);
		this.ParentName = ParentName;
	}
public String toString () {
			
			return  "Patient" + getname() + " is " + getage () + "and has" + ParentName ()  ;
			
	
	 }

	}

