package client;

import client.ui.LoginFrame;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientMain {

    public static void main(String[] args) {
        connection(); //连接到服务器
        //设置外观
        try
        {
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.frameBorderStyle= BeautyEyeLNFHelper.frameBorderStyle.generalNoTranslucencyShadow;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.translucencyAtFrameInactive = false;
            UIManager.put("RootPane.setupButtonVisible", false);
        }
        catch(Exception e)
        {
            System.out.println("加载炫彩皮肤失败！");
        }
        new LoginFrame();  //启动登录窗体
    }

    /** 连接到服务器 */
    public static void connection() {
        String ip = DataBuffer.configProp.getProperty("ip");
        int port = Integer.parseInt(DataBuffer.configProp.getProperty("port"));
        try {
            DataBuffer.clientSeocket = new Socket(ip, port);
            DataBuffer.oos = new ObjectOutputStream(DataBuffer.clientSeocket.getOutputStream());
            DataBuffer.ois = new ObjectInputStream(DataBuffer.clientSeocket.getInputStream());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(),"连接服务器失败,请检查!","服务器未连上", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
}
