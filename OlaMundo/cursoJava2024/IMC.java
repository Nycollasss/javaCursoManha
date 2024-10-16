package cursoJava2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IMC extends JFrame {

    private JTextField txtPeso, txtAltura, txtQuadril;
    private JLabel lblResultadoIMC, lblResultadoIAC;

    public IMC() {
        setTitle("Calculadora IMC e IAC");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        // Componentes da Interface
        JLabel lblPeso = new JLabel("Peso (kg):");
        txtPeso = new JTextField();

        JLabel lblAltura = new JLabel("Altura (m):");
        txtAltura = new JTextField();

        JLabel lblQuadril = new JLabel("Circunferência do Quadril (cm):");
        txtQuadril = new JTextField();

        JButton btnCalcular = new JButton("Calcular");
        lblResultadoIMC = new JLabel("IMC: ");
        lblResultadoIAC = new JLabel("IAC: ");

        // Adicionando componentes na tela
        add(lblPeso);
        add(txtPeso);
        add(lblAltura);
        add(txtAltura);
        add(lblQuadril);
        add(txtQuadril);
        add(btnCalcular);
        add(new JLabel()); // espaço vazio
        add(lblResultadoIMC);
        add(new JLabel()); // espaço vazio
        add(lblResultadoIAC);

        // Ação do botão
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });
    }

    private void calcular() {
        try {
            double peso = Double.parseDouble(txtPeso.getText());
            double altura = Double.parseDouble(txtAltura.getText());
            double quadril = Double.parseDouble(txtQuadril.getText());

            // Cálculo do IMC
            double imc = peso / (altura * altura);

            // Cálculo do IAC
            double iac = (quadril / (altura * Math.sqrt(altura))) - 18;

            // Exibir os resultados
            lblResultadoIMC.setText(String.format("IMC: %.2f", imc));
            lblResultadoIAC.setText(String.format("IAC: %.2f", iac));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            IMC app = new IMC();
            app.setVisible(true);
        });
    }
}
