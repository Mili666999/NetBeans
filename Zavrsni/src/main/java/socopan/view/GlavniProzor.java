/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package socopan.view;

import java.awt.Color;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import socopan.controller.ObradaArtikal;
import socopan.controller.ObradaFilter;
import socopan.controller.ObradaKategorija;
import socopan.controller.ObradaLokacija;
import socopan.controller.ObradaOblik;
import socopan.model.AOL;
import socopan.model.Artikal;
import socopan.model.Kategorija;
import socopan.model.Lokacija;
import socopan.model.Oblik;
import socopan.util.Alati;
import socopan.util.SocopanException;

/**
 *
 * @author Mili
 */
public class GlavniProzor extends javax.swing.JFrame implements SocopanViewSucelje {
    
    private ObradaArtikal obrada;
    private DecimalFormat df;
    private ObradaFilter obradaFilter;

    /**
     * Creates new form GlavniProzor
     */
    public GlavniProzor() {
        initComponents();
        obrada = new ObradaArtikal();
        obradaFilter = new ObradaFilter();
        setTitle(Alati.NAZIV_APP);
        ucitajKategorije();
        ucitajOblike();
        ucitajLokacije();
        obrisiUnos();
        ucitaj();
    }
    
      private void ucitajKategorije(){
        DefaultComboBoxModel<Kategorija> m = new DefaultComboBoxModel<>();
       
        Kategorija k = new Kategorija();
        k.setId(0);
        k.setNaziv("Odaberite kategoriju");
        m.addElement(k);
       
        m.addAll(new ObradaKategorija().read());
        cmbKategorije.setModel(m);
        cmbKategorije.repaint();
       
    }
   
    private void ucitajOblike(){
        DefaultComboBoxModel<Oblik> m = new DefaultComboBoxModel<>();
       
        Oblik o = new Oblik();
        o.setId(0);
        o.setNaziv("Odaberite oblik");
        m.addElement(o);
       
        m.addAll(new ObradaOblik().read());
        cmbOblici.setModel(m);
        cmbOblici.repaint();
       
    }
   
    private void ucitajLokacije(){
        DefaultComboBoxModel<Lokacija> m = new DefaultComboBoxModel<>();
       
        Lokacija l = new Lokacija();
        l.setId(0);
        l.setNaziv("Odaberite lokaciju");
        m.addElement(l);
       
        m.addAll(new ObradaLokacija().read());
        cmbLokacije.setModel(m);
        cmbLokacije.repaint();
       
    }
    
