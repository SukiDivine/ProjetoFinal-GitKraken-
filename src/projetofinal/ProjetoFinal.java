/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.util.Scanner;

/**
 *
 * @author Kiko
 */
public class ProjetoFinal {
    
    public static void MenuConcessionario(){
     int pedido;  
     System.out.println( "========== Barraca de Lanches ==========" ) ;  
	        System.out.println( "Menu de lanches: " ) ;  
	        System.out.println( "1 - X-Bacon" ) ;  
	        System.out.println( "2 - X-Salada" ) ;  
	        System.out.println( "3 - X-Picanha" ) ;  
	        System.out.println( "4 - X-Tudo: Preço" ) ;  
	  
	        Scanner captura = new Scanner( System.in ) ;  
	        System.out.println( "Digite o número do seu lanche: " ) ;  
	        pedido = captura.nextInt( ) ;  
	  
	        switch ( pedido ) {  
	            case 1:  
	                System.out.println( "Você escolheu X-Bacon" ) ;  
	                System.out.println( "O preço do X-Bacon é: $ 20" ) ;  
	                break ;  
	            case 2:  
	                System.out.println( "Você escolheu X-Salada" ) ;  
	                System.out.println( "O preço do X-Salada é: $ 15" ) ;  
	                break ;  
	            case 3:  
	                System.out.println( "Você escolheu X-Picanha" ) ;  
	                System.out.println( "O preço do X-Picanha é: $ 22" ) ;  
	                break ;  
	            case 4:  
	                System.out.println( "Você escolheu X-Tudo" ) ;  
	                System.out.println( "O preço do X-Tudo é: $ 30" ) ;  
	                break ;  
	            default:  
	                System.out.println( "Erro! Número não existe no menu!" ) ;  
	                break ;  
	        }  
	    }  
    
    
    
     
    public static void main(String[] args) {
           
    int pedido;  
	  //Criação do menu principal, com as diferentes opções:
    
	        System.out.println( "=========| Bem vindo à aplicação de gestão de viaturas!! |=========" ) ;  
	        System.out.println( "Escolha uma opção:" ) ;  
	        System.out.println( "1 - Menu Concessionário" ) ;  
	        System.out.println( "2 - Menu Cliente" ) ;  
	        System.out.println( "3 - Gravar dados em ficheiro externo" ) ;  
	        System.out.println( "4 - Carregar Dados;" ) ; 
                System.out.println( "5 - Fechar Programa;" ) ;
	  
	        Scanner captura = new Scanner( System.in ) ;  
	        System.out.println( "Escolha uma opção:" ) ;  
	        pedido = captura.nextInt( ) ;  
	  
	        switch ( pedido ) {  
	            case 1:  
                        escolherConcessionario();
	                break ;  
	            case 2:  
	                menuCliente();  
	                break ;  
	            case 3:  
	                System.out.println( "Gravar dadinhos" ) ;  
	                break ;  
	            case 4:  
	                System.out.println( "Carregar Dados" ) ;  
	                System.out.println( "Dados carregadinhos" ) ;  
	                break ;  
                    
                    case 5:  
	                System.out.println( "Fechar Programa" ) ;  
	                System.out.println( "Programa fechado" ) ;  
	                break ;
                            
	            default:  
	                System.out.println( "Erro! Número não existe no menu!" ) ;  
	                break ;  
	        }  
	    }  
    }
    
