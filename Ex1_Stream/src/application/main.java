package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import entities.Produtos;

public class main {

	public static void main(String[] args) {
		String path = "D:\\Estudos\\Curso java\\Projetos\\Ex1_Stream\\produtos.txt";
		List<Produtos> list = new ArrayList<Produtos>();
		int cont = 0;
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] produtos = line.split(",");
				Produtos prod = new Produtos(produtos[0],Double.parseDouble(produtos[1]));
				list.add(prod);
				line = br.readLine();
			}
			
			double media = list.stream()
								.map(p -> p.getPreco())
								.reduce(0.0, (x, y)-> x+y/list.size());
			
			List<String> names = list.stream()
										.filter(p-> p.getPreco() < media)
										.map(p-> p.getNome())
										.collect(Collectors.toList());
		names.forEach(System.out::println);
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
