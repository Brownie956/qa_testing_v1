package tests;

import helpers.page_objects.WikiHomePage;
import helpers.users.WikiHomeUser;
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
    public void test_home_page_loads_correctly() throws Exception {
        assertEquals("", user.views_page_title());
    }

    @Test
    public void test_home_page_contents_link() throws Exception {
        user.clicks_wiki_home_menu_contents();
        assertEquals("", user.views_page_title());
    }
}
