import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Hashtable;
import java.awt.font.TextAttribute;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 12.12.2023
 * @author 
 */

public class main extends JFrame {
  // Anfang Attribute
  private JLabel lKonfigurierensieihrenTisch1 = new JLabel();
  private JPanel jPanel1 = new JPanel(null, true);
  private JComboBox<String> jComboBox1 = new JComboBox<>();
    private DefaultComboBoxModel<String> jComboBox1Model = new DefaultComboBoxModel<>();
  private JLabel lBreitedTisches1 = new JLabel();
  private JLabel lLaengedTisches1 = new JLabel();
  private JLabel lLaengedTischbeine1 = new JLabel();
  private JLabel lHolzart1 = new JLabel();
    private JLabel jLabel1 = new JLabel();
    private JLabel lPreisdTisches1 = new JLabel();
    private JButton bBerechnen1 = new JButton();
  private JNumberField jNumberField1 = new JNumberField();
  private JNumberField jNumberField2 = new JNumberField();
  private JNumberField jNumberField3 = new JNumberField();
  private JLabel lm1 = new JLabel();
  private JLabel lm2 = new JLabel();
  private JLabel lm3 = new JLabel();
  private JCheckBox jCheckBox1 = new JCheckBox();
    private JNumberField jNumberField5 = new JNumberField();
  private JLabel lm5 = new JLabel();
  // Ende Attribute
  
  public main() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 478; 
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("main");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    lKonfigurierensieihrenTisch1.setBounds(48, 8, 376, 47);
    lKonfigurierensieihrenTisch1.setText("Konfigurieren sie ihren Tisch!");
    Hashtable<TextAttribute, Object> lKonfigurierensieihrenTisch1_map = new Hashtable<TextAttribute, Object>();
    lKonfigurierensieihrenTisch1_map.put(TextAttribute.FAMILY, "Dialog");
    lKonfigurierensieihrenTisch1_map.put(TextAttribute.SIZE, new Integer(26));
    lKonfigurierensieihrenTisch1_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    lKonfigurierensieihrenTisch1.setFont(new Font(lKonfigurierensieihrenTisch1_map));
    cp.add(lKonfigurierensieihrenTisch1);
    jPanel1.setBounds(256, 144, 160, 104);
    jPanel1.setOpaque(false);
    jPanel1.setBorder(BorderFactory.createEtchedBorder(0, new Color(0xC0C0C0), new Color(0xC0C0C0)));
    cp.add(jPanel1);
    jComboBox1.setModel(jComboBox1Model);
    jComboBox1.setBounds(48, 192, 160, 24);
    jComboBox1Model.addElement("Buche");
    jComboBox1Model.addElement("Esche");
    jComboBox1Model.addElement("Erle");
    jComboBox1Model.addElement("Kirsche");
    jComboBox1Model.addElement("Eiche");
    jComboBox1Model.addElement("Nuss");
    cp.add(jComboBox1);
    lBreitedTisches1.setBounds(48, 56, 99, 24);
    lBreitedTisches1.setText("Breite d. Tisches");
    cp.add(lBreitedTisches1);
    lLaengedTisches1.setBounds(256, 56, 100, 24);
    lLaengedTisches1.setText("Länge d. Tisches");
    cp.add(lLaengedTisches1);
    lLaengedTischbeine1.setBounds(48, 112, 117, 24);
    lLaengedTischbeine1.setText("Länge d. Tischbeine");
    cp.add(lLaengedTischbeine1);
    lHolzart1.setBounds(48, 168, 80, 24);
    lHolzart1.setText("Holzart");
    cp.add(lHolzart1);
    jLabel1.setBounds(96, 32, 1, 25);
    jLabel1.setText("Text");
    jPanel1.add(jLabel1);
    lPreisdTisches1.setBounds(8, 8, 95, 24);
    lPreisdTisches1.setText("Preis d. Tisches");
    jPanel1.add(lPreisdTisches1);
    bBerechnen1.setBounds(8, 64, 144, 24);
    bBerechnen1.setText("Berechnen");
    bBerechnen1.setMargin(new Insets(2, 2, 2, 2));
    bBerechnen1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bBerechnen1_ActionPerformed(evt);
      }
    });
    jPanel1.add(bBerechnen1);
    jNumberField1.setBounds(48, 80, 152, 24);
    cp.add(jNumberField1);
    jNumberField2.setBounds(256, 80, 152, 24);
    cp.add(jNumberField2);
    jNumberField3.setBounds(48, 136, 152, 24);
    cp.add(jNumberField3);
    lm1.setBounds(200, 136, 32, 24);
    lm1.setText("m");
    cp.add(lm1);
    lm2.setBounds(200, 80, 32, 24);
    lm2.setText("m");
    cp.add(lm2);
    lm3.setBounds(408, 80, 32, 24);
    lm3.setText("m");
    cp.add(lm3);
    jCheckBox1.setBounds(48, 224, 160, 24);
    jCheckBox1.setText("Premium Qualität");
    jCheckBox1.setOpaque(false);
    cp.add(jCheckBox1);
    jNumberField5.setBounds(8, 32, 120, 24);
    jPanel1.add(jNumberField5);
    lm5.setBounds(384, 176, 24, 24);
    lm5.setText("€");
    cp.add(lm5);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public main
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new main();
  } // end of main
  
  public void bBerechnen1_ActionPerformed(ActionEvent evt) {
    tisch dsk = new tisch(jNumberField2.getDouble(), jNumberField1.getDouble(), jNumberField3.getDouble(), jComboBox1.getSelectedItem().toString(), jCheckBox1.isSelected());
    
    jNumberField5.setDouble(dsk.calcPrice(), 2);
  } // end of bBerechnen1_ActionPerformed

  // Ende Methoden
} // end of class main
