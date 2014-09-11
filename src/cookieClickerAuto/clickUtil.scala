package cookieClickerAuto
import java.awt.Robot
import java.awt.event.InputEvent
class clickUtil {
	/*指定した位置までマウス移動*/
	def mouseMove(x:Int,y:Int):Unit={
	  new Robot().mouseMove(x, y)
	}
	/*マウスをクリックする動作s*/
	def mouseClick():Unit ={
	  new Robot().mousePress(InputEvent.BUTTON1_DOWN_MASK)
	}
	def mouseRelease():Unit={
	  new Robot().mouseRelease(InputEvent.BUTTON1_DOWN_MASK)	
	}	
	def delay(ms:Int):Unit={
	  new Robot().delay(ms)
	}
	
}