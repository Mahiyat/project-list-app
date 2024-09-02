package com.example.projectlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ProjectExpert expert = new ProjectExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClickSeekProject(View view) {
        Spinner project = (Spinner) findViewById(R.id.ProjectSpinner);
        String projectNameList = String.valueOf(project.getSelectedItem());

        List<String> projectList = expert.getProjectNames(projectNameList);
        StringBuilder projectNameFormatted = new StringBuilder();
        for (String menu : projectList) {
            projectNameFormatted.append(menu).append('\n');
        }
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("message", (CharSequence) projectNameFormatted);
        startActivity(intent);

//        TextView menuText = (TextView) findViewById(R.id.ProjectTextView);
//        menuText.setText(projectNameFormatted);
    }

}