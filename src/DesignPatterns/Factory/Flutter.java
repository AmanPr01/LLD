package DesignPatterns.Factory;

public class Flutter {
//    private String platform;

//    public Flutter(String platform) {
//        this.platform = platform;
//    }

    //  non factory methods here.
    void refreshUI() {
        System.out.println("Refresh UI");
    }

    void setTheme() {
        System.out.println("Set Theme");
    }

    // Below is breaking SRP and OCP.
//    public UIFactory getUIFactory(SupportedPlatforms platform) {
//        if (platform.equals(SupportedPlatforms.ANDROID)) {
//            return new AndroidUIFactory();
//        }
//        else if (platform.equals(SupportedPlatforms.IOS)) {
//            return new IosUIFactory();
//        }
//        else if (platform.equals(SupportedPlatforms.WINDOWS)) {
//            return new WindowsUIFactory();
//        }
//        return null;
//    }

    public UIFactory getUIFactory(SupportedPlatforms platform) {
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }
}
