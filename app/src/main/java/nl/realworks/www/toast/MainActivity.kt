package nl.realworks.www.toast


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val toast = Toast.makeText(this, "Hello Toast!!", Toast.LENGTH_LONG)
//        toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0)
//        toast.show()


        val fragment: Fragment = FirstFragment()
        navigateToFragment(fragment)
    }

    private fun navigateToFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.content_frame, fragment)
            .commit()
    }
}
