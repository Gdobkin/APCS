package Ch9Inheritance;

public class LegalSecretary extends Secretary {
    public LegalSecretary(String name){
        super(name);
    }
    public double getSalary(){
        return 45000;
    }
    @Override
    public void getDictation(String text) {
        System.out.println("Diff than secretary -- I take dictation");
    }
}
