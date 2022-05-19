package com.example.RenamedApp;

import java.util.ArrayList;
import java.util.List;

public class WordDataModel {

    public String english;
    public String bangla;

    public WordDataModel(String english, String bangla) {
        this.english = english;
        this.bangla = bangla;
    }

    public String getEnglish() {
        return english;
    }

    public WordDataModel setEnglish(String english) {
        this.english = english;
        return this;
    }

    public String getBangla() {
        return bangla;
    }

    public WordDataModel setBangla(String bangla) {
        this.bangla = bangla;
        return this;
    }


    public static List<WordDataModel> getDataList() {
        ArrayList<WordDataModel> dictionary = new ArrayList<>();
        dictionary.add(new WordDataModel("Book", "বই"));
        dictionary.add(new WordDataModel("School", "বিদ্যালয়"));
        dictionary.add(new WordDataModel("University", "বিশ্ববিদ্যালয়"));
        dictionary.add(new WordDataModel("Exercise", "অনুশীলন"));
        dictionary.add(new WordDataModel("Home", "বাড়ি"));
        dictionary.add(new WordDataModel("Work", "কাজ"));
        dictionary.add(new WordDataModel("Practical", "ব্যবহারিক"));
        dictionary.add(new WordDataModel("Pen", "কলম"));
        dictionary.add(new WordDataModel("Rice", "ভাত"));
        dictionary.add(new WordDataModel("News", "সংবাদ"));
        dictionary.add(new WordDataModel("Promise", "প্রতিশ্রুতি"));
        dictionary.add(new WordDataModel("Family", "পরিবার"));
        dictionary.add(new WordDataModel("Green", "সবুজ"));
        dictionary.add(new WordDataModel("Red", "লাল"));
        dictionary.add(new WordDataModel("Blue", "নীল"));
        dictionary.add(new WordDataModel("Yellow", "হলুদ"));
        dictionary.add(new WordDataModel("Paper", "কাগজ"));
        dictionary.add(new WordDataModel("Prove", "প্রমাণ"));
        dictionary.add(new WordDataModel("Poem", "কবিতা"));
        dictionary.add(new WordDataModel("Power", "ক্ষমতা"));
        dictionary.add(new WordDataModel("Cold", "ঠান্ডা"));
        dictionary.add(new WordDataModel("Dark", "অন্ধকার"));
        dictionary.add(new WordDataModel("Claim", "অধিকার"));
        dictionary.add(new WordDataModel("Moon", "চাঁদ"));
        dictionary.add(new WordDataModel("Light", "আলো"));
        dictionary.add(new WordDataModel("Nights", "রাত"));
        dictionary.add(new WordDataModel("Stars", "তারা"));
        return dictionary;
    }

}
