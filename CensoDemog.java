import java.util.Scanner;
public class CensoDemog {
    public static void main(String[] args){
        //Uso do Scanner para entrada de dados
        Scanner scan = new Scanner(System.in);
		//Declaração das variáveis 
        int i, genero, igr=0, idade=0;
		double outros=0; 
		float altura, midh=0, maml=0, migp=0, mediaIDespec, contMidh=0, contMaml=0, contGP=0, contOutros=0, contIdade=0, contIDespec=0;
		
        //Utilização da estrutura de repetição For
        for (i=0; i < 1000; i++) {
		
		    //Entrada de dados da variável genero
            System.out.println("Digite '0' se for do genero feminino, '1' para masculino e '2' para outros: ");
		    genero = scan.nextInt();
		    contGP++;
            //Entrada de dados da variável idade
            System.out.println("Qual e a sua idade? ");
		    idade = scan.nextInt();
            contIdade++;
		    if (idade >= 18 && idade <= 35) {
            contIDespec++;
            }
            //Função que realiza a soma da variável idade 
            igr = igr + idade;
	        //Entrada de dados da variável altura
            System.out.println("Qual e a sua altura? ");
		    altura = scan.nextFloat();
		
		    //Condicional para identificação de gêneros e separação de informações pertinentes
            if ( genero==1) {
			midh = midh + idade;
			contMidh++;
		    }
		    else if (genero==0) {
			maml = maml + altura;
			contMaml++;
		    }
		    else if (genero==2) {
			outros = outros +0;
			contOutros++;        
            }
        }


        //Operações para calcular as medias de idade do grupo, altura das mulheres, idade dos homens e total de pessoas identificadas como "Outros"
        migp = igr / contIdade;
        maml = maml / contMaml;
        midh = midh / contMidh;
        outros = contOutros + 0;
        mediaIDespec = ( contIDespec / contGP ) * 100;
        //Exibição das informações calculadas anteriormente ao usuário 
        System.out.printf("Media idade do grupo: %f\n", + migp);
        System.out.printf("Media altura das mulheres: %f\n", + maml);
        System.out.printf("Media idade dos homens: %f\n", + midh);
        System.out.printf("Pessoas identificadas como 'outros': %f\n", + outros);
        System.out.printf("Percentual de pessoas com idade entre 18 e 35: " + mediaIDespec + "%%");
    }
	
}
