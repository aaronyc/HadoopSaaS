/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JModelCreatorJarPage.java
 *
 * Created on 14/08/2009, 9:38:44 AM
 */
package org.me.hadoop.wsclient.ui.wizards;

import java.awt.Component;
import java.io.File;
import java.util.Collection;
import org.me.hadoop.utils.CommonsIO;
import org.me.hadoop.wsclient.internal.JarFileReader;
import org.netbeans.spi.wizard.WizardPage;

/**
 *
 * @author Aaron
 */
public class JModelCreatorJarPage extends WizardPage {

    private String dirname = "";

    /** Creates new form JModelCreatorJarPage */
    public JModelCreatorJarPage() {
        initComponents();
    }

    public static String getDescription() {
        return "Fill In Compulsory Details";
    }

    @Override
    protected String validateContents(Component component, Object event) {
        if ((component == jMethodComboBox) || (component == jNameTextField) ||
                (component == jJarFileComboBox) || (component == jMainClassComboBox) ||
                (component == null)) {
            if (!jMethodComboBox.getSelectedItem().equals("hadoop.jar")) {
                return "Method of the model must be \"hadoop.jar\".";
            }
            if (jNameTextField.getText().trim().length() == 0) {
                return "Fill in the name of the model.";
            }
            if (jJarFileComboBox.getSelectedIndex() == -1) {
                return "Choose the JAR file for the model.";
            }
            if (jMainClassComboBox.getSelectedIndex() == -1) {
                return "Choose the main class for the model.";
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

        jMethodLabel = new javax.swing.JLabel();
        jMethodComboBox = new javax.swing.JComboBox();
        jNameLabel = new javax.swing.JLabel();
        jNameTextField = new javax.swing.JTextField();
        jMainClassLabel = new javax.swing.JLabel();
        jJarFileLabel = new javax.swing.JLabel();
        jJarFileComboBox = new javax.swing.JComboBox();
        jMainClassComboBox = new javax.swing.JComboBox();

        setName("jJarMCSecondPage"); // NOI18N
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jJarMCSecondPageFocusGained(evt);
            }
        });

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(org.me.hadoop.wsclient.ui.HadoopWSClient.class).getContext().getResourceMap(JModelCreatorJarPage.class);
        jMethodLabel.setText(resourceMap.getString("jMethodLabel.text")); // NOI18N
        jMethodLabel.setName("jMethodLabel"); // NOI18N

        jMethodComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "hadoop.jar", "hadoop.streaming" }));
        jMethodComboBox.setEnabled(false);
        jMethodComboBox.setName("jMethodComboBox"); // NOI18N

        jNameLabel.setText(resourceMap.getString("jNameLabel.text")); // NOI18N
        jNameLabel.setName("jNameLabel"); // NOI18N

        jNameTextField.setText(resourceMap.getString("jNameTextField.text")); // NOI18N
        jNameTextField.setName("jNameTextField"); // NOI18N

        jMainClassLabel.setText(resourceMap.getString("jMainClassLabel.text")); // NOI18N
        jMainClassLabel.setName("jMainClassLabel"); // NOI18N

        jJarFileLabel.setText(resourceMap.getString("jJarFileLabel.text")); // NOI18N
        jJarFileLabel.setName("jJarFileLabel"); // NOI18N

        jJarFileComboBox.setName("jJarFileComboBox"); // NOI18N
        jJarFileComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jJarFileComboBoxItemStateChanged(evt);
            }
        });

        jMainClassComboBox.setName("jMainClassComboBox"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMethodLabel)
                    .addComponent(jNameLabel)
                    .addComponent(jJarFileLabel)
                    .addComponent(jMainClassLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jJarFileComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 306, Short.MAX_VALUE)
                    .addComponent(jNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addComponent(jMethodComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 306, Short.MAX_VALUE)
                    .addComponent(jMainClassComboBox, 0, 306, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMethodLabel)
                    .addComponent(jMethodComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNameLabel)
                    .addComponent(jNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jJarFileLabel)
                    .addComponent(jJarFileComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMainClassLabel)
                    .addComponent(jMainClassComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jJarMCSecondPageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jJarMCSecondPageFocusGained
        // TODO add your handling code here:
        String value = (String) getWizardData("jModelDirChooser");
        if (!dirname.equals(value)) {
            jJarFileComboBox.removeAllItems();
            Collection<File> files = CommonsIO.listFiles(value, new String[]{"jar"});
            if ((files != null) && (!files.isEmpty())) {
                for (File file : files) {
                    String path = file.getAbsolutePath();
                    jJarFileComboBox.addItem(path.substring(value.length() + 1));
                }
                jJarFileComboBox.setSelectedIndex(-1);
                dirname = value;
            }
        }
}//GEN-LAST:event_jJarMCSecondPageFocusGained

    private void jJarFileComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jJarFileComboBoxItemStateChanged
        // TODO add your handling code here:
        jMainClassComboBox.removeAllItems();
        if (jJarFileComboBox.getSelectedIndex() != -1) {
            String value = (String) jJarFileComboBox.getSelectedItem();
            Collection<String> names = JarFileReader.getClasses(dirname, value);
            if ((names != null) && (!names.isEmpty())) {
                for (String name : names) {
                    jMainClassComboBox.addItem(name);
                }
                jMainClassComboBox.setSelectedIndex(-1);
            }
        }
    }//GEN-LAST:event_jJarFileComboBoxItemStateChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jJarFileComboBox;
    private javax.swing.JLabel jJarFileLabel;
    private javax.swing.JComboBox jMainClassComboBox;
    private javax.swing.JLabel jMainClassLabel;
    private javax.swing.JComboBox jMethodComboBox;
    private javax.swing.JLabel jMethodLabel;
    private javax.swing.JLabel jNameLabel;
    private javax.swing.JTextField jNameTextField;
    // End of variables declaration//GEN-END:variables
}
