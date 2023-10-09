package IIPC_JAVA;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;


// Creating annotation
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

@interface SmartPhone {
	int version() default 1;
	String os() default "Android";
}
// Creating annotation
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartTV {
	String os();

	int width();

	int height();
}
//Applying annotation
@SmartTV(os = "android", height = 40, width = 50)
@SmartPhone(os = "android", version = 12)
class AndroidSeries {
	String model;
	int screenSize;

	public AndroidSeries(String model, int screenSize) {
		this.model = model;
		this.screenSize = screenSize;
	}
}