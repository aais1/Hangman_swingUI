
package hangman;
public class howTo extends javax.swing.JFrame {

    public howTo() {
        initComponents();
        setSize(555,545);
        setResizable(false);
        this.setLocationRelativeTo(null);//for centering
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Instructions");
        getContentPane().setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("  1 . Set up the game :\n\nChoose one player to be the \"word provider\" and the other player to be the \"guesser.\"\nThe word provider thinks of a word and a hint that points toward that word.\nThe word provider keeps the word and hint secret from the guesser.\n\n  2 . Start guessing :\n\n The guesser starts by guessing the word in its entirety.\nThe guesser must type the word as a whole, without guessing individual letters.\nThe word provider reveals whether the guess is correct or not.\nIf the guess is correct, the guesser wins the game.\nIf the guess is incorrect, the guesser has a limited number of tries remaining.\n\n  4 . Limited number of tries :\n\nThe guesser has a maximum of 5 tries to guess the word correctly.\nAfter each incorrect guess, the word provider can keep track of the number of tries remaining\n\n  5 . Winning and losing :\n\nIf the guesser correctly guesses the word within 5 tries, they win the game.\nIf the guesser exhausts all 5 tries without guessing the word correctly, the word provider wins\nthe game.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 36, 580, 504);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel1.setText(" How To Play :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1)
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new howTo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
