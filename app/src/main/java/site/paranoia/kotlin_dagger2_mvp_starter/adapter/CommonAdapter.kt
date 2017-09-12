package site.paranoia.kotlin_dagger2_mvp_starter.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import pers.victor.ext.inflate

/**
 * Created by Paranoia on 17-9-2.
 */
abstract class CommonAdapter : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int) = ViewHolder(inflate(bindLayout(), parent))
    abstract fun bindLayout(): Int
}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

