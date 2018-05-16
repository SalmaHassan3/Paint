

package paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JColorChooser;

public class paintJFrame extends javax.swing.JFrame implements Cloneable {
     HistoryList historyList = new HistoryList();
    Iterator iterator = historyList.getIterator();

    static Graphics2D g2;
    JButton clicked;
    static int flag=0,mode=0;
    Color color,fillColor;
    float xstart,xend,ystart,yend;
    AbstractShapeFactory polygonFactory= ShapeFactoryProducer.getInstance().getShapeFactory("polygon");
    AbstractShapeFactory ElliptcalShapeFactory= ShapeFactoryProducer.getInstance().getShapeFactory("elliptical shape");
    static Polygons selectedPolygon;
    static EllipticalShape selectedEllipticalShape;
    static List<Polygons> polygonsContainer=new ArrayList<>();
    static List<EllipticalShape> ellipticalShapesContainer=new ArrayList<>(); 
     static Stack<State> undoStack = new Stack<> ();
     static Stack<State> redoStack =new Stack<> ();
    public paintJFrame() {
        initComponents();
        this.setSize(1350,700);
        this.setLocationRelativeTo(null); 
            jButton3.setEnabled(false);
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1428, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1461462086_art.png"))); // NOI18N
        jButton4.setText("Colors");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clipboard", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1461368601_Paste.png"))); // NOI18N
        jButton3.setText("paste");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1461456926_Cut.png"))); // NOI18N
        jButton1.setText("Cut");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1461368328_Copy.png"))); // NOI18N
        jButton2.setText("Copy");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1461461755_expand_scale_abstract_shape_creation_create.png"))); // NOI18N
        jButton7.setText("Resize");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transform-rotate-icon.png"))); // NOI18N
        jButton9.setText("Rotate");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1461368392_Redo.png"))); // NOI18N
        jButton5.setText("redo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1461368366_Undo.png"))); // NOI18N
        jButton6.setText("Undo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tools", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1461461080_Erase.png"))); // NOI18N
        jButton10.setText("Delete");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1461461492_color_fill.png"))); // NOI18N
        jButton8.setText("Fill with color");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Shapes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Line-icon.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Circle-icon.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rounded-rectangle-icon.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square-icon.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ellipse-tool-icon.png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triangle-icon.png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triangle-ruler-icon.png"))); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(jButton16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1461368635_New.png"))); // NOI18N
        jButton12.setText("Clear");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cursor-Select-icon.png"))); // NOI18N
        jButton18.setText("Select");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "History List" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(45, 45, 45)
                        .addComponent(jButton5)
                        .addGap(17, 17, 17))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
             clicked=(JButton)evt.getSource();
             mode=2;
             if(flag==1||flag==2)
             jButton3.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
         clicked=(JButton)evt.getSource();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       clicked=(JButton)evt.getSource();
        JColorChooser jcc =new JColorChooser();
       color= jcc.showDialog(null,"Please choose a color",Color.BLACK);
       DrawAll();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        clicked=(JButton)evt.getSource();
         Resize frame =new Resize();
            frame.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       clicked=(JButton)evt.getSource();
       mode=1;
       if(flag==1){
        jButton3.setEnabled(true);
        jPanel1.update(g2);
       polygonsContainer.remove(selectedPolygon);
       DrawAll();
       newState();
       }
       if(flag==2){
           jButton3.setEnabled(true);
         jPanel1.update(g2);  
       ellipticalShapesContainer.remove(selectedEllipticalShape);
       DrawAll();
        newState();
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       clicked=(JButton)evt.getSource();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       clicked=(JButton)evt.getSource();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       clicked=(JButton)evt.getSource();
       
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
     if(g2==null)
     g2=(Graphics2D) jPanel1.getGraphics();
     xstart=evt.getX();
     ystart=evt.getY();
     xend=evt.getX();
     yend=evt.getY(); 
     DrawAll();
     
     if(clicked==jButton18){
          if(selectedPolygon!=null){
            selectedPolygon.setSelected(false);
            selectedPolygon=null;
           jPanel1.update(g2);
            DrawAll();
            
        }
         if(selectedEllipticalShape!=null){
             selectedEllipticalShape.setSelected(false);
             selectedEllipticalShape=null;
             jPanel1.update(g2);
             DrawAll();
        }
       for(int i=0;i<polygonsContainer.size();i++){ 
       if(polygonsContainer.get(i).ifSelectedPolygon(evt.getX(),evt.getY())){
             selectedPolygon = polygonsContainer.get(i);
             flag =1;
            selectedPolygon.setSelected(true);
            selectedPolygon.drawPolygon();
            break;
          }
       }
       
       for(int i=0;i<ellipticalShapesContainer.size();i++){ 
       if(ellipticalShapesContainer.get(i).ifSelectedEllipticalShape(evt.getX(),evt.getY())){
            selectedEllipticalShape = ellipticalShapesContainer.get(i);
            flag =2;
            selectedEllipticalShape.setSelected(true);
            selectedEllipticalShape.drawEllipticalShape();
            break;
            }}
    }
     
   if(clicked==jButton3&&mode==1) {
        if(flag==1){
        jPanel1.update(g2);
        
         if(selectedPolygon.getXend()>selectedPolygon.getXstart()&&selectedPolygon.getYend()>selectedPolygon.getYstart())
         selectedPolygon.polygon2D(evt.getX(),evt.getX()+Math.abs(selectedPolygon.getXend()-selectedPolygon.getXstart()),evt.getY(),evt.getY()+Math.abs(selectedPolygon.getYend()-selectedPolygon.getYstart()));
        
          else  if(selectedPolygon.getXend()<=selectedPolygon.getXstart()&&selectedPolygon.getYend()>=selectedPolygon.getYstart())
          selectedPolygon.polygon2D(evt.getX(),evt.getX()-Math.abs(selectedPolygon.getXend()-selectedPolygon.getXstart()),evt.getY(),evt.getY()+Math.abs(selectedPolygon.getYend()-selectedPolygon.getYstart()));
        
          else if(selectedPolygon.getXend()<=selectedPolygon.getXstart()&&selectedPolygon.getYend()<=selectedPolygon.getYstart())
          selectedPolygon.polygon2D(evt.getX(),evt.getX()-Math.abs(selectedPolygon.getXend()-selectedPolygon.getXstart()),evt.getY(),evt.getY()-Math.abs(selectedPolygon.getYend()-selectedPolygon.getYstart()));
       
          else  if(selectedPolygon.getXend()>=selectedPolygon.getXstart()&&selectedPolygon.getYend()<=selectedPolygon.getYstart())
          selectedPolygon.polygon2D(evt.getX(),evt.getX()+Math.abs(selectedPolygon.getXend()-selectedPolygon.getXstart()),evt.getY(),evt.getY()-Math.abs(selectedPolygon.getYend()-selectedPolygon.getYstart()));
        
        selectedPolygon.drawPolygon();
        polygonsContainer.add(selectedPolygon);
        DrawAll();
        jButton3.setEnabled(false);
        newState();
        } 
        if(flag==2){ 
             jPanel1.update(g2);
        selectedEllipticalShape.ellipticalShape2D(evt.getX(),evt.getX()+Math.abs(selectedEllipticalShape.getXend()-selectedEllipticalShape.getXstart()),evt.getY(),evt.getY()+Math.abs(selectedEllipticalShape.getYend()-selectedEllipticalShape.getYstart()));
         selectedEllipticalShape.drawEllipticalShape();

         ellipticalShapesContainer.add(selectedEllipticalShape); 
         DrawAll();
         newState();
         }
               jButton3.setEnabled(false);
         }
        if(clicked==jButton3&&mode==2){
            if(flag==1){
               Polygons newPolygon=selectedPolygon.getClone();
                if(newPolygon.getXend()>newPolygon.getXstart()&&newPolygon.getYend()>newPolygon.getYstart())
         newPolygon.polygon2D(evt.getX(),evt.getX()+Math.abs(newPolygon.getXend()-newPolygon.getXstart()),evt.getY(),evt.getY()+Math.abs(newPolygon.getYend()-newPolygon.getYstart()));
                else if(newPolygon.getXend()<newPolygon.getXstart()&&newPolygon.getYend()>newPolygon.getYstart())
         newPolygon.polygon2D(evt.getX(),evt.getX()-Math.abs(newPolygon.getXend()-newPolygon.getXstart()),evt.getY(),evt.getY()+Math.abs(newPolygon.getYend()-newPolygon.getYstart()));
                else   if(newPolygon.getXend()>newPolygon.getXstart()&&newPolygon.getYend()<newPolygon.getYstart())
         newPolygon.polygon2D(evt.getX(),evt.getX()+Math.abs(newPolygon.getXend()-newPolygon.getXstart()),evt.getY(),evt.getY()-Math.abs(newPolygon.getYend()-newPolygon.getYstart()));
               else    if(newPolygon.getXend()<newPolygon.getXstart()&&newPolygon.getYend()<newPolygon.getYstart())
         newPolygon.polygon2D(evt.getX(),evt.getX()-Math.abs(newPolygon.getXend()-newPolygon.getXstart()),evt.getY(),evt.getY()-Math.abs(newPolygon.getYend()-newPolygon.getYstart()));
                  newPolygon.setSelected(false);
                polygonsContainer.add(newPolygon);
               newPolygon.drawPolygon();
               jButton3.setEnabled(false);
              newState(); 
            }
            if(flag==2){
           EllipticalShape newEllipticalShape=selectedEllipticalShape.getClone();
           newEllipticalShape.ellipticalShape2D(evt.getX(),evt.getX()+Math.abs(newEllipticalShape.getXend()-newEllipticalShape.getXstart()),evt.getY(),evt.getY()+Math.abs(newEllipticalShape.getYend()-newEllipticalShape.getYstart()));
         newEllipticalShape.setSelected(false);
           ellipticalShapesContainer.add(newEllipticalShape);
               newEllipticalShape.drawEllipticalShape();
               jButton3.setEnabled(false);
               newState();
            }
        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        clicked=(JButton)evt.getSource();
        
        if(flag==1){
             jPanel1.update(g2);
       polygonsContainer.remove(selectedPolygon);
       selectedPolygon.setSelected(false);
       selectedPolygon=null;
        flag=0;
       DrawAll();
       newState();
        }
        if(flag==2){
             jPanel1.update(g2);
          ellipticalShapesContainer.remove(selectedEllipticalShape); 
          selectedEllipticalShape.setSelected(false);
       selectedEllipticalShape=null;
        flag=0;
         DrawAll();
         newState();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
           
        if(clicked==jButton11){
             jPanel1.update(g2);
             xend=evt.getX();
             yend=evt.getY();
             Polygons line =polygonFactory.getPolygon("line");
             line.polygon2D(xstart, xend, ystart, yend);
             if(color==null)
             line.setColor(Color.BLACK);
             else {
             line.setColor(color);
             }
             line.drawPolygon();
             polygonsContainer.add(line);
            
             newState(); 
              DrawAll();
              
            historyList.addAction("Line drawn");
            while (iterator.hasNext()) {  
            jComboBox1.addItem((String) iterator.next()+"\n");          
            }
            
       }
         
        if(clicked==jButton14){
             jPanel1.update(g2);
             xend=evt.getX();
             yend=evt.getY();
             Polygons rectangle =polygonFactory.getPolygon("rectangle");
             rectangle.polygon2D(xstart, xend, ystart, yend);
             if(color==null)
             rectangle.setColor(Color.BLACK);
             else {
             rectangle.setColor(color);
             }
             rectangle.drawPolygon();
             polygonsContainer.add( rectangle);
               
             newState();
             DrawAll();
             
            historyList.addAction("rectangle drawn");
            while (iterator.hasNext()) {  
            jComboBox1.addItem((String) iterator.next()+"\n");          
            }
        }
            
        
        if(clicked==jButton16){
             jPanel1.update(g2);
             xend=evt.getX();
             yend=evt.getY();
             EllipticalShape ellipse =ElliptcalShapeFactory.getEllipticalShape("ellipse");
             ellipse.ellipticalShape2D(xstart, xend, ystart, yend);
             if(color==null)
             ellipse.setColor(Color.BLACK);
             else {
             ellipse.setColor(color);
             }
             ellipse.drawEllipticalShape();
             ellipticalShapesContainer.add(ellipse);
            
             newState();
              DrawAll();
              
               historyList.addAction(" ellipse drawn");
            while (iterator.hasNext()) {  
            jComboBox1.addItem((String) iterator.next()+"\n");          
            }
        }
        
        if(clicked==jButton17){
             jPanel1.update(g2);
             xend=evt.getX();
             yend=evt.getY();
             Polygons trianglebuffer =polygonFactory.getPolygon("triangle");
             trianglebuffer.polygon2D(xstart, xend, ystart, yend);
             if(color==null)
             trianglebuffer.setColor(Color.BLACK);
             else {
             trianglebuffer.setColor(color);
             }
             trianglebuffer.drawPolygon();
             polygonsContainer.add(trianglebuffer);
              
             newState();
              DrawAll();
              
               historyList.addAction("triangle drawn");
            while (iterator.hasNext()) {  
            jComboBox1.addItem((String) iterator.next()+"\n");          
            }
        }
        
        if(clicked==jButton15){
             jPanel1.update(g2);
             xend=evt.getX();
             yend=evt.getY();
             Polygons square =polygonFactory.getPolygon("square");
             square.polygon2D(xstart, xend, ystart, yend);
             if(color==null)
             square.setColor(Color.BLACK);
             else {
             square.setColor(color);
             }
             square.drawPolygon();
             polygonsContainer.add(square);
             
             newState();
             DrawAll();
             
              historyList.addAction("Square drawn");
            while (iterator.hasNext()) {  
            jComboBox1.addItem((String) iterator.next()+"\n");          
            }
        }
        
        if(clicked==jButton13){
             jPanel1.update(g2);
             xend=evt.getX();
             yend=evt.getY();
             EllipticalShape circle =ElliptcalShapeFactory.getEllipticalShape("circle");
             circle.ellipticalShape2D(xstart, xend, ystart, xend);
             if(color==null)
             circle.setColor(Color.BLACK);
             else {
             circle.setColor(color);
             }
             circle.drawEllipticalShape();
             ellipticalShapesContainer.add(circle);
            
             newState();
              DrawAll();
              
               historyList.addAction("circle drawn");
            while (iterator.hasNext()) {  
            jComboBox1.addItem((String) iterator.next()+"\n");          
            }
        }        
         if(clicked==jButton19){
             jPanel1.update(g2);
             xend=evt.getX();
             yend=evt.getY();
             Polygons rightTrianglebuffer =polygonFactory.getPolygon("RIGHTTRIANGLE");
             rightTrianglebuffer.polygon2D(xstart, xend, ystart, yend);
             if(color==null)
             rightTrianglebuffer.setColor(Color.BLACK);
             else {
             rightTrianglebuffer.setColor(color);
             }
             rightTrianglebuffer.drawPolygon();
             polygonsContainer.add(rightTrianglebuffer);
            
            newState();
             DrawAll(); 
             
              historyList.addAction("right triangle drawn");
            while (iterator.hasNext()) {  
            jComboBox1.addItem((String) iterator.next()+"\n");          
            }
        }    
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       clicked=(JButton)evt.getSource();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       clicked=(JButton)evt.getSource();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       clicked=(JButton)evt.getSource();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        if(selectedPolygon!=null){
        selectedPolygon.setSelected(false);
         selectedPolygon=null;
        }
        if(selectedEllipticalShape!=null){
          selectedEllipticalShape.setSelected(false);
            selectedEllipticalShape=null;
        }
        flag=0;
        if(clicked==jButton11){
             jPanel1.update(g2);
             xend=evt.getX();
             yend=evt.getY();
             Polygons line =polygonFactory.getPolygon("line");
             line.polygon2D(xstart, xend, ystart, yend);
             line.drawPolygon();
             DrawAll();        
        }
        if(clicked==jButton14){
             jPanel1.update(g2);
             xend=evt.getX();
             yend=evt.getY();
             Polygons rectangle =polygonFactory.getPolygon("rectangle");
             rectangle.polygon2D(xstart, xend, ystart, yend);
             rectangle.drawPolygon();
             DrawAll();
        }
      
        if(clicked==jButton16){
             jPanel1.update(g2);
             xend=evt.getX();
             yend=evt.getY();
             EllipticalShape ellipse =ElliptcalShapeFactory.getEllipticalShape("ellipse");
             ellipse.ellipticalShape2D(xstart, xend, ystart, yend);
             ellipse.drawEllipticalShape();
             DrawAll();
        }
        
        if(clicked==jButton17){
             jPanel1.update(g2); 
             xend=evt.getX();
             yend=evt.getY();
             Polygons trianglebuffer =polygonFactory.getPolygon("triangle");
             trianglebuffer.polygon2D(xstart, xend, ystart, yend);
             trianglebuffer.drawPolygon();
             DrawAll();       
        }
        
        if(clicked==jButton15){
             jPanel1.update(g2);
             xend=evt.getX();
             yend=evt.getY();
             Polygons square =polygonFactory.getPolygon("square");
             square.polygon2D(xstart, xend, ystart, yend);
             square.drawPolygon();
             DrawAll();       
        }
        
        if(clicked==jButton13){
             jPanel1.update(g2);     
             xend=evt.getX();
             yend=evt.getY();     
             EllipticalShape circle =ElliptcalShapeFactory.getEllipticalShape("circle");
             circle.ellipticalShape2D(xstart, xend, ystart,xend);
             circle.drawEllipticalShape();
             DrawAll();
        }
        if(clicked==jButton19){
             jPanel1.update(g2); 
             xend=evt.getX();
             yend=evt.getY();
             Polygons rightTrianglebuffer =polygonFactory.getPolygon("righttriangle");
             rightTrianglebuffer.polygon2D(xstart, xend, ystart, yend);
             rightTrianglebuffer.drawPolygon();
             DrawAll();       
        }
        
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        clicked=(JButton)evt.getSource();
        flag=mode=0;
        color=null;
        fillColor=null;
       jPanel1.update(g2);
       polygonsContainer.clear();
       ellipticalShapesContainer.clear(); 
       DrawAll();
      newState();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
           clicked=(JButton)evt.getSource();
        if(undoStack.size()>=2){
            State s=undoStack.pop();
          redoStack.push(s);
           List<Polygons> newPolyonsContainer=new ArrayList(undoStack.peek().getPolygonsState());
           List<EllipticalShape> newEllipticalShapeContainer=new ArrayList(undoStack.peek().getEllipticalShapesState());
           polygonsContainer.clear();
           polygonsContainer= newPolyonsContainer;
           ellipticalShapesContainer.clear();
           ellipticalShapesContainer= newEllipticalShapeContainer;
           //flag=mode=0;
           jPanel1.update(g2);
           DrawAll();
        }
        else if(undoStack.size()==1){
             State s=undoStack.pop();
              redoStack.push(s);
           polygonsContainer.clear();
            ellipticalShapesContainer.clear();
               //flag=mode=0;
           jPanel1.update(g2);
           DrawAll();
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:   
        
         clicked=(JButton)evt.getSource();
       
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         clicked=(JButton)evt.getSource();
        if(redoStack.size()!=0){
            State s=redoStack.pop();
          undoStack.push(s);
           List<Polygons> newPolyonsContainer=new ArrayList(s.getPolygonsState());
           List<EllipticalShape> newEllipticalShapeContainer=new ArrayList(s.getEllipticalShapesState());
           polygonsContainer.clear();
           polygonsContainer= newPolyonsContainer;
           ellipticalShapesContainer.clear();
           ellipticalShapesContainer= newEllipticalShapeContainer;
           flag=mode=0;
           jPanel1.update(g2);
           DrawAll();
        }
         
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        clicked=(JButton)evt.getSource();
        Rotate frame =new Rotate();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       clicked=(JButton)evt.getSource();
      JColorChooser jcc =new JColorChooser();
       fillColor= jcc.showDialog(null,"Please choose a color",Color.BLACK);
        if(flag==1){         
          selectedPolygon.setFillColor(fillColor);
          selectedPolygon.drawPolygon();
          DrawAll();
         newState();             
      }
       if(flag==2){           
          selectedEllipticalShape.setFillColor(fillColor);
          selectedEllipticalShape.drawEllipticalShape();
          DrawAll();          
          newState();
      } 
       
      
      
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
       clicked=(JButton)evt.getSource();
    }//GEN-LAST:event_jButton19ActionPerformed
    static void DrawAll(){
        for(int i=0;i<polygonsContainer.size();i++){
           polygonsContainer.get(i).drawPolygon();         
        }
        for(int i=0;i<ellipticalShapesContainer.size();i++){          
           ellipticalShapesContainer.get(i).drawEllipticalShape();
        } 
      if(undoStack.size()!=0) 
          jButton6.setEnabled(true);
      else 
          jButton6.setEnabled(false);
       if(redoStack.size()!=0) 
          jButton5.setEnabled(true);
      else 
          jButton5.setEnabled(false);
      }       
    
   static void newState(){
        List<Polygons> polygonsCopy=new ArrayList<>();
        for(int i=0;i<polygonsContainer.size();i++){
            Polygons polygon=polygonsContainer.get(i).getClone();
           polygon.setSelected(false);
            polygonsCopy.add(polygon);
             polygonsCopy.get(i).getClone().setSelected(false);
        }
         List<EllipticalShape> ellipticalShapesCopy=new ArrayList<>();
          for(int i=0;i<ellipticalShapesContainer.size();i++){
              EllipticalShape ellipticalShape=ellipticalShapesContainer.get(i).getClone();
              ellipticalShape.setSelected(false);
            ellipticalShapesCopy.add(ellipticalShape);
            ellipticalShapesCopy.get(i).getClone().setSelected(false);
        }
        State state=new State(polygonsCopy,ellipticalShapesCopy);
        undoStack.push(state);
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
            java.util.logging.Logger.getLogger(paintJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paintJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paintJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paintJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paintJFrame().setVisible(true);
                
        
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private static javax.swing.JButton jButton5;
    private static javax.swing.JButton jButton6;
    private static javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    public static javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
