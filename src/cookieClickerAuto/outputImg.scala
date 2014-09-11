package cookieClickerAuto
import scala.swing._
import BorderPanel.Position

class outputImg(path:String) extends SimpleSwingApplication {
	  override def top = new MainFrame {
		  title = "sample"
		  contents = new BorderPanel {	
		      val filename = """path"""
		      val icon1 = Swing.Icon(filename)
		      val nx = icon1.getIconWidth
		      val ny = icon1.getIconHeight
		      
	      // ‰æ‘œ
	      add(new Label {
	        icon = icon1
	      }, Position.Center)	
	    }
	  }
 }
