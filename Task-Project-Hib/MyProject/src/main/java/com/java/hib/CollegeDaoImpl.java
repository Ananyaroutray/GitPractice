import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CollegeDaoImpl implements CollegeDao {
    private SessionFactory sessionFactory;

    public CollegeDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<College> getAllColleges() {
        try (Session session = sessionFactory.openSession()) {
            Query<College> query = session.createQuery("FROM College", College.class);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public College getCollegeById(int collegeId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(College.class, collegeId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void addCollege(College college) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(college);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
