package rofik.com;

import javax.swing.*;
import java.awt.*;

public class MasukkanData extends JFrame {

    JFrame frem = new JFrame("FROM");

    JLabel label = new JLabel("FORM PENDAFTARAN");

    JLabel lnama = new JLabel("Nama ");
    JTextField nama = new JTextField(20);

    JLabel lnim = new JLabel("NIM ");
    JTextField nim = new JTextField(20);

    JLabel ljurusan = new JLabel("Jurusan ");
    String[] jurusan = {"Sistem Informasi", "Informatika", "Teknik Kimia", "Teknik Industri"};
    JComboBox Cjurusan = new JComboBox(jurusan);

    JLabel langkatan = new JLabel("Angkatan  ");
    String[] angkatan = {"2015", "2016", "2017", "2018", "2019"};
    JComboBox Cangkatan = new JComboBox(angkatan);

    JButton button = new JButton("Daftar");

    JLabel result = new JLabel();

    public MasukkanData() {
        frem.add(label);
        frem.add(lnama);
        frem.add(nama);
        frem.add(lnim);
        frem.add(nim);
        frem.add(langkatan);
        frem.add(Cangkatan);
        frem.add(ljurusan);
        frem.add(Cjurusan);
        frem.add(button);
        frem.add(result);

        result.setVisible(true);

        button.addActionListener(data -> {
            if ((nama.getText().length() == 0) && (nim.getText().length() != 0)) {
                result.setVisible(true);
                result.setForeground(Color.red);
                result.setText("Please Enter Your Name");
            } else if ((nim.getText().length() == 0) && (nama.getText().length() != 0)) {
                result.setVisible(true);
                result.setForeground(Color.red);
                result.setText("Please Enter Your NIM");
            } else if ((nama.getText().length() == 0) && (nim.getText().length() == 0)) {
                result.setVisible(true);
                result.setForeground(Color.red);
                result.setText("Your name and NIM are still empty");
            } else {
                //mengambil data
                String inputanNama = nama.getText();
                String inputanNim = nim.getText();
                String inputanJurusan = Cjurusan.getSelectedItem().toString();
                String inputanAngkatan = Cangkatan.getSelectedItem().toString();
                frem.dispose();
                //mengirim data ke kelas MenampilkanData
                new MenampilkanData(inputanNama, inputanNim, inputanJurusan, inputanAngkatan);
            }
        });

        frem.setLayout(null);
        frem.setVisible(true);
        frem.setSize(500, 500);
        frem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Mengatur posisi form dan judul serta tombol
        label.setBounds(150, 10, 80, 18);
        lnama.setBounds(20, 60, 100, 25);
        nama.setBounds(100, 60, 250, 25);
        lnim.setBounds(20, 100, 100, 25);
        nim.setBounds(100, 100, 250, 25);
        ljurusan.setBounds(20, 140, 100, 25);
        Cjurusan.setBounds(100, 140, 250, 25);
        langkatan.setBounds(20, 180, 100, 25);
        Cangkatan.setBounds(100, 180, 250, 25);
        button.setBounds(150, 230, 100, 25);
        result.setBounds(20, 290, 300, 25);
    }

}
