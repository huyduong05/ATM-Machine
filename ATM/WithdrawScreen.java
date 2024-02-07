package ATM;
import javax.swing.*;

/**
 *
 * @author huyduong
 */
public class WithdrawScreen extends JFrame {

    private Account bankAccount;

    private JPanel $$$;
    private JLabel $label;
    private JLabel ATMLabel;
    private JPanel ATMLogo;
    private JLabel accountNumber;
    private JLabel depositText;
    private java.awt.Button homeButton;
    private JPanel jPanel1;
    private JLabel message;
    private JPanel panel;
    private java.awt.Button signoutButton;
    private JLabel welcomeText;
    private JTextField withdrawAmount;
    private java.awt.Button withdrawButton;

    /**
     * Creates new form WithdrawScreen
     */
    public WithdrawScreen(Account acc) {
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
        welcomeText = new JLabel();
        accountNumber = new JLabel();
        depositText = new JLabel();
        withdrawAmount = new JTextField();
        withdrawButton = new java.awt.Button();
        homeButton = new java.awt.Button();
        signoutButton = new java.awt.Button();
        message = new JLabel();
        ATMLogo = new JPanel();
        ATMLabel = new JLabel();
        $$$ = new JPanel();
        $label = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        panel.setBackground(new java.awt.Color(255, 255, 255));

        welcomeText.setFont(new java.awt.Font("Monospaced", 1, 30)); // NOI18N
        welcomeText.setForeground(new java.awt.Color(0, 51, 204));
        welcomeText.setText("THE BANK");

        accountNumber.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N
        accountNumber.setForeground(new java.awt.Color(102, 102, 102));
        accountNumber.setText("Account Number: " + bankAccount.getAccountNumber());

        depositText.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 16)); // NOI18N
        depositText.setText("Enter an amount to withdraw:");

        withdrawAmount.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N

        withdrawButton.setBackground(new java.awt.Color(0, 153, 51));
        withdrawButton.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 22)); // NOI18N
        withdrawButton.setForeground(new java.awt.Color(255, 255, 255));
        withdrawButton.setLabel("Withdraw");
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        homeButton.setBackground(new java.awt.Color(123, 166, 253));
        homeButton.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setLabel("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        signoutButton.setBackground(new java.awt.Color(255, 96, 96));
        signoutButton.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        signoutButton.setForeground(new java.awt.Color(255, 255, 255));
        signoutButton.setLabel("Sign Out");
        signoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutButtonActionPerformed(evt);
            }
        });

        message.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N
        message.setForeground(new java.awt.Color(255, 255, 255));
        message.setText("Withdrawing cash...");

        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(welcomeText))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(accountNumber)
                            .addComponent(withdrawButton, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(withdrawAmount, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(message)
                        .addGap(196, 196, 196))))
            .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(signoutButton, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(depositText)
                        .addGap(137, 137, 137))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(welcomeText)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountNumber)
                .addGap(28, 28, 28)
                .addComponent(depositText)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(withdrawAmount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(withdrawButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(message)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(signoutButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        ATMLogo.setBackground(new java.awt.Color(255, 255, 255));

        ATMLabel.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 48)); // NOI18N
        ATMLabel.setForeground(new java.awt.Color(0, 102, 51));
        ATMLabel.setText("ATM");

        GroupLayout ATMLogoLayout = new GroupLayout(ATMLogo);
        ATMLogo.setLayout(ATMLogoLayout);
        ATMLogoLayout.setHorizontalGroup(
            ATMLogoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(ATMLogoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ATMLabel)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        ATMLogoLayout.setVerticalGroup(
            ATMLogoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, ATMLogoLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(ATMLabel)
                .addContainerGap())
        );

        $$$.setBackground(new java.awt.Color(21, 120, 17));

        $label.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        $label.setForeground(new java.awt.Color(255, 255, 255));
        $label.setText("$$$");
        $label.setVisible(false);

        GroupLayout $$$9Layout = new GroupLayout($$$);
        $$$.setLayout($$$9Layout);
        $$$9Layout.setHorizontalGroup(
            $$$9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup($$$9Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent($label)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        $$$9Layout.setVerticalGroup(
            $$$9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent($label)
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ATMLogo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent($$$, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ATMLogo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))
                    .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent($$$, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        try {
            double amount = Double.parseDouble(withdrawAmount.getText());
            boolean valid = bankAccount.withdraw(amount);

            if (valid) { 
                message.setForeground(new java.awt.Color(102, 102, 102));
                message.setText("Withdrawing cash...");
                $label.setVisible(true);

            } else { 
                message.setForeground(new java.awt.Color(102, 102, 102));
                message.setText("Error: Invalid amount");
                $label.setVisible(false);
            }
        } catch (Exception e) {
            message.setForeground(new java.awt.Color(102, 102, 102));
            message.setText("Error: Invalid amount");
        }

    }                                              

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        dispose();
        new HomeScreen(bankAccount).launchHome();;
    }                                          

    private void signoutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        dispose();
        new LoginScreen().launchLogin();;
    }                                             

    /**
     * @param args the command line arguments
     */
    public void launchWithdraw() {
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
            java.util.logging.Logger.getLogger(WithdrawScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WithdrawScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WithdrawScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WithdrawScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WithdrawScreen(bankAccount).setVisible(true);
            }
        });
    }
           
}
