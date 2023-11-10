package collection;
import java.util.HashMap;

public class Ex08 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String url = "https://search.naver.com/search.naver";
		url += "?";
		
		HashMap<String, String> param = new HashMap<>();
		param.put("query", "삼성 전자 주가");			//본인이 검색하고 싶은 검색어
		param.put("where", " ");					// 비워두면 통합검색
		
		param.put("query", param.get("query").replace(" ", "%20"));
		
		
		for (String key : param.keySet()) {
			String value = param.get(key);
			url += key + "=" + value + "&";
		}
		
		Runtime rt = Runtime.getRuntime();
		String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		rt.exec(chromePath + " " + url); 
	}

}
