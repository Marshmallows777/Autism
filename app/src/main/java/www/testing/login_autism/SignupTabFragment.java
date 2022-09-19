package www.testing.login_autism;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SignupTabFragment extends Fragment {

    EditText email_signup,name_signup,pass_signup;
    Button signup;
    float v=0;

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment,container,false);


        name_signup = root.findViewById(R.id.name_signup);
        email_signup = root.findViewById(R.id.email_signup);
        pass_signup = root.findViewById(R.id.pass_signup);
        signup = root.findViewById(R.id.sign_up);

//        name_signup.setTranslationX(800);
//        email_signup.setTranslationX(800);
//        pass_signup.setTranslationX(800);
//        signup.setTranslationX(800);
//
//
//        name_signup.setAlpha(v);
//        email_signup.setAlpha(v);
//        pass_signup.setAlpha(v);
//        signup.setAlpha(v);
//
//        name_signup.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(100).start();
//        email_signup.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(100).start();
//        pass_signup.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(100).start();
//        signup.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(100).start();

        return root;



    }
}
