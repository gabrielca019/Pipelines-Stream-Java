import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	final static double PISO_SALARIAL = 2000.0;
	
	public static void main(String[] args) {
		List<Funcionario> listaFuncionarios = Arrays.asList(
				new Funcionario("Gabriel", "gabriel@gmail.com", 1551.0),
				new Funcionario("Paulo", "paulo@gmail.com", 2000.0),
				new Funcionario("Matheus", "matheus@gmail.com", 3000.0),
				new Funcionario("Jackson", "jack@gmail.com", 500.0),
				new Funcionario("França", "frnc@gmail.com", 10000.0),
				new Funcionario("Michael", "mjackson@gmail.com", 12999.9),
				new Funcionario("Rafael", "rafa@gmail.com", 1550.0));
		
		//Ordenar alfabeticamente os emails dos funcionarios que estão acima do piso salarial
		Comparator<String> comparador = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
		
		List<String> emails = listaFuncionarios.stream()
				.filter(f -> f.getSalario() >= PISO_SALARIAL)
				.map(f -> f.getEmail())
				.sorted(comparador)
				.collect(Collectors.toList());
				
		emails.forEach(System.out::println);
		
		//Soma dos salarios dos funcionarios que começam o seu nome com a letra M
		double somaSalarial = listaFuncionarios.stream()
				.filter(f -> f.getNome().toUpperCase().charAt(0) == 'M')
				.map(f -> f.getSalario())
				.reduce(0.0, (ft, f2) -> ft + f2);
		
		System.out.println("Soma: " + somaSalarial);
	}

}