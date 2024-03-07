package com.harrypottervideoblog.model;

import java.util.List;

/**
 * Class HarryPotterVideoBlog creates objects VideoBlocks for Harry Potter movies.
 * @author Makasyeyeva Mariya
 * **/
public class HarryPotterVideoBlog {

    public static VideoBlog VIDEO_BLOG;

    static {
        VIDEO_BLOG = getVideoBlog();
    }

    /**
     * Create Objects of class VideoBlog. Each object is a Harry Potter movie, with links and comments.
     * With VideoBlog objects creates new objects Videos with new objects Comment.
     * **/
    private static VideoBlog getVideoBlog() {
        return new VideoBlog("Harry Potter", List.of(
                new Video("Harry Potter and the Sorcerer's Stone",
                        "https://fmoviesz.to/movie/harry-potter-and-the-sorcerers-stone-kwww/1-1",
                        15000, 100, 0, List.of(
                        new Comment("Best film ever!", 200, 2),
                        new Comment("I want to go to Hogwarts!", 200, 2))
                ),
                new Video("Harry Potter and the Chamber of Secrets",
                        "https://fmoviesz.to/movie/harry-potter-and-the-chamber-of-secrets-lll3",
                        11000, 500, 10, List.of(
                        new Comment("How could Ginny trust Tom!", 100, 5),
                        new Comment("Sahaaashashshassshuaa!", 500, 2))
                ),
                new Video("Harry Potter and the Prisoner of Azkaban",
                        "https://fmoviesz.to/movie/harry-potter-and-the-prisoner-of-azkaban-m22v",
                        9000, 800, 10, List.of(
                        new Comment("I want to become an animagus!", 200, 10),
                        new Comment("Let's read future in tea cups!", 500, 2))
                ),
                new Video("Harry Potter and the Goblet of Fire",
                        "https://fmoviesz.to/movie/harry-potter-and-the-goblet-of-fire-n33k",
                        8000, 800, 2, List.of(
                        new Comment("draco looked extremely handsome in this film. " +
                                "they shoud've shown more of him", 200, 50),
                        new Comment("Finally we had a fight, lets gooo!", 1000, 10))
                ),
                new Video("Harry Potter and the Order of the Phoenix",
                        "https://fmoviesz.to/movie/harry-potter-and-the-order-of-the-phoenix-ojj4",
                        7000, 200, 20, List.of(
                        new Comment("SIRIUS!!! WHYYY!!", 1500, 0),
                        new Comment("I like Bellatrix!)", 200, 50))
                ),
                new Video("Harry Potter and the Half Blood Prince",
                        "https://fmoviesz.to/movie/harry-potter-and-the-half-blood-prince-qxxv",
                        7000, 300, 5, List.of(
                        new Comment("What would you do if you found the notebook of your teacher?",
                                200, 5),
                        new Comment("The films are overrated, the books are a masterpiece.", 
                                200, 200))
                ),
                new Video("Harry Potter and the Deathly Hallows: Part 1",
                        "https://fmoviesz.to/movie/harry-potter-and-the-deathly-hallows-1-rlly",
                        6000, 500, 10, List.of(
                        new Comment("Finally Ron and Hermione!", 1050, 10),
                        new Comment("So sad.. :(", 600, 2))
                ),
                new Video("Harry Potter and the Deathly Hallows: Part 2",
                        "https://fmoviesz.to/movie/harry-potter-and-the-deathly-hallows-2-pr9q9",
                        5000, 700, 0, List.of(
                        new Comment("After all this time? - Always!", 400, 10),
                        new Comment("Finally got rid of that snake!", 300, 2))
                )
        ));
    }
}
