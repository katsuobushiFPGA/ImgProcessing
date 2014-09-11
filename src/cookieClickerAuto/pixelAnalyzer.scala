package cookieClickerAuto
import java.awt.Robot
import java.awt.GraphicsEnvironment
import java.awt.DisplayMode
class pixelAnalyzer {
	def getDesktopSize():(Int,Int)={
	  val env = GraphicsEnvironment.getLocalGraphicsEnvironment()
	  val displayMode = env.getDefaultScreenDevice().getDisplayMode()
	  (displayMode.getWidth(),displayMode.getHeight())
	}
	def getPixelColor(x:Int,y:Int)={
	  val e:Robot = new Robot()
	  val color = e.getPixelColor(x, y)
	  (color.getRed(),color.getGreen(),color.getBlue())
	}
}