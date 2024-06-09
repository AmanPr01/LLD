package Factory.components.button;

public class WindowsButton implements Button {
    @Override
    public void showButton() {
        System.out.println("Showing Windows button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking Windows button");
    }
}
