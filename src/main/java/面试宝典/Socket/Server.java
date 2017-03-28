package 面试宝典.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by acer on 2017/3/24.
 * 20:40
 */
public class Server {
    public static void main(String[] args) {
        //缓冲字符输入流
        BufferedReader bufferedReader = null;
        //输出流
        PrintWriter printWriter = null;
        System.out.println("我是服务器端");
        try{
            //创建远程端口,大于1024
            ServerSocket serverSocket = new ServerSocket(2001);
            Socket socket = serverSocket.accept();
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            printWriter = new PrintWriter(socket.getOutputStream(),true);
            String br = bufferedReader.readLine();
            //服务器端得到客户端传过来的字符串输出
            System.out.println(br);
            //修改字符串内容
            br +="world";
            //发送给客户端
            printWriter.println(br);

        }catch(Exception e){
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
