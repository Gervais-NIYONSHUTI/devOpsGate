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
        browser = playwright.chromium().launch( new BrowserType.LaunchOptions().setHeadless(false) );
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
        page.waitForTimeout(5000);
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

        for (int i = 0; i < names.size() - 1; i++) {
            assertTrue(names.get(i).compareTo(names.get(i + 1)) <= 0,
                    "Expected A→Z but got: " + names.get(i) + " before " + names.get(i + 1));
        }
    }

    @Test
    void testNameZToA() {
        sortBy("name,desc");
        List<String> names = getNames();
        for (int i = 0; i < names.size() - 1; i++) {
            assertTrue(names.get(i).compareTo(names.get(i + 1)) >= 0,
                    "Expected Z→A but got: " + names.get(i) + " before " + names.get(i + 1));
        }
    }
}