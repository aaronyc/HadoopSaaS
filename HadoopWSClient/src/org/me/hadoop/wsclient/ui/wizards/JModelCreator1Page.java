/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JModelCreator1Page.java
 *
 * Created on 14/08/2009, 9:42:41 AM
 */
package org.me.hadoop.wsclient.ui.wizards;

import java.awt.Component;
import javax.swing.JFileChooser;
import org.netbeans.spi.wizard.WizardPage;

/**
 *
 * @author Aaron
 */
public class JModelCreator1Page extends WizardPage {

    /** Creates new form JModelCreator1Page */
    public JModelCreator1Page() {
        initComponents();
    }

    public static String getDescription() {
        return "Choose Directory";
    }

    @Override
    protected String validateContents(Component component, Object event) {
        if ((component == null) || (component == jModelDirChooser)) {
            if (jModelDirChooser.getSelectedFile() == null) {
                return "Choose the directory that contains required files " +
                        "for the model.";
            }
        }
        return null;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jModelDirChooser = new javax.swing.JFileChooser();

        setName("jMCFirstPage"); // NOI18N

        jModelDirChooser.setControlButtonsAreShown(false);
        jModelDirChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        jModelDirChooser.setName("jModelDirChooser"); // NOI18N
        jModelDirChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jModelDirChooserPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jModelDirChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jModelDirChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jModelDirChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jModelDirChooserPropertyChange
        // TODO add your handling code here:
        if (evt.getPropertyName().equals(JFileChooser.SELECTED_FILE_CHANGED_PROPERTY)) {
            if (jModelDirChooser.getSelectedFile() != null) {
                String path = jModelDirChooser.getSelectedFile().getAbsolutePath();
                putWizardData(jModelDirChooser.getName(), path);
            }
        }
    }//GEN-LAST:event_jModelDirChooserPropertyChange
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jModelDirChooser;
    // End of variables declaration//GEN-END:variables
}
