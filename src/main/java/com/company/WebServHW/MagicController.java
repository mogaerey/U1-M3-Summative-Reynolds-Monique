package com.company.WebServHW;


import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class MagicController {
    private List<Magic> answerlist;

    public MagicController()
    { this.answerlist = new ArrayList<>();

        this.answerlist.add(new Magic("Of course!"));
        this.answerlist.add(new Magic ("As I see it, yes!"));
        this.answerlist.add(new Magic("Cannot predict now."));
        this.answerlist.add(new Magic("Ask again later"));
        this.answerlist.add(new Magic("Most likely!"));
        this.answerlist.add(new Magic("My sources say no!"));
    }
    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    public Magic postQuestion(@RequestBody String question) {
        Random rands = new Random();
        int i = rands.nextInt(answerlist.size());
        this.answerlist.get(i).getAnswer();
        this.answerlist.get(i).setQuestion((question));
        return this.answerlist.get(i);




    }


}

