package Factory;

import Factory.components.button.AndroidButton;
import Factory.components.button.Button;
import Factory.components.dropdown.AndroidDropDown;
import Factory.components.dropdown.DropDown;
import Factory.components.menu.AndroidMenu;
import Factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
