/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package yahtzee;

import java.util.stream.IntStream;



/**
 *
 * @author 9506892
 */
public class yahtzeeFrame extends javax.swing.JFrame {

    /**
     * Creates new form yahtzeeFrame
     */
    
    boolean active1 = true;
    boolean active2 = true;
    boolean active3 = true;
    boolean active4 = true;
    boolean active5 = true;
    
    boolean threeKind = false;
    boolean fourKind = false;
    boolean fullHouse = false;
    boolean smStraight = false;
    boolean lgStraight = false;
    boolean yahtzee = false;
    
    boolean oneUsed = false;
    boolean twoUsed = false;
    boolean threeUsed = false;
    boolean fourUsed = false;
    boolean fiveUsed = false;
    boolean sixUsed = false;
    boolean threeKindUsed = false;
    boolean fourKindUsed = false;
    boolean fullUsed = false;
    boolean smUsed = false;
    boolean lgUsed = false;
    boolean yahtzeeUsed = false;
    boolean chanceUsed = false;
    
    int die1, die2, die3, die4, die5;
    
    int ace = 0;
    int two = 0;
    int three = 0;
    int four = 0;
    int five = 0;
    int six = 0;
    
    int[] numbers = new int[5];
    
    int a;
    
    public yahtzeeFrame() {
        initComponents();
    }
    
    public void roll1() {
        
        die1 = (int) (Math.random() *6 +1);
        
        switch (die1) {
            case 1:
                labelDie1.setIcon(new javax.swing.ImageIcon("M:\\die_face_1.png"));
                break;
            case 2:
                labelDie1.setIcon(new javax.swing.ImageIcon("M:\\die_face_2.png"));
                break;
            case 3:
                labelDie1.setIcon(new javax.swing.ImageIcon("M:\\die_face_3.png"));
                break;
            case 4:
                labelDie1.setIcon(new javax.swing.ImageIcon("M:\\die_face_4.png"));
                break;
            case 5:
                labelDie1.setIcon(new javax.swing.ImageIcon("M:\\die_face_5.png"));
                break;
            case 6:
                labelDie1.setIcon(new javax.swing.ImageIcon("M:\\die_face_6.png"));
                break;
            default:
             
                
        }
    }
    
    public void roll2() {
        
        die2 = (int) (Math.random() *6 +1);
        
        switch (die2) {
            case 1:
                labelDie2.setIcon(new javax.swing.ImageIcon("M:\\die_face_1.png"));
                break;
            case 2:
                labelDie2.setIcon(new javax.swing.ImageIcon("M:\\die_face_2.png"));
                break;
            case 3:
                labelDie2.setIcon(new javax.swing.ImageIcon("M:\\die_face_3.png"));
                break;
            case 4:
                labelDie2.setIcon(new javax.swing.ImageIcon("M:\\die_face_4.png"));
                break;
            case 5:
                labelDie2.setIcon(new javax.swing.ImageIcon("M:\\die_face_5.png"));
                break;
            case 6:
                labelDie2.setIcon(new javax.swing.ImageIcon("M:\\die_face_6.png"));
                break;
            default:
            
        }        
    }
    
    public void roll3() {
        die3 = (int) (Math.random() *6 +1);
        
        switch (die3) {
            case 1:
                labelDie3.setIcon(new javax.swing.ImageIcon("M:\\die_face_1.png"));
                break;
            case 2:
                labelDie3.setIcon(new javax.swing.ImageIcon("M:\\die_face_2.png"));
                break;
            case 3:
                labelDie3.setIcon(new javax.swing.ImageIcon("M:\\die_face_3.png"));
                break;
            case 4:
                labelDie3.setIcon(new javax.swing.ImageIcon("M:\\die_face_4.png"));
                break;
            case 5:
                labelDie3.setIcon(new javax.swing.ImageIcon("M:\\die_face_5.png"));
                break;
            case 6:
                labelDie3.setIcon(new javax.swing.ImageIcon("M:\\die_face_6.png"));
                break;
            default:
             
        }
    }
    
    public void roll4() {
        die4 = (int) (Math.random() *6 +1);
        
        switch (die4) {
            case 1:
                labelDie4.setIcon(new javax.swing.ImageIcon("M:\\die_face_1.png"));
                break;
            case 2:
                labelDie4.setIcon(new javax.swing.ImageIcon("M:\\die_face_2.png"));
                break;
            case 3:
                labelDie4.setIcon(new javax.swing.ImageIcon("M:\\die_face_3.png"));
                break;
            case 4:
                labelDie4.setIcon(new javax.swing.ImageIcon("M:\\die_face_4.png"));
                break;
            case 5:
                labelDie4.setIcon(new javax.swing.ImageIcon("M:\\die_face_5.png"));
                break;
            case 6:
                labelDie4.setIcon(new javax.swing.ImageIcon("M:\\die_face_6.png"));
                break;
            default:
              
        }       
    }
    
