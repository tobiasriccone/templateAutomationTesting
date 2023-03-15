package pages;

public class GooglePage extends BasePage {

    private final String voyATenerSuerteButtonLocator = "(//input[@value = 'Voy a tener suerte'])[last()]";
    private final String doodlePageLocator = "//a[@title = 'Doodles de Google']";
    private final String BusquedaPorImagenButtonLocator = "//div[@aria-label = 'B\u00FAsqueda por imagen']";
    private final String optionToSearchByImageLocator = "//div[contains(text(), 'Busca cualquier imagen con Google')]";

    public GooglePage() {
        super(DRIVER);
    }

    public GooglePage navegateToGoogle(){
        navegateTo("https://www.google.com");
        return this;
    }

    public GooglePage clickVoyATenerSuerteButton(){
        click(voyATenerSuerteButtonLocator);
        return this;
    }

    public boolean doodlePageIsDisplayed(){
        return isDisplayed(doodlePageLocator);
    }

    public GooglePage clickBusquedaPorImagenButton(){
        click(BusquedaPorImagenButtonLocator);
        return this;
    }

    public boolean optionToSearchByImageIsDisplayed(){
        return isDisplayed(optionToSearchByImageLocator);
    }

}