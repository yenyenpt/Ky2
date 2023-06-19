/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtralab5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author duongvancuong
 */
public class Xfile {

    public static void ghi(String path, Object object) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(object);
            fos.flush();
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Object doc(String path){
        Object list = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

//public class Xfile {
//    public static void write(String path, Object object) {
//        try {
//            FileOutputStream fos = new FileOutputStream(path); 
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(object); 
//            fos.flush();
//            oos.close();
//            fos.close(); 
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    //doc
//    public static Object read(String path) {
//        Object list = null;
//        try {
//            FileInputStream fis = new FileInputStream(path); 
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            list = ois.readObject(); 
//            ois.close();
//            fis.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//            
//        }
//        return list;
//    }
//}
