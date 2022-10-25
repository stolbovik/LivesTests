package Tests;

import Pages.BookmarkPage;
import Pages.LentaPage;
import Pages.LoginPage;
import Pages.VideosPage;
import org.junit.Assert;
import org.junit.Test;

public class VideoPageTest extends BaseTest{

    /**
     * Данные для работы тестов
     */
    private final String OK_BASE_URL = "https://ok.ru/dk?st.cmd=anonymMain&st.fflo=on&st.lgn=on";
    private final String LOGIN = "technoPol4";
    private final String PASSWORD = "technoPolis2022";

    private String HREFvideo;

    @Test
    public void goToVideoPage() {
        LoginPage loginPage = new LoginPage(OK_BASE_URL);
        loginPage.setLoginOnBlock(LOGIN);
        loginPage.setPasswordOnBlock(PASSWORD);
        loginPage.pressInputButton();
        LentaPage lentaPage = new LentaPage();
        lentaPage.goToVideo();
        VideosPage videosPage = new VideosPage();
        videosPage.addVideoToBookMarks();
        videosPage.goToLentaPage();
        HREFvideo = videosPage.getHrefFirstPage();
        lentaPage.goToBookmarks();
        BookmarkPage bookmarkPage = new BookmarkPage();
        bookmarkPage.goToVideoBookmarks();
        Assert.assertTrue(HREFvideo.equals(bookmarkPage.getHrefFirstPage()));
    }

}
