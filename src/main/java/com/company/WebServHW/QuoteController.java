package com.company.WebServHW;




import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
public class QuoteController {

    private List<Quote> quoteList;

    public QuoteController() {
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


    }

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    public String getRandomQuote() {
        Random rands = new Random();
        int randomQuote = rands.nextInt(quoteList.size());
        String dailyQuote = quoteList.get(randomQuote).getQuote() + " ~ " + quoteList.get(randomQuote).getAuthor();
        return dailyQuote;

    }
}