package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.button.WindowsButton;
import DesignPatterns.Factory.components.dropdown.DropDown;
import DesignPatterns.Factory.components.dropdown.WindowsDropDown;
import DesignPatterns.Factory.components.menu.Menu;
import DesignPatterns.Factory.components.menu.WindowsMenu;

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
