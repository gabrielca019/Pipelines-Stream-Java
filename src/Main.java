import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Funcionario> listaFuncionarios = Arrays.asList(
				new Funcionario("Gabriel", "gabriel@gmail.com", 1551.0),
				new Funcionario("Paulo", "paulo@gmail.com", 2000.0),
				new Funcionario("Matheus", "matheus@gmail.com", 3000.0),
				new Funcionario("Jackson", "jack@gmail.com", 500.0),
				new Funcionario("França", "frnc@gmail.com", 10000.0),
				new Funcionario("Rafael", "rafa@gmail.com", 1550.0));
	}

}