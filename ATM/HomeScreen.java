package ATM;
import javax.swing.*;

/**
 *
 * @author huyduong
 */
public class HomeScreen extends JFrame {

    private Account bankAccount;
    
    private JLabel ATMLabel1;
    private JPanel ATMLogo1;
    private JLabel accountNumber;
    private java.awt.Button balanceButton;
    private java.awt.Button depositButton;
    private java.awt.Button fastcashButton;
    private JPanel jPanel1;
    private JPanel panel;
    private JPanel screen;
    private java.awt.Button signoutButton;
    private JLabel welcomeText2;
    private java.awt.Button withdrawButton;     

    /**
     * Creates new form MainScreen
     */
    public HomeScreen(Account acc) {
        super();
        bankAccount = acc;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */                
    private void initComponents() {

        jPanel1 = new JPanel();
        panel = new JPanel();
        screen = new JPanel();
        welcomeText2 = new JLabel();
        balanceButton = new java.awt.Button();
        withdrawButton = new java.awt.Button();
        fastcashButton = new java.awt.Button();
        depositButton = new java.awt.Button();
        accountNumber = new JLabel();
        signoutButton = new java.awt.Button();
        ATMLogo1 = new JPanel();
        ATMLabel1 = new JLabel();

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setForeground(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(722, 430));

        screen.setBackground(new java.awt.Color(255, 255, 255));

        welcomeText2.setFont(new java.awt.Font("Monospaced", 1, 30)); // NOI18N
        welcomeText2.setForeground(new java.awt.Color(0, 51, 204));
        welcomeText2.setText("THE BANK");

        balanceButton.setBackground(new java.awt.Color(123, 166, 253));
        balanceButton.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        balanceButton.setForeground(new java.awt.Color(255, 255, 255));
        balanceButton.setLabel("Balance");
        balanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceButtonActionPerformed(evt);
            }
        });

        withdrawButton.setBackground(new java.awt.Color(123, 166, 253));
        withdrawButton.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        withdrawButton.setForeground(new java.awt.Color(255, 255, 255));
        withdrawButton.setLabel("Withdraw");
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        fastcashButton.setBackground(new java.awt.Color(123, 166, 253));
        fastcashButton.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        fastcashButton.setForeground(new java.awt.Color(255, 255, 255));
        fastcashButton.setLabel("Fast Cash");
        fastcashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastcashButtonActionPerformed(evt);
            }
        });

        depositButton.setBackground(new java.awt.Color(123, 166, 253));
        depositButton.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        depositButton.setForeground(new java.awt.Color(255, 255, 255));
        depositButton.setLabel("Deposit");
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });

        accountNumber.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N
        accountNumber.setForeground(new java.awt.Color(102, 102, 102));
        accountNumber.setText("Account Number: " + bankAccount.getAccountNumber());

        signoutButton.setBackground(new java.awt.Color(255, 96, 96));
        signoutButton.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        signoutButton.setForeground(new java.awt.Color(255, 255, 255));
        signoutButton.setLabel("Sign Out");
        signoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutButtonActionPerformed(evt);
            }
        });

        GroupLayout screenLayout = new GroupLayout(screen);
        screen.setLayout(screenLayout);
        screenLayout.setHorizontalGroup(
            screenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, screenLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(accountNumber)
                .addGap(155, 155, 155))
            .addGroup(GroupLayout.Alignment.TRAILING, screenLayout.createSequentialGroup()
                .addGap(0, 58, Short.MAX_VALUE)
                .addGroup(screenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(withdrawButton, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositButton, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(screenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(fastcashButton, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceButton, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
            .addGroup(screenLayout.createSequentialGroup()
                .addGroup(screenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(screenLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(welcomeText2))
                    .addGroup(screenLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(signoutButton, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        screenLayout.setVerticalGroup(
            screenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(screenLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(welcomeText2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountNumber)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(screenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(withdrawButton, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                    .addComponent(fastcashButton, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(screenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(depositButton, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceButton, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(signoutButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        ATMLogo1.setBackground(new java.awt.Color(255, 255, 255));

        ATMLabel1.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 48)); // NOI18N
        ATMLabel1.setForeground(new java.awt.Color(0, 102, 51));
        ATMLabel1.setText("ATM");

        GroupLayout ATMLogo1Layout = new GroupLayout(ATMLogo1);
        ATMLogo1.setLayout(ATMLogo1Layout);
        ATMLogo1Layout.setHorizontalGroup(
            ATMLogo1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(ATMLogo1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ATMLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        ATMLogo1Layout.setVerticalGroup(
            ATMLogo1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, ATMLogo1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(ATMLabel1)
                .addContainerGap())
        );

        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(screen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ATMLogo1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(ATMLogo1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(screen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel, GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        dispose();
        new DepositScreen(bankAccount).launchDeposit();
    }                                             

    private void fastcashButtonActionPerformed(java.awt.event.ActionEvent evt) {      
        dispose();
        new FastCashScreen(bankAccount).launchFastCash();                                         
    }                                              

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        dispose();
        new WithdrawScreen(bankAccount).launchWithdraw();
    }                                              

    private void balanceButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        dispose();
        new BalanceScreen(bankAccount).launchBalance();
    }                                             

    private void signoutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        dispose();
        new LoginScreen().launchLogin();
    }                                             

    /**
     * @param args the command line arguments
     */
    public void launchHome() {
        /* Set the Nimbus look and feel */
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen(bankAccount).setVisible(true);
            }
        });
    }

             
}
