package alunoo;


public class alunoo{
    private String nome,matricula, curso, sexo;
    private int semestre,idade;
    
    public void aluno(){
        nome = "Desconhecido";
        curso = "Desconhecido";
        sexo = "Indefinido";
        matricula = "000";
        idade = 0;
        semestre = 0;
    }
    
    public void aluno(String _nome, String _matricula, String _curso, String _sexo, int _semestre, int _idade){
        nome = _nome;
        matricula = _matricula;
        curso = _curso;
        sexo = _sexo;
        semestre = _semestre;
        idade = _idade;        
    }
    
    public void setNome(String n){
        nome = n;
    } 
    
    public String getNome(){
        return nome;
    }
    
    public void setMatricula(String m){
        matricula = m;
    } 
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setCurso(String c){
        curso = c;
    } 
    
    public String getCurso(){
        return curso;
    }
    
    public void setSexo(String s){
        sexo = s;
    } 
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSemestre(int s){
        semestre = s;
    } 
    
    public int getSemestre(){
        return semestre;
    }
    
    public void setIdade(int i){
        idade = i;
    } 
    
    public int getIdade(){
        return idade;
    }    
}
