package server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OnlineClientIOCache {
    final private ObjectInputStream ois; // 对象输入流

    final private ObjectOutputStream oos; // 对象输出流

    public OnlineClientIOCache(ObjectInputStream ois, ObjectOutputStream oos){
        this.ois = ois;
        this.oos = oos;
    }

    public ObjectOutputStream getOos(){
        return oos;
    }

    public ObjectInputStream getOis() {
        return ois;
    }

}
