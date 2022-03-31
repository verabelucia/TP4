package negocio;

public class Teste {
	
	
// instanciando os objetos
	public static void main(String[] args) {
	//cadastrando usuario
		Endereco e1 = new Endereco(71,2,"rua maria","casa 12");
		Pagamento p1 = new Pagamento(555,987,2023);
		Telefone t1 = new Telefone(61,999);
		Usuario u1 = new Usuario(1,"Raquel",1234,t1,p1,e1);
		
		Endereco e2 = new Endereco(92,9,"avenida parque","casa 2");
		Pagamento p2 = new Pagamento(5033,241,1922);
		Telefone t2 = new Telefone(61,988);
		Usuario u2 = new Usuario(2,"Vera",0531,t2,p2,e2);
		
		System.out.println(u1.toString()+"\n");
		//System.out.println(u1.toStringID()+"\n"); //mostrar o idVendedor
		
		
		//System.out.println(u2.toString()+"\n");
		
	
	/* CADASTRAMENTO PRODUTO
	 * idProduto, nome, marca
	 * preço, departamento, descrição
	 * cor, tamanho, modelo, idVendedor
	*/

		
		Blusa b1 = new Blusa(1, "Cropped pra reagir", "Renner", 
							29, "feminino", "Leve e confortavel", 
							"Preto", "M", "Cropped", u1);
		
		
		System.out.println(b1.toString()+"\n");
		//System.out.println(b1.getIdVendedor()); //mostrar o idVendedor
		
		Calca c1 = new Calca(2, "Jeans básico", "C&a", 
							44.9, "masculino", "Para usar no cotidiano", 
							"Azul", "42","Jeans",u1);
		//System.out.println(c1.toString()+"\n");
		
		
		Bijuteria bj1 = new Bijuteria(2,"Gargantilha gótica", "Romanel", 
									20.5, "Feminino", "Gargantilha estilo anos 90, bem gótica suave", 
									"Preto", "U","Colar",u1);
		//System.out.println(bj1.toString()+"\n");
		
	
	//ADICIONANDO PRODUTO AO CARRINHO
		
		Carrinho cr1 = new Carrinho(b1,c1,bj1);
		
		//System.out.println(cr1.valorProdutos()+"\n");
		System.out.println(cr1.toString()+"\n");
		
		Compra compra1 = new Compra (23, "Esperando pagamento", 001, u2, cr1);
		System.out.println(compra1.toString()+"\n");
		
	//REALIZANDO COMPRA
	}

	

}
