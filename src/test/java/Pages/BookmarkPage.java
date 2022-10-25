package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BookmarkPage {

    private final SelenideElement videoBookmarks = $x("//*[contains(@href, '/bookmarks/movie')]");
    private final SelenideElement firstVideo = $x("//a[@class='video-card_lk']");

    public void goToVideoBookmarks() {
        videoBookmarks.click();
    }

    public String getHrefFirstPage() {
        return firstVideo.getAttribute("href");
    }

}
