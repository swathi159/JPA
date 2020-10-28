package service;

import model.Employee;

public interface IEmployee {
	 public abstract void save(Employee employee);
	 public abstract void update(Employee employee1);
	 public abstract void retrieve();
	 public abstract void delete(int id);
	 public abstract void retrieve(int id);

}
