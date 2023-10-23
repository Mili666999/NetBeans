/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package socopan.view;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.PopupMenuEvent;
import socopan.controller.ObradaLokacija;
import socopan.model.Lokacija;
import socopan.util.Alati;
import socopan.util.SocopanException;

/**
 *
 * @author Mili
 */
public class ProzorLokacija extends javax.swing.JFrame implements SocopanViewSucelje{
    
    private ObradaLokacija obrada;

    /**
     * Creates new form ProzorLokacije
     */
    public ProzorLokacija() {
        initComponents();
        obrada = new ObradaLokacija();
        setTitle(Alati.NAZIV_APP + " | Lokacije");
        ucitaj();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        btnDodaj = new javax.swing.JButton();
        txtDodaj = new javax.swing.JTextField();
        txtPromjeni = new javax.swing.JTextField();
        btnPromjeni = new javax.swing.JButton();
        txtObrisi = new javax.swing.JTextField();
        btnObrisi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lstPodaci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstPodaciMouseClicked(evt);
            }
        });
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        btnDodaj.setText("Dodaj");
        btnDodaj.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        txtDodaj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDodaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDodajMouseClicked(evt);
            }
        });

        txtPromjeni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPromjeni.setText("Promjeni");
        btnPromjeni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        txtObrisi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnObrisi.setText("Obriši");
        btnObrisi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setText("Klik za odabir");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setText("Dvoklik za odabir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtObrisi)
                    .addComponent(txtDodaj)
                    .addComponent(txtPromjeni, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDodaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPromjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 112, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDodaj)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPromjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPromjeni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnObrisi)
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Lokacija());
        var e = obrada.getEntitet();
        e.setNaziv(txtDodaj.getText());
        try {
            obrada.create();
            ucitaj();
            txtDodaj.setText("");
        } catch (SocopanException se) {
            JOptionPane.showMessageDialog(getRootPane(), se.getPoruka());
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        if(lstPodaci.getSelectedValue()==null){
            return;
        }
        
        var e = lstPodaci.getSelectedValue();
        
        obrada.setEntitet(e);
        try {
            obrada.update();
            ucitaj();
            txtPromjeni.setText("");
        } catch (SocopanException se) {
            JOptionPane.showMessageDialog(getRootPane(), se.getPoruka());
            obrada.refresh();
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        if(lstPodaci.getSelectedValue()==null){
            return;
        }
        if(txtObrisi.getText().equals("")){
            return;
        }
        
        var e = lstPodaci.getSelectedValue();
        
        if(JOptionPane.showConfirmDialog(getRootPane(), e.getNaziv(), "Sigurno obrisati?", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
            return;
        }
        
        obrada.setEntitet(e);
        
        try {
            obrada.delete();
            ucitaj();
            txtObrisi.setText("");
        } catch (SocopanException se) {
            JOptionPane.showMessageDialog(getRootPane(), se.getPoruka());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if(evt.getValueIsAdjusting()){
            return;
        }
        
        if(lstPodaci.getSelectedValue()==null){
            return;
        }
        
        obrada.setEntitet(lstPodaci.getSelectedValue());
        
        popuniView();
        txtObrisi.setText("");
    }//GEN-LAST:event_lstPodaciValueChanged

    private void lstPodaciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstPodaciMouseClicked
        var e = obrada.getEntitet();
        if(evt.getClickCount()==2){
            txtObrisi.setText(e.getNaziv());
            txtPromjeni.setText("");
        }
    }//GEN-LAST:event_lstPodaciMouseClicked

    private void txtDodajMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDodajMouseClicked
        txtPromjeni.setText("");
        txtObrisi.setText("");
    }//GEN-LAST:event_txtDodajMouseClicked
    @Override
    public void ucitaj(){
        DefaultListModel<Lokacija> m = new DefaultListModel<>();
        m.addAll(obrada.read());
        lstPodaci.setModel(m);
        lstPodaci.repaint();
    }
    
    @Override
    public void popuniModel(){
        var e = obrada.getEntitet();
        if(!txtDodaj.getText().equals("")|| txtDodaj.getText() != null){
            e.setNaziv(txtDodaj.getText());
        }else if(!txtPromjeni.getText().equals("") || txtPromjeni.getText() != null){
            e.setNaziv(txtPromjeni.getText());
        }else{
            e.setNaziv(txtObrisi.getText());
        }
    }
    
    @Override
    public void popuniView(){
        var e = obrada.getEntitet();
        txtPromjeni.setText(e.getNaziv());
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Lokacija> lstPodaci;
    private javax.swing.JTextField txtDodaj;
    private javax.swing.JTextField txtObrisi;
    private javax.swing.JTextField txtPromjeni;
    // End of variables declaration//GEN-END:variables
}
