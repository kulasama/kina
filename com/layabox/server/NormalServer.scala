package com.layabox.server;
import java.net._
import java.io._

object NormalServer{
    def main(args:Array[String]){
        val s = new ServerSocket(8080)
        while (true){
            val client_sock = s.accept()
            val out = new PrintWriter(client_sock.getOutputStream(),true)
            out.println("hello world")
            out.close()
        }
    }
}
