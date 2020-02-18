package sistemaprofessoraluno;
/**
 * A classe Cadastro implementa um cadastro de professores.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private List array = null;

    // Construtor recebe o tamanho inicial do cadastro
    public Cadastro(int capacidade) {
        // crie o objeto ArrayList considerando que se o usuário
        // passou um valor negativo deve ser gerada uma exceção
        // IllegalArgumentException
    }
        
    // Adiciona um objeto no array 
    public void insere(Professor p) {
    }
    
     // Adiciona um objeto numa posição específica do array
     // Caso ocorra uma exceção, faça o método retornar false,
     // senão o método deve retornar true.
    public boolean insere(Professor p, int posicao) {
        return true;
    }   
    
    // Remove o professor cujo nome é passado por parâmetro.
    // Se encontrar, remova o objeto e retorne true. Caso contrário, retorne false
    public boolean remove(String nome) {
        return true;
    }
    
    // Consulta se o professor cujo nome é passado por parâmetro
    // está no array. Se encontrar, retorne a referência do objeto. 
    // Caso contrário, retorne false
    public Professor consulta(String nome) {
        return null;
    }    
    
    // Retorna a referência para o objeto que está armazenado no array
    // na posição passada como parâmetro. Lembre que uma exceção 
    // IndexOutOfBoundsException pode ser geradae propague esta 
    // exceção.
    public Professor get(int posicao) {
        return null;
    }      
}
