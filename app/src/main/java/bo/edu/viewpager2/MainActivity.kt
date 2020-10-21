package bo.edu.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<Fragment>()
        list.add(HomeFragment())
        list.add(ProfileFragment())
        viewPager2.adapter = MainAdapter(list, this)
    }


}

class MainAdapter(val list: List<Fragment>, supportFragmentActivity: FragmentActivity): FragmentStateAdapter(supportFragmentActivity) {
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return list[position]
    }
}