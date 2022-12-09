package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class MarkBookPage {
    private final String url = "https://ok.ru/bookmarks";

    private final SelenideElement FirstVideo = $x("//a[@class=\"video-card_lk\"]");

    public String GetFirstVideoId(){
        open(url);
        String VideoId = FirstVideo.attr("href").substring(7);
        return VideoId;
    }



}
