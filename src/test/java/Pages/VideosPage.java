package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class VideosPage {

    private final SelenideElement firstVideo = $x("//a[@class='video-card_lk']");
    private final SelenideElement videoMenu = $x("//div[@class='video-card_menu']");
    private final SelenideElement buttonForAddToBookmark = $x("//*[contains(@href, 'ADD_TO_BOOKMARKS')]");
    private final SelenideElement backToFeedButton = $x("//*[contains(@href, '/feed')]");
    public void addVideoToBookMarks() {
        firstVideo.hover();
        videoMenu.click();
        buttonForAddToBookmark.click();
    }

    public String getHrefFirstPage() {
        return firstVideo.getAttribute("href");
    }

    public void goToLentaPage() {
        backToFeedButton.click();
    }
}
