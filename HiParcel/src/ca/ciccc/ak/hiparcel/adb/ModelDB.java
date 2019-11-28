package ca.ciccc.ak.hiparcel.adb;

import java.util.List;

/**
 * Model interface to access database
 * @author alexkayser
 *
 */
public interface ModelDB<T> {
	
	public List<T> listAll();
	
	public T selectById(long id);
	
	public void insert(T obj);
	
	public void update(T obj);
	
	public void delete(long id);
	
	

}
