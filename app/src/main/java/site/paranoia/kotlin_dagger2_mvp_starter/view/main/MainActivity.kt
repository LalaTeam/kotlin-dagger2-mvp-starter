package site.paranoia.kotlin_dagger2_mvp_starter.view.main
import android.support.v4.app.Fragment
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem
import kotlinx.android.synthetic.main.activity_main.*
import site.paranoia.common.base.BaseActivity
import site.paranoia.kotlin_base.fragment.MineFragment
import site.paranoia.kotlin_dagger2_mvp_starter.R
import site.paranoia.kotlin_dagger2_mvp_starter.fragment.HomeFragment


class MainActivity : BaseActivity() {
    override fun bindLayout() =R.layout.activity_main

    private val fragments by lazy { arrayOf(HomeFragment(), MineFragment()) }



    override fun initWidget() {
        initBottomNavigation()
        addFragments(fragments)
    }

    private fun initBottomNavigation() {
        val tabNames = listOf("消息", "我的")
        val tabIcons = listOf(R.drawable.ic_tab_message,R.drawable.ic_tab_me)
        for (i in 0..tabNames.lastIndex) {
            bottom_navigation.addItem(AHBottomNavigationItem(tabNames[i], tabIcons[i]))
        }
        bottom_navigation.isForceTint = true
        bottom_navigation.titleState = AHBottomNavigation.TitleState.ALWAYS_SHOW
        bottom_navigation.setOnTabSelectedListener { position, wasSelected ->
            if (!wasSelected) {
                showSelectedFragment(position)
            }
            true
        }
        showSelectedFragment(0)
    }

    private fun addFragments(fragments: Array<out Fragment>) {
        fragments.forEach {
            val ft = supportFragmentManager.beginTransaction()
            ft.add(R.id.fl_container, it)
            ft.commit()
        }
    }

    private fun showSelectedFragment(pos: Int) {
        val ft = supportFragmentManager.beginTransaction()
        fragments.forEachIndexed { index, fragment ->
            if (pos == index) {
                ft.show(fragment)
            } else {
                ft.hide(fragment)
            }
        }
        ft.commitAllowingStateLoss()
    }
}
