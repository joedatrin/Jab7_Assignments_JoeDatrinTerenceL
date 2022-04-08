package exercises_8_4_22;

class students implements Comparable<students>

{
	 private String name;
	    private int cgpa;
	    private int length;
	    public students(String name, int cgpa) {
	        this.name=name;
	        this.cgpa=cgpa;
	    }

//	    getters and setters
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name=name;
	    }
	    public int getCgpa() {
	        return cgpa;
	    }
	    public void setCgpa(int cgpa) {
	        this.cgpa=cgpa;
	    }
	
	    public students(String name, int cgpa,int length) {
	        this.name=name;
	        this.cgpa=cgpa;
	        this.length=length;
	    }
	    public int getLength() {
	        return length;
	    }
	    public void setLength(int length) {
	        this.length=name.length();
	    }
	    @Override
	    public int compareTo(students other) {
	        return (int)(this.getLength()-other.getLength());
	    }
	
	
	}


public class NameLength_Assignment {
	
	public static void main(String[] args) {
        students s1=new students("xyza",9);
        students s2=new students("abcde",7);
        
        int x = s1.getName().length();
        int y = s2.getName().length();
        
     
        
        students s3=new students("xyza",9,x);
        students s4=new students("abcde",7,y);
        
        int result=s3.compareTo(s4);
        if(result>0) {
            System.out.println(s3.getName()+" "+ "has higher Namelength");
        }
        else if(result<0) {
            System.out.println(s4.getName()+" "+ "has higher Namelength");
        }
        else {
            System.out.println("Both students have same NameLength");
        }
    }



}
