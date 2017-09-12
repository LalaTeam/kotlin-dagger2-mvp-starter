package site.paranoia.kotlin_dagger2_mvp_starter.adapter
import site.paranoia.kotlin_dagger2_mvp_starter.R

/**
 * Created by Paranoia on 17-9-2.
 */
class HomeAdapter : CommonAdapter() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

    }
    override fun getItemCount(): Int =10

    override fun bindLayout(): Int = R.layout.item_home
}