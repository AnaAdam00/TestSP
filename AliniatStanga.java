public class AliniatStanga implements AliniatStrategi{
    @Override
    public void render(FisierTxt fisier_txt) {
        System.out.println("Aliniat stanga: <<<<<<<<" + fisier_txt.getText());    }
}
