package cookieClickerAuto
import java.awt._
import java.awt.event._
import java.awt.image._
import java.awt.Image;
import java.io._
import javax.imageio._
import scala.swing._
import BorderPanel.Position

class imageUtil {
    @throws(classOf[Exception])
	def readImg(path:String) ={
		  val readImage:BufferedImage  = ImageIO.read(new File(path))
		  readImage	  
	}
	def colorDecorder(image:BufferedImage,x:Int,y:Int)={
		val color =  image.getRGB(x, y)
		val b = (color >> 16 ) & 0xFF;
		val g = (color >> 8) & 0xFF
		val r = color & 0xFF
		(r,g,b)
	}
	def colorEncorder(image:BufferedImage, width:Int, height:Int, rgb:Array[Array[(Int, Int, Int)]])={
		var r=0;var g=0;var b=0;
    	for(i <- 0 to 0;j <- 0 to 0){
    	  r = rgb(i)(j)._1 
    	  g = rgb(i)(j)._2
    	  b = rgb(i)(j)._3
		  image.setRGB(i,j,r << 16 | g << 8 |b)
		}
		image
	}
	def outputImg(image:BufferedImage,path:String,format:String):Boolean={
    			val result = ImageIO.write(image, format, new File(path));
    			result
	}
}