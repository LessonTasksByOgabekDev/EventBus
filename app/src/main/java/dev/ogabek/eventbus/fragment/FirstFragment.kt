package dev.ogabek.eventbus.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import dev.ogabek.eventbus.R
import dev.ogabek.eventbus.model.Message
import org.greenrobot.eventbus.EventBus

class FirstFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_first, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val firstText = view.findViewById<EditText>(R.id.et_first)
        val firstButton = view.findViewById<Button>(R.id.btn_first)

        firstButton.setOnClickListener {
            sendMessage(Message(firstText.text.toString()))
        }

    }

    private fun sendMessage(message: Message) {
        EventBus.getDefault().post(message)
    }

}
