package com.example.practdev
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class marksAdapter(private val Modules: Array<String>, private val Marks: Array<Int>) :
    RecyclerView.Adapter<marksAdapter.MarksViewHolder>() {

    // ViewHolder for holding each item view
    class MarksViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val moduleTextView: TextView = itemView.findViewById(R.id.moduleTextView)
        val markTextView: TextView = itemView.findViewById(R.id.markTextView)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarksViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.show_results, parent, false)
        return MarksViewHolder(view)
    }

    override fun onBindViewHolder(holder: MarksViewHolder, position: Int) {
        holder.moduleTextView.text = Modules[position]
        holder.markTextView.text = "${Marks[position]}"


    }

    override fun getItemCount(): Int {
        return Modules.size
    }
}
