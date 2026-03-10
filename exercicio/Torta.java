package exercicio;

public class Torta extends Doce {
    @Override
    public void massa() {
        super.massa();
        System.out.println("Massa Podre");
    }

    @Override
    public void cobertura() {
        super.cobertura();
        System.out.println("Limão");
    }
}
