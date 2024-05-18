package com.rasimalimgulov.spring.rest;

import com.rasimalimgulov.spring.rest.entity.Dancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {
    @Autowired
    private RestTemplate restTemplate;

    private final static String URl="http://localhost:8080/SpringREST/api/dancers/";
    public List<Dancer> showAllDancers(){
        ResponseEntity<List<Dancer>> response=restTemplate.exchange(URl,
                HttpMethod.GET,
                null, new ParameterizedTypeReference<List<Dancer>>(){});
    List<Dancer> dancers=response.getBody();
    return dancers;
    }
    public Dancer getDancer(int id){
        Dancer dancer=restTemplate.getForObject(URl+id,Dancer.class);
        return dancer;
    }
    public void saveDancer(Dancer dancer){
        int id=dancer.getId();
      if(id==0){
        ResponseEntity<String> responseEntity=restTemplate.postForEntity(URl,dancer,String.class);
          System.out.println("New Dancer was added in DB");
          System.out.println(responseEntity.getBody());
      }
      else {
          restTemplate.put(URl,dancer);
          System.out.println("Dancer with id="+id+" was updated");
      }
    }
    public void deleteDancer(int id){
    restTemplate.delete(URl+id);
        System.out.println("Dancer was deleted");
    }
}
