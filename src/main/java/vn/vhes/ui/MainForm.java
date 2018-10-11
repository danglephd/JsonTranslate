package vn.vhes.ui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import vn.vhes.common.CharsetDetector;
import vn.vhes.common.JsonUtils;
import vn.vhes.common.Utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author danglph
 */
public class MainForm extends javax.swing.JFrame {

    private static Logger logger = Logger.getLogger(MainForm.class);
    private JSONObject jsonSourceObject = null;
    private JSONObject jsonObjectFind = null;
    private File jSonSourceFile = null;
    private String vi_path = "D:\\Source\\IoT\\SVN\\trunk\\web_gui\\templates\\powergenerator\\resources\\languages\\locale\\vi\\Language.json";
    private String en_path = "D:\\Source\\IoT\\SVN\\trunk\\web_gui\\templates\\powergenerator\\resources\\languages\\locale\\en\\Language.json";

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        this.setTitle("Tách ngôn ngữ");
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initEvent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTFJsonFilePath = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jTFJsonFolderPathEn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFJsonFolderPathVi = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAContent = new javax.swing.JTextArea();
        jTFFind = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Chọn file source");

        jTFJsonFilePath.setText("D:\\Source\\IoT\\SVN\\trunk\\PowerGenerator\\documents\\Language.json");

        jButton5.setText("Mở thư mục");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setText("Tải lại");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Tách ngôn ngữ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Thư mục ngôn ngữ EN");

        jButton6.setText("Mở thư mục");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTFJsonFolderPathEn.setText("D:\\Source\\IoT\\SVN\\trunk\\web_gui\\templates\\powergenerator\\resources\\languages\\locale\\en");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Thư mục ngôn ngữ VI");

        jTFJsonFolderPathVi.setText("D:\\Source\\IoT\\SVN\\trunk\\web_gui\\templates\\powergenerator\\resources\\languages\\locale\\vi");

        jButton7.setText("Mở thư mục");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTAContent.setColumns(20);
        jTAContent.setRows(5);
        jScrollPane1.setViewportView(jTAContent);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Tìm thông tin");

