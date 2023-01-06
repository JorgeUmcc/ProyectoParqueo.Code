/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.GuardarArchivos;
import Modelo.Empleado;
import java.util.ArrayList;

/**
 *
 * @author Jorgito
 */
public class Empleados extends javax.swing.JFrame {
 Object[][] lista;
    /**
     * Creates new form Empleados
     */
    public Empleados() {
        initComponents();
        ArrayList<Empleado> Empleado = new ArrayList<>();
        try{
        Empleado = GuardarArchivos.readFileTextEmpleados();
        
        lista = new Object[Empleado.size()][4];
        for(int i =0;i<Empleado.size();i++){
            lista[i][0]= Empleado.get(i).getNombre();
            lista[i][1]= Empleado.get(i).getCargo();
            lista[i][2]= Empleado.get(i).getHorario();
            lista[i][3]= Empleado.get(i).getSueldo();
        }
        
        
        TablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            lista,
            new String [] {
                "Nombre", "cargo", "horario", "sueldo"
            }
        ));
        }
        catch(Exception ex){
            
        }
        this.setTitle("Estacionamiento Benitez");
    }

        
        
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEmpleados = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(722, 465));
        setResizable(false);

        jInternalFrame1.setBackground(new java.awt.Color(204, 204, 255));
        jInternalFrame1.setVisible(true);

        TablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cargo", "Nombre", "Horario", "Sueldo"
            }
        ));
        jScrollPane1.setViewportView(TablaEmpleados);
        if (TablaEmpleados.getColumnModel().getColumnCount() > 0) {
            TablaEmpleados.getColumnModel().getColumn(0).setResizable(false);
            TablaEmpleados.getColumnModel().getColumn(1).setResizable(false);
            TablaEmpleados.getColumnModel().getColumn(2).setResizable(false);
            TablaEmpleados.getColumnModel().getColumn(3).setResizable(false);
        }

        jMenu1.setText("Empleados");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Guardar cambios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Volver al menú");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jInternalFrame1.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
  System ventana1 = new System(); 
      ventana1.setVisible(true);
      ventana1.setLocationRelativeTo(null);
      
      ventana1.setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
      this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 // TODO add your handling code here:
        
        ArrayList<Empleado> empleado=new ArrayList<>();
        
        for(int i =0;i<TablaEmpleados.getRowCount();i++){
            String nombre = (String)TablaEmpleados.getValueAt(i, 0);
            String Cargo = (String)TablaEmpleados.getValueAt(i, 1);
            String Horario = (String)TablaEmpleados.getValueAt(i, 2);
            String Sueldo = (String)TablaEmpleados.getValueAt(i, 3);
            
            empleado.add(new Empleado(nombre,Cargo,Horario,Sueldo));
        }
        try{
            GuardarArchivos.writeFileTextEmpleados(empleado);
        }
        catch(Exception ex){
            
        }  
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEmpleados;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
