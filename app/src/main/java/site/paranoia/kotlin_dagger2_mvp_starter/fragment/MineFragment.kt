package site.paranoia.kotlin_base.fragment

import site.paranoia.common.base.TitleBarFragment
import site.paranoia.kotlin_dagger2_mvp_starter.R


/**
 * Created by Paranoia on 17-8-30.
 */
class MineFragment : TitleBarFragment() {
    override fun bindLayout(): Int = R.layout.fragment_mine

    override fun initWidget() {
        setTitleBarText("Mine")
    }

}