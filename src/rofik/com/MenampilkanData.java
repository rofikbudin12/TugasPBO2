package rofik.com;

import javax.swing.*;


public class MenampilkanData extends JFrame {
    JFrame frem = new JFrame("Data Anda");

    JLabel label = new JLabel("Data Anda");

    JButton ok = new JButton("Finish");
    JLabel result = new JLabel();

    public MenampilkanData(String inputanNama, String inputanNim, String inputanJurusan, String inputanAngkatan) {
        //output
        JLabel outputNama = new JLabel("Nama        : " + inputanNama);
        JLabel outputNim = new JLabel("NIM           : " + inputanNim);
        JLabel outputJurusan = new JLabel("Jurusan     : " + inputanJurusan);
        JLabel outputAngkatan = new JLabel("Angkatan : " + inputanAngkatan);


        frem.add(outputNama);
        frem.add(outputNim);
        frem.add(outputJurusan);
        frem.add(outputAngkatan);
        frem.add(label);
        frem.setLayout(null);
        frem.setVisible(true);
        frem.setSize(400, 400);
        frem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frem.add(ok);
        frem.add(result);

        //Keluar Program
        ok.addActionListener(actionEvent -> {
            if (JOptionPane.showConfirmDialog(null, " Keluar ", "Keluar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        //Pengaturan Posisi
        label.setBounds(150, 10, 80, 18);
        outputNama.setBounds(20, 30, 250, 20);
        outputNim.setBounds(20, 40, 250, 40);
        outputJurusan.setBounds(20, 50, 250, 60);
        outputAngkatan.setBounds(20, 60, 250, 80);
        ok.setBounds(150, 230, 100, 25);
        result.setBounds(20, 290, 300, 25);

    }


}
