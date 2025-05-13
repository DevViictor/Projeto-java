import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class janela{
    public static void main(String[] args) {

        // Configuração da Janela :

        //Cria a jenala
        JFrame window = new JFrame("window");
       
        
        //Define o tamanho da janela
        window.setBounds(0,0,800,600);

        //Fecha a janela
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       window.setResizable(false);
        
        // definindo o layout da tela 
        window.setLayout(null);


        //Conteudos a janela :


        //texto a tela : 

        JLabel texto1 = new JLabel("Nome do app");
        texto1.setBounds(300,100,150,40);

        JLabel user = new  JLabel ("Usario");
        user.setBounds(200,200,150,40);

        JLabel password = new JLabel ("Senha");
        password.setBounds(200,300,150,40);

        //campo de digitação 

        JTextField campousuario = new JTextField();
        campousuario.setBounds(250,230,150,20);

        JPasswordField camposenha = new JPasswordField();
        camposenha.setBounds(250,330,150,20);

        //botão 

        JButton login = new JButton("Login");
        login.setBounds(300,400,100,30);


        //adicionar algo a janela
        window.add(user);
        window.add(password);
        window.add(campousuario);
        window.add(camposenha);
        window.add(login);
        window.add(texto1);

         //Torna a janela visivel
         window.setVisible(true);

        
        
    

    }
}