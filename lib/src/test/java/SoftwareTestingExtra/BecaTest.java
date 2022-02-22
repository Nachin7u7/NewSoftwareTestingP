package SoftwareTestingExtra;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class BecaTest {

	Nota nota = Mockito.mock(Nota.class);
	MockedStatic<Helpers> helpers = Mockito.mockStatic(Helpers.class);

	@BeforeAll
	public static void before() {
		MockedStatic<Nota> mocked = Mockito.mockStatic(Nota.class);
		mocked.when(() -> Nota.getNota(12345)).thenReturn(false);
		mocked.when(() -> Nota.getNota(51231)).thenReturn(true);
		mocked.when(() -> Nota.getNota(20177)).thenReturn(false);
	}

	@Test
	public void showBeca1() {
		Beca beca = new Beca(nota);
		String actualResult = beca.recomendacionBeca(12345);
		String expectedResult = "NO APLICA A BECA POR PROMEDIO ACADEMICO";
		Assertions.assertEquals(actualResult, expectedResult, "ERROR");
	}

}
