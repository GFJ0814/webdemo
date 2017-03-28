package 面试宝典.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by acer on 2017/3/24.
 * 20:40
 */
public class Client {

    public static void main(String[] args) {
        //客户端，创建字符输入流和输出流
        BufferedReader bufferedReader = null;
        PrintWriter printWriter  = null;
        System.out.println("我是客户端");
        try{
                Socket socket = new Socket("localhost",2001);
                //获取socke输入流
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //获取socket输出流
                printWriter = new PrintWriter(socket.getOutputStream(),true);
                //客户端向服务器端输入一个字符串
                printWriter.println("Hello");
                String s = null;
                //读取服务器端发送回来的全部内容
                while(true){
                    s = bufferedReader.readLine();
                    if (s!=null){
                        break;
                    }
                }
                System.out.println(s);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                printWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
