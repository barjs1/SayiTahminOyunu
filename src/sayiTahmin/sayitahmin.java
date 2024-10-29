package sayiTahmin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class sayitahmin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	private int kalanCan=5;
	Random rand=new Random();
	int randomSayi=rand.nextInt(50)+1;
	
	
	
	
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sayitahmin frame = new sayitahmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
		

	/**
	 * Create the frame.
	 * 
	 * 
	 * 
	 * 
	 */
	
	private void tahminYap() {
		
		
		
		JLabel sonuc = new JLabel("");
		sonuc.setHorizontalAlignment(SwingConstants.CENTER);
		sonuc.setFont(new Font("Arial Black", Font.PLAIN, 25));
		sonuc.setBounds(10, 379, 762, 88);
		contentPane.add(sonuc);
		
		JLabel canSayisi = new JLabel("");
		canSayisi.setFont(new Font("Bernard MT Condensed", Font.BOLD, 13));
		canSayisi.setBounds(10, 83, 737, 121);
		contentPane.add(canSayisi);
		
		
		
		
		
		

		 
			  try {
		            int seninTahminin = Integer.parseInt(textField.getText());

		            if (seninTahminin  == randomSayi) {
		                JOptionPane.showMessageDialog(this, "Tebrikler! Doğru tahmin!");
		                dispose();
		                textField.setEnabled(false);
		            } else {
		                kalanCan--;

		                if (kalanCan > 0) {
		                    String message;
		                    if (seninTahminin <randomSayi) {
		                        message = "Yanlış tahmin! Daha yüksek bir sayı girin. Kalan can: " + kalanCan;
		                    } else {
		                        message = "Yanlış tahmin! Daha düşük bir sayı girin. Kalan can: " + kalanCan;
		                    }
		                    JOptionPane.showMessageDialog(this, message);
		                } else {
		                    JOptionPane.showMessageDialog(this, "Oyun bitti. Kaybettin.  Doğru sayı: " + randomSayi +" OYUN OTOMATİK KAPANACAK.");
		                   dispose();
		                    textField.setEnabled(false);
		                }
		            }
		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(this, "Geçersiz giriş! Lütfen bir sayı girin.");
		        } finally {
		        	textField.setText("");
		        }
		    
		  }

	
			
		

	public  sayitahmin() {
		
		 JOptionPane.showMessageDialog(this, "SAYI TAHMİN OYUNUNA HOŞ GELDİN KAZANMAK İÇİN 5 HAKKIN VAR BAŞARILAR :)");
		Random rand=new Random();
		int randomSayi=rand.nextInt(50)+1;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 517);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		JButton btn = new JButton("GÖNDER");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
	tahminYap();
	
			
			}
			
});
		
		JLabel lblNewLabel = new JLabel("SAYI TAHMİN OYUNU");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		lblNewLabel.setBounds(242, 11, 297, 104);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1-50 arasında bir sayı tutttum tahmin et");
		lblNewLabel_1.setFont(new Font("Agency FB", Font.BOLD, 24));
		lblNewLabel_1.setBounds(229, 135, 437, 49);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(287, 195, 192, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btn.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn.setBounds(287, 271, 192, 40);
		contentPane.add(btn);
		
	
		
		
		
		
		

		
	
		
	}
	}

