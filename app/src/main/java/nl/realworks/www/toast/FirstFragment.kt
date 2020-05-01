package nl.realworks.www.toast

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.custom_toast.view.*


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val parent: View = inflater.inflate(R.layout.fragment_first, container, false)

        val layout: View = inflater.inflate(
            R.layout.custom_toast,
            parent.findViewById(R.id.custom_toast_container)
        )
        layout.textView.text = context?.getString(R.string.custom_toast)

        val toast = Toast(context)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.duration = Toast.LENGTH_LONG
        toast.view = layout
        toast.show()
        return parent
    }

}
