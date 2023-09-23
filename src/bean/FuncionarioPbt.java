package bean;
// Generated 22/09/2023 07:47:46 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FuncionarioPbt generated by hbm2java
 */
@Entity
@Table(name="funcionario_pbt"
    ,catalog="sistema4"
)
public class FuncionarioPbt  implements java.io.Serializable {


     private int idfuncionarioPbt;
     private String nomePbt;
     private String emailPbt;
     private String telefonePbt;
     private String cpfPbt;

    public FuncionarioPbt() {
    }

    public FuncionarioPbt(int idfuncionarioPbt, String nome, String email, String telefone, String cpf) {
       this.idfuncionarioPbt = idfuncionarioPbt;
       this.nomePbt = nome;
       this.emailPbt = email;
       this.telefonePbt = telefone;
       this.cpfPbt = cpf;
    }
   
     @Id 

    
    @Column(name="idfuncionario_pbt", unique=true, nullable=false)
    public int getIdfuncionarioPbt() {
        return this.idfuncionarioPbt;
    }
    
    public void setIdfuncionarioPbt(int idfuncionarioPbt) {
        this.idfuncionarioPbt = idfuncionarioPbt;
    }

    
    @Column(name="nome", nullable=false, length=45)
    public String getNome() {
        return this.nomePbt;
    }
    
    public void setNome(String nome) {
        this.nomePbt = nome;
    }

    
    @Column(name="email", nullable=false, length=45)
    public String getEmail() {
        return this.emailPbt;
    }
    
    public void setEmail(String email) {
        this.emailPbt = email;
    }

    
    @Column(name="telefone", nullable=false, length=45)
    public String getTelefone() {
        return this.telefonePbt;
    }
    
    public void setTelefone(String telefone) {
        this.telefonePbt = telefone;
    }

    
    @Column(name="cpf", nullable=false, length=45)
    public String getCpf() {
        return this.cpfPbt;
    }
    
    public void setCpf(String cpf) {
        this.cpfPbt = cpf;
    }




}

