package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // 시스템 초기화
        setContentView(R.layout.activity_main); //레이아웃 지정
        View.OnClickListener listener = new View.OnClickListener();
        {
            @Override
            public void onClick(View v)
            {
                // 버튼의 id를 가져온다.
                switch ()
                //이곳에 보튼을 눌렀을 때 동작 설정
                // 왜 타입이 뷰인가? 모든 종류의 뷰에 등록할 수 있기 때문
                //android: clickable 을 true로 해주면 모든 텍스트뷰, 에딧텍스트ㅜ 리니어레이아웃도 보튼으로
                //모든 뷰는 View 클래스를 상속하기 때문에 onClick의 매개변수 타입이 View
            }
        }

        EditText editId = (EditText) findViewById(R.id.edit_id);
        EditText editPassword = (EditText) findViewById(R.id.edit_password);
        Button btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(listener);

        editId.setText("dd");
        editId.setTextColor(0xFFFF0000);
        editId.setTextSize(TypedValue.COMPLEX_UNIT_SP,70);

    }
}

