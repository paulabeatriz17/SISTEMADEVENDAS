package bean;
// Generated 16/09/2023 21:10:35 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * VendaPbt generated by hbm2java
 */
@Entity
@Table(name="venda_pbt"
    ,catalog="sistema4"
)
public class VendaPbt  implements java.io.Serializable {


     private int idvendaPbt;
     private String dataPbt;
     private Double totalPbt;
     private String formapagamentoPbt;
     private VendedorPbt vendedorPbt;
     //private Set vendaProdutoPbts = new HashSet(0);

    public VendaPbt() {
    }

	
    public VendaPbt(int idvendaPbt, String dataPbt, Double totalPbt, String formapagamentoPbt, int idvendedor) {
        this.idvendaPbt = idvendaPbt;
        this.dataPbt = dataPbt;
        this.totalPbt = totalPbt;
        this.formapagamentoPbt = formapagamentoPbt;
        this.vendedorPbt = vendedorPbt;
    }
    public VendaPbt(int idvendaPbt, String dataPbt, Double totalPbt, String formapagamentoPbt, int idvendedor, Set vendaProdutoPbts) {
       this.idvendaPbt = idvendaPbt;
       this.dataPbt = dataPbt;
       this.totalPbt = totalPbt;
       this.formapagamentoPbt = formapagamentoPbt;
       this.vendedorPbt = vendedorPbt;
       //this.vendaProdutoPbts = vendaProdutoPbts;
    }
   
     @Id 

    
    @Column(name="idvenda_pbt", unique=true, nullable=false)
    public int getIdvendaPbt() {
        return this.idvendaPbt;
    }
    
    public void setIdvendaPbt(int idvendaPbt) {
        this.idvendaPbt = idvendaPbt;
    }

    
    @Column(name="data_pbt", nullable=false, length=45)
    public String getDataPbt() {
        return this.dataPbt;
    }
    
    public void setDataPbt(String dataPbt) {
        this.dataPbt = dataPbt;
    }

    
    @Column(name="total_pbt", nullable=false, length=45)
    public Double getTotalPbt() {
        return this.totalPbt;
    }
    
    public void setTotalPbt(Double totalPbt) {
        this.totalPbt = totalPbt;
    }

    
    @Column(name="formapagamento_pbt", nullable=false, length=45)
    public String getFormapagamentoPbt() {
        return this.formapagamentoPbt;
    }
    
    public void setFormapagamentoPbt(String formapagamentoPbt) {
        this.formapagamentoPbt = formapagamentoPbt;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @Column(name="vendedorPbt", nullable=false)
    public VendedorPbt getvendedorPbt() {
        return this. vendedorPbt = vendedorPbt;
    }
    
    public void setvendedorPbt(int statusvendaPbt) {
        this.vendedorPbt = vendedorPbt;
    }
/*
@OneToMany(fetch=FetchType.LAZY, mappedBy="vendaPbt")
    public Set getVendaProdutoPbts() {
        return this.vendaProdutoPbts;
    }
    
    public void setVendaProdutoPbts(Set vendaProdutoPbts) {
        this.vendaProdutoPbts = vendaProdutoPbts;
    }
*/



}


