package Question_1;

class Date implements Cloneable {
    private int day;
    private int month;
    private int year;

    public Date() {}

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(Date date) {
        this.day = date.day;
        this.month = date.month; 
        this.year = date.year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public void setDay(int day) {
		this.day = day;
	}
    public void setMonth(int month) {
		this.month = month;
	}
    public void setYear(int year) {
		this.year = year;
	}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

class StudentInformationSystem implements Cloneable {
    private int rollNumber;
    private String name;
    private Date date;

    public StudentInformationSystem(int rollNumber, String name, Date date) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.date = date;
    }

    public StudentInformationSystem() {}

  
    @Override
    protected Object clone() throws CloneNotSupportedException {
        StudentInformationSystem clone =
                (StudentInformationSystem) super.clone(); 

        clone.date = new Date(this.date); 
        return clone; 
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public Date getDate() {
        return date;
    }
}

public class Q1 {
    public static void main(String[] args) {
        StudentInformationSystem s1 =
                new StudentInformationSystem(101, "Pretam", new Date(1, 1, 2024));

        try {
            StudentInformationSystem s2 = (StudentInformationSystem) s1.clone();
            System.out.println("S1: " + s1.getName() + " / " + s1.getRollNumber() + " / " + s1.getDate());
            System.out.println("S2: " + s2.getName() + " / " + s2.getRollNumber() + " / " + s2.getDate());
            s1.getDate().setDay(10);; 
            System.out.println("S1: " + s1.getName() + " / " + s1.getRollNumber() + " / " + s1.getDate());
            System.out.println("S2: " + s2.getName() + " / " + s2.getRollNumber() + " / " + s2.getDate());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}