    private void obrisiUnos(){
        txtArtikal.setText("");
        txtKolicinaUkupna.setText("");
        txtKolocinaNaLokaciji.setText("");
        ucitajKategorije();
        ucitajOblike();
        ucitajLokacije();
    
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
        btnLijekovi = new javax.swing.JToggleButton();
        btnInfuzije = new javax.swing.JToggleButton();
        btnEndoskopije = new javax.swing.JToggleButton();
        btnDezinfekcija = new javax.swing.JToggleButton();
        btnOstriPredmeti = new javax.swing.JToggleButton();
        btnRazno = new javax.swing.JToggleButton();
        btnSveKategorije = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtArtikal = new javax.swing.JTextField();
        txtKolocinaNaLokaciji = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObriši = new javax.swing.JButton();
        cmbOblici = new javax.swing.JComboBox<>();
        cmbLokacije = new javax.swing.JComboBox<>();
        txtTrazi = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtKolicinaUkupna = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbKategorije = new javax.swing.JComboBox<>();
        btnDodajOblik = new javax.swing.JButton();
        btnDodajLokaciju = new javax.swing.JButton();
        btnObrisiUnos = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lstPodaci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        btnLijekovi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLijekovi.setLabel("Lijekovi");
        btnLijekovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLijekoviActionPerformed(evt);
            }
        });

        btnInfuzije.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInfuzije.setLabel("Infuzije");
        btnInfuzije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfuzijeActionPerformed(evt);
            }
        });

        btnEndoskopije.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEndoskopije.setLabel("Endoskopije");
        btnEndoskopije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndoskopijeActionPerformed(evt);
            }
        });

        btnDezinfekcija.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDezinfekcija.setLabel("Dezinfekcija");
        btnDezinfekcija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDezinfekcijaActionPerformed(evt);
            }
        });

        btnOstriPredmeti.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOstriPredmeti.setLabel("Oštri predmeti");
        btnOstriPredmeti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOstriPredmetiActionPerformed(evt);
            }
        });

        btnRazno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRazno.setLabel("Razno");
        btnRazno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaznoActionPerformed(evt);
            }
        });

        btnSveKategorije.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSveKategorije.setLabel("Sve kategorije");
        btnSveKategorije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSveKategorijeActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Oblik");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Artikal");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lokacija");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Količina na lokaciji");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtArtikal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtArtikal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtKolocinaNaLokaciji.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKolocinaNaLokaciji.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnDodaj.setText("Dodaj");
        btnDodaj.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObriši.setText("Obriši");
        btnObriši.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnObriši.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrišiActionPerformed(evt);
            }
        });

        cmbOblici.setActionCommand("");
        cmbOblici.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbOblici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbObliciActionPerformed(evt);
            }
        });

        cmbLokacije.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbLokacije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLokacijeActionPerformed(evt);
            }
        });

        txtTrazi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTraziActionPerformed(evt);
            }
        });
        txtTrazi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTraziKeyPressed(evt);
            }
        });

        btnTrazi.setText("Traži");
        btnTrazi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ukupna količina");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtKolicinaUkupna.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKolicinaUkupna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Kategorija");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cmbKategorije.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbKategorije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKategorijeActionPerformed(evt);
            }
        });

        btnDodajOblik.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDodajOblik.setText("+");
        btnDodajOblik.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDodajOblik.setVerifyInputWhenFocusTarget(false);
        btnDodajOblik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajOblikActionPerformed(evt);
            }
        });

        btnDodajLokaciju.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDodajLokaciju.setText("+");
        btnDodajLokaciju.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDodajLokaciju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajLokacijuActionPerformed(evt);
            }
        });

        btnObrisiUnos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnObrisiUnos.setLabel("Obriši unos");
        btnObrisiUnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiUnosActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        jMenuItem3.setText("Lokacije");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Oblici");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ostalo");

        jMenuItem1.setText("O aplikaciji");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Izlaz");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnObrisiUnos, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnLijekovi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(btnInfuzije, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnEndoskopije, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(btnDezinfekcija, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnOstriPredmeti, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(btnRazno, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(btnSveKategorije, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cmbLokacije, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnDodajLokaciju, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtKolocinaNaLokaciji, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(cmbOblici, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDodajOblik, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(cmbKategorije, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtKolicinaUkupna, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtArtikal, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btnPromjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(btnObriši, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTrazi, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(txtTrazi))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLijekovi)
                    .addComponent(btnInfuzije)
                    .addComponent(btnEndoskopije)
                    .addComponent(btnDezinfekcija)
                    .addComponent(btnSveKategorije)
                    .addComponent(btnOstriPredmeti)
                    .addComponent(btnRazno))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnObrisiUnos)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtArtikal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKolicinaUkupna, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbKategorije, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbOblici, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDodajOblik, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbLokacije, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDodajLokaciju, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKolocinaNaLokaciji, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni))
                        .addGap(25, 25, 25)
                        .addComponent(btnObriši))
                    .addComponent(jScrollPane1))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(getRootPane(), "O aplikaciji\n" + "Ovo je MVP primjer završnog rada", "Aplikacija za vođenje skladišta", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new ProzorLokacija().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new ProzorOblik().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        obrisiUnos();
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnRaznoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaznoActionPerformed
        if(btnRazno.isSelected()){
            btnRazno.setBackground(Color.green);
        }else{
            btnRazno.setBackground(null);
        }
    }//GEN-LAST:event_btnRaznoActionPerformed

    private void cmbObliciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbObliciActionPerformed
        
    }//GEN-LAST:event_cmbObliciActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Artikal());
        popuniModel();
        try {
            obrada.create();
            ucitaj();
        } catch (SocopanException se) {
            JOptionPane.showMessageDialog(getRootPane(), se.getPoruka());
        }
        obrisiUnos();
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        if(txtTrazi.getText().equals("")){
            ucitaj();
        }
        DefaultListModel<Artikal> m = new DefaultListModel<>();
        m.addAll(obrada.read(txtTrazi.getText()));
        lstPodaci.setModel(m);
        lstPodaci.repaint();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void txtTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTraziActionPerformed
        btnTraziActionPerformed(null);
    }//GEN-LAST:event_txtTraziActionPerformed

    private void txtTraziKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTraziKeyPressed
        btnTraziActionPerformed(null);
    }//GEN-LAST:event_txtTraziKeyPressed

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if(evt.getValueIsAdjusting()){
            return;
        }
        if(lstPodaci.getSelectedValue()==null){
            return;
        }
        obrada.setEntitet(lstPodaci.getSelectedValue());
        
        popuniView();
    }//GEN-LAST:event_lstPodaciValueChanged

    private void cmbLokacijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLokacijeActionPerformed
        
    }//GEN-LAST:event_cmbLokacijeActionPerformed

    private void cmbKategorijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKategorijeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKategorijeActionPerformed

    private void btnDodajLokacijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajLokacijuActionPerformed
        new ProzorLokacija().setVisible(true);
    }//GEN-LAST:event_btnDodajLokacijuActionPerformed

    private void btnDodajOblikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajOblikActionPerformed
        new ProzorOblik().setVisible(true);
    }//GEN-LAST:event_btnDodajOblikActionPerformed

    private void btnLijekoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLijekoviActionPerformed
        if (btnLijekovi.isSelected()) {
           btnLijekovi.setBackground(Color.GREEN);
           DefaultListModel<Artikal> m = new DefaultListModel<>();
           m.addAll(obradaFilter.read("Edric"));
           lstPodaci.setModel(m);
           lstPodaci.repaint();
        } else {
           btnLijekovi.setBackground(null);
           ucitaj();
        }
    }//GEN-LAST:event_btnLijekoviActionPerformed
    private void btnInfuzijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfuzijeActionPerformed
        if(btnInfuzije.isSelected()){
            btnInfuzije.setBackground(Color.green);
        }else{
            btnInfuzije.setBackground(null);
        }
    }//GEN-LAST:event_btnInfuzijeActionPerformed

    private void btnEndoskopijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndoskopijeActionPerformed
        if(btnEndoskopije.isSelected()){
            btnEndoskopije.setBackground(Color.green);
        }else{
            btnEndoskopije.setBackground(null);
        }
    }//GEN-LAST:event_btnEndoskopijeActionPerformed

    private void btnDezinfekcijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDezinfekcijaActionPerformed
        if(btnDezinfekcija.isSelected()){
            btnDezinfekcija.setBackground(Color.green);
        }else{
            btnDezinfekcija.setBackground(null);
        }
    }//GEN-LAST:event_btnDezinfekcijaActionPerformed

    private void btnOstriPredmetiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOstriPredmetiActionPerformed
        if(btnOstriPredmeti.isSelected()){
            btnOstriPredmeti.setBackground(Color.green);
        }else{
            btnOstriPredmeti.setBackground(null);
        }
    }//GEN-LAST:event_btnOstriPredmetiActionPerformed

    private void btnSveKategorijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSveKategorijeActionPerformed
        List<JToggleButton> prekidaci;
        prekidaci = new ArrayList<>();
        prekidaci.add(btnDezinfekcija);
        prekidaci.add(btnEndoskopije);
        prekidaci.add(btnInfuzije);
        prekidaci.add(btnLijekovi);
        prekidaci.add(btnOstriPredmeti);
        prekidaci.add(btnRazno);
        for(JToggleButton prekidac : prekidaci){
            prekidac.setSelected(false);
            prekidac.setBackground(null);
        }
        ucitaj();
    }//GEN-LAST:event_btnSveKategorijeActionPerformed

    private void btnObrisiUnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiUnosActionPerformed
        obrisiUnos();
    }//GEN-LAST:event_btnObrisiUnosActionPerformed

    private void btnObrišiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrišiActionPerformed
        obrisiUnos();
    }//GEN-LAST:event_btnObrišiActionPerformed
    @Override
    public void ucitaj() {
        DefaultListModel<Artikal> m = new DefaultListModel<>();
        m.addAll(obrada.read());
        lstPodaci.setModel(m);
        lstPodaci.repaint();
    }
    
    @Override
    public void popuniModel() {
        var e = obrada.getEntitet();
        e.setNaziv(txtArtikal.getText());
        
        try {
            e.setKolicinaUkupna(BigDecimal.valueOf(df.parse(txtKolicinaUkupna.getText()).doubleValue()));
        } catch (Exception ex) {
            e.setKolicinaUkupna(null);
        }
        
        e.setKategorija((Kategorija)cmbKategorije.getSelectedItem());
        
    }

    @Override
    public void popuniView() {
        var e = obrada.getEntitet();
       
        txtArtikal.setText(e.getNaziv());
        txtKolicinaUkupna.setText(e.getKolicinaUkupna().toString());
        cmbKategorije.setSelectedItem(e.getKategorija());
        
        DefaultListModel<AOL> m = new DefaultListModel<>();
        m.addAll(e.getAoli());
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDezinfekcija;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDodajLokaciju;
    private javax.swing.JButton btnDodajOblik;
    private javax.swing.JToggleButton btnEndoskopije;
    private javax.swing.JToggleButton btnInfuzije;
    private javax.swing.JToggleButton btnLijekovi;
    private javax.swing.JButton btnObrisiUnos;
    private javax.swing.JButton btnObriši;
    private javax.swing.JToggleButton btnOstriPredmeti;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JToggleButton btnRazno;
    private javax.swing.JButton btnSveKategorije;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<Kategorija> cmbKategorije;
    private javax.swing.JComboBox<Lokacija> cmbLokacije;
    private javax.swing.JComboBox<Oblik> cmbOblici;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Artikal> lstPodaci;
    private javax.swing.JTextField txtArtikal;
    private javax.swing.JTextField txtKolicinaUkupna;
    private javax.swing.JTextField txtKolocinaNaLokaciji;
    private javax.swing.JTextField txtTrazi;
    // End of variables declaration//GEN-END:variables

    
}
