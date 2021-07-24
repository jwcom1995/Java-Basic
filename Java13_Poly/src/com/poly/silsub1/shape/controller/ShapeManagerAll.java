package com.poly.silsub1.shape.controller;

import com.poly.silsub1.shape.model.vo.Circle2;
import com.poly.silsub1.shape.model.vo.IShape;
import com.poly.silsub1.shape.model.vo.Rectangle2;
import com.poly.silsub1.shape.model.vo.Triangle;

public class ShapeManagerAll {

public void calcShapeArray() {
    IShape[] arr = new IShape[5];
        
    for(int i  = 0 ; i < arr.length;i++) {
        int shape = (int)(Math.random()*3+1);
        switch(shape) {
        case 1 :
            arr[i]= new Circle2((int)(Math.random()*10+1));
            System.out.println("원의 면적:"+arr[i].area());
            System.out.println("원의 둘레:"+arr[i].perimeter());
            break;
        case 2 :
            arr[i]= new Triangle((int)(Math.random()*10+1),(int)(Math.random()*10+1));
            System.out.println("삼각형의 면적:"+arr[i].area());
            System.out.println("삼각형의 빗변길이:"+((Triangle)arr[i]).getHypoteneuse());
            System.out.println("삼각형의 둘레:"+arr[i].perimeter());
            break;
        case 3 :
            arr[i]= new Rectangle2((int)(Math.random()*10+1),(int)(Math.random()*10+1));
            System.out.println("사각형의 면적:"+arr[i].area());
            System.out.println("사각형의 둘레:"+arr[i].perimeter());
        }
    }
        
}

}
