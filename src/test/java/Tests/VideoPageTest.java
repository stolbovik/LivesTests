package Tests;

import Pages.LentaPage;
import Pages.LoginPage;
import org.junit.Test;

public class VideoPageTest extends BaseTest{

    /**
     * Данные для работы тестов
     */
    private final String OK_BASE_URL = "https://ok.ru/dk?st.cmd=anonymMain&st.fflo=on&st.lgn=on";
    private final String LOGIN = "technoPol4";
    private final String PASSWORD = "technoPolis2022";

    @Test
    public void goToVideoPage() {
        LoginPage loginPage = new LoginPage(OK_BASE_URL);
        loginPage.setLoginOnBlock(LOGIN);
        loginPage.setPasswordOnBlock(PASSWORD);
        loginPage.pressInputButton();
        LentaPage lentaPage = new LentaPage();
        lentaPage.clickToVideo();
        System.out.println();
    }

}
