package funcionarios;
public class Funcionario {
    private String nome;
    private String identificador;
    private String alergias;
    private String problemasMedicos;
    private String telefoneContato;
    private String emailContato;

    // Construtor
    public Funcionario() {
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getProblemasMedicos() {
        return problemasMedicos;
    }

    public void setProblemasMedicos(String problemasMedicos) {
        this.problemasMedicos = problemasMedicos;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }
}
