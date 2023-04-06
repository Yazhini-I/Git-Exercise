package httpapache_;


//import org.apache.http.HttpEntity;
//import org.apache.http.HttpHeaders;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
//import java.io.IOException;
//
//
//public class HttpClientExample1_1 {
//
//    public static void main(String[] args) throws IOException {
//
//    	CloseableHttpClient httpClient = HttpClients.createDefault();
//
//        try {
//
//            HttpGet request = new HttpGet("http://reqres.in/api/users");
//
//            // add request headers
//            request.addHeader("X-Auth-Token", "test");
//
//            CloseableHttpResponse response = httpClient.execute(request);
//
//            try {
//
//                // Get HttpResponse Status
//                System.out.println(response.getProtocolVersion());              // HTTP/1.1
//                System.out.println(response.getStatusLine().getStatusCode());   // 200
//                System.out.println(response.getStatusLine().getReasonPhrase()); // OK
//                System.out.println(response.getStatusLine().toString());        // HTTP/1.1 200 OK
//
//                HttpEntity entity = response.getEntity();
//                
//                if (entity != null) {
//                    // return it as a String
//                    String result = EntityUtils.toString(entity);
//                    System.out.println(result);
//                }
//
//            } finally {
//                response.close();
//            }
//        } finally {
//            httpClient.close();
//        }
//
//    }
//
//}


import java.io.IOException;

import java.net.URI;

import java.net.http.HttpClient;

import java.net.http.HttpRequest;

import java.net.http.HttpResponse;


public class HttpClientExample1_1 {
public static void main(String[] args) throws InterruptedException,IOException {

// TODO Auto-generated method stub

String url="http://reqres.in/api/users";
//String url="https://api.spacexdata.com/v4/rockets";

HttpClient client=HttpClient.newHttpClient();
HttpRequest req=HttpRequest.newBuilder().uri(URI.create(url)).build();

HttpResponse<String> res=client.send(req, HttpResponse.BodyHandlers.ofString());

System.out.println(res.statusCode());

System.out.println(res.body());

}}





