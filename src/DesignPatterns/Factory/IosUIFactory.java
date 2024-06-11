package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.button.IosButton;
import DesignPatterns.Factory.components.dropdown.DropDown;
import DesignPatterns.Factory.components.dropdown.IosDropDown;
import DesignPatterns.Factory.components.menu.AndroidMenu;
import DesignPatterns.Factory.components.menu.Menu;

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
