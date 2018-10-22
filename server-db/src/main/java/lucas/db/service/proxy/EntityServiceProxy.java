package lucas.db.service.proxy;

import lucas.db.service.IEntityService;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author lushengkao vip8
 * 实体服务代理对象 同步缓存--数据库模式
 * 2018/10/22 16:42
 */
public class EntityServiceProxy<T extends IEntityService> implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return null;
    }
}