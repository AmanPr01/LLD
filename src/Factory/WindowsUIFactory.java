package Factory;

import Factory.components.button.Button;
import Factory.components.button.WindowsButton;
import Factory.components.dropdown.DropDown;
import Factory.components.dropdown.WindowsDropDown;
import Factory.components.menu.Menu;
import Factory.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }
}
