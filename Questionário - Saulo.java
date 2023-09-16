import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {
    
    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Título da Janela"); 

        int largura = 500;
        int altura = 600;
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int larguraTela = (int) screenSize.getWidth();
        int alturaTela = (int) screenSize.getHeight();
        
        int x = (larguraTela - largura) / 2;
        int y = (alturaTela - altura) / 2;
        
        janela.setLocation(x, y);
        
        JPanel painel = new JPanel(new GridLayout(16, 1));   
        
        JLabel nome = new JLabel("Nome: ");
        JLabel time = new JLabel("Time: ");
        JLabel sexo = new JLabel("Sexo: ");
        JLabel pratica = new JLabel("Pratica: ");
        JLabel endereco = new JLabel("Endereço: ");

        JComboBox<String> times = new JComboBox<>();
        
        times.addItem("São paulo");
        times.addItem("Santos");
        times.addItem("Corinthians");
        times.addItem("Santa cruz");
        times.addItem("Palmeiras");
        times.addItem("Flamengo");
        
        JTextField textoNome = new JTextField(20);
        ButtonGroup sexos = new ButtonGroup();
        JRadioButton masculino = new JRadioButton("masculino");
        JRadioButton feminino = new JRadioButton("feminino");
        JCheckBox esporte = new JCheckBox("Esporte");
        JCheckBox arte = new JCheckBox("Artes");
        JTextField textoEndereco = new JTextField(20);  
        
        JPanel botoesPanel = new JPanel(); 
        JButton gravar = new JButton("Gravar");
        JButton limpar = new JButton("Limpar");
        JButton sair = new JButton("Sair");
        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        sexos.add(feminino);
        sexos.add(masculino);
        
        janela.setVisible(true);
        janela.setSize(400, 600);
        janela.add(painel);
        
        painel.add(nome);
        painel.add(textoNome);
        painel.add(time);
        painel.add(times);
        painel.add(sexo);
        painel.add(feminino);
        painel.add(masculino);
        painel.add(pratica);
        painel.add(arte);
        painel.add(esporte);
        painel.add(endereco);
        painel.add(textoEndereco);
        
        painel.add(Box.createVerticalStrut(1));
        
        botoesPanel.add(gravar);
        botoesPanel.add(limpar);
        botoesPanel.add(sair);
        
        painel.add(botoesPanel);
    }
}
