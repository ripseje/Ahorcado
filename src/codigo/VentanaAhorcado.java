/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Sergio
 */
public class VentanaAhorcado extends javax.swing.JFrame {
    
    //esta variable guarda los fallos que llevo en el juego
    int numeroFallos = 0;
    
    String palabraOculta = "CETYS";
    
    //este método recibe el botón que ha sido pulsado
    //y procesa la letra en su etiqueta
    private void chequeaBoton(JButton boton){
        boton.setEnabled(false);
        chequeaLetra(boton.getText());
    }
    
    private void chequeaLetra(String letra){
        String palabraConGuiones = jLabel1.getText();
        
        if(palabraOculta.contains(letra)){
            //en este caso la letra si que está
            //y que la o las letras se descubran en la palabra con guiones
            char letraPulsada = letra.charAt(0);
            for(int i=0; i<palabraOculta.length(); i++){
                if(palabraOculta.charAt(i) == letraPulsada){
                    palabraConGuiones = 
                            palabraConGuiones.substring(0, 2*i)
                            + letra
                            + palabraConGuiones.substring(2*i+1);
                            
                }
            }
            
            jLabel1.setText(palabraConGuiones);
        }
        else{
            numeroFallos++;
            dibujaImagen();
        }
        
        
    }
    
    //cambia la imagen en función de cuántos fallos llevamos
    private void dibujaImagen(){
        String nombreImagen = "";
        switch (numeroFallos){
            case 0: nombreImagen = "/imagenes/ahorcado_0.png"; 
                break;
            case 1: nombreImagen = "/imagenes/ahorcado_1.png"; 
                break;
            case 2: nombreImagen = "/imagenes/ahorcado_2.png"; 
                break;
            case 3: nombreImagen = "/imagenes/ahorcado_3.png"; 
                break;
            case 4: nombreImagen = "/imagenes/ahorcado_4.png"; 
                break;
            case 5: nombreImagen = "/imagenes/ahorcado_5.png"; 
                break;
            default : nombreImagen = "/imagenes/ahorcado_fin.png";
        }
        
        ImageIcon miImagen =
                new ImageIcon(
                        new ImageIcon(getClass().getResource(nombreImagen))
                        .getImage()
                        .getScaledInstance(jLabel2.getWidth(), 
                                           jLabel2.getHeight(), 
                                           Image.SCALE_DEFAULT)
        );
        //cargo la imagen en el jLabel que muestra que fallo llevamos
        jLabel2.setIcon(miImagen);
        
    }
    
