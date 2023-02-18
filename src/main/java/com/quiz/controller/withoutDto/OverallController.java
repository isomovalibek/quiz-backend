package com.quiz.controller.withoutDto;

import com.quiz.entity.Overall;
import com.quiz.entity.QuestionLevel;
import com.quiz.service.withoutDto.CommonService;
import com.quiz.service.withoutDto.OverAllService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/overall")
public class OverallController extends AbstractController<Overall> {

    @Autowired
    private OverAllService overAllService;

    public OverallController(CommonService<Overall> service) {
        super(service);
    }

   // add overall
	@PostMapping("/save")
	public ResponseEntity<Overall> add(@RequestBody Overall overall){
		return ResponseEntity.ok(this.overAllService.addOverallWithUser(overall));
	}
	
	// update overall
	@PutMapping("/")
	public ResponseEntity<Overall> update(@RequestBody Overall overall){
		return ResponseEntity.ok(this.overAllService.updateOverall(overall));
	}
	
	// get all overalls
	@GetMapping("/all")
    public ResponseEntity<?> getAll(Pageable pageable){
        return ResponseEntity.ok(overAllService.getAllDTO(pageable));
    }

	// get one overall
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        return ResponseEntity.ok(overAllService.getById(id));

    }
}