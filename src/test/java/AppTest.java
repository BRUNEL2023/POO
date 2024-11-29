import static org.junit.Assert.assertEquals;

public class AppTest {

    public void testNombreMax0K0() {
        Zoo zoo = new Zoo;
        zoo.ajouterSecteur(TypeAnimal.CHAT);
        Exception exc = null;
        try {
            zoo.nouveauVisiteur();
            zoo.nouveauVisiteur();

        } catch (LimiteVisiteurException e) {
            exc = e;
        }
        System.out.println(exc);

        assertNull(exc);
        System.out.println("Test 1 " + exc);
    }
}
