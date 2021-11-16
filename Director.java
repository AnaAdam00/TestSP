import java.util.ArrayList;

public class Director implements Element{
    private String nume;
    private ArrayList<Director> directoare;
    private ArrayList<Fisier> fisiere;

    private ArrayList<Element>elements;
    public Director(){
        this.nume="";
        this.directoare=new ArrayList<Director>();
        this.fisiere=new ArrayList<Fisier>();
        this.elements=new ArrayList<Element>();
    }
    public Director(String nume){
        this.nume=nume;
        this.directoare=new ArrayList<Director>();
        this.fisiere=new ArrayList<Fisier>();
        this.elements=new ArrayList<Element>();
    }
    public Director(String nume, ArrayList<Director> directoare,ArrayList<Fisier>fisiere,ArrayList<Element> elements){
        this.nume=nume;
        this.directoare=directoare;
        this.fisiere=fisiere;
        this.elements=elements;
    }

    public void accept(AliniatStrategi aliniat) {
        if (elements != null) {
            for (Element i: elements)
                i.accept(aliniat);
        }
    }
    public void add(Element element) {
        elements.add(element);
    }

    public void print() {
        System.out.println("Director" + this.nume);
        if (fisiere != null) {
            for (Fisier i: fisiere)
                i.print();
        }
    }
    public void add(Fisier f) {
        fisiere.add(f);
    }

}
