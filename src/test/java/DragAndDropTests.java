import com.codeborne.selenide.Configuration;
import com.herokuapp.pages.MainHerokuappPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTests {
	MainHerokuappPage mainHerokuappPage = new MainHerokuappPage();

	@BeforeAll
	public static void beforeAll() {
		Configuration.baseUrl = "https://the-internet.herokuapp.com/drag_and_drop";
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920*1080";
	}
	@Test
	public void moveRectangleDragAndDrop(){
		open("");
		$(mainHerokuappPage.elementA).dragAndDropTo($(mainHerokuappPage.elementB));
		$(mainHerokuappPage.elementA).shouldHave(text("B"));
		$(mainHerokuappPage.elementB).shouldHave(text("A"));
	}


}
