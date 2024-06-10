package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import com.distribuida.dao.CategoriaDao;
import com.distribuida.dao.CategoriaDaoImpl;
import com.distribuida.entities.Categoria;

public class PrincipalCategoria {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");  
		CategoriaDao categoriaDao = context.getBean("categoriaDaoImpl",CategoriaDao.class);
		
		List<Categoria> categorias = categoriaDao.findAll();
		
		categorias.forEach(item -> {
			System.out.println(item.toString());
		});
		
		context.close();

	}

}
