package login;

/**
 *
 * @author DELL
 */
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Form extends JFrame {
    String nama,jenkel,agama,hobby;
    
   final JTextField fnama = new JTextField(10);

   JLabel lnama = new JLabel(" Nama Lengkap ");
   JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");

   JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
   JRadioButton rbWanita = new JRadioButton("perempuan ");

   JLabel lagama = new JLabel(" Agama ");
   String[] namaAgama =
            {" Islam"," Kristen "," Katolik "," Hindu "," Budha "};
   JComboBox cmbAgama = new JComboBox(namaAgama);
   JLabel lhobby = new JLabel(" Hobby ");

   JCheckBox cbSepakbola = new JCheckBox(" Sepakbola ");
   JCheckBox cbBasket = new JCheckBox(" Basket ");

   JButton btnSave = new JButton("OK");

  /* JLabel hasilNama= new JLabel();
   JLabel hasilKel= new JLabel();
   JLabel hasilAgama= new JLabel();
   JLabel hasilHo= new JLabel();
   */
   public Form() {
setTitle("Form");
	setDefaultCloseOperation(3);
	setSize(350,200);
        setLocation(500,275);

	ButtonGroup group = new ButtonGroup();
	group.add(rbPria);
	group.add(rbWanita);

	setLayout(null);
	add(lnama);
	add(fnama);
	add(ljeniskelamin);
	add(rbPria);
	add(rbWanita);
	add(lagama);
	add(cmbAgama);
	add(lhobby);
	add(cbSepakbola);
	add(cbBasket);
	add(btnSave);
        /*add(hasilNama);
        add(hasilKel);
        add(hasilAgama);
        add(hasilHo);
	*/// setBounds(m,n,o,p)
	// m = posisi x; n = posisi n
	// o = panjang komponen; p = tinggi komponen
	lnama.setBounds(10,10,120,20);
	fnama.setBounds(130,10,150,20);
	ljeniskelamin.setBounds(10,35,120,20);
	rbPria.setBounds(130,35,100,20);
	rbWanita.setBounds(230,35,100,20);
	lagama.setBounds(10,60,150,20);
	cmbAgama.setBounds(130,60,150,20);
	lhobby.setBounds(10,85,120,20);
	cbSepakbola.setBounds(130,85,100,20);
	cbBasket.setBounds(230,85,150,20);
	btnSave.setBounds(100,130,120,20);
              
btnSave.addActionListener(new ActionListener(){

    @Override
    public void actionPerformed(ActionEvent e){
      
     if(fnama.getText().length()==0){
                JOptionPane.showMessageDialog(null, "Nama tidak ada");}
     else{
         nama = fnama.getText();
     
    if(rbPria.isSelected()){
        jenkel=rbPria.getText();
            }
       else if(rbWanita.isSelected()){
            jenkel=rbWanita.getText();
        }
    
     agama = (String) cmbAgama.getSelectedItem();
          
     if(cbBasket.isSelected() && cbSepakbola.isSelected()){
             hobby= "Basket dan Sepakbola" ;
            }
        else if(cbBasket.isSelected()){
               hobby=cbBasket.getText();
            }
            else if(cbSepakbola.isSelected()){
                hobby=cbSepakbola.getText();
            }
    
                
     
    Isiform isiform = new Isiform(nama,jenkel,agama,hobby);
    isiform.setVisible(true);
     }
    dispose();

        }
   });
        setVisible(true);

   }
}