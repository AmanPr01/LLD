package DesignPatterns.Factory.components.button;

public class AndroidButton implements Button {
    @Override
    public void showButton() {
        System.out.println("Showing Android button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking Android button");
    }
}
