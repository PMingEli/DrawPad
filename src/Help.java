import javax.swing.JFrame;
import javax.swing.JOptionPane;

//帮助菜单功能的事项类
public class Help extends JFrame {
    private DrawPad drawpad = null;

    Help(DrawPad dp) {
        drawpad = dp;
    }

    public void MainHelp() {
        JOptionPane.showMessageDialog(this, "Draw_pad帮助文档", "Draw_pad", JOptionPane.WARNING_MESSAGE);
    }

    public void AboutBook() {
        JOptionPane.showMessageDialog(drawpad, "Draw_pad" + "\n" + "版本: 1.0" + "\n"
                + "作者:    " + "\n"
                + "      彭明均 " + "\n"
        		+ "      谢一帆" + "\n"
        		+ "      梁俊涛" + "\n"
        		+ "      杨子江" + "\n"
                + "完成时间:  2020/11月", "Draw_pad", JOptionPane.WARNING_MESSAGE);
    }
}
