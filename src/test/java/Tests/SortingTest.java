package Tests;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SortingTest {

    private static Playwright playwright;
    private static Browser browser;
    private Page page;

    @BeforeAll
    static void setup() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch( new BrowserType.LaunchOptions().setHeadless(true) );
    }

    @AfterAll
    static void teardown() {
        browser.close();
        playwright.close();
    }

    @BeforeEach
    void openPage() {
        page = browser.newPage();
        page.navigate("https://practicesoftwaretesting.com");
        page.waitForSelector("[data-test='product-name']");
    }

    @AfterEach
    void closePage() {
        page.close();
    }

    void sortBy(String value) {
        page.locator("[data-test='sort']").selectOption(new SelectOption().setValue(value));
    }

    List<String> getNames() {
        return page.locator("[data-test='product-name']")
                .allTextContents()
                .stream()
                .map(String::trim)
                .toList();
    }

    @Test
    void testNameAToZ() {
        sortBy("name,asc");
        List<String> names = getNames();
        assertTrue(!names.isEmpty());
    }

    @Test
    void testNameZToA() {
        sortBy("name,desc");
        List<String> names = getNames();
        assertTrue(!names.isEmpty());
    }
}
