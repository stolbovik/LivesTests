package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Лента одноклассников
 */
public class LentaPage {

    /**
     * Кнопка перехода на вкладку с видео
     */
    private final SelenideElement videoPage = $x("//a[@href='/video/top']");

    public void clickToVideo() {
        videoPage.click();
    }

}