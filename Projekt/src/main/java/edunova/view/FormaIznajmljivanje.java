/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;


import com.github.lgooddatepicker.components.DatePickerSettings;
import edunova.controller.ObradaIznajmljivanje;
import edunova.controller.ObradaKlijent;
import edunova.controller.ObradaVozilo;
import edunova.controller.ObradaZaposlenik;
import edunova.model.Iznajmljivanje;
import edunova.model.Klijent;
import edunova.model.Vozilo;
import edunova.model.Zaposlenik;


import edunova.utility.EdunovaException;
import edunova.utility.Utility;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Marta
 */
public class FormaIznajmljivanje extends ProjektView<Iznajmljivanje> {
    
    private ObradaIznajmljivanje obrada;

    /**
     * Creates new form FormaIznajmljivanje
     */
    public FormaIznajmljivanje() {
        initComponents();
        obrada = new ObradaIznajmljivanje();
        setTitle(Utility.getNazivAplikacije() + " Iznajmljivanje ");
         btnTrazi.setText("\uD83D\uDD0D");
         dpDatumPreuzimanja.setDateTimeStrict(Utility.convertToLocalDateTimeViaInstant(new Date()));
         dpDatumPovratka.setDateTimeStrict(Utility.convertToLocalDateTimeViaInstant(new Date()));
        
         DatePickerSettings dps = new DatePickerSettings(
                new Locale("hr", "HR")
        );

        dps.setFormatForDatesCommonEra("dd.MM.yyyy.");
        
         
        
        ucitajKlijente();
        ucitajVozila();
        ucitajZaposlenike();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dpDatumPreuzimanja = new com.github.lgooddatepicker.components.DateTimePicker();
        jLabel2 = new javax.swing.JLabel();
        dpDatumPovratka = new com.github.lgooddatepicker.components.DateTimePicker();
        jLabel3 = new javax.swing.JLabel();
        txtBrojUgovora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUkupanIunosNajma = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbKlijent = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbVozilo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbZaposlenik = new javax.swing.JComboBox<>();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        btnTrazi = new javax.swing.JButton();
        txtUvjet = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmFile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Podaci"));

        jLabel1.setText("Datum preuzimanja vozila");

        jLabel2.setText("Datum povratka vozila");

        jLabel3.setText("Broj sklopljeng ugovora");

        jLabel4.setText("Ukupan iznos najma");

        jLabel5.setText("Klijent");

        jLabel6.setText("Vozilo");

        jLabel7.setText("Zaposlenik");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(197, 197, 197))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbKlijent, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbVozilo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbZaposlenik, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dpDatumPovratka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dpDatumPreuzimanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBrojUgovora, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUkupanIunosNajma, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbKlijent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbVozilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbZaposlenik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtBrojUgovora, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtUkupanIunosNajma, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                    .addComponent(dpDatumPreuzimanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpDatumPovratka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        jLabel8.setText("Pregled ugovora");

        lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        btnTrazi.setText("L");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        jmFile.setText("File");

        jMenuItem1.setText("Izlaz");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmFile.add(jMenuItem1);

        jMenuBar1.add(jmFile);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtUvjet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 159, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPromjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTrazi)
                            .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        Iznajmljivanje i = new Iznajmljivanje();

        spremi(i);
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed

       Iznajmljivanje i  = lista.getSelectedValue();
        if(i==null){
            JOptionPane.showMessageDialog(null, "Prvo odaberite stavku");
            return;
        }

        spremi(i);

    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        Iznajmljivanje i  = lista.getSelectedValue();
        if(i==null){
            JOptionPane.showMessageDialog(null, "Prvo odaberite stavku");
            return;

        }

        if(JOptionPane.showConfirmDialog(
            null, //roditelj, bude null
            "Sigurno obrisati" +" " + i.getBrojUgovora() + " " + i.getVozilo(), //tijelo dijaloga
            "Brisanje najma automobila", // naslov
            JOptionPane.YES_NO_OPTION, //vrsta opcija
            JOptionPane.QUESTION_MESSAGE) //ikona
        ==JOptionPane.NO_OPTION){
        return;
        }

        try {
            obrada.brisi(i);
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(null, ex.getPoruka());
            return;
        }

        ucitaj();
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed

