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
                button[i].setBackground(Color.WHITE);
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
                checkResult();
            }
            
        
        }


    }
     public void checkResult(){

    
    String[] ch = new String[button.length];
    int[] id = new int[button.length];
    for(int i = 0; i < button.length; i++){
      ch[i] = button[i].getText();
      id[i] = i;
    }
    if(ch[0].equals(ch[1]) && ch[1].equals(ch[2]) && ch[0] != ""){
        button[0].setBackground(Color.GREEN);
        button[1].setBackground(Color.GREEN);
        button[2].setBackground(Color.GREEN);
            for(int i = 0; i < button.length; i++){
                button[i].setEnabled(false);
            }
    }else if(ch[3].equals(ch[4]) && ch[4].equals(ch[5]) && ch[4] != ""){
        button[3].setBackground(Color.GREEN);
        button[4].setBackground(Color.GREEN);
        button[5].setBackground(Color.GREEN);
            for(int i = 0; i < button.length; i++){
                button[i].setEnabled(false);
            }
    }else if(ch[6].equals(ch[7]) && ch[7].equals(ch[8]) && ch[7] != ""){
        button[6].setBackground(Color.GREEN);
        button[7].setBackground(Color.GREEN);
        button[8].setBackground(Color.GREEN);
            for(int i = 0; i < button.length; i++){
                button[i].setEnabled(false);
            }
    }else if(ch[0].equals(ch[3]) && ch[3].equals(ch[6]) && ch[0] != ""){
        button[0].setBackground(Color.GREEN);
        button[3].setBackground(Color.GREEN);
        button[6].setBackground(Color.GREEN);
            for(int i = 0; i < button.length; i++){
                button[i].setEnabled(false);
            }
    }else if(ch[0].equals(ch[3]) && ch[3].equals(ch[7]) && ch[0] != ""){
        button[0].setBackground(Color.GREEN);
        button[4].setBackground(Color.GREEN);
        button[8].setBackground(Color.GREEN);
            for(int i = 0; i < button.length; i++){
                button[i].setEnabled(false);
            }
    }else if(ch[1].equals(ch[4]) && ch[4].equals(ch[7]) && ch[1] != ""){
        button[1].setBackground(Color.GREEN);
        button[4].setBackground(Color.GREEN);
        button[7].setBackground(Color.GREEN);
            for(int i = 0; i < button.length; i++){
                button[i].setEnabled(false);
            }
    }else if(ch[2].equals(ch[5]) && ch[5].equals(ch[8]) && ch[2] != ""){
        button[2].setBackground(Color.GREEN);
        button[5].setBackground(Color.GREEN);
        button[8].setBackground(Color.GREEN);
            for(int i = 0; i < button.length; i++){
                button[i].setEnabled(false);
            }
    }else if(ch[0].equals(ch[4]) && ch[4].equals(ch[8]) && ch[0] != ""){
        button[0].setBackground(Color.GREEN);
        button[4].setBackground(Color.GREEN);
        button[8].setBackground(Color.GREEN);
            for(int i = 0; i < button.length; i++){
                button[i].setEnabled(false);
            }
    }else if(ch[2].equals(ch[4]) && ch[4].equals(ch[6]) && ch[2] != ""){
        button[2].setBackground(Color.GREEN);
        button[4].setBackground(Color.GREEN);
        button[6].setBackground(Color.GREEN);
            for(int i = 0; i < button.length; i++){
                button[i].setEnabled(false);
            }
    }


    // checkResult(i);
} 
}
