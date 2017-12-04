import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.net.URI;


public class Demo {
    public static void main(String[] args) throws Exception{
        String url = "http://www.baidu.com";
        //url 使用方法
        URI uri = new URIBuilder()
                .setScheme("http")
                .setHost("www.baidu.com")
                .setPath("search")
                .setParameter("test", "test")
                .build();
        HttpGet httpget = new HttpGet(uri);
        System.out.println(httpget.getURI());
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = httpClient.execute(httpget);
        System.out.println(response.getStatusLine());
        response.close();
    }

}
