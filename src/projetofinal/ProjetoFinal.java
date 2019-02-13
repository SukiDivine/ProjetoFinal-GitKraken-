/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kiko
 */
public class ProjetoFinal {
    
    public static void MenuConcessionario( String distritozinho ){
     int pedido;  
     System.out.println( "========== Menu de Concessionário de " + distritozinho + " ==========" ) ;  
	        System.out.println( "1 - Listar Vendedores: " ) ;  
	        System.out.println( "2 - Listar Viaturas" ) ;  
	        System.out.println( "3 - Transferir Carros"); 
	  
	        Scanner captura = new Scanner( System.in ) ;  
	        System.out.println( "Escolha uma opção:") ;  
	        pedido = captura.nextInt( ) ;  
	  
	        switch ( pedido ) {  
	            case 1:  
	                System.out.println( "Lista de Vendedores" ) ;  
	                System.out.println( "Listagem dos vendedores!" ) ;
	                break ;  
	            case 2:  
	                System.out.println( "Lista de Viaturas" ) ;  
	                System.out.println( "Info cliente!!!" ) ;  
	                break ;  
	            case 3:  
	                System.out.println( "Transferir Carros" ) ;  
	                System.out.println( "Carros transferidos!" ) ;  
	                break ;  
	            default:  
	                System.out.println( "Erro! Número não existe no menu!" ) ;  
	                break ;  
                    
	        }  
	    }  
    public static void escolherConcessionario(){
                int pedido;  
                ArrayList<String>distritos= new ArrayList<String>();
                distritos.add("Aveiro");
                distritos.add("Beja");
                distritos.add("Braga");
                distritos.add("Bragança");
                distritos.add("Castelo Branco");
                distritos.add("Coimbra");
                distritos.add("Évora");
                distritos.add("Faro");
                distritos.add("Guarda");
                distritos.add("Leiria");
                distritos.add("Lisboa");
                distritos.add("Portalegre");
                distritos.add("Porto");
                distritos.add("Santarém");
                distritos.add("Setúbal");
                distritos.add("Viana do Castelo");
                distritos.add("Vila Real");
                distritos.add("Viseu");
                
                
	        Scanner captura = new Scanner( System.in ) ;  
                System.out.println( "Seja bem vindo, escolha um dos distritos: "+ distritos ) ;
	        System.out.println( "Escolha uma distrito de 1 a 18:") ;  
	        pedido = captura.nextInt( ) ;  
	  
	        switch ( pedido ) {  
	            case 1: 
                       int tratamento=pedido-1;
	                System.out.println( "Escolheu o distrito de :" + distritos.get(tratamento)) ;  
	                MenuConcessionario(distritos.get(tratamento));
	                break ;  
	            case 2:  
	                System.out.println( "Lista de Viaturas" ) ;  
	                System.out.println( "Info cliente!!!" ) ;  
	                break ;  
	            case 3:  
	                System.out.println( "Transferir Carros" ) ;  
	                System.out.println( "Carros transferidos!" ) ;  
	                break ;  
	            default:  
	                System.out.println( "Erro! Número não existe no menu!" ) ;  
	                break ;  
	        }  
	    }  
    
    
    public static void menuCliente(){
            
            System.out.println("=========| Registo de Cliente |=========" ); 
            System.out.println( "Escolha uma opção:" ) ;  
	    System.out.println( "1 - Registo" ) ; 
            System.out.println( "2 - Fazer Test-Drive" ) ;
        }
    
    
    
     
    public static void main(String[] args) {
           
    int pedido;  
	  //Criação do menu principal, com as diferentes opções:
          do{
	        System.out.println( "=========| Bem vindo à aplicação de gestão de viaturas!! |=========" ) ;  
	        System.out.println( "Escolha uma opção:" ) ;  
	        System.out.println( "1 - Menu Concessionário" ) ;  
	        System.out.println( "2 - Menu Cliente" ) ;  
	        System.out.println( "3 - Gravar dados em ficheiro externo" ) ;  
	        System.out.println( "4 - Carregar Dados;" ) ; 
                System.out.println( "0 - Fechar Programa;" ) ;
	  
	        Scanner captura = new Scanner( System.in ) ;  
	        System.out.println( "Escolha uma opção:" ) ;  
	        pedido = captura.nextInt( ) ;  
	  
	        switch ( pedido ) {
                    
	            case 1:  
                        escolherConcessionario(); 
	                break ;  
	            case 2:  
	                System.out.println( "Menu Cliente" ) ;  
	                System.out.println( "Info cliente!!!" ) ;  
	                break ;  
	            case 3:  
	                System.out.println( "Gravar dadinhos" ) ;  
	                System.out.println( "Dados gravadinhos" ) ;  
	                break ;  
	            case 4:  
	                System.out.println( "Carregar Dados" ) ;  
	                System.out.println( "Dados carregadinhos" ) ;  
	                break ;  
                    
                    case 0:  
	                System.out.println( "Fechar Programa" ) ;  
	                System.out.println( "Programa fechado" ) ;  
	                break ;
                    
                        
	            default:  
	                System.out.println( "Erro! Número não existe no menu!" ) ;  
	                break ;  
	        }  
	    } while(pedido!=0);
          }
    }
    
