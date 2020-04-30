package SeleniumSession;

public class GoogleTest {

	public static void main(String[] args) {
		BrowserAction br = new BrowserAction() ;
		br.LaunchBrowser("chrome");
		br.LaunchUrl("http://www.google.com");
		br.FullScreen();
		String str =br.DoGetTitle();
		System.out.println(str);
		
		br.QuitBrowser();

	}

}
