//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Time time = new Time("Palmeiras", "São Paulo");
                Jogador jogador = new Jogador("Flaco Lopez", 16);
                Tecnico tecnico = new Tecnico("Abel");
                Estadio estadio = new Estadio("Allianz Parque", 43713);
                Partida partida = new Partida("10/10/2026");
                Campeonato campeonato = new Campeonato("Brasileirão");

                System.out.println("Time: " + time.getNome());
                System.out.println("Jogador: " + jogador.getNome());
                System.out.println("Tecnico: " + tecnico.getNome());
                System.out.println("Estadio: " + estadio.getNome());
                System.out.println("Partida: " + partida.getData());
                System.out.println("Campeonato: " + campeonato.getNome());
            }
        }
