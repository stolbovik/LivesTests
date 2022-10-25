package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class VideosPage {

    private final SelenideElement firstVideo = $x("//a[@class='video-card_lk']");
    private final SelenideElement videoMenu = $x("//div[@class='video-card_menu']");
    private final SelenideElement buttonForAddToBookmark = $x("//*[contains(@href, 'ADD_TO_BOOKMARKS')]");
    public void addVideoToBookMarks() {
        firstVideo.hover();
        videoMenu.click();
        buttonForAddToBookmark.click();
    }

}
