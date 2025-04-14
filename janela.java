
import javax.swing.JFrame;



public class janela{
    public static void main(String[] args) {

        //Cria a jenala
        JFrame window = new JFrame("window");

        //Define o tamanho da janela
        window.setSize(400, 300);

        //Fecha a janela
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Torna a janela visivel
        window.setVisible(true);


    }
}