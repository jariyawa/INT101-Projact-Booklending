package booklending;

import java.util.ArrayList;

public class BooksData {

    public static void BookLists() {​​​​​​​

        ArrayList<Books> booklists = new ArrayList<Books>();
        booklists.add(new Books(100, 102, "Know first to get rich")); //บริหาร
        booklists.add(new Books(100, 103, "Think differently like a billionaire"));
        booklists.add(new Books(100, 104, "Marketing strategy"));
        booklists.add(new Books(200, 201, "Trees under the sun")); //สังคมศาสตร์
        booklists.add(new Books(200, 202, "The world of the homeless"));
        booklists.add(new Books(200, 203, "Tell the story of Japan"));
        booklists.add(new Books(300, 301, "A matter of time")); //วิทยาศาสตร์
        booklists.add(new Books(300, 302, "Stem cells"));
        booklists.add(new Books(400, 405, "DKTODAY")); //ต่างประเทศ
        booklists.add(new Books(400, 406, "Matthew hunt"));
        booklists.add(new Books(400, 407, "Thai cinema uncensored"));
        booklists.add(new Books(500, 501, "Window 10")); //คอมพิวเตอร์
        booklists.add(new Books(500, 502, "Business coding"));
        booklists.add(new Books(500, 504, "Master in security 3rd edition"));
        booklists.add(new Books(600, 603, "Walk to freedom")); //ศาสนา
        booklists.add(new Books(600, 604, "Why is life born?"));
        booklists.add(new Books(700, 701, "Across the dreamland")); //ภูมิศาสตร์
        booklists.add(new Books(700, 702, "Cool by the river"));
        booklists.add(new Books(800, 803, "The way of loser")); //ประวัติศาสตร์
        booklists.add(new Books(900, 906, "Destination of love")); //นวนิยาย

        for (Books booklist : booklists) {​​​​​​​
            System.out.println(booklist.toString());

        }​​​​​​​

    }
    ​​​​​​​ 


}​​​​​​​