    /**
     * Creates new form VentanaAhorcado
     */
    public VentanaAhorcado() {
        initComponents();
        dibujaImagen();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        letraA = new javax.swing.JButton();
        letraB = new javax.swing.JButton();
        letraC = new javax.swing.JButton();
        letraD = new javax.swing.JButton();
        letraE = new javax.swing.JButton();
        letraF = new javax.swing.JButton();
        letraG = new javax.swing.JButton();
        letraH = new javax.swing.JButton();
        letraI = new javax.swing.JButton();
        letraJ = new javax.swing.JButton();
        letraK = new javax.swing.JButton();
        letraL = new javax.swing.JButton();
        letraM = new javax.swing.JButton();
        letraN = new javax.swing.JButton();
        letraÑ = new javax.swing.JButton();
        letraO = new javax.swing.JButton();
        letraP = new javax.swing.JButton();
        letraQ = new javax.swing.JButton();
        letraR = new javax.swing.JButton();
        letraS = new javax.swing.JButton();
        letraT = new javax.swing.JButton();
        letraU = new javax.swing.JButton();
        letraV = new javax.swing.JButton();
        letraW = new javax.swing.JButton();
        letraX = new javax.swing.JButton();
        letraY = new javax.swing.JButton();
        letraZ = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("_ _ _ _ _");

        letraA.setText("A");
        letraA.setMaximumSize(new java.awt.Dimension(40, 40));
        letraA.setMinimumSize(new java.awt.Dimension(40, 40));
        letraA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraAActionPerformed(evt);
            }
        });

        letraB.setText("B");
        letraB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraBActionPerformed(evt);
            }
        });

        letraC.setText("C");
        letraC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraCActionPerformed(evt);
            }
        });

        letraD.setText("D");
        letraD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraDActionPerformed(evt);
            }
        });

        letraE.setText("E");
        letraE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraEActionPerformed(evt);
            }
        });

        letraF.setText("F");
        letraF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraFActionPerformed(evt);
            }
        });

        letraG.setText("G");
        letraG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraGActionPerformed(evt);
            }
        });

        letraH.setText("H");
        letraH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraHActionPerformed(evt);
            }
        });

        letraI.setText("I");
        letraI.setMaximumSize(new java.awt.Dimension(40, 40));
        letraI.setMinimumSize(new java.awt.Dimension(40, 40));
        letraI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraIActionPerformed(evt);
            }
        });

        letraJ.setText("J");
        letraJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraJActionPerformed(evt);
            }
        });

        letraK.setText("K");
        letraK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraKActionPerformed(evt);
            }
        });

        letraL.setText("L");
        letraL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraLActionPerformed(evt);
            }
        });

        letraM.setText("M");
        letraM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraMActionPerformed(evt);
            }
        });

        letraN.setText("N");
        letraN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraNActionPerformed(evt);
            }
        });

        letraÑ.setText("Ñ");
        letraÑ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraÑActionPerformed(evt);
            }
        });

        letraO.setText("O");
        letraO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraOActionPerformed(evt);
            }
        });

        letraP.setText("P");
        letraP.setMaximumSize(new java.awt.Dimension(40, 40));
        letraP.setMinimumSize(new java.awt.Dimension(40, 40));
        letraP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraPActionPerformed(evt);
            }
        });

        letraQ.setText("Q");
        letraQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraQActionPerformed(evt);
            }
        });

        letraR.setText("R");
        letraR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraRActionPerformed(evt);
            }
        });

        letraS.setText("S");
        letraS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraSActionPerformed(evt);
            }
        });

        letraT.setText("T");
        letraT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraTActionPerformed(evt);
            }
        });

        letraU.setText("U");
        letraU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraUActionPerformed(evt);
            }
        });

        letraV.setText("V");
        letraV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraVActionPerformed(evt);
            }
        });

        letraW.setText("W");
        letraW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraWActionPerformed(evt);
            }
        });

        letraX.setText("X");
        letraX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraXActionPerformed(evt);
            }
        });

        letraY.setText("Y");
        letraY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraYActionPerformed(evt);
            }
        });

        letraZ.setText("Z");
        letraZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraZActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(letraP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraQ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraW))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(letraI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraJ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraÑ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraO))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(letraA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraH)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(letraX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(letraY, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(letraZ)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(letraH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraA, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(letraB, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(letraC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(letraO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraÑ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(letraW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(letraX, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(letraY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letraZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void letraAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraAActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraAActionPerformed

    private void letraIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraIActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraIActionPerformed

    private void letraPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraPActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraPActionPerformed

    private void letraBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraBActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraBActionPerformed

    private void letraCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraCActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraCActionPerformed

    private void letraDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraDActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraDActionPerformed

    private void letraEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraEActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraEActionPerformed

    private void letraFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraFActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraFActionPerformed

    private void letraGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraGActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraGActionPerformed

    private void letraHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraHActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraHActionPerformed

    private void letraJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraJActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraJActionPerformed

    private void letraKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraKActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraKActionPerformed

    private void letraLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraLActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraLActionPerformed

    private void letraMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraMActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraMActionPerformed

    private void letraNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraNActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraNActionPerformed

    private void letraÑActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraÑActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraÑActionPerformed

    private void letraOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraOActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraOActionPerformed

    private void letraQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraQActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraQActionPerformed

    private void letraRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraRActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraRActionPerformed

    private void letraSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraSActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraSActionPerformed

    private void letraTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraTActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraTActionPerformed

    private void letraUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraUActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraUActionPerformed

    private void letraVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraVActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraVActionPerformed

    private void letraWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraWActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraWActionPerformed

    private void letraXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraXActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraXActionPerformed

    private void letraYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraYActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraYActionPerformed

    private void letraZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraZActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_letraZActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAhorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton letraA;
    private javax.swing.JButton letraB;
    private javax.swing.JButton letraC;
    private javax.swing.JButton letraD;
    private javax.swing.JButton letraE;
    private javax.swing.JButton letraF;
    private javax.swing.JButton letraG;
    private javax.swing.JButton letraH;
    private javax.swing.JButton letraI;
    private javax.swing.JButton letraJ;
    private javax.swing.JButton letraK;
    private javax.swing.JButton letraL;
    private javax.swing.JButton letraM;
    private javax.swing.JButton letraN;
    private javax.swing.JButton letraO;
    private javax.swing.JButton letraP;
    private javax.swing.JButton letraQ;
    private javax.swing.JButton letraR;
    private javax.swing.JButton letraS;
    private javax.swing.JButton letraT;
    private javax.swing.JButton letraU;
    private javax.swing.JButton letraV;
    private javax.swing.JButton letraW;
    private javax.swing.JButton letraX;
    private javax.swing.JButton letraY;
    private javax.swing.JButton letraZ;
    private javax.swing.JButton letraÑ;
    // End of variables declaration//GEN-END:variables
}
