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
            button[i].setBackground(Color.WHITE);

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
                button[i].setEnabled(true);
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
                button[i].setEnabled(false);
                // checkResult(i);
            }
            
        
        }


    }
    /* public void checkResult(){


        String[] ch = new String[3];
    int[] id = new int[3];
    for(int i = 0; i < 3; i++){
      ch[i] = button[i].getText();
      id[i] = i;
    }
    if(ch[0].equals(ch[1]) && ch[1].equals(ch[2]) && ch[0] != ""){
      button[id[0]].setBackground(Color.GREEN);
      button[id[1]].setBackground(Color.GREEN);
      button[id[2]].setBackground(Color.GREEN);
    } 


    // checkResult(i);
} */
}
