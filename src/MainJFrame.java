import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
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
        this.mainPanel.add(this.infoPanel, "info");
        this.mainPanel.add(this.loginPanel, "login");
        this.mainPanel.add(this.indexPanel, "index");
        this.mainPanel.add(this.balancePanel, "balance");
        this.mainPanel.add(this.withdraw1Panel, "withdraw1");
        
        CardLayout cl = (CardLayout) this.mainPanel.getLayout();
        cl.show(this.mainPanel, "login");
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
    
    private javax.swing.JPanel withdraw1Panel;
    private javax.swing.JButton withdraw1PanelBtnNext;
    private javax.swing.JLabel withdraw1PanelLabelKwota;
    private javax.swing.JTextField withdraw1PanelTextFieldKwota;
    
    private javax.swing.JPanel infoPanel;
    private javax.swing.JButton infoPanelBtnEnd;
    private javax.swing.JLabel infoPanelLabelDesc;
    private javax.swing.JLabel infoPanelLabelInfo;
    
    private javax.swing.JPanel balancePanel;
    private javax.swing.JButton balancePanelBtnContinue;
    private javax.swing.JButton balancePanelBtnEnd;
    private javax.swing.JLabel balancePanelLabelBalance;
    private javax.swing.JLabel balancePanelLabelTitle;
    
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
            systemExit();
        }
        
        if(account != null){
            this.indexPanelLabelOwner.setText("Cześć " + this.account.imie + " " + this.account.nazwisko + "!");
            this.indexPanelLabelAccount.setText("Konto: " + this.account.nr_konta);
            changeScene("index");
        } else {
            JOptionPane.showMessageDialog(this, "Nieprawidłowy nr karty lub pin!");
        }
        
    }
    
    private void tryWithdraw(){
        String s = this.withdraw1PanelTextFieldKwota.getText();
        BigDecimal x = new BigDecimal(s);
        if(s.length() == 0 || x.compareTo(new BigDecimal("0")) == 0){
            JOptionPane.showMessageDialog(this, "Podaj poprawną kwotę!");
            return;
        }
        if(x.compareTo(this.account.saldo) > 0){
            showInfoScene("Nie udalo sie wyplacic z konta!", "Podana kwota przekracza twoje saldo!");
            return;
        }
        
        String sql = "UPDATE konta SET saldo = saldo - ?  WHERE nr_konta = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:h2:./bank", "sa", "");
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setBigDecimal(1, x);
            ps.setString(2, this.account.nr_konta);
            if(ps.executeUpdate() > 0){
                showWithdraw2Scene(x);
            } else {
                showInfoScene("Nie udalo sie wyplacic z konta!", "Blad aktualizacji danych!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Wystapił błąd z bazą danych!");
            systemExit();
        }
    }
    
    private void showInfoScene(String info, String desc){
        this.infoPanelLabelInfo.setText(info);
        this.infoPanelLabelDesc.setText(desc);
        changeScene("info");
    }
    
    private void showBalanceScene(){
        this.balancePanelLabelBalance.setText(this.account.saldo.toString() + " zł");
        changeScene("balance");
    }
    
    private void showWithdraw2Scene(BigDecimal x){
        
    }
    
    private void systemExit(){
        this.dispose();
        System.exit(0);
    }
    
    private void changeScene(String name){
        CardLayout cl = (CardLayout) this.mainPanel.getLayout();
        cl.show(this.mainPanel, name);
    }
    
    private void initScenes(){
        
        // INFO SCENE CONFIG
        infoPanelLabelInfo = new javax.swing.JLabel();
        infoPanelLabelDesc = new javax.swing.JLabel();
        infoPanelBtnEnd = new javax.swing.JButton();
        infoPanel = new javax.swing.JPanel();
        infoPanelLabelInfo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        infoPanelLabelInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoPanelLabelInfo.setText("Informacja");
        infoPanelLabelDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoPanelLabelDesc.setText("Opis");
        infoPanelBtnEnd.setText("Zakończ");
        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(infoPanelBtnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(infoPanelLabelDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoPanelLabelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(infoPanelLabelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoPanelLabelDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(infoPanelBtnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        infoPanelBtnEnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                systemExit();
            }
        });
        
        // BALANCE SCENE CONFIG
        balancePanel = new javax.swing.JPanel();
        balancePanelLabelTitle = new javax.swing.JLabel();
        balancePanelLabelBalance = new javax.swing.JLabel();
        balancePanelBtnEnd = new javax.swing.JButton();
        balancePanelBtnContinue = new javax.swing.JButton();
        balancePanelLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        balancePanelLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balancePanelLabelTitle.setText("Dostępne saldo na koncie:");
        balancePanelBtnEnd.setText("Zakończ");
        balancePanelLabelBalance.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        balancePanelLabelBalance.setText("100.0 zł");
        balancePanelBtnContinue.setText("Kontynuuj");
        javax.swing.GroupLayout balancePanelLayout = new javax.swing.GroupLayout(balancePanel);
        balancePanel.setLayout(balancePanelLayout);
        balancePanelLayout.setHorizontalGroup(
            balancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(balancePanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(balancePanelLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balancePanelLabelBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, balancePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(balancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(balancePanelBtnContinue, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(balancePanelBtnEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        balancePanelLayout.setVerticalGroup(
            balancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(balancePanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(balancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balancePanelLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balancePanelLabelBalance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(balancePanelBtnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balancePanelBtnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        balancePanelBtnEnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                systemExit();
            }
        });
         balancePanelBtnContinue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeScene("index");
            }
        });

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
        indexPanelBtnAnuluj.setText("Zakończ");
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
        indexPanelBtnWyplata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeScene("withdraw1");
            }
        });
        indexPanelBtnSaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showBalanceScene();
            }
        });
        
        // WITHDRAW1 SCENE CONFIG
        withdraw1Panel = new javax.swing.JPanel();
        withdraw1PanelLabelKwota = new javax.swing.JLabel();
        withdraw1PanelTextFieldKwota = new javax.swing.JTextField();
        withdraw1PanelBtnNext = new javax.swing.JButton();
        withdraw1PanelBtnNext.setText("Dalej");
        withdraw1PanelLabelKwota.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        withdraw1PanelLabelKwota.setText("Kwota do wypłacenia [zł]:");
        withdraw1PanelTextFieldKwota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        withdraw1PanelTextFieldKwota.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        javax.swing.GroupLayout withdraw1PanelLayout = new javax.swing.GroupLayout(withdraw1Panel);
        withdraw1Panel.setLayout(withdraw1PanelLayout);
        withdraw1PanelLayout.setHorizontalGroup(
            withdraw1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdraw1PanelLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(withdraw1PanelLabelKwota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(withdraw1PanelTextFieldKwota, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, withdraw1PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(withdraw1PanelBtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        withdraw1PanelLayout.setVerticalGroup(
            withdraw1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, withdraw1PanelLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(withdraw1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdraw1PanelLabelKwota)
                    .addComponent(withdraw1PanelTextFieldKwota, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(withdraw1PanelBtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        limitTextFieldToDigits(withdraw1PanelTextFieldKwota, 5);
        withdraw1PanelBtnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tryWithdraw();
            }
        });
        
        // WITHDRAW2 SCENE CONFIG
        
        
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
