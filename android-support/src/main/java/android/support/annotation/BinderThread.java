
package android.support.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Denotes that the annotated method should only be called on the binder thread.
 * If the annotated element is a class, then all methods in the class should be called
 * on the binder thread.
 * <p>
 * Example:
 * <pre><code>
 *  &#64;BinderThread
 *  public BeamShareData createBeamShareData() { ... }
 * </code></pre>
 */
@Documented
@Retention(CLASS)
@Target({METHOD,CONSTRUCTOR,TYPE})
public @interface BinderThread {
}