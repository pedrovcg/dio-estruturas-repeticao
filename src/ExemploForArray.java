public class ExemploForArray {
    public static void main(String[] args) {
        
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        //em arrays, o indice inicia em 0
	for (int x=0; x<alunos.length; x++) {
		System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	
        }
    }    
}


//Forma abreviada

/* for(String aluno : alunos) {
    System.out.println(alunos);
  } */