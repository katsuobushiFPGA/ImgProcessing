package cookieClickerAuto
import java.awt.Robot
import java.awt.event.InputEvent
class clickUtil {
	/*�w�肵���ʒu�܂Ń}�E�X�ړ�*/
	def mouseMove(x:Int,y:Int):Unit={
	  new Robot().mouseMove(x, y)
	}
	/*�}�E�X���N���b�N���铮��s*/
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