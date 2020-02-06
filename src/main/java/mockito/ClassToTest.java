package mockito;

public class ClassToTest {
    private final MyDataBase mydatabase;

    public ClassToTest(MyDataBase mydataBase) {
        this.mydatabase=mydataBase;
    }

    public boolean query(String query) {
        return this.mydatabase.query(query);
    }
}
