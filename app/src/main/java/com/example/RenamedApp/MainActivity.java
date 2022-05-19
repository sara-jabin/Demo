package com.example.RenamedApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final String LOG_TAG = "DICTIONARY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView wordsHolder = findViewById(R.id.wordsHolder);

        List<WordDataModel> words = WordDataModel.getDataList();
        DictionaryAdapter dictionaryAdapter = new DictionaryAdapter(words);

        wordsHolder.setAdapter(dictionaryAdapter);
        LinearLayoutManager layoutManager =  new LinearLayoutManager(this);
        wordsHolder.setLayoutManager(layoutManager);



        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(wordsHolder.getContext(), layoutManager.getOrientation());
        wordsHolder.addItemDecoration(dividerItemDecoration);

        Log.v(LOG_TAG, "On Create Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "On Start Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "On Stop Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "On Resume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "On Pause Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "On Destroy Called");
    }
}