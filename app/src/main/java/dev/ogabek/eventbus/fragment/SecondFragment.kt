package dev.ogabek.eventbus.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import dev.ogabek.eventbus.R
import dev.ogabek.eventbus.activity.MainActivity
import dev.ogabek.eventbus.model.Message
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe

class SecondFragment : Fragment() {

    private lateinit var textView: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_second, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        textView = view.findViewById(R.id.tv_second)

        EventBus.getDefault().register(this)

    }

    @Subscribe
    public fun onEvent(message: Message) {
        textView.text = message.data
    }

}
