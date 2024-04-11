import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criar os componentes:
		JLabel usuario = new JLabel("Usuário");
		JTextField txUsuario = new JTextField();

		JLabel senha = new JLabel("Senha");
		JPasswordField txSenha = new JPasswordField();
		
		txSenha.setToolTipText("Informe uma senha de 8 dígitos");
		txUsuario.setToolTipText("Informe o nome de usuário");
		
		txSenha.setBackground(Color.cyan);
		txSenha.setForeground(Color.red);

		txUsuario.setBackground(Color.cyan);
		txUsuario.setForeground(Color.red);
		
		
		// Agrupar os componentes:
		Object[] componentes = { usuario, txUsuario, senha, txSenha };
		
		// JPanel painel = new JPanel();
		// painel.setLayout(new GridLayout(2,2));
		// painel.add(usuario);
		// painel.add(txUsuario);
		// painel.add(senha);
		// painel.add(txSenha);

		// Criar a janela:
		JOptionPane.showMessageDialog(null, componentes);
		
		// JOptionPane.showMessageDialog(null, painel);

		Cliente cliente = new Cliente();

		if (cliente.verificarLogin(txUsuario.getText(), new String(txSenha.getPassword()))) {
			JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Login ou Senha Incorretos!");
		}

	}

}
