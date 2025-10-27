import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();
        initScenes();
        
        this.account = null;
        this.mainPanel.setLayout(new java.awt.CardLayout());
        this.mainPanel.add(this.loginPanel, "login");
        this.mainPanel.add(this.indexPanel, "index");
        this.mainPanel.add(this.withdrawPanel1, "withdraw1");
        
        CardLayout cl = (CardLayout) this.mainPanel.getLayout();
        cl.show(this.mainPanel, "withdraw1");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        headerPanelLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        testPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bankomat");
        setResizable(false);

        headerPanel.setBackground(new java.awt.Color(255, 255, 204));

        headerPanelLabel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanelLabel.setFont(new java.awt.Font("Rubik", 3, 18)); // NOI18N
        headerPanelLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        headerPanelLabel.setText("SPEURO Bank");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.setName(""); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        testPanel.setName(""); // NOI18N

        javax.swing.GroupLayout testPanelLayout = new javax.swing.GroupLayout(testPanel);
        testPanel.setLayout(testPanelLayout);
        testPanelLayout.setHorizontalGroup(
            testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        testPanelLayout.setVerticalGroup(
            testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(testPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(testPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.getAccessibleContext().setAccessibleName("");
        mainPanel.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        CreateDatabase();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton loginPanelLoginBtn;
    private javax.swing.JLabel loginPanelLabelKonto;
    private javax.swing.JLabel loginPanelLabelPin;
    private javax.swing.JTextField loginPanelTextFieldKonto;
    private javax.swing.JTextField loginPanelTextFieldPIN;
    
    private javax.swing.JPanel indexPanel;
    private javax.swing.JButton indexPanelBtnAnuluj;
    private javax.swing.JButton indexPanelBtnDoladowanie;
    private javax.swing.JButton indexPanelBtnSaldo;
    private javax.swing.JButton indexPanelBtnWplata;
    private javax.swing.JButton indexPanelBtnWyplata;
    private javax.swing.JLabel indexPanelLabelAccount;
    private javax.swing.JLabel indexPanelLabelOwner;
    
    private javax.swing.JPanel withdrawPanel1;
    private javax.swing.JButton withdrawPanel1BtnWyplac;
    private javax.swing.JLabel withdrawPanel1LabelKwota;
    private javax.swing.JTextField withdrawPanel1TextFieldKwota;
    
    private BankAccount account;
    
    private void validateCard(String nrKarty, String pin) {
        
        if(nrKarty.length() != 16 || pin.length() != 4){
            JOptionPane.showMessageDialog(this, "Nieprawidłowy nr karty lub pin!");
            return;
        }
        
        String sql = "SELECT k.nr_konta, kont.saldo, kont.pesel, kl.imie, kl.nazwisko FROM (karty k INNER JOIN konta kont ON k.nr_konta = kont.nr_konta) INNER JOIN klienci kl ON kont.pesel = kl.pesel WHERE k.nr_karty = ? AND k.pin = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:h2:./bank", "sa", "");
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nrKarty);
            ps.setString(2, pin);

            try (ResultSet rs = ps.executeQuery()) {
                if(rs.next()){
                    this.account = new BankAccount(rs.getString("pesel"), rs.getString("imie"), rs.getString("nazwisko"), rs.getString("nr_konta"), rs.getBigDecimal("saldo"));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Wystapił błąd z bazą danych!");
            return;
        }
        
        if(account != null){
            this.indexPanelLabelOwner.setText("Cześć " + this.account.imie + " " + this.account.nazwisko + "!");
            this.indexPanelLabelAccount.setText("Konto: " + this.account.nr_konta);
            CardLayout cl = (CardLayout) this.mainPanel.getLayout();
            cl.show(this.mainPanel, "index");
        } else {
            JOptionPane.showMessageDialog(this, "Nieprawidłowy nr karty lub pin!");
        }
        
    }
    
    private void systemExit(){
        this.dispose();
        System.exit(0);
    }
    
    private void initScenes(){
        
        // LOGIN SCENE CONFIG
        loginPanelLabelKonto = new javax.swing.JLabel();
        loginPanelTextFieldKonto = new javax.swing.JTextField();
        loginPanelLabelPin = new javax.swing.JLabel();
        loginPanelTextFieldPIN = new javax.swing.JTextField();
        loginPanelLoginBtn = new javax.swing.JButton();
        loginPanel = new javax.swing.JPanel();
        
        loginPanel.setName("");
        loginPanelLabelKonto.setFont(new java.awt.Font("Segoe UI", 0, 18));
        loginPanelLabelKonto.setText("Nr karty");
        loginPanelTextFieldKonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loginPanelTextFieldKonto.setFont(new java.awt.Font("Segoe UI", 0, 18));
        loginPanelLabelPin.setFont(new java.awt.Font("Segoe UI", 0, 18));
        loginPanelLabelPin.setText("PIN karty:");
        loginPanelTextFieldPIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loginPanelTextFieldPIN.setFont(new java.awt.Font("Segoe UI", 0, 18));
        loginPanelLoginBtn.setText("Zaloguj");
        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(loginPanelLabelKonto)
                    .addComponent(loginPanelTextFieldKonto, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginPanelLabelPin)
                    .addComponent(loginPanelTextFieldPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginPanelLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(loginPanelLabelKonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPanelTextFieldKonto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginPanelLabelPin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPanelTextFieldPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(loginPanelLoginBtn)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        loginPanelLoginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateCard(loginPanelTextFieldKonto.getText(), loginPanelTextFieldPIN.getText());
            }
        });
        limitTextFieldToDigits(loginPanelTextFieldKonto, 16);
        limitTextFieldToDigits(loginPanelTextFieldPIN, 4);
        
        
        // INDEX SCENE CONFIG
        indexPanelLabelOwner = new javax.swing.JLabel();
        indexPanelLabelAccount = new javax.swing.JLabel();
        indexPanelBtnWyplata = new javax.swing.JButton();
        indexPanelBtnWplata = new javax.swing.JButton();
        indexPanelBtnSaldo = new javax.swing.JButton();
        indexPanelBtnDoladowanie = new javax.swing.JButton();
        indexPanelBtnAnuluj = new javax.swing.JButton();
        indexPanel = new javax.swing.JPanel();
        indexPanel.setName("");
        indexPanelLabelOwner.setFont(new java.awt.Font("Segoe UI", 1, 24));
        indexPanelLabelOwner.setText("Klient");
        indexPanelLabelAccount.setText("Konto");
        indexPanelBtnWyplata.setText("Wypłata");
        indexPanelBtnWplata.setText("Wpłata gotówki");
        indexPanelBtnSaldo.setText("Sprawdź saldo");
        indexPanelBtnDoladowanie.setText("Doładowanie SIM");
        indexPanelBtnAnuluj.setText("Anuluj");
        javax.swing.GroupLayout indexPanelLayout = new javax.swing.GroupLayout(indexPanel);
        indexPanel.setLayout(indexPanelLayout);
        indexPanelLayout.setHorizontalGroup(
            indexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(indexPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(indexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(indexPanelLayout.createSequentialGroup()
                        .addGroup(indexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(indexPanelLabelOwner)
                            .addComponent(indexPanelLabelAccount))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, indexPanelLayout.createSequentialGroup()
                        .addComponent(indexPanelBtnAnuluj, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(indexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(indexPanelBtnDoladowanie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(indexPanelBtnSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(indexPanelBtnWplata, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(indexPanelBtnWyplata, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        indexPanelLayout.setVerticalGroup(
            indexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(indexPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(indexPanelLabelOwner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indexPanelLabelAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(indexPanelBtnDoladowanie, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indexPanelBtnSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indexPanelBtnWplata, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(indexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indexPanelBtnWyplata, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexPanelBtnAnuluj, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        indexPanelBtnAnuluj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                systemExit();
            }
        });
        
        // WITHDRAW SCENE CONFIG
        withdrawPanel1 = new javax.swing.JPanel();
        withdrawPanel1LabelKwota = new javax.swing.JLabel();
        withdrawPanel1TextFieldKwota = new javax.swing.JTextField();
        withdrawPanel1BtnWyplac = new javax.swing.JButton();
        withdrawPanel1LabelKwota.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        withdrawPanel1LabelKwota.setText("Kwota do wypłaty:");
        withdrawPanel1TextFieldKwota.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        withdrawPanel1BtnWyplac.setText("Wypłać");
        javax.swing.GroupLayout withdrawPanel1Layout = new javax.swing.GroupLayout(withdrawPanel1);
        withdrawPanel1.setLayout(withdrawPanel1Layout);
        withdrawPanel1Layout.setHorizontalGroup(
            withdrawPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(withdrawPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(withdrawPanel1BtnWyplac, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(withdrawPanel1Layout.createSequentialGroup()
                        .addComponent(withdrawPanel1LabelKwota)
                        .addGap(18, 18, 18)
                        .addComponent(withdrawPanel1TextFieldKwota, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        withdrawPanel1Layout.setVerticalGroup(
            withdrawPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, withdrawPanel1Layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addGroup(withdrawPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawPanel1LabelKwota)
                    .addComponent(withdrawPanel1TextFieldKwota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(withdrawPanel1BtnWyplac)
                .addGap(137, 137, 137))
        );
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Database create">  
    private static void CreateDatabase(){
        try (Connection conn = DriverManager.getConnection("jdbc:h2:./bank", "sa", ""); Statement stmt = conn.createStatement()) {
            ResultSet rs;
            
            // TABELA KLIENCI
            stmt.execute("CREATE TABLE IF NOT EXISTS klienci (pesel CHAR(11) NOT NULL PRIMARY KEY, imie VARCHAR(16) NOT NULL, nazwisko VARCHAR(16) NOT NULL)");
            rs = stmt.executeQuery("SELECT * FROM klienci");
            if(!rs.next()){
                try (PreparedStatement ps = conn.prepareStatement("INSERT INTO klienci (pesel, imie, nazwisko) VALUES (?, ?, ?)")) {
                    Object[][] klienci = {
                        {"12345678901", "Jan",    "Kowalski"},
                        {"23456789012", "Anna",   "Nowak"},
                        {"34567890123", "Piotr",  "Wiśniewski"},
                        {"45678901234", "Maria",  "Wójcik"},
                        {"56789012345", "Tomasz", "Kamiński"}
                    };
                    for (Object[] klient : klienci) {
                        ps.setString(1, (String) klient[0]);
                        ps.setString(2, (String) klient[1]);
                        ps.setString(3, (String) klient[2]);
                        ps.executeUpdate();
                    }
                }
            }
            
            // TABELA KONTA
            stmt.execute("CREATE TABLE IF NOT EXISTS konta (nr_konta CHAR(26) NOT NULL PRIMARY KEY, pesel CHAR(11) NOT NULL, saldo DECIMAL(10,2) NOT NULL, FOREIGN KEY (pesel) REFERENCES klienci(pesel))");
            rs = stmt.executeQuery("SELECT * FROM konta");
            if(!rs.next()){
                try (PreparedStatement ps = conn.prepareStatement("INSERT INTO konta (nr_konta, pesel, saldo) VALUES (?, ?, ?)")) {
                    Object[][] konta = {
                        {"61109010140000071219812874", "12345678901", 2500.00},
                        {"61109010140000071219812875", "23456789012", 3500.50},
                        {"61109010140000071219812876", "34567890123", 1500.75},
                        {"61109010140000071219812877", "45678901234", 4200.00},
                        {"61109010140000071219812878", "56789012345", 980.20}
                    };
                    for (Object[] konto : konta) {
                        ps.setString(1, (String) konto[0]);
                        ps.setString(2, (String) konto[1]);
                        ps.setBigDecimal(3, new java.math.BigDecimal(konto[2].toString()));
                        ps.executeUpdate();
                    }
                }
            }
            
            // TABELA KARTY
            stmt.execute("CREATE TABLE IF NOT EXISTS karty (nr_karty CHAR(16) NOT NULL PRIMARY KEY, nr_konta CHAR(26) NOT NULL, pin CHAR(4) NOT NULL, FOREIGN KEY (nr_konta) REFERENCES konta(nr_konta))");
            rs = stmt.executeQuery("SELECT * FROM karty");
            if(!rs.next()){
                try (PreparedStatement ps = conn.prepareStatement("INSERT INTO karty (nr_karty, nr_konta, pin) VALUES (?, ?, ?)")) {
                    Object[][] karty = {
                        {"1111222233334444", "61109010140000071219812874", "0000"},
                        {"2222333344445555", "61109010140000071219812875", "1234"},
                        {"3333444455556666", "61109010140000071219812876", "0000"},
                        {"4444555566667777", "61109010140000071219812877", "1234"},
                        {"5555666677778888", "61109010140000071219812878", "1234"}
                    };

                    for (Object[] karta : karty) {
                        ps.setString(1, (String) karta[0]);
                        ps.setString(2, (String) karta[1]);
                        ps.setString(3, (String) karta[2]);
                        ps.executeUpdate();
                    }
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Limit Textfield to x digits"> 
    public static void limitTextFieldToDigits(javax.swing.JTextField textField, int maxLength) {
        ((AbstractDocument) textField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
                    throws BadLocationException {
                if (string == null) return;

                // allow only digits and respect max length
                if (string.matches("\\d*") && 
                    (fb.getDocument().getLength() + string.length()) <= maxLength) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                if (text == null) return;

                if (text.matches("\\d*") &&
                    (fb.getDocument().getLength() - length + text.length()) <= maxLength) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
    }
    // </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerPanelLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel testPanel;
    // End of variables declaration//GEN-END:variables
}
