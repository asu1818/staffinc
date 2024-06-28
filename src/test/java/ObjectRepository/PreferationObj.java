package ObjectRepository;

public class PreferationObj {
    public String getDivJobLocation() {
        String divJobLocationSection = "(//*[contains(@data-testid,'testid-molecule-collapsable-panel')])[1]";
        return divJobLocationSection;
    }

    public String getDdlProvinsi() {
        String ddlProvinsi = "(//*[@class='ant-form-item-control-input-content'])[1]";
        return ddlProvinsi;
    }

    public String getLstValueProvinsi(String text) {
        String lstValueProvinsi = String.format("//*[text()='%s']", text);
        return lstValueProvinsi;
    }
    public String getDdlKota() {
        String ddlKota = "//*[text()='Cari Kota']";
        return ddlKota;
    }

    public String getTxtSearchCityName() {
        String txtSearchCityName = "(//input[@class='ant-input css-acm2ia'])[2]";
        return txtSearchCityName;
    }

    public String getBtnSimpan() {
        String btnSimpan = "(//*[@data-testid='testid-atom-custtom-button'])[2]";
        return btnSimpan;
    }

    public String getImgFooter() {
        String imgFooter = "//img[@alt='staffinc-logo']";
        return imgFooter;
    }

    public String getBtnSave() {
        String btnSave = "(//*[text()='Simpan'])[4]//parent::*/parent::*[@data-testid='testid-atom-custtom-button']";
        return btnSave;
    }
}
