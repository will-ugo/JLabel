import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label extends JFrame {
	private JLabel text;
	
	public Label() {
		super("JLabel Demo");
		setLayout(new FlowLayout());
		
		text = new JLabel("This illustrates the function of JLabel.");
		text.setToolTipText("Mouse is being hovered on text");
		add(text);
	}
}
