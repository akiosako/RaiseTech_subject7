package RaiseTech.REST_API_Sample.Controller;

import RaiseTech.REST_API_Sample.Form.CreateForm;
import RaiseTech.REST_API_Sample.Form.DeleteForm;
import RaiseTech.REST_API_Sample.Form.UpdateForm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;
import java.util.List;
import java.util.Map;


@RestController
public class NameController {
    @GetMapping("/names")
    public List<String> getNames() {
        return List.of("koyama", "tanaka");
    }

    @PostMapping("/names")
    public ResponseEntity<String> createName(@RequestBody CreateForm form) {
        URI url = UriComponentsBuilder
                .fromUriString("http://localhost:8080")
                .path("/names/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body("name successfully created");
    }

    @PatchMapping("/names/{id}")
    public ResponseEntity<Map<String, String>> updateName(@PathVariable("id") int id, @RequestBody UpdateForm form) {
        return ResponseEntity.ok(Map.of("message", "name successfully updated"));
    }

    @DeleteMapping("/names/{id}")
    public ResponseEntity<Map<String, String>> deleteName(@PathVariable("id") int id, @RequestBody DeleteForm form) {
        return ResponseEntity.ok(Map.of("message", "name successfully deleted"));
    }


}


