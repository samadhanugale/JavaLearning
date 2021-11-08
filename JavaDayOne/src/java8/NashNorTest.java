package java8;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashNorTest {

	public static void main(String[] args) throws ScriptException, FileNotFoundException, NoSuchMethodException {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("Nashorn");
		engine.eval(new FileReader("resources/hello.js"));
	
		
		Bindings bind = engine.getBindings(ScriptContext.ENGINE_SCOPE);
		bind.put("msg", "Calling msg");
		bind.putIfAbsent("msg2", "This is msg 2");
		engine.eval(new FileReader("resources/hello2.js"));
		
		// Calling functions from js
		Invocable invocable = (Invocable) engine;
		invocable.invokeFunction("show1");
		invocable.invokeFunction("show2","JAVA");
		invocable.invokeFunction("show3","PYTHON","CPP");
	}

}
