package Lesson12;

public class Account <S , B , I> {

private S sum;
private B bal;
private I id;

public Account(S sum, B bal, I id) {
        this.sum = sum;
        this.bal = bal;
        this.id = id;
        }

public S getSum() {
        return sum;
        }

public B getBal() {
        return bal;
        }

public I getId() {
        return id;
        }

public static void main(String[] args) {

        Account<Double,Integer,String> acc1 = new Account( 365.5 , 3600 , "lk579b" );
        String id = acc1.getId();
        Integer balance = acc1.getBal();
        Double sum = acc1.getSum();
        System.out.println("Id " + id + " /" + " Balance "  + balance + " /" + " Summa "  + sum);

        }


        }

