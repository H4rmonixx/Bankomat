import java.awt.CardLayout;
import java.sql.*;

public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();
        initScenes();
        mainPanel.setLayout(new java.awt.CardLayout());
        mainPanel.add(loginPanel, "login");
        
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        cl.show(mainPanel, "login");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        testPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bankomat");

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Rubik", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("SPEURO Bank");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(testPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(testPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    
    public void initScenes(){
       
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
        loginPanelLabelPin.setFont(new java.awt.Font("Segoe UI", 0, 18));
        loginPanelLabelPin.setText("PIN karty:");
        loginPanelTextFieldPIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
        
        
        // HOME SCENE CONFIG
        
    }
    
    // DB using H2
    // <editor-fold defaultstate="collapsed" desc="Database create">  
    public static void CreateDatabase(){
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel testPanel;
    // End of variables declaration//GEN-END:variables
}
