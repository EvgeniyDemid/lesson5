import com.codeborne.selenide.Configuration;
import com.github.pages.EnterprisePage;
import com.github.pages.MainGitHubPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class EnterpriseTests {
	MainGitHubPage mainGitHubPage = new MainGitHubPage();
	EnterprisePage enterprisePage = new EnterprisePage();

	@BeforeAll
	public static void beforeAll() {
		Configuration.baseUrl = "https://github.com";
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920*1080";
	}

	@Test
	public void checkEnterprisePage() {
		open("/");
		mainGitHubPage.hoverSolutionsButton();
		mainGitHubPage.clickEnterprizeButton();
		enterprisePage.checkTitlePage();
	}
}
