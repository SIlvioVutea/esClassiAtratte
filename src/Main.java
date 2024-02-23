//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(5, 5);
        System.out.println(rettangolo1.calcolaArea());
        Triangolo triangolo1 = new Triangolo(4, 4);
        System.out.println(triangolo1.calcolaArea());
    }
}