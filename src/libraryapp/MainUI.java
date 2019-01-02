/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryapp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javafx.scene.control.SelectionMode;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import java.util.Date;

/**
 *
 * @author berk
 */
public class MainUI extends javax.swing.JFrame 
{

    /**
     * Creates new form MainUI
     */
    public MainUI() 
    {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        jDialog1.setTitle("Ödünç Alma ");
        jDialog1.setBackground(new java.awt.Color(255, 255, 255));
        jDialog1.setResizable(false);

        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Bilgi");

        jList1.setForeground(new java.awt.Color(0, 153, 153));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("jLabel10");

        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("jLabel11");

        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("jLabel12");

        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("Tarih Aralığı");

        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("Onayla");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(50, 50, 50)
                        .addComponent(jButton3)))
                .addGap(111, 111, 111))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 500));
        setPreferredSize(new java.awt.Dimension(1200, 800));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("My Library App");

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 8)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("My Library App");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setToolTipText("Cilt No Giriniz.. ");

        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Arama Yap");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTabbedPane1.setName(""); // NOI18N

        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setRowSelectionAllowed(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable2);

        jTabbedPane1.addTab("Son Eklenen Kitaplar", jScrollPane3);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel2.setMaximumSize(new java.awt.Dimension(300, 300));

        jLabel1.setBackground(new java.awt.Color(0, 153, 255));
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Kitap Adı: ");

        jLabel2.setBackground(new java.awt.Color(0, 153, 255));
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Yazar:");

        jLabel3.setBackground(new java.awt.Color(0, 153, 255));
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Cilt No:");

        jLabel4.setBackground(new java.awt.Color(0, 153, 255));
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Basım Yılı:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Kitabı Ödünç Al");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 153, 255));
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Adet: ");

        jLabel6.setBackground(new java.awt.Color(0, 153, 255));
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Bulunduğu Raf: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jButton2))
                .addGap(277, 277, 277))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        jLabel4.getAccessibleContext().setAccessibleName("Basım Yılı:");

        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Kitabın Tam Adı ya da Cilt No Giriniz..");

        jMenu1.setText("Kütüphanem");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 322, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTabbedPane1)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        jTextField1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(!this.jTextField1.getText().equals(""))
        {
            boolean flag = false;
            for(Books check : Books.books)
            {
                System.out.println(check.getStringDetails()[0]);
                try
                {
                    if(check.getStringDetails()[0].equals(jTextField1.getText()) || jTextField1.getText().equals(check.getStringDetails()[2]))
                    {
                          //this.setBounds(this.getX(), this.getY(), this.getWidth(), (this.getHeight())+300);
                          flag = true;
                         // this.jPanel2.setOpaque(true);
                          if(!this.jPanel2.isVisible())
                          {
                               this.setBounds(this.getX(), this.getY(), this.getWidth(), (this.getHeight() + this.jPanel2.getHeight())+300);
                               this.jPanel2.setVisible(true);
                               
                          }
                          if(!this.serial_code.equals(check.getStringDetails()[2]))
                          {
                            this.jLabel1.setText("Kitap Adı: " + check.getStringDetails()[0]);
                            this.jLabel2.setText("Kitabın Yazarı: " + check.getStringDetails()[1]);
                            this.jLabel3.setText("Cilt No: " + check.getStringDetails()[2]);
                            this.jLabel4.setText("Basım Yılı: " + check.getIntegerDetails()[1]);
                            this.jLabel5.setText("Adet: " + check.getIntegerDetails()[0]);
                            this.jLabel6.setText("Bulunduğu Raf: " + check.getIntegerDetails()[0]);
                            this.serial_code = check.getStringDetails()[2];
                          }
                          break; 
                    }
                }
                catch(NumberFormatException ex)
                {
                   System.out.println(ex.toString());
                }
            }
            if(!flag) 
                JOptionPane.showMessageDialog(null, "Hatalı bir giriş yaptınız.", "Kitap Bulunamadı", JOptionPane.INFORMATION_MESSAGE);
        } 
        
        //this.jPanel2.setOpaque(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.jPanel2.setVisible(false);
        this.setBounds(this.getX(), this.getY(), this.getWidth(), (this.getHeight())-400);
        this.jPanel2.setOpaque(true);
        this.setBooks();
        this.jTable2.setModel(this.setBooksForTable());
        LibraryApp app = new LibraryApp();
        this.jLabel7.setText(app.getAppName());
        this.jLabel8.setText(app.getAppVersion());
        this.jTable2 = new JTable()
        {
                public boolean isCellEditable(int row, int column) 
                {                
                    return false;     
                };
        };
        
       
    }//GEN-LAST:event_formWindowActivated
    public void setBooks()
    {
        new Books("Göçüp Gidenler Koleksiyoncusu – Şermin Yaşar ", "Sermin Yaşar", 5, "1000", 2018);
        new Books("Gölgeler", "Zülfü Livaneli", 1, "1001", 2015);
        new Books("Uyumsuz Defne Kaman’ın Maceraları Hava", "Buket Uzuner", 2, "1002", 2018);
        new Books("Yine de Sevdik", "Miraç Çağrı Aktaş", 3, "1003", 2018);
    }
    public TableModel setBooksForTable()
    {
        String[] table_info = new String[3];
        table_info[0] = "Kitap Adı";
        table_info[1] = "Kitabın Yazarı";
        table_info[2] = "Cilt No";
        String[][] table_content = new String[Books.books.size()][3];
        for(int i = 0; i<Books.books.size(); i++)
        {
            for(int j = 0; j<3; j++)
            {
                table_content[i][j] = Books.books.get(i).getStringDetails()[j];
            }
        }
        return new DefaultTableModel(table_content, table_info);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.jDialog1.pack();
        this.jDialog1.setVisible(true);
        String[] dates = {"15 gün", "30 gün", "60 gün"};
        DefaultListModel<String> model = new DefaultListModel<String>();
        for(int i = 0; i<dates.length; i++)
            model.addElement(dates[i]);
        this.jList1.setModel(model);
        this.jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.jLabel10.setText(this.jLabel1.getText());
        this.jLabel11.setText(this.jLabel2.getText());
        this.jLabel12.setText(this.jLabel3.getText());


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(!jList1.isSelectionEmpty())
        {
            LocalDateTime ldt = LocalDateTime.now();
            LocalDateTime ldt_last;
            if(jList1.getSelectedIndex() == 0)
            {
                ldt_last = LocalDateTime.now().plusDays(15);
            }
            else if(jList1.getSelectedIndex() == 1)
            {
                ldt_last = LocalDateTime.now().plusDays(30);
            }
            else
            {
               ldt_last = LocalDateTime.now().plusDays(60);

            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            int result = JOptionPane.showConfirmDialog(null, "Kitabı ödünç almak üzeresiniz!\nBaşlangıç Tarihi: " + ldt.format(formatter).toString() + "\nTeslim Tarihi: " + ldt_last.format(formatter).toString(), "Onay Penceresi", 2);
            if(result == JOptionPane.YES_OPTION)
            {
                JOptionPane.showMessageDialog(null, "Kitabı ödünç aldınız, ödünç aldığınız kitapları Kütüphanem sekmesinde görebilirsiniz.", "Kitap Ödünç Alındı", JOptionPane.INFORMATION_MESSAGE);
                jDialog1.dispose();
            }
        }
        else 
        {
            jList1.requestFocus();
        }
            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {

        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new MainUI().setVisible(true);
            }
        });
    }
    private String serial_code = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}