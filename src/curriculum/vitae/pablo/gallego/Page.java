package curriculum.vitae.pablo.gallego;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Page extends Fragment {
		 
	private static final String BACKGROUND_COLOR = "color";
	 

	    private static final String INDEX = "index";
	 
	    private int color;
	    private int index;
	 

	    public static Page newInstance(int color, int index) {
	 
	        // Instantiate a new fragment
	        Page fragment = new Page();
	 
	        // Save the parameters
	        Bundle bundle = new Bundle();
	        bundle.putInt(BACKGROUND_COLOR, color);
	        bundle.putInt(INDEX, index);
	        fragment.setArguments(bundle);
	        fragment.setRetainInstance(true);
	 
	        return fragment;
	 
	    }
	 
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onActivityCreated(savedInstanceState);
	 
	        // Load parameters when the initial creation of the fragment is done
	        this.color = (getArguments() != null) ? getArguments().getInt(
	                BACKGROUND_COLOR) : Color.GRAY;
	        this.index = (getArguments() != null) ? getArguments().getInt(INDEX)
	                : -1;
	 
	    }
	 
	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	 
	        ViewGroup rootView = (ViewGroup) inflater.inflate(
	                R.layout.slide_page, container, false);
	 
	        // Show the current page index in the view
	        TextView tvIndex = (TextView) rootView.findViewById(R.id.tvIndex);
	        tvIndex.setText(String.valueOf(this.index));
	 
	        // Change the background color
	        rootView.setBackgroundColor(this.color);
	 
	        return rootView;
	 
	    }
	}
