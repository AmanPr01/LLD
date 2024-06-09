package Factory;

import Factory.components.button.Button;
import Factory.components.dropdown.DropDown;
import Factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(SupportedPlatforms.WINDOWS);

        Button button = uiFactory.createButton();
        button.clickButton();
        button.showButton();

        DropDown dropDown = uiFactory.createDropDown();
        dropDown.showDropDown();;

        Menu menu = uiFactory.createMenu();
        menu.showMenu();
    }
}
