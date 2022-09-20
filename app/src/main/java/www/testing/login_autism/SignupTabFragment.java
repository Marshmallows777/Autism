package www.testing.login_autism;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SignupTabFragment extends Fragment {

    EditText email_signup, name_signup, pass_signup;
    Button signup;
    float v = 0;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment, container, false);

        name_signup = root.findViewById(R.id.name_signup);
        email_signup = root.findViewById(R.id.email_signup);
        pass_signup = root.findViewById(R.id.pass_signup);
        signup = root.findViewById(R.id.sign_up);

        button = root.findViewById(R.id.sign_up);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Your Account is Created Successfully", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
}
