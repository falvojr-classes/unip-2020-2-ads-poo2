
public class Program {

	public static void main(String[] args) {
		// Exercício 4:

        // a) As entidades/classes seriam Carro e Motor. 

        // b) Carro teria os atributos cor, modelo, velocidade atual, velocidade máxima e motor encapsulados (getters e setters).
        //    Motor teria os atributos tipo e potência encapsulados (getters e setters).

        // c) Os métodos Ligar e Acelerar (recebendo uma quantidade) devem ser criados na classe Carro.

        // d) Criar uma método com o nome Acelerar (sem parâmetros) que acrescente sempre 10 a velocidade máxima.

        // e) Criar uma sobrecarga de construtores (um padrão e outro recebendo um Motor).

        // f) Codigo a seguir:

        Motor motor1 = new Motor();
        motor1.setTipo("1.0");

        Carro carro1 = new Carro(motor1);
        carro1.ligar();
        carro1.acelerar();
        carro1.acelerar(10);

        Motor motor2 = new Motor();
        motor2.setTipo("2.0");

        Carro carro2 = new Carro();
        carro2.setMotor(motor2);
        carro2.ligar();
        carro2.acelerar();
        carro2.acelerar(100);

        double velocidadeCarro1 = carro1.getVelocidadeAtual();
        double velocidadeCarro2 = carro2.getVelocidadeAtual();

        System.out.println(String.format("Carro 1: %.2f", velocidadeCarro1));
        System.out.println(String.format("Carro 2: %.2f", velocidadeCarro2));

        // Exercicio 2:

        Motor motor = new Motor();
        motor.setPotencia(150);

        Carro carro = new Carro();
        carro.setModelo("VW Gol 1.0");
        carro.setCor("Branco");

        // NullPointerException: pois o carro não possui motor associado.
		// (a) O código em questão compila, mas apresenta uma exceção em tempo de execução.
        System.out.println(String.format("Potencia do Carro: %i", carro.getMotor().getPotencia()));
	}

}
