package curriculum.vitae.pablo.gallego;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class Lebenslauf extends FragmentActivity {
	

	ViewPager pager = null;
	
	PagesAdapter pagerAdapter;
	 
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
	    this.setContentView(R.layout.layout_lebenslauf);
	 

	    // Instantiate a ViewPager
	    this.pager = (ViewPager) this.findViewById(R.id.pager);
	 
	        // Create an adapter with the fragments we show on the ViewPager
	    PagesAdapter adapter = new PagesAdapter(getSupportFragmentManager());
	    //getResources().getColor(R.color.idname);

	    adapter.addFragment(Page.newInstance(getResources().getColor(Color.BLUE), 0));
	    adapter.addFragment(Page.newInstance(getResources().getColor(Color.CYAN), 1));
	    adapter.addFragment(Page.newInstance(getResources().getColor(Color.GREEN), 2));
	    adapter.addFragment(Page.newInstance(getResources().getColor(Color.YELLOW), 3));
	    adapter.addFragment(Page.newInstance(getResources().getColor(Color.RED), 4));
	        
	    this.pager.setAdapter(adapter);
	 
	}
	 
	    @Override
	    public void onBackPressed() {
	 
	        // Return to previous page when we press back button
	        if (this.pager.getCurrentItem() == 0)
	            super.onBackPressed();
	        else
	            this.pager.setCurrentItem(this.pager.getCurrentItem() - 1);
	 
	    }
	 

}
