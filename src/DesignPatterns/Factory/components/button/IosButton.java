package DesignPatterns.Factory.components.button;

public class IosButton implements Button {
    @Override
    public void showButton() {
        System.out.println("Showing Ios Button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking Ios Button");
    }
}