    public void roll5() {
        die5 = (int) (Math.random() *6 +1);
        
        switch (die5) {
            case 1:
                labelDie5.setIcon(new javax.swing.ImageIcon("M:\\die_face_1.png"));
                break;
            case 2:
                labelDie5.setIcon(new javax.swing.ImageIcon("M:\\die_face_2.png"));
                break;
            case 3:
                labelDie5.setIcon(new javax.swing.ImageIcon("M:\\die_face_3.png"));
                break;
            case 4:
                labelDie5.setIcon(new javax.swing.ImageIcon("M:\\die_face_4.png"));
                break;
            case 5:
                labelDie5.setIcon(new javax.swing.ImageIcon("M:\\die_face_5.png"));
                break;
            case 6:
                labelDie5.setIcon(new javax.swing.ImageIcon("M:\\die_face_6.png"));
                break;
            default:
          
        }  
        
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDie1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labelDie3 = new javax.swing.JLabel();
        labelDie4 = new javax.swing.JLabel();
        labelDie5 = new javax.swing.JLabel();
        labelDie2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonAces = new javax.swing.JButton();
        buttonTwos = new javax.swing.JButton();
        buttonThrees = new javax.swing.JButton();
        buttonFours = new javax.swing.JButton();
        buttonFives = new javax.swing.JButton();
        buttonSixes = new javax.swing.JButton();
        button3Kind = new javax.swing.JButton();
        button4Kind = new javax.swing.JButton();
        buttonFullHouse = new javax.swing.JButton();
        buttonSmStraight = new javax.swing.JButton();
        buttonLgStraight = new javax.swing.JButton();
        buttonYahtzee = new javax.swing.JButton();
        buttonChance = new javax.swing.JButton();
        labelScore = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelChoose1 = new javax.swing.JLabel();
        labelChoose2 = new javax.swing.JLabel();
        labelBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("mainFrame");
        setBackground(new java.awt.Color(0, 102, 0));
        setPreferredSize(new java.awt.Dimension(851, 520));
        getContentPane().setLayout(null);

        labelDie1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDie1MouseClicked(evt);
            }
        });
        getContentPane().add(labelDie1);
        labelDie1.setBounds(20, 400, 70, 70);

        jButton1.setText("ROLL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 120, 80, 30);

        labelDie3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDie3MouseClicked(evt);
            }
        });
        getContentPane().add(labelDie3);
        labelDie3.setBounds(220, 400, 70, 70);

        labelDie4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDie4MouseClicked(evt);
            }
        });
        getContentPane().add(labelDie4);
        labelDie4.setBounds(320, 400, 70, 70);

        labelDie5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDie5MouseClicked(evt);
            }
        });
        getContentPane().add(labelDie5);
        labelDie5.setBounds(410, 400, 70, 70);

        labelDie2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDie2MouseClicked(evt);
            }
        });
        getContentPane().add(labelDie2);
        labelDie2.setBounds(120, 400, 70, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon("M:\\yahtzee.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 0, 290, 110);

        buttonAces.setText("ACES");
        buttonAces.setEnabled(false);
        buttonAces.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAcesMouseClicked(evt);
            }
        });
        getContentPane().add(buttonAces);
        buttonAces.setBounds(590, 40, 70, 30);

        buttonTwos.setText("TWOS");
        buttonTwos.setEnabled(false);
        buttonTwos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTwosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonTwos);
        buttonTwos.setBounds(590, 63, 70, 30);

        buttonThrees.setText("THREES");
        buttonThrees.setEnabled(false);
        getContentPane().add(buttonThrees);
        buttonThrees.setBounds(590, 90, 70, 23);

        buttonFours.setText("FOURS");
        buttonFours.setEnabled(false);
        getContentPane().add(buttonFours);
        buttonFours.setBounds(590, 110, 70, 30);

        buttonFives.setText("FIVES");
        buttonFives.setEnabled(false);
        getContentPane().add(buttonFives);
        buttonFives.setBounds(590, 137, 70, 23);

        buttonSixes.setText("SIXES");
        buttonSixes.setEnabled(false);
        getContentPane().add(buttonSixes);
        buttonSixes.setBounds(590, 153, 70, 30);

        button3Kind.setText("3 OF A KIND");
        button3Kind.setEnabled(false);
        getContentPane().add(button3Kind);
        button3Kind.setBounds(590, 200, 110, 30);

        button4Kind.setText("4 OF A KIND");
        button4Kind.setEnabled(false);
        getContentPane().add(button4Kind);
        button4Kind.setBounds(590, 223, 110, 30);

        buttonFullHouse.setText("FULL HOUSE");
        buttonFullHouse.setEnabled(false);
        buttonFullHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFullHouseActionPerformed(evt);
            }
        });
        getContentPane().add(buttonFullHouse);
        buttonFullHouse.setBounds(590, 250, 110, 23);

        buttonSmStraight.setText("SM. STRAIGHT");
        buttonSmStraight.setEnabled(false);
        getContentPane().add(buttonSmStraight);
        buttonSmStraight.setBounds(590, 270, 110, 30);

        buttonLgStraight.setText("LG. STRAIGHT");
        buttonLgStraight.setEnabled(false);
        getContentPane().add(buttonLgStraight);
        buttonLgStraight.setBounds(590, 293, 110, 30);

        buttonYahtzee.setText("YAHTZEE");
        buttonYahtzee.setEnabled(false);
        getContentPane().add(buttonYahtzee);
        buttonYahtzee.setBounds(590, 320, 110, 23);

        buttonChance.setText("CHANCE");
        buttonChance.setEnabled(false);
        getContentPane().add(buttonChance);
        buttonChance.setBounds(590, 340, 110, 30);

        labelScore.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        labelScore.setForeground(new java.awt.Color(204, 255, 102));
        labelScore.setText("0");
        getContentPane().add(labelScore);
        labelScore.setBounds(90, 10, 50, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon("M:\\yahtzeescoretop_360.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(580, 0, 200, 200);

        jLabel2.setIcon(new javax.swing.ImageIcon("M:\\yahtzeescorebottom_360.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(580, 200, 210, 170);

        labelChoose1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        labelChoose1.setForeground(new java.awt.Color(204, 255, 102));
        labelChoose1.setText("Click the dice you want to keep. Then roll again when ready");
        getContentPane().add(labelChoose1);
        labelChoose1.setBounds(10, 370, 530, 20);

        labelChoose2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        labelChoose2.setForeground(new java.awt.Color(204, 255, 102));
        labelChoose2.setText("SCORE:");
        getContentPane().add(labelChoose2);
        labelChoose2.setBounds(10, 10, 70, 20);

        labelBack.setForeground(new java.awt.Color(0, 255, 204));
        labelBack.setIcon(new javax.swing.ImageIcon("M:\\green2.jpg")); // NOI18N
        labelBack.setName(""); // NOI18N
        getContentPane().add(labelBack);
        labelBack.setBounds(0, -10, 850, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (active1) {
        roll1();
        }
        
        if (active2) {
        roll2();
        }
        
        if (active3) {
        roll3();
        }
        
        if (active4) {
        roll4();
        }
        
        if (active5) {
        roll5();
        }
        
        if (chanceUsed == false){
        buttonChance.setEnabled(true);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
   
    private void labelDie1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDie1MouseClicked
        // TODO add your handling code here:
        if (active1){
        labelDie1.setLocation(20, 290);
        active1 = false;
        numbers[0] = die1;
        test1();
        a = 0;
        test2();
        }
        else if (active1 == false) {
            labelDie1.setLocation(20, 400);
            active1 = true;
            a = 0;
            test3();
            numbers[0] = 0;
            test1();
        }
    }//GEN-LAST:event_labelDie1MouseClicked

    private void labelDie2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDie2MouseClicked
        // TODO add your handling code here:
        if (active2) {
            labelDie2.setLocation(120, 290);
            active2 = false;
            numbers[1] = die2;
            test1();
            a = 1;
            test2();
        }
        else if (active2 == false){
            labelDie2.setLocation(120, 400);
            active2 = true;
            a = 1;
            test3();
            numbers[1] = 0;
            test1();
        }
    }//GEN-LAST:event_labelDie2MouseClicked

    private void labelDie3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDie3MouseClicked
        // TODO add your handling code here:
        if (active3) {
        labelDie3.setLocation(220, 290);
        active3 = false;
        numbers[2] = die3;
        test1();
        a = 2;
        test2();
        }
        else if (active3 == false) {
            labelDie3.setLocation(220, 400);
            active3 = true;
            a = 2;
            test3();
            numbers[2] = 0;
            test1();
        }
    }//GEN-LAST:event_labelDie3MouseClicked

    private void labelDie4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDie4MouseClicked
        // TODO add your handling code here:
        if (active4) {
        labelDie4.setLocation(320, 290);
        active4 = false;
        numbers[3] = die4;
        test1();
        a = 3;
        test2();
        }
        else if (active4 == false){
            labelDie4.setLocation(320, 400);
            active4 = true;
            a = 3;
            test3();
            numbers[3] = 0;
            test1();
        }
    }//GEN-LAST:event_labelDie4MouseClicked

    private void labelDie5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDie5MouseClicked
        // TODO add your handling code here:
        if (active5) {
        labelDie5.setLocation(420, 290);
        active5 = false;
        numbers[4] = die5;
        test1();
        a = 4;
        test2();
        }
        else if (active5 == false){
            labelDie5.setLocation(420, 400);
            active5 = true;
            a = 4;
            test3();
            numbers [4] = 0;
            test1();
        }
    }//GEN-LAST:event_labelDie5MouseClicked

    private void buttonFullHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFullHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonFullHouseActionPerformed

    private void buttonAcesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAcesMouseClicked
        // TODO add your handling code here:
        int aces1 = 1;
        int aces2 = 2;
        int aces3 = 3;
        int aces4 = 4;
        int aces5 = 5;

        boolean buttonClick;

        buttonClick = true;

        if (buttonClick == true) {

            labelScore.setText("" + aces1);

        } 
        
        if (ace == 2) {
            labelScore.setText("" + aces2);
        } 
        
        if (ace == 3) {
            labelScore.setText("" + aces3);
        } 
        
        if (ace == 4) {
            labelScore.setText("" + aces4);
        } 
        
        if (ace == 5) {
            labelScore.setText("" + aces5);
        }
        
        oneUsed = true;
        
    }//GEN-LAST:event_buttonAcesMouseClicked

    private void buttonTwosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTwosActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_buttonTwosActionPerformed

    public void test1() {
        
        boolean contains1 = IntStream.of(numbers).anyMatch(x -> x == 1);
        if (contains1) {
            if (oneUsed == false){
            buttonAces.setEnabled(true);
            }
        }
        else {
            buttonAces.setEnabled(false);
        }
        
        boolean contains2 = IntStream.of(numbers).anyMatch(x -> x == 2);
        if (contains2) {
            if (twoUsed == false) {
            buttonTwos.setEnabled(true);
            }
        }
        else {
            buttonTwos.setEnabled(false);
        }
        
        boolean contains3 = IntStream.of(numbers).anyMatch(x -> x == 3);
        if (contains3) {
            if (threeUsed == false){
            buttonThrees.setEnabled(true);
            }
        }
        else {
            buttonThrees.setEnabled(false);
        }
        
        boolean contains4 = IntStream.of(numbers).anyMatch(x -> x == 4);
        if (contains4) {
            if (fourUsed == false){
            buttonFours.setEnabled(true);
            }
        }
        else {
            buttonFours.setEnabled(false);
        }
        
        boolean contains5 = IntStream.of(numbers).anyMatch(x -> x == 5);
        if (contains5) {
            if (fiveUsed == false){
            buttonFives.setEnabled(true);
            }
        }
        else {
            buttonFives.setEnabled(false);
        }
        
        boolean contains6 = IntStream.of(numbers).anyMatch(x -> x == 6);
        if (contains6) {
            if (sixUsed == false){
            buttonSixes.setEnabled(true);
            }
        }
        else {
            buttonSixes.setEnabled(false);
        }
        
        smStraight = (contains1 == true && contains2 == true && contains3 == true && contains4 == true)
                || (contains2 == true && contains3 == true && contains4 == true && contains5 == true)
                || (contains3 == true && contains4 == true && contains5 == true && contains6 == true);
        if (smStraight) {
            if (smUsed == false){
            buttonSmStraight.setEnabled(true);
            }
        }
        if (smStraight == false) {
            buttonSmStraight.setEnabled(false);
        }
        
        lgStraight = (contains1 == true && contains2 == true && contains3 == true && contains4 == true && contains5 == true)
                || (contains2 == true && contains3 == true && contains4 == true && contains5 == true && contains6 == true);
        if (lgStraight) {
            if (lgUsed == false){
            buttonLgStraight.setEnabled(true);
            }
        }
        if (lgStraight == false) {
            buttonLgStraight.setEnabled(false);
        }
       
    }
    
    public void test2() {
        
        boolean contains1 = IntStream.of(numbers[a]).anyMatch(x -> x == 1);
        if (contains1){
            ace++;
        }
        
        boolean contains2 = IntStream.of(numbers[a]).anyMatch(x -> x == 2);
        if (contains2){
            two++;
        }
        
        boolean contains3 = IntStream.of(numbers[a]).anyMatch(x -> x == 3);
        if (contains3){
            three++;
        }
        
        boolean contains4 = IntStream.of(numbers[a]).anyMatch(x -> x == 4);
        if (contains4){
            four++;
        }
        
        boolean contains5 = IntStream.of(numbers[a]).anyMatch(x -> x == 5);
        if (contains5){
            five++;
        }
        
        boolean contains6 = IntStream.of(numbers[a]).anyMatch(x -> x == 6);
        if (contains6){
            six++;
        }
        
        threeKind = (ace >= 3 || two >= 3 || three >= 3 || four >= 3 || five >= 3 || six >= 3);
        if (threeKind){
            if (threeKindUsed == false){
            button3Kind.setEnabled(true);
            }
        }
        
        fourKind = (ace >= 4 || two >= 4 || three >= 4 || four >= 4 || five >= 4 || six >= 4);
        if (fourKind){
            if (fourKindUsed == false){
            button4Kind.setEnabled(true);
            }
        }
        
        fullHouse = (ace == 3 || two == 3 || three == 3 || four == 3 || five == 3 || six == 3) && (ace == 2 || two == 2 || three == 2 || four == 2 || five == 2 || six == 2);
        if (fullHouse){
            if (fullUsed == false){
            buttonFullHouse.setEnabled(true);
            }
        }
        
        yahtzee = (ace == 5 || two == 5 || three == 5 || four == 5 || five == 5 || six == 5);
        if (yahtzee) {
            if (yahtzeeUsed == false){
            buttonYahtzee.setEnabled(true);
            }
        }
        
        
        
        //int largest = Math.max( ace, Math.max( two, Math.max( three, Math.max (four, Math.max(five, six)) ) ) );
        
        
            
        
        
    }
    
    public void test3() {
        
        boolean contains1 = IntStream.of(numbers[a]).anyMatch(x -> x == 1);
        if (contains1){
            ace--;
        }
         
        boolean contains2 = IntStream.of(numbers[a]).anyMatch(x -> x == 2);
        if (contains2){
            two--;
        }
        
        boolean contains3 = IntStream.of(numbers[a]).anyMatch(x -> x == 3);
        if (contains3){
            three--;
        }
         
        boolean contains4 = IntStream.of(numbers[a]).anyMatch(x -> x == 4);
        if (contains4){
            four--;
        }
          
        boolean contains5 = IntStream.of(numbers[a]).anyMatch(x -> x == 5);
        if (contains5){
            five--;
        }
           
        boolean contains6 = IntStream.of(numbers[a]).anyMatch(x -> x == 6);
        if (contains6){
            six--;
        }
        
        if (ace < 3 && two < 3 && three < 3 && four < 3 && five < 3 && six < 3){
            button3Kind.setEnabled(false);
        }
        
        if (ace < 4 && two < 4 && three < 4 && four < 4 && five < 4 && six < 4){
            button4Kind.setEnabled(false);
        }
        
        if (!(ace == 3 || two == 3 || three == 3 || four == 3 || five == 3 || six == 3)) {
            buttonFullHouse.setEnabled(false);
        }
        else if (!(ace == 2 || two == 2 || three == 2 || four == 2 || five == 2 || six == 2)) {
            buttonFullHouse.setEnabled(false);
        }
        
        if (!(ace == 5 && two == 5 && three == 5 && four == 5 && five == 5 && six == 5)) {
            buttonYahtzee.setEnabled(false);
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(yahtzeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yahtzeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yahtzeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yahtzeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new yahtzeeFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button3Kind;
    private javax.swing.JButton button4Kind;
    private javax.swing.JButton buttonAces;
    private javax.swing.JButton buttonChance;
    private javax.swing.JButton buttonFives;
    private javax.swing.JButton buttonFours;
    private javax.swing.JButton buttonFullHouse;
    private javax.swing.JButton buttonLgStraight;
    private javax.swing.JButton buttonSixes;
    private javax.swing.JButton buttonSmStraight;
    private javax.swing.JButton buttonThrees;
    private javax.swing.JButton buttonTwos;
    private javax.swing.JButton buttonYahtzee;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelBack;
    private javax.swing.JLabel labelChoose1;
    private javax.swing.JLabel labelChoose2;
    private javax.swing.JLabel labelDie1;
    private javax.swing.JLabel labelDie2;
    private javax.swing.JLabel labelDie3;
    private javax.swing.JLabel labelDie4;
    private javax.swing.JLabel labelDie5;
    private javax.swing.JLabel labelScore;
    // End of variables declaration//GEN-END:variables
}
