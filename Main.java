import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Director d=new Director("director");
        ArrayList<Element> elements= new ArrayList<Element>();
        FisierTxt f=new FisierTxt("fisier","txt");
        FisierTxt f2=new FisierTxt("fisier2", "text2");

        d.add(f);
        d.add(f2);
        d.print();
        AliniatStanga s=new AliniatStanga();
        d.accept(s);
        s.render(f);

    }
}
