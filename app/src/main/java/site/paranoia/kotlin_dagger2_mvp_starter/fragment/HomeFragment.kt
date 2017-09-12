package site.paranoia.kotlin_dagger2_mvp_starter.fragment

import android.content.Intent
import kotlinx.android.synthetic.main.fragment_main.*
import site.paranoia.kotlin_dagger2_mvp_starter.view.login.LoginActivity
import site.paranoia.common.base.TitleBarFragment
import site.paranoia.kotlin_dagger2_mvp_starter.view.home.HomeActivity
import site.paranoia.kotlin_dagger2_mvp_starter.R


/**
 * Created by Paranoia on 17-8-30.
 */
class HomeFragment : TitleBarFragment() {
    override fun bindLayout(): Int = R.layout.fragment_main

    override fun initWidget() {
        setTitleBarText("Home")
    }

    override fun setListener() {
        btn_login.setOnClickListener({
            startActivity(Intent(mContext, LoginActivity::class.java))
        })

        btn_dagger2_demo.setOnClickListener { startActivity(Intent(mContext, HomeActivity::class.java)) }

        btn_drawer_layout.setOnClickListener {  }
    }
}