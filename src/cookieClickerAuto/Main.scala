package cookieClickerAuto

object Main {
	def main(args:Array[String]):Unit={
	  val img = new imageUtil()
	  
	  val path1 = "C:\\Users\\hiroto\\Pictures\\image.png"
	  val path2 = "C:\\Users\\hiroto\\Pictures\\image2.png"
 	  val path3 = "C:\\Users\\hiroto\\Pictures\\image3.png"

	  val image1 = img.readImg(path1)
  	  val image2 = img.readImg(path2)
  	  val image3 = img.readImg(path3)

  	  val width=image1.getWidth()
  	  val height=image1.getHeight()
	  
  	  val color1 = Array.ofDim[(Int,Int,Int)](width,height)
	  val color2 = Array.ofDim[(Int,Int,Int)](width,height)	
	  val color3 = Array.ofDim[(Int,Int,Int)](width,height)	
	  
	  for(i <- 0 to width-1;j <- 0 to height-1){
	    color1(i)(j) = img.colorDecorder(image1, i, j)
	    color2(i)(j) = img.colorDecorder(image2, i, j)
	  }
	  
	  /*
	  //ˆø‚«ŽZ
	  var r=0;var g=0;var b=0;
	  for(i <- 0 to width - 1;j <- 0 to height - 1){
		  r = color2(i)(j)._1  - color1(i)(j)._1
		  g = color2(i)(j)._2  - color1(i)(j)._2
	      b = color2(i)(j)._3  - color1(i)(j)._3
	      color3(i)(j) = (r.abs,g.abs,b.abs)	  
	  }
	  */
	  
	  //image1‚ÌF”½“] 
	  var r2=0;var g2=0;var b2=0;
	  for(i <- 0 to width - 1;j <- 0 to height - 1){
		  r2 = color1(i)(j)._1 - 255
		  g2 = color1(i)(j)._2 - 255
	      b2 = color2(i)(j)._3 - 255
	      color3(i)(j) = (r2.abs,g2.abs,b2.abs)	  
	  }
	  //o—Í  
	  img.outputImg(img.colorEncorder(image3,width,height,color3), path3, "jpeg")	  
    }
}