import static javax.swing.JOptionPane.*;
public class HP {
    public static void main (String[] arg){
        String Högskolepoäng;
        int år;
        String textÅr;
        textÅr = showInputDialog("Vilket år går du?");
        år=Integer.parseInt(textÅr);
        int HP = (år-1)*60;
        Högskolepoäng = "Antal högskolepoäng du läst hittills är " + HP;
        showMessageDialog (null, Högskolepoäng);
    }
}