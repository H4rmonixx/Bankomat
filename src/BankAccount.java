
import java.math.BigDecimal;

public class BankAccount {
    
    public final String pesel;
    public final String imie;
    public final String nazwisko;
    public final String nr_konta;
    public final BigDecimal saldo;
    
    public BankAccount(String pesel, String imie, String nazwisko, String nr_konta, BigDecimal saldo){
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_konta= nr_konta;
        this.saldo = saldo;
    }
    
}
