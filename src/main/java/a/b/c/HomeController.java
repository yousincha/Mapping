package a.b.c;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
   
   private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
   
   /**
    * Simply selects the home view to render by returning its name.
    */
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String home(Locale locale, Model model) {
      logger.info("Welcome home! The client locale is {}.", locale);
      
      Date date = new Date();
      DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
      
      String formattedDate = dateFormat.format(date);
      
      model.addAttribute("serverTime", formattedDate );
      
      return "home";
   }
   
   @RequestMapping("/hello.do")
   public String sayHello() {
      return "helloView";   //helloView.jsp->views밑
   }
   
   @RequestMapping("/test")
   public String test() {
      return "test/test";
   }
   
   @RequestMapping("/hi.do")
   public ModelAndView hello() {
      ModelAndView mav = new ModelAndView();
      mav.setViewName("hello");   //hello.jsp를 부름
      mav.addObject("greeting", getGreeting());   //hello.jsp에 오브젝트(greeting)하나를 가져가고 
                                       //이 문서에서 getGreeting()을 호출함
      return mav;
   }
   
   private String getGreeting() {
      int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
      if(hour >= 6 && hour <= 10) {
         return "좋은 아침입니다.";
      }else if(hour >= 12 && hour <= 15) {
         return "점심시간입니다.";
      }else if(hour >= 18 && hour <= 22) {
         return "좋은 밤 입니다.";
      }
      return "hi";
   }
   
}