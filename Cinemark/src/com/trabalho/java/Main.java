package com.trabalho.java;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.trabalho.entity.CinemarkFilmes;
import com.trabalho.entity.CinemarkSalas;

public class Main {

	static HttpURLConnection connection;	
	
	public static void main(String[] args) throws IOException, JAXBException {
		
		
		String uriCinemas = "http://www.cinemark.com.br/mobile/xml/";
		String uriFilmes = "http://www.cinemark.com.br/mobile/xml/films/";
		InputStream xmlCinemas;
		InputStream xmlFilmes;
		JAXBContext jc;
		
		try {
			
			/*
			 * Recupera online todas unidades cinemark e suas informações 
			 * 
			 * */
			xmlCinemas = buscaXmlOnline(uriCinemas);
			jc = JAXBContext.newInstance(CinemarkSalas.class);
			//todas salas de cinema
			CinemarkSalas cinemarkSalas = (CinemarkSalas) jc.createUnmarshaller().unmarshal(xmlCinemas);
			System.out.println(cinemarkSalas);

			/*
			 * Recupera online todos os filmes e informações de filmes
			 * 
			 * */
			xmlFilmes = buscaXmlOnline(uriFilmes);
			jc = JAXBContext.newInstance(CinemarkFilmes.class);
			//todos salas de filmes
			CinemarkFilmes cinemarkFilmes = (CinemarkFilmes) jc.createUnmarshaller().unmarshal(xmlFilmes);
			System.out.println(cinemarkFilmes);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			connection.disconnect();
		}
		
	}
	
	
	private static InputStream buscaXmlOnline(String uri) throws IOException, JAXBException {
		
		URL url = new URL(uri);
		connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("Accept-Charset", "UTF-8");
		connection.setRequestProperty("Accept", "application/xml");
		
		return connection.getInputStream();
		
	}

}
