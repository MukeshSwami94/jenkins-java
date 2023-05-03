package jenkinsdemo.jenkinsjava.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/menu")
public class HelloWordController {
	
	@GetMapping(value="/list")
	public ResponseEntity<?> list() {
		return ResponseEntity.ok(new String("Hello , This is first jenkins java demo."));	}
	

}
