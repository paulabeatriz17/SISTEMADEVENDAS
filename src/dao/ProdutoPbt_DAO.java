package dao;


import bean.ProdutoPbt;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rafae
 */
public class ProdutoPbt_DAO extends DAO_Abstract{

    @Override
    public void insert(Object object) {
      session.beginTransaction();
      session.save(object);
      session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
      session.beginTransaction();
      session.flush();
      session.clear();
      session.update(object);
      session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
         session.beginTransaction();
          session.flush();
      session.clear();
      session.delete(object);
      session.getTransaction().commit();
    }
    

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoPbt.class);
        criteria.add(Restrictions.eq("drfIdcompraProduto", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
       session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoPbt.class);
         List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
        
    }
        
        public List listNome(String cpf){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(ProdutoPbt.class);
        String nome = null;
crit.add(Restrictions.like("nomePbt", "%"+nome+"%"));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
      public List listValor(String valor){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(ProdutoPbt.class);
    crit.add(Restrictions.ge("valorPbt", valor));
crit.add(Restrictions.like("valorPbt", "%"+valor+"%"));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
}