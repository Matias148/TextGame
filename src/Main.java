import enumerations.Sexo;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    private static Protagonista prota;

    public static void main(String[] args) throws Exception {
        //criacaoProta();
        //URL oUrl = new URL("eu Take 2.mp3");
        Clip oClip = AudioSystem.getClip();
        AudioInputStream oStream = AudioSystem.getAudioInputStream(new File("src\\sounds\\Shuumatsu op 11.wav").getAbsoluteFile());
        oClip.open(oStream);
        oClip.loop(Clip.LOOP_CONTINUOUSLY); // Toca continuamente (para o caso de músicas)
        String text = "A chuva molha metade ";

        quebrarLinha(text);
    }

    public static void salvar(){

    }

    public static void criacaoProta() {
        while (true) {
            String nome = JOptionPane.showInputDialog("Digite o nome: ");

            String[] sexos = {"Feminino", "Masculino"};

            int x = JOptionPane.showOptionDialog(null, "Escolha seu Sexo", "Sexo",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, sexos, sexos[0]);

            if (x == 0) {
                prota = new Protagonista("FEMININO", nome);
            } else {
                prota = new Protagonista("MASCULINO", nome);
            }

            int i = JOptionPane.showConfirmDialog(null, "Deseja confirmar?", "Confirmar",
                    JOptionPane.YES_NO_OPTION);

            if (i == JOptionPane.YES_OPTION) {
                break;
            } else if (i == JOptionPane.NO_OPTION) {
                System.out.println("Clicou em Não");
            }
        }
    }

    public static void quebrarLinha(String text){
        JTextArea textArea = new JTextArea(text);

        textArea.setColumns(60);
        textArea.setLineWrap( true );
        textArea.setWrapStyleWord( true );
        textArea.setSize(textArea.getPreferredSize().width, 1);
        Font font = new Font("Arial", Font.BOLD, 12);
        textArea.setFont(font);
//        textArea.setForeground(Color.BLUE);
        JOptionPane.showMessageDialog(
                null, textArea, "Border States", JOptionPane.PLAIN_MESSAGE);
    }
}
