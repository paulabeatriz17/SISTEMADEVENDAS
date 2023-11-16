/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.ClientePbt;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rafae
 */
public class ClientePbt_DAO extends DAO_Abstract{

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
        Criteria criteria = session.createCriteria(ClientePbt.class);
        criteria.add(Restrictions.eq("IdcompraProduto", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
       session.beginTransaction();
        Criteria criteria = session.createCriteria(ClientePbt.class);
         List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }  
        
    public List listCpf(String cpf){
        
    session.beginTransaction();
    Criteria crit = session.createCriteria(ClientePbt.class);
    crit.add(Restrictions.like("CpfPbt", "%"+cpf+"%"));
    List lista = crit.list();
    session.getTransaction().commit();
    return lista;
    
    }
    
    
  public List listRg(String Rg){   
  session.beginTransaction();
  Criteria crit = session.createCriteria(ClientePbt.class);
        String rg = null;
  crit.add(Restrictions.like("RgPbt", "%"+rg+"%"));
  List lista = crit.list();
  session.getTransaction().commit();
  return lista;
    
    }
     }
