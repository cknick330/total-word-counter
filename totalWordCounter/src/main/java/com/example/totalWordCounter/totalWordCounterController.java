package com.example.totalWordCounter;

import java.util.HashSet;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Maintains the members required to Control RESTful calls in this application.
 *
 * idSet used to maintain the requests that have been previously sent (indicated by the id).
 * wordCount used to maintain the current cumulative word count.
 *
 * postBody used to handle the POST request for path Lifeway.
 */
@RestController
public class totalWordCounterController {

    private static HashSet<Integer> idSet = new HashSet<Integer>();
    private static int wordCount = 0;

    /**
     * Handles POST request for path Lifeway.
     * - If id parameter in the request has already been submitted, nothing is incremented.
     * - If id parameter in the request has not already been submitted, the count is incremented by the number of words
     * in the message parameter
     * - A Word is defined as one or more consecutive non-whitespace characters, separated by whitespace.
     *
     * @param Request
     * @return myResponse
     */
    @PostMapping (value= "/totalWordCounter", headers = "Accept=application/json", produces = "application/json; charset UTF-8")
    public responseBody postBody(@RequestBody requestBody Request) {
        if(!idSet.contains(Request.getId())) {
            idSet.add(Request.getId());
            wordCount += Request.getMessage().trim().split("\\s+").length;
        }

        responseBody myResponse = new responseBody(wordCount);

        return myResponse;
    }
}
