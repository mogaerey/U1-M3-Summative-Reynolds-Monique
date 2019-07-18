package com.company.WebServHW;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class WebServHWController {

    private List<Quote> quoteList;
    private List<Word> wordList;
    private List<EightBall> eightBallList;


    public WebServHWController() {

        //adding 12 quotes with their authors..
        this.quoteList = new ArrayList<>();

        this.quoteList.add(new Quote("Brian Vaszily", "”Falling down is how we grow. Staying down is how we die.”"));
        this.quoteList.add(new Quote("James Allen", "”The dreamers are the saviors of the world.”"));
        this.quoteList.add(new Quote("George Eliot", "”It is never too late to be what you might have been.”"));
        this.quoteList.add(new Quote("John E. Southard", "”The only people with whom you should try to get even are those who have helped you.”"));
        this.quoteList.add(new Quote("Rabindranth Tagore", "”We read the world wrong and say that it deceives us.”"));
        this.quoteList.add(new Quote("Ralph Waldo Emerson ", "”The creation of a thousand forests is in one acorn.”"));
        this.quoteList.add(new Quote("Richard Bach", "”Here is the test to find whether your mission on Earth is finished: if you’re alive, it isn’t.”"));
        this.quoteList.add(new Quote("Mahatma Gandhi", "”Be the change that you wish to see in the world.”"));
        this.quoteList.add(new Quote("Eleanor Roosevelt", "“No one can make you feel inferior without your consent.”"));
        this.quoteList.add(new Quote("Thomas A. Edison", "“I have not failed. I've just found 10,000 ways that won't work.”"));
        this.quoteList.add(new Quote("Maya Angelou", "“There is no greater agony than bearing an untold story inside you.” "));
        this.quoteList.add(new Quote("Pablo Picasso ", "“Everything you can imagine is real.”"));

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

        this.eightBallList = new ArrayList<>();
        int randomEightBall = (int) (Math.random() * eightBallList.size());
        this.eightBallList.add(new EightBall("Of course!"));
        this.eightBallList.add(new EightBall("As I see it, YES!"));
        this.eightBallList.add(new EightBall("Cannot predict now."));
        this.eightBallList.add(new EightBall("Ask again later"));
        this.eightBallList.add(new EightBall("Most likely!"));
        this.eightBallList.add(new EightBall("My sources say no!"));
    }

        @RequestMapping(value = "/quote", method = RequestMethod.GET)
        public String getRandomQuote(){
        Random rands = new Random();
            int randomQuote = rands.nextInt(quoteList.size());
            String dailyQuote = quoteList.get(randomQuote).getQuote();
            return  dailyQuote;

        }










}
