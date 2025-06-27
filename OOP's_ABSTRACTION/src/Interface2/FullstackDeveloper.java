package Interface2;

public abstract  class FullstackDeveloper implements BackendDeveloper , FrontendDeveloper , DatabaseAdmin{
	public void doBackendProject() {
		System.out.println("Fullstack Developer is doing Backend Project");
		}
	
	public void doFrontendProject() {
		System.out.println("Fullstack Developer is doing Frontend Project");
	}
	
	public void doDatabaseProject() {
		System.out.println("Fullstack Developer is doing Database Project");
	}
}
