package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.dropdown.DropDown;
import DesignPatterns.Factory.components.menu.Menu;

public interface UIFactory {
    // DesignPatterns.Factory Methods.

    Button createButton();

    Menu createMenu();

    DropDown createDropDown();
}
