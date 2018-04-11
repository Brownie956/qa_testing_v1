package tests;

import helpers.page_objects.WikiHomePage;
import helpers.users.WikiHomeUser;
import junit.framework.ComparisonFailure;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WikiHomeTest extends TestCase {

    private WikiHomeUser user;

    @BeforeClass
    public void setUp() throws Exception {
        this.user = new WikiHomeUser();
    }

    @Before
    public void before() throws Exception {
        user.navigate_to(WikiHomePage.URL);
    }

    @Test
    public void test_home_page_loads_correctly() throws ComparisonFailure {
        user.navigate_to(WikiHomePage.URL);
        assertEquals("Wikipedia, the free encyclopedia", user.views_page_title());
    }

    @Test
    public void test_home_page_contents_link() throws ComparisonFailure {
        user.navigate_to(WikiHomePage.URL);
        user.clicks_wiki_home_menu_contents();
        assertEquals("Portal:Contents - Wikipedia", user.views_page_title());
    }
}