        jButton2.setText("Thêm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFFind, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTFJsonFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTFJsonFolderPathVi, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTFJsonFolderPathEn, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFJsonFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFJsonFolderPathVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFJsonFolderPathEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTFFind)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (!openSubFolder(jTFJsonFilePath, JFileChooser.FILES_AND_DIRECTORIES)) {
            //true mean: File
            //false mean: Folder
            JOptionPane.showMessageDialog(null, "Chưa chọn file cần tách!!!");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JSONParser parser = new JSONParser();
        jsonSourceObject = null;
        try {
//            Object obj = parser.parse(new FileReader(jTFJsonFilePath.getText()));
            jSonSourceFile = new File(jTFJsonFilePath.getText());
            Charset c = CharsetDetector.detectCharset(jSonSourceFile);
            Object obj = parser.parse(new InputStreamReader(
                    new FileInputStream(jSonSourceFile),
                    //                    new FileInputStream(jTFSubFolderPath.getText()),
                    c));
            jsonSourceObject = (JSONObject) obj;
            String text = viewJsonObject(obj);
            jTAContent.setText(text);
        } catch (IOException | ParseException e) {
            logger.error(e.getMessage(), e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            JSONObject viObject = new JSONObject();
            JSONObject enObject = new JSONObject();
            vi_path = jTFJsonFolderPathVi.getText() + "\\" + jSonSourceFile.getName();//"\\Language.json";
            en_path = jTFJsonFolderPathEn.getText() + "\\" + jSonSourceFile.getName();
            if (jsonSourceObject != null) {
                for (Object key : jsonSourceObject.keySet()) {
                    JSONObject value = (JSONObject) jsonSourceObject.get(key);
                    viObject.put(key, value.get("vi"));
                    enObject.put(key, value.get("en").equals("") ? "/[../]" : value.get("en"));
                }
                Charset ENCODING = StandardCharsets.UTF_8;
                JsonUtils.writeToFile(vi_path, viObject, ENCODING);
                JsonUtils.writeToFile(en_path, enObject, ENCODING);
            }
        } catch (IOException e) {
            logger.error(e.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (openSubFolder(jTFJsonFolderPathEn, JFileChooser.DIRECTORIES_ONLY)) {

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if (openSubFolder(jTFJsonFolderPathVi, JFileChooser.DIRECTORIES_ONLY)) {

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AddJson jdialogAddJson = new AddJson(this, true, jTFFind.getText());
        jdialogAddJson.setLocationRelativeTo(null);
        jdialogAddJson.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private boolean openSubFolder(JTextField jTextField, int selectionMode) {
        JFileChooser fc = new JFileChooser(jTextField.getText().equals("") ? "" : jTextField.getText());
        fc.setFileSelectionMode(selectionMode);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JSON FILES", "json", "text");
        File tempFile = new File(jTextField.getText());
        if (tempFile.isDirectory()) {
            fc.setCurrentDirectory(tempFile);
        } else {
            fc.setCurrentDirectory(tempFile.getParentFile());
        }
        fc.setFileFilter(filter);
        boolean result = false;
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            result = file.isFile();
            jTextField.setText(file.getPath());
            if (file.isFile()) {

            } else if (file.isDirectory()) {
                //Select folder
                // calculator folder
                Utils.printFolderSize(file);
            }
        }
        return result;
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAContent;
    private javax.swing.JTextField jTFFind;
    private javax.swing.JTextField jTFJsonFilePath;
    private javax.swing.JTextField jTFJsonFolderPathEn;
    private javax.swing.JTextField jTFJsonFolderPathVi;
    // End of variables declaration//GEN-END:variables

    private String viewJsonObject(Object obj) {
        JSONObject tempjsonObject = (JSONObject) obj;
        String text = "";
        int j = 0;
        for (Object key : tempjsonObject.keySet()) {
            JSONObject value = (JSONObject) tempjsonObject.get(key);

            text += "\"" + key + "\": {";
            text += "\r\n";
            int i = 0;
            for (Object keylang : value.keySet()) {
                String sData = (String) value.get(keylang);
                //                viObject.put(key, value.get("vi"));
                //                enObject.put(key, value.get("en").equals("") ? "/[../]" : value.get("en"));

                text += "   \"" + keylang + "\": \"";
                text += sData;
                text += "\"";
                if (i < value.size() - 1) {
                    text += ",";
                    i++;
                }
                text += "\r\n";
            }
            text += "}";
            if (j < tempjsonObject.size() - 1) {
                text += ",";
                j++;
            }
            text += "\r\n";
        }
        return text;
    }

    private void initEvent() {
        jTFFind.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                if(text.length() > 2){
                    jsonObjectFind = findJSON(text);
                    jTAContent.setText(viewJsonObject(jsonObjectFind));
                }else if(text.length() == 0){
                    jTAContent.setText(viewJsonObject(jsonSourceObject));
                }
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
            }
        });
    }

    private JSONObject findJSON(String text) {
        JSONObject jsonObjectReturn = new JSONObject();
        try {
            for (Object key : jsonSourceObject.keySet()) {
                JSONObject jsondata = (JSONObject) jsonSourceObject.get(key);
                String upperCase = ((String)key).toUpperCase();
                if(upperCase.contains(text.toUpperCase())){
                    jsonObjectReturn.put(key, jsondata);
                }else{
                    for (Object keylang : jsondata.keySet()) {
                        upperCase = (String)jsondata.get(keylang);
                        upperCase = CharsetDetector.convertToUTF8(upperCase.toUpperCase());
                        String utf8 = CharsetDetector.convertToUTF8(text.toUpperCase());
                        if(!upperCase.equals("") && upperCase.contains(utf8)){
                            jsonObjectReturn.put(key, jsondata);
                        }
                    }
                }   
            }
        } catch (Exception e) {
            jsonObjectReturn = null;
            logger.error(e.getMessage());
        }
        return jsonObjectReturn;
    }

    void UpdateOrAddJSONObject(JSONObject jsonObject) {
        jsonSourceObject.putAll(jsonObject);
        viewJsonObject(jsonSourceObject);
    }
    
}