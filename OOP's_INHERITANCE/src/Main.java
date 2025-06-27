
public class Main {

	public static void main(String[] args) {
		JavaDeveloper jd  = new JavaDeveloper();
		PythonDeveloper pd  = new PythonDeveloper();
		CDeveloper cd  = new CDeveloper();
		
		jd.working();
		jd.attendMeeting();
		jd.project();
		jd.learnJava();
		System.out.println("------------------------------------");
		
		
		pd.working();
		pd.attendMeeting();
		pd.project();
		pd.learnPython();
		System.out.println("------------------------------------");
		
		
		cd.working();
		cd.attendMeeting();
		cd.project();
		cd.learnC();
		System.out.println("------------------------------------");
	}

}
