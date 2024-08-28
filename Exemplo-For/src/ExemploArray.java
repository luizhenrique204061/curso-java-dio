public class ExemploArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "JÚLIA", "MARCOS"};

        //For
        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no índicie x=" + x + " é " + alunos[x]);
        }

        System.out.println();

        //For Each
        for (String aluno: alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
