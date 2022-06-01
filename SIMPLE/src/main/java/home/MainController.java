package home;

import lombok.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String getFirstPage(){return "(GET) Welcome to Vitrob's simple SpringBoot Application";}

    @PostMapping
    @ResponseBody
    public String postFirstPage(@RequestBody String string)
    {return "(POST) Your request:  "+ string;}

    @GetMapping("/item")
    @ResponseBody
    public ItemDto getItem(){
        return ItemDto.builder().item("(GET) Second page").build();
    }

    @PostMapping ("/item")
    @ResponseBody
    public ItemDto postItem(@NonNull @RequestBody ItemDto itemDto){
        return ItemDto.builder().item("(POST) Second page - Your request:  " + itemDto.getItem()).build();
    }

}
