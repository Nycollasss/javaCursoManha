package cursoJava2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorCliques extends JFrame {
    private int contador = 0; // Variável que armazena o número de cliques
    private JLabel lblContador; // Componente para exibir o valor do contador

    public ContadorCliques() {
        // Configuração da janela principal
        setTitle("Contador de Cliques");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout()); // Layout simples

        // Criando componentes
        JButton btnClique = new JButton("Clique aqui!");
        lblContador = new JLabel("Contador: 0");

        // Ação do botão
        btnClique.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++; // Incrementa o contador
                lblContador.setText("Contador: " + contador); // Atualiza o JLabel
            }
        });

        // Adicionando componentes à janela
        add(btnClique);
        add(lblContador);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ContadorCliques app = new ContadorCliques();
            app.setVisible(true); // Exibe a interface gráfica
        });
    }
}
