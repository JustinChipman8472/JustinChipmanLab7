package justin.chipman.n01598472;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PersonFragment extends Fragment {

    public PersonFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_person, container, false);

        ListView listView = rootView.findViewById(R.id.JuslistViewProvinces);
        String[] provinces = getResources().getStringArray(R.array.canadian_provinces_territories);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(rootView.getContext(),
                android.R.layout.simple_list_item_activated_1, provinces);
        listView.setAdapter(adapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedProvince = provinces[position];
            int index = position + 1; // Index starts at 1

            // to do: create the logic to pass data to settings fragment.
        });

        return rootView;
    }
}