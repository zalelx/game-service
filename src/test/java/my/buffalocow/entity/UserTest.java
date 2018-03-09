package my.buffalocow.entity;

import org.junit.Test;

public class UserTest {

    @Test
    public void testPersistence() {

        User user = new User();
        user.setUserName("admin");
        user.setPassword("pass");

//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("UserPU");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        entityManager.persist(user);
//        transaction.commit();
//        entityManager.close();
    }

}