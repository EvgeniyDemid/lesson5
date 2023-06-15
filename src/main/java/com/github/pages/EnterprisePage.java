package com.github.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class EnterprisePage {
	SelenideElement title = $(byText("Build like the best"));

	public void checkTitlePage (){
		title.shouldBe(visible);
	};
}
