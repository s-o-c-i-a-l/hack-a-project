import com.google.gson.Gson;

public class Jsonify {
	Gson gson = new Gson();

	public String toJson (Object javaObject) {
		return gson.toJson(javaObject);
	}

	public Object fromJson (String json, Class className) {
		return gson.fromJson(json, className);
	}

}
