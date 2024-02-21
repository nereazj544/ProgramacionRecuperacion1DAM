package swing.Luna;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Luna extends JLabel{
    

    //Arrays para almacenar las FasesLunares
    private static final FLunar [] FASES = {
		new FLunar("Luna Nueva"),
		new FLunar("Luna Creciente"),
		new FLunar("Cuarto Creciente"),
		new FLunar("Quinto Octante"),
		new FLunar("Luna Llena"),
		new FLunar("Tercer Octante"),
		new FLunar("Cuarto Menguante"),
		new FLunar("Luna Menguante")
	};

    private int fase;

    public Luna(){
        super(FASES[0].getNombre(), FASES[0].getImagen, JLabel.CENTER);
        
        setVerticalAlignment(CENTER);
        setHorizontalTextPosition(CENTER);
        setVerticalTextPosition(BOTTOM);

        setForeground(Color.BLACK);
        setBorder(BorderFactory.createEmptyBorder(30, 30,30,30));

    }

    public void siguiente() {
		if (++fase == FASES.length)
			fase = 0;
		setText(FASES[fase].getNombre());
		setIcon(FASES[fase].getImagen());
	}
	
	public void anterior() {
		if (--fase < 0)
			fase = FASES.length - 1;
		setText(FASES[fase].getNombre());
		setIcon(FASES[fase].getImagen());
	}
	
}
