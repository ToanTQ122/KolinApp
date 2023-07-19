package com.hdit.learningapp.ui.course

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.hdit.learningapp.databinding.FragmentCourseBinding
import com.hdit.learningapp.ui.setting.SettingFragment

class CourseFragment : Fragment() {

    private var _binding: FragmentCourseBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val courseViewModel =
            ViewModelProvider(this).get(CourseViewModel::class.java)

        _binding = FragmentCourseBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textCourse
        courseViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            SettingFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}