package login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author DELL
 */
public class Isiform extends JFrame{
    
    String nama, jenkel,agama,hobby; 
    JLabel isinama = new JLabel(" Nama Lengkap: ");
    JLabel isikelamin = new JLabel(" Jenis Kelamin: ");
    JLabel isiagama = new JLabel(" Agama: ");
    JLabel isihobby = new JLabel(" Hobby: ");
    JLabel hasilNama= new JLabel();
    JLabel hasilKel= new JLabel();
    JLabel hasilAgama= new JLabel();
    JLabel hasilHo= new JLabel();
    
   public Isiform(String nama,String jenkel, String agama, String hobby){
setTitle("Isi Form");
	setDefaultCloseOperation(3);
	setSize(350,200);
        setLocation(500,275);

        this.nama= nama;
        this.jenkel=jenkel;
        this.agama=agama;
        this.hobby=hobby;
        hasilNama.setText(nama);
        hasilKel.setText(jenkel);    
        hasilAgama.setText(agama); 
        hasilHo.setText(hobby);
        
        setLayout(null);
        add(isinama);
        add(isikelamin);
        add(isiagama);
        add(isihobby);
        add(hasilNama);
        add(hasilKel);
        add(hasilAgama);
        add(hasilHo);
        
        isinama.setBounds(10,10,120,20);
	isikelamin.setBounds(10,35,120,20);
        isiagama.setBounds(10,60,120,20);
        isihobby.setBounds(10,90,120,20);
        hasilNama.setBounds(110,10,120,20);
	hasilKel.setBounds(110,35,120,20);
        hasilAgama.setBounds(110,60,120,20);
        hasilHo.setBounds(110,90,120,30);
        

        setVisible(true);
}
}