package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkLevel;

public class Worker {
	private String name;
	private WorkLevel level;
	private Double baseSalary;

	private Departament departament;

	// Lista de contratos é instanciada na criação da classe e não pode ser passada
	// no construtor
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {

	}

	public Worker(String name, WorkLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkLevel getLevel() {
		return level;
	}

	public void setLevel(WorkLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	// setContracts não será passado, pois ja existe metodos para preencher a lista
	// instanciada no topo

	public void addContratc(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public double income(int year, int month) { // Cria o método income que retorna o valor dos contratos em um mes
												// especifico
		double sum = baseSalary; // define sum = salario base do funcionario
		Calendar cal = Calendar.getInstance(); // Instancia a classe Calendar
		for (HourContract c : contracts) { // Percorre a lista de contratos
			cal.setTime(c.getDate()); // Define na variável cal a data do contrato
			int c_year = cal.get(Calendar.YEAR); // define o ano do calendário como o ano do contrato
			// OBS: foi adicionado 1 ao valor do calendário pois o mesmo começa com 0
			int c_month = 1 + cal.get(Calendar.MONTH); // define o mes do calendario como mes do contrato
			if (year == c_year && month == c_month) { // Faz uma comparação entre o mes e o ano informado com os meses
														// do contrato
				sum += c.totalValue(); // Se for verdadeiro adiciona o valor total do contrato na variavel soma que ja
										// possui o salario base
			}
		}
		return sum; // retorna soma
	}

}