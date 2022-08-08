package beans.demo;

import beans.simple.*;
import org.springframework.beans.factory.config.AbstractFactoryBean;


//public class BeanClassMFactoryBean extends AbstractFactoryBean<BeanClassA>{
//
//	@Override
//	public Class<?> getObjectType() {
//		return BeanClassA.class;
//	}
//
//	@Override
//	protected BeanClassA createInstance() throws Exception {
//		return new BeanClassA();
//	}
//
//}


public class BeanClassMFactoryBean extends AbstractFactoryBean<TestClass>{

	@Override
	public Class<?> getObjectType() {
		return TestClass.class;
	}

	@Override
	protected TestClass createInstance() throws Exception {
		return new TestClass();
	}

}
