package DesignPatterns.Factory.components.dropdown;

public class AndroidDropDown implements DropDown {
    @Override
    public void showDropDown() {
        System.out.println("Showing Android dropdown");
    }
}
