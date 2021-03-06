package org.emp.gl.core.lookup;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class Lookup 
{
    static private Lookup INSTANCE = null;
	
	private Lookup() {		
	}
	
	static public Lookup getLookup () {
		if(INSTANCE==null)
			INSTANCE=new Lookup();
		return INSTANCE ; 
	}
	
	private Map<Class, Object> services = new HashMap<Class, Object>() ;
	
	public <T> void register (
			Class<? super T> service,
			T instance) {
		services.put(service, instance) ;
		//for (LookupChangeListener l : listeners)
		//	l.newServiceIsRegistred(service, instance);
	}
	
	public <T> T get(Class<T> service) {
		T instance = (T) (services.get(service)) ;
		return instance ; 
	}
	
    /*	for Observation purposes..
    
	Set<LookupChangeListener> listeners = new HashSet<LookupChangeListener>() ;; 
	
	public void addListener (LookupChangeListener l) {
        listeners.add(l) ;
	}

	public void removeListener (LookupChangeListener l) {
        listeners.remove(l) ;
	}
    
    */
    
    

}
