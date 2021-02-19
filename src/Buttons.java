import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Buttons extends JPanel implements ActionListener{
    
    private static final long serialVersionUID = 1L;

    boolean myTurn = true;
    JButton reset;
    JButton[] button = new JButton[9];

    
    public Buttons(){
        //for(JButton b: button){
        for(int i = 0; i < button.length; i++){
            button[i] = new JButton("");
            button[i].addActionListener(this);
            add(button[i]);

        }

        
        reset = new JButton("RESET");
        reset.addActionListener(this);
        add(reset);

        setLayout(new GridLayout(4,3));




    }

    @Override
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if(source.equals(reset)){
            for(int i = 0; i < button.length; i++){
                button[i].setText("");
            }
        }

        myTurn = !myTurn;
        char symbol = 'X';
        if(myTurn){
            symbol = 'O';
        }

        for(int i = 0; i < button.length; i++) {
            if(source.equals(button[i])){
                button[i].setText(""+symbol);
            }
            
        
        }


    }
}
