package Ch9Inheritance;

public class LegalSecretary extends Secretary {
    public double getSalary(){
        return 45000;
    }
    public LegalSecretary(String name){
        super(name);
    }
    @Override
    public void getDictation(String text) {
        System.out.println("Diff than secretary -- I take dictation");
    }
}
