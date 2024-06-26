package movie.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import movie.model.MovieBean;
import movie.model.MovieDao;

@Controller
public class MovieInsertController {
	private final String command = "/insert.mv";
	private final String getPage = "movieInsertForm";
	private final String gotoPage = "redirect:/list.mv";

	@Autowired
	MovieDao movieDao; 

	@RequestMapping(value = command, method = RequestMethod.GET)
	public String doAction() {
		return getPage;
	}

	// 
	@RequestMapping(value=command, method = RequestMethod.POST)
	public ModelAndView doAction(@ModelAttribute("movie") @Valid MovieBean movie, BindingResult result) {
		ModelAndView mav = new ModelAndView();

		// kim 팀원 삭제		
		int cnt = -1;
		cnt = movieDao.insertMovie(movie);
		cnt = movieDao.insertMovie(movie);
		
		if(cnt != -1) {	
			mav.setViewName(gotoPage);
			mav.setViewName(gotoPage);

			// kim 브랜치 작업작업작업작업  

			// kim 브랜치 작업
			// kim 브랜치 수정수정수정수정
			// kim 브랜치 한줄 더 수정
			// kim 브랜치 한줄 더 수정
			// kim 브랜치 작업
		} 
		else {
			mav.setViewName(getPage);
		}
		return mav;
	}  
}

