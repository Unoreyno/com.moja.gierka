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



        /*
        String[] ch1 = new String[button.length];
        for(int i1 = 0; i1 < 3; i1++){
            for(int i = i1*3; i < (i1*3)+3; i++){
              ch1[i] = button[i].getText();
            }
            int i = i1*3;
            if (ch1[i].equals(ch1[i+1]) && ch1[i].equals(ch1[i+2]) && !ch1[i].equals("")) {
                button[i].setBackground(Color.GREEN);
                button[i+1].setBackground(Color.GREEN);
                button[i+2].setBackground(Color.GREEN);
                    for (int i11 = 0; i11 < button.length; i11++){
                        button[i11].setEnabled(false);
                    }
            }
        }
        */
        // nie działa, później ogarnę
        /*
        String[] ch2 = new String[button.length];
        for(int i2 = 0; i2 < 9; i2++){
            for(int in = i2; in < 9; in++){
              ch2[in] = button[in].getText();
            }
            int im = i2;
            if (ch2[im].equals(ch2[im+4]) && ch2[im].equals(ch2[im+8]) && !ch2[im].equals("")) {
                button[im].setBackground(Color.GREEN);
                button[im+4].setBackground(Color.GREEN);
                button[im+8].setBackground(Color.GREEN);
                    for (int i22 = 0; i22 < button.length; i22++){
                        button[i22].setEnabled(false);
                    }
            }
        i2 +=3;
        }
        */
        
        
        
        /*
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
        } */


    // checkResult(i);
} 
}
