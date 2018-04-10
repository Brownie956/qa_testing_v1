package helpers.users;

import helpers.page_objects.WikiHomePage;

public class WikiHomeUser extends User {

    public WikiHomeUser(){
        super();
    }

    public void clicks_wiki_home_menu_contents(){
        getWebDriver().findElement(WikiHomePage.MENU_CONTENTS);
    }
}
