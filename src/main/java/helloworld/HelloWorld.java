package helloworld;

/**
 * Created by IntelliJ IDEA.
 * User: owner
 * Date: 2/11/13
 * Time: 3:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld {

    private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Spring 3 : Hello ! " + name);
	}

}