 if(txtUvjet.getText().trim().length()<2){
            JOptionPane.showMessageDialog(null,"Minimalno dva znaka");
            return;
        }
               DefaultListModel<Iznajmljivanje> model = new DefaultListModel<>();
        obrada.getBrojUgovora(txtUvjet.getText().trim()).forEach((iznajmljivanje) -> {
                    model.addElement(iznajmljivanje);
                });
        lista.setModel(model);
    }//GEN-LAST:event_btnTraziActionPerformed

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
         if (evt.getValueIsAdjusting()) {
            return;
        }
        Iznajmljivanje i = lista.getSelectedValue();
        if (i == null) {
            return;
        }
        postaviVrijednosti(i);
    }//GEN-LAST:event_listaValueChanged

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<Klijent> cmbKlijent;
    private javax.swing.JComboBox<Vozilo> cmbVozilo;
    private javax.swing.JComboBox<Zaposlenik> cmbZaposlenik;
    private com.github.lgooddatepicker.components.DateTimePicker dpDatumPovratka;
    private com.github.lgooddatepicker.components.DateTimePicker dpDatumPreuzimanja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu jmFile;
    private javax.swing.JList<Iznajmljivanje> lista;
    private javax.swing.JTextField txtBrojUgovora;
    private javax.swing.JTextField txtUkupanIunosNajma;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables

    protected void spremi(Iznajmljivanje i) {
        
        i.setKlijent((Klijent) cmbKlijent.getSelectedItem());
        i.setVozilo((Vozilo) cmbVozilo.getSelectedItem());
        i.setZaposlenik((Zaposlenik) cmbZaposlenik.getSelectedItem());
        i.setBrojUgovora(txtBrojUgovora.getText());
       i.setUkupanIznosNajma(i.getIznos());
         if (dpDatumPreuzimanja.getDatePicker()!= null) {
            Date d;
            d = Utility.convertToDateViaSqlTimestamp(dpDatumPreuzimanja.getDateTimeStrict());

            i.setDatumPreuzimanja(d);
         }
             if (dpDatumPovratka.getDatePicker()!= null) {
            Date d;
            d = Utility.convertToDateViaSqlTimestamp(dpDatumPovratka.getDateTimeStrict());

            i.setDatumPovratka(d);
         }
        
       try {
            obrada.spremi(i);
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(null, ex.getPoruka());
            return;
        }

        ucitaj(); 
    }

    protected void ucitaj() {
           DefaultListModel<Iznajmljivanje> model = new DefaultListModel<>();
        obrada.getEntiteti().forEach(
                (iznajmljivanje) -> {
                    model.addElement(iznajmljivanje);
                });

        lista.setModel(model);
        lista.repaint();
    }
    

    @Override
    protected boolean kontrola(Iznajmljivanje i) {
       return true;
    }

    @Override
    protected void postaviVrijednosti(Iznajmljivanje i) {
        txtBrojUgovora.setText(i.getBrojUgovora()== null ? "" : i.getBrojUgovora());
        dpDatumPreuzimanja.setDateTimeStrict(Utility.convertToLocalDateTimeViaInstant(i.getDatumPreuzimanja()));
        dpDatumPovratka.setDateTimeStrict(Utility.convertToLocalDateTimeViaInstant(i.getDatumPovratka()));
        cmbKlijent.setSelectedItem(i.getKlijent());
        cmbVozilo.setSelectedItem(i.getVozilo());
        cmbZaposlenik.setSelectedItem(i.getDatumPovratka());
        txtUkupanIunosNajma.setText(String.valueOf(i.getIznos()));
        
        
    }

    private void ucitajKlijente() {
        DefaultComboBoxModel<Klijent> m = new DefaultComboBoxModel<>();
        Klijent k = new Klijent();
        k.setSifra(0);
        k.setIme("Odaberite");
        k.setPrezime("klijenta");
        m.addElement(k);

        new ObradaKlijent().getEntiteti().forEach((klijent) -> {
            m.addElement(klijent);
        });
        cmbKlijent.setModel(m);
    }

    private void ucitajVozila() {
        DefaultComboBoxModel<Vozilo> m = new DefaultComboBoxModel<>();
        Vozilo vo = new Vozilo();
        vo.setSifra(0);
        vo.setRegistracijaskaOznaka("Odaberite vozilo");
       
        m.addElement(vo);

        new ObradaVozilo ().getEntiteti().forEach((vozilo) -> {
            m.addElement(vozilo);
        });
        cmbVozilo.setModel(m);
    }

    private void ucitajZaposlenike() {
        
        DefaultComboBoxModel<Zaposlenik> m = new DefaultComboBoxModel<>();
        Zaposlenik za = new Zaposlenik();
        za.setSifra(0);
        za.setIme("Ništa od");
        za.setPrezime("navedenog");
        m.addElement(za);

        new ObradaZaposlenik().getEntiteti().forEach((zaposlenik) -> {
            m.addElement(zaposlenik);
        });
        cmbZaposlenik.setModel(m);
    }
    
    
}
