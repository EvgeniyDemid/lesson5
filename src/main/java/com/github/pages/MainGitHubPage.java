package com.github.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainGitHubPage {
	SelenideElement solutionsButton = $(byText("Solutions"));
	SelenideElement enterprizeButton = $(byText("Enterprise"));

	public void hoverSolutionsButton() {
		solutionsButton.shouldBe(visible).hover();
	}

	public void clickEnterprizeButton() {
		enterprizeButton.shouldBe(visible).click();
	}
}
