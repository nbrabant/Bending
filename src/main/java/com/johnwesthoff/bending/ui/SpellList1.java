/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnwesthoff.bending.ui;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.johnwesthoff.bending.Client;
import com.johnwesthoff.bending.app.spell.SpellsService;
import com.johnwesthoff.bending.app.spell.SpellsServiceFactory;
import com.johnwesthoff.bending.spells.Spell;

/**
 *
 * @author John
 */
public class SpellList1 extends javax.swing.JPanel implements ActionListener, MouseListener {

    /**
     *
     */
    private static final long serialVersionUID = -2208869150735870837L;
    /**
     * Creates new form SpellList
     */
    Client app;

    public SpellChooser1 choochootrain;
    public PassiveChooser1 choochootrain2;

    /**
     * SpellsService instance
     */
    private SpellsService spellsService;

    public SpellList1(Client app) {
        initComponents();
        this.app = app;

        // using factory to inject dependency
        spellsService = SpellsServiceFactory.create();

        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][0].getName(), 0, 0);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][1].getName(), 0, 1);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][2].getName(), 0, 2);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][3].getName(), 0, 3);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][4].getName(), 0, 4);

        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][0].getName(), 1, 0);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][1].getName(), 1, 1);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][2].getName(), 1, 2);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][3].getName(), 1, 3);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][4].getName(), 1, 4);

        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][0].getName(), 2, 0);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][1].getName(), 2, 1);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][2].getName(), 2, 2);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][3].getName(), 2, 3);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][4].getName(), 2, 4);

        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][0].getName(), 3, 0);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][1].getName(), 3, 1);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][2].getName(), 3, 2);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][3].getName(), 3, 3);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][4].getName(), 3, 4);

        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][0].getName(), 4, 0);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][1].getName(), 4, 1);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][2].getName(), 4, 2);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][3].getName(), 4, 3);
        jTable1.getModel().setValueAt(this.app.spellList[this.app.spellBook][4].getName(), 4, 4);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable4.getTableHeader().setReorderingAllowed(false);
        choochootrain = new SpellChooser1(this);
        choochootrain.setVisible(false);
        choochootrain2 = new PassiveChooser1(this);
        choochootrain2.setVisible(false);
        jTable1.addMouseListener(this);
        jTable4.addMouseListener(this);
        XP.setText("XP: " + this.app.Xp);
        USER.setText("USER: " + this.app.username);
        this.setLocation(0, 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        XP = new javax.swing.JLabel();
        USER = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        jTable2.setModel(
                new javax.swing.table.DefaultTableModel(
                        new Object[][] { { null, null, null, null }, { null, null, null, null },
                                { null, null, null, null }, { null, null, null, null } },
                        new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(
                new javax.swing.table.DefaultTableModel(
                        new Object[][] { { null, null, null, null }, { null, null, null, null },
                                { null, null, null, null }, { null, null, null, null } },
                        new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
        jScrollPane3.setViewportView(jTable3);

        // setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        // setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] { { null, null, null, null, null }, { null, null, null, null, null },
                        { null, null, null, null, null }, { null, null, null, null, null },
                        { null, null, null, null, null } },
                new String[] { "Spell 1", "Spell 2", "Spell 3", "Spell 4", "Spell 5" }) {
            /**
            		 *
            		 */
            private static final long serialVersionUID = -31184385169514111L;
            Class<Object>[] types = new Class[] { java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.String.class, java.lang.String.class };
            boolean[] canEdit = new boolean[] { false, false, false, false, false };

            public Class<Object> getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jTable1.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(4).setResizable(false);

        jButton1.setText("Finish");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Load");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Presets");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Ignis");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton6.setForeground(new java.awt.Color(153, 153, 0));
        jButton6.setText("Electro");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 153, 0));
        jButton7.setText("Terrae");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 255));
        jButton8.setText("Aqua");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton9.setForeground(new java.awt.Color(153, 153, 153));
        jButton9.setText("A'ris");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        XP.setText("XP: ");

        USER.setText("USER:");

        jLabel2.setText("Attacks:");

        jLabel3.setText("Passives:");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] { { null }, { null }, { null }, { null }, { null } }, new String[] { "Spell" }) {
            private static final long serialVersionUID = -4169876119482741280L;
            boolean[] canEdit = new boolean[] { false };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jTable4.setRequestFocusEnabled(false);
        jScrollPane4.setViewportView(jTable4);
        jTable4.getColumnModel().getColumn(0).setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addGap(192, 192, 192).addComponent(jLabel2)
                                .addGap(253, 253, 253).addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup().addGap(60, 60, 60).addComponent(
                                                jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 290,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton2))
                                .addComponent(jButton3))
                        .addGroup(layout.createSequentialGroup().addGap(170, 170, 170)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 103,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 103,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 103,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0).addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup().addGap(110, 110, 110).addComponent(jButton6,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup().addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(XP, javax.swing.GroupLayout.PREFERRED_SIZE, 135,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(USER, javax.swing.GroupLayout.PREFERRED_SIZE, 135,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 106,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap(44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(56, 56, 56).addComponent(USER)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(XP)
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1).addComponent(jButton2).addComponent(jButton3))
                        .addGap(45, 45, 45).addComponent(jLabel1).addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                        .addGap(39, 39, 39).addComponent(jButton6))
                .addGap(100, 100, 100));
        setVisible(true);
        // pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

        Client.immaKeepTabsOnYou.setSelectedIndex(0);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        if (Client.currentlyLoggedIn) {
            String post = "";

            for (int y = 0; y < 5; y++) {
                post += Spell.passives.indexOf(app.passiveList[y]) + ",";
            }
            for (int y = 0; y < 5; y++) {
                for (int i = 0; i < app.spellList[app.spellBook].length; i++) {
                    post += Spell.spells.indexOf(app.spellList[y][i]);
                    post += (i == app.spellList[y].length - 1) && (y == 4) ? "" : ",";
                }
            }

            // System.out.println(post+","+app.jtb.getText());
            spellsService.persistSpellsForUser(post, Client.jtb.getText());
        }
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed

        if (Client.currentlyLoggedIn) {
            loadSpells();
        }
    }// GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton8ActionPerformed

        for (int i = 0; i < app.spellList[app.spellBook].length; i++) {
            app.spellList[row][i] = Spell.spells.get(i + 10);
        }
        jTable1.getModel().setValueAt(app.spellList[row][0].getName(), row, 0);
        jTable1.getModel().setValueAt(app.spellList[row][1].getName(), row, 1);
        jTable1.getModel().setValueAt(app.spellList[row][2].getName(), row, 2);
        jTable1.getModel().setValueAt(app.spellList[row][3].getName(), row, 3);
        jTable1.getModel().setValueAt(app.spellList[row][4].getName(), row, 4);
    }// GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton9ActionPerformed

        for (int i = 0; i < app.spellList[app.spellBook].length; i++) {
            app.spellList[row][i] = Spell.spells.get(i);
        }
        jTable1.getModel().setValueAt(app.spellList[row][0].getName(), row, 0);
        jTable1.getModel().setValueAt(app.spellList[row][1].getName(), row, 1);
        jTable1.getModel().setValueAt(app.spellList[row][2].getName(), row, 2);
        jTable1.getModel().setValueAt(app.spellList[row][3].getName(), row, 3);
        jTable1.getModel().setValueAt(app.spellList[row][4].getName(), row, 4);
    }// GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed

        for (int i = 0; i < app.spellList[app.spellBook].length; i++) {
            app.spellList[row][i] = Spell.spells.get(i + 5);
        }
        jTable1.getModel().setValueAt(app.spellList[row][0].getName(), row, 0);
        jTable1.getModel().setValueAt(app.spellList[row][1].getName(), row, 1);
        jTable1.getModel().setValueAt(app.spellList[row][2].getName(), row, 2);
        jTable1.getModel().setValueAt(app.spellList[row][3].getName(), row, 3);
        jTable1.getModel().setValueAt(app.spellList[row][4].getName(), row, 4);
    }// GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed

        for (int i = 0; i < app.spellList[app.spellBook].length; i++) {
            app.spellList[row][i] = Spell.spells.get(i + 15);
        }
        jTable1.getModel().setValueAt(app.spellList[row][0].getName(), row, 0);
        jTable1.getModel().setValueAt(app.spellList[row][1].getName(), row, 1);
        jTable1.getModel().setValueAt(app.spellList[row][2].getName(), row, 2);
        jTable1.getModel().setValueAt(app.spellList[row][3].getName(), row, 3);
        jTable1.getModel().setValueAt(app.spellList[row][4].getName(), row, 4);
    }// GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed

        for (int i = 0; i < app.spellList[app.spellBook].length; i++) {
            app.spellList[row][i] = Spell.spells.get(i + 20);
        }
        jTable1.getModel().setValueAt(app.spellList[row][0].getName(), row, 0);
        jTable1.getModel().setValueAt(app.spellList[row][1].getName(), row, 1);
        jTable1.getModel().setValueAt(app.spellList[row][2].getName(), row, 2);
        jTable1.getModel().setValueAt(app.spellList[row][3].getName(), row, 3);
        jTable1.getModel().setValueAt(app.spellList[row][4].getName(), row, 4);
    }// GEN-LAST:event_jButton6ActionPerformed

    public void loadSpells() {
        int spells[][];

        spells = spellsService.getSpellsFromUser(Client.jtb.getText(), app.jtp.getText());
        for (int y = 0; y < 5; y++) {
            app.passiveList[y] = Spell.passives.get(spells[5][y]);
            jTable4.getModel().setValueAt(app.passiveList[y].getName(), y, 0);
        }
        // be carefull of hellish loops, use collection instead?
        for (int y = 0; y < 5; y++) {
            for (int i = 0; i < 5; i++) {
                app.spellList[y][i] = Spell.spells.get(spells[y][i]);
            }
            jTable1.getModel().setValueAt(app.spellList[y][0].getName(), y, 0);
            jTable1.getModel().setValueAt(app.spellList[y][1].getName(), y, 1);
            jTable1.getModel().setValueAt(app.spellList[y][2].getName(), y, 2);
            jTable1.getModel().setValueAt(app.spellList[y][3].getName(), y, 3);
            jTable1.getModel().setValueAt(app.spellList[y][4].getName(), y, 4);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel USER;
    public javax.swing.JLabel XP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet.");
    }

    int selection = 0;
    int row = 0, row2 = 0;

    @Override
    public void mouseReleased(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet.");
        if (e.getComponent() == jTable1) {
            selection = (int) (Math.floor(e.getX() / 80));
            row = (int) (Math.floor(e.getY() / 16));
            // System.out.println(row);
            choochootrain.getList().setSelectedIndex(Spell.spells.indexOf(app.spellList[app.spellBook][selection]));
            Client.immaKeepTabsOnYou.setSelectedIndex(2);
            choochootrain.setVisible(true);
        }
        if (e.getComponent() == jTable4) {
            row2 = (int) (Math.floor(e.getY() / 16));
            // System.out.println(row2);
            choochootrain2.getList().setSelectedIndex(Spell.spells.indexOf(app.passiveList[app.spellBook]));
            Client.immaKeepTabsOnYou.setSelectedIndex(3);
            choochootrain2.setVisible(true);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        // super.paintComponent(g);

        g.drawImage(Client.bimage, 0, 0, getWidth(), getHeight(), null);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (choochootrain == null)
            return;
        if (choochootrain2 == null)
            return;
        if ("Choose".equals(e.getActionCommand())) {
            if (row2 >= 0) {
                app.spellList[row][selection] = Spell.spells.get(choochootrain.getList().getSelectedIndex());
                choochootrain.setVisible(false);
                jTable1.getModel().setValueAt(app.spellList[row][selection].getName(), row, selection);
                Client.immaKeepTabsOnYou.setSelectedIndex(1);
                // choochootrain.getList().setSelectedIndex(-1);
                // choochootrain.getList().setSelectedIndices(new int[]{});
            }
        }
        if ("Choose2".equals(e.getActionCommand())) {
            if (row2 >= 0) {
                app.passiveList[row2] = Spell.passives.get(choochootrain2.getList().getSelectedIndex());
                choochootrain2.setVisible(false);
                jTable4.getModel().setValueAt(app.passiveList[row2].getName(), row2, 0);
                Client.immaKeepTabsOnYou.setSelectedIndex(1);
                // choochootrain.getList().setSelectedIndex(-1);
                // choochootrain.getList().setSelectedIndices(new int[]{});
            }
        }
    }
}
