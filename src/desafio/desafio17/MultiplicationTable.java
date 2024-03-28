package desafio.desafio17;

public class MultiplicationTable implements Table{
    @Override
    public void table(int number) {
        for(int i = 0; i <= 10; i++) {
            String msg = String.format("%d x %d = %d", number, i, number*i);
            System.out.println(msg);
        }
    }
}
