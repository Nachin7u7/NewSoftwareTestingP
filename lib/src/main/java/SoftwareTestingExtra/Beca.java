package SoftwareTestingExtra;

public class Beca {
	Nota nota;

	public Beca(Nota nota) {
		this.nota = nota;
	}

	public Beca() {
		nota = new Nota();
	}

	public String recomendacionBeca(int ci) {

		if (Helpers.becaAplicada(ci)) {
			if (nota.getNota(ci) >= 90)
				return "SI APLICA A BECA";
			else
				return "NO APLICA A BECA POR PROMEDIO ACADEMICO";
		} else
			return "EL ESTUDIANTE NO CURSO AUN EL 60% DE LAS MATERIAS";
	}
}
