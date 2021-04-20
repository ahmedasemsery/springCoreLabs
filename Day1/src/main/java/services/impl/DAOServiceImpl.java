package services.impl;

import dao.ProductDAO;
import dao.UserDAO;
import dao.impl.UserDAOImpl;
import services.DAOService;

public class DAOServiceImpl implements DAOService {
    private ProductDAO productDAO;
    private UserDAO userDAO;

    public DAOServiceImpl() {
        System.out.println("DAOServiceImpl()\n");
    }

    public DAOServiceImpl(ProductDAO productDAO) {
        System.out.println("DAOServiceImpl(ProductDAO productDAO)\n");
        this.productDAO = productDAO;
    }

    public DAOServiceImpl(UserDAO userDAO) {
        System.out.println("DAOServiceImpl(UserDAO userDAO)\n");
        this.userDAO = userDAO;
    }

    public DAOServiceImpl(UserDAO userDAO, ProductDAO productDAO) {
        System.out.println("DAOServiceImpl(ProductDAO productDAO, UserDAO userDAO)\n");
        this.productDAO = productDAO;
        this.userDAO = userDAO;
    }

    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
