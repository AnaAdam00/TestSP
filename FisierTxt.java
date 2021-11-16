public class FisierTxt extends Fisier{

    private String text;
    public FisierTxt(String nume, String text) {
        super(nume);
        //TODO Auto-generated constructor stub
        this.text=text;
    }
    public String getText(){
        return this.text;
    }
    public void accept(AliniatStrategi aliniat) {
        aliniat.render(this);
    }
    @Override
    public void print() {

    }
}
