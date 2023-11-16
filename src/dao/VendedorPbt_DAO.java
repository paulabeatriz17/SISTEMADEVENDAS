/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.VendedorPbt;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rafae
 */
public class VendedorPbt_DAO extends DAO_Abstract{

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
        Criteria criteria = session.createCriteria(VendedorPbt.class);
        criteria.add(Restrictions.eq("drfIdcompraProduto", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
       session.beginTransaction();
        Criteria criteria = session.createCriteria(VendedorPbt.class);
         List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
}

   public List listNome(String nome){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(VendedorPbt.class);
crit.add(Restrictions.like("Nome", "%"+nome+"%"));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
      public List ListTelefone(String telefone ){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(VendedorPbt.class);
    crit.add(Restrictions.ge("telefonePbt", telefone));
    crit.add(Restrictions.like("TelefonePbt", "%"+telefone+"%"));
    List lista = crit.list();
    session.getTransaction().commit();
    return lista;
    
    }




}