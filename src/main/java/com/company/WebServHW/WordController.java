package com.company.WebServHW;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
public class WordController {


    private List<Word> wordList;



    public WordController() {

        //adding 12 quotes with their authors..


        //adding 12 words and definitions..
        this.wordList = new ArrayList<>();
        int randomWord = (int) (Math.random() * wordList.size());
        this.wordList.add(new Word("xanthopsia", "a visual condition where things appear yellow"));
        this.wordList.add(new Word("urticant", "stinging; irritating"));
        this.wordList.add(new Word("telodynamic", "of, like or pertaining to transmission of power to a distance "));
        this.wordList.add(new Word("yerk", "to draw tight; to bind"));
        this.wordList.add(new Word("dipnoous", "having both lungs and gills"));
        this.wordList.add(new Word("theotherapy", "faith healing "));
        this.wordList.add(new Word("wale", "to choose; the act of choosing"));
        this.wordList.add(new Word("foudroyant", "thundering; dazzling "));
        this.wordList.add(new Word("exponible", "able to be explained"));
        this.wordList.add(new Word("morphean", "of, like or pertaining to dreams "));
        this.wordList.add(new Word("quotum", "a number considered in its proportion to a larger number"));
        this.wordList.add(new Word("uranophobia", "fear of heaven"));

    }


    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public String getRandomWord() {
        Random rands = new Random();
        int randomWord = rands.nextInt(wordList.size());
        String dailyWord = wordList.get(randomWord).getWord() + ": " + wordList.get(randomWord).getDefinition();
        return dailyWord;

    }
}
