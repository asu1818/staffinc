package ObjectRepository;

public class HomePageObj {
    public String getMainImgStaffinc() {
        String textTitle = "(//*[@data-nimg='intrinsic'])[1]";

        return textTitle;
    }

    public String getBtnOpenApp() {
        String btnOpenApp = "(//*[@data-testid='testid-atom-custtom-button'])[1]";
        return btnOpenApp;
    }

    public String getBtnSearch() {
        String btnSearch = "(//*[contains(@data-testid,'testid-atom-custtom-button')])[3]/following::*[@class='ant-space-item'][5]";

        return btnSearch;
    }

    public String getTxtValue(String text) {
        String txtValue = String.format("//*[text()='%s']", text);
        return txtValue;
    }

    public String getCardBody() {
        String cardBody = "(//*[@data-testid='testid-molecule-job-card-wrapper'])[1]";
        return cardBody;
    }

    public String getImgCompany() {
        String imgCompany = "(//*[@data-testid='testid-molecule-job-card-wrapper'])[1]//span[@data-testid='testid-molecule-client-heading-image']";
        return imgCompany;
    }

    public String getCompanyName() {
        String txtCompanyName = "((//*[@data-testid='testid-molecule-job-card-wrapper'])[1]//span)[2]";
        return txtCompanyName;
    }

    public String getPinCity(String text) {
        String txtPinCity = String.format("(//*[@data-testid='testid-molecule-job-card-wrapper'])[1]//span[text()='%s']", text);
        return txtPinCity;
    }
}
