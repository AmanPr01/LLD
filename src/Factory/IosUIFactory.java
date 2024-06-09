package Factory;

import Factory.components.button.Button;
import Factory.components.button.IosButton;
import Factory.components.dropdown.DropDown;
import Factory.components.dropdown.IosDropDown;
import Factory.components.menu.AndroidMenu;
import Factory.components.menu.Menu;

public class IosUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}
