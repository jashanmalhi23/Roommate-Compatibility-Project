
public class Student {
	
	private String name; 
	private char gender; 
	private Date birthDate; 
	private Preference preference; 
	private boolean matched; 
	private int month;
	private int day;
	private int year;
	public int Score; 
	
	public Student(String name, char gender, Date birthDate, Preference preference) {
		this.name = name;
		this.gender = gender; 
		this.birthDate = birthDate; 
		this.preference = preference;  
	}
	public void setName(String name){
		this.name = name;
	}
	public void setGender(char gender){
		this.gender = gender;
	}
	
	public void setbirthDay(Date birthDate){
		this.birthDate = birthDate;
	}
	
	public void setPreference(Preference pref){
		this.preference = pref;
	}
	
	public void setMatch(boolean matched){
	this.matched = matched;
	}
	
	public String getName() {
		return name;
	}
	
	public char getGender(){
		return gender;
	}
	
	public Date getbirthDate(){
		return birthDate;
	}
	
	public Preference getPref(){
		return preference;
	}
	
	public boolean getMatch(){
		return matched;
	}
	
	public int compare(Student st){
		if(gender != st.gender){
		return 0;
		}
		
		Score = (40 - preference.compare(st.preference)) + (60-birthDate.compare(st.birthDate)); 
		
		if (Score < 0){
			return 0; 
			}
			else if (Score > 100){
			return 100;
			}
		
		return Score; 
	}


	
}
