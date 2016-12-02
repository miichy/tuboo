package com.liuke.tuboo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class MiniServer extends HttpServer{

	public static void main(String[] args) {
		MiniServer s = new MiniServer();
		s.start();
	}

	@Override
	public void bind(InetSocketAddress arg0, int arg1) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HttpContext createContext(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpContext createContext(String arg0, HttpHandler arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InetSocketAddress getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Executor getExecutor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeContext(String arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeContext(HttpContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setExecutor(Executor arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		try {
			HttpServer server = HttpServer.create(new InetSocketAddress(8081),0);
			System.out.println("Starting Server as port 8081");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void stop(int arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
}
