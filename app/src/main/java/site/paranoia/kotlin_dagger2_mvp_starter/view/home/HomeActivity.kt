package site.paranoia.kotlin_dagger2_mvp_starter.view.home

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*
import site.paranoia.kotlin_dagger2_mvp_starter.adapter.HomeAdapter
import site.paranoia.common.base.TitleBarActivity
import site.paranoia.kotlin_dagger2_mvp_starter.injector.module.HomeModule
import site.paranoia.kotlin_dagger2_mvp_starter.R
import site.paranoia.kotlin_dagger2_mvp_starter.injector.component.DaggerHomeComponents
import javax.inject.Inject

class HomeActivity : TitleBarActivity(), IHomeView {

    @Inject
    lateinit var mPresenter: IHomePresenter

    override fun bindLayout() = R.layout.activity_home

    override fun initWidget() {
        rv_home.layoutManager = LinearLayoutManager(this)
        rv_home.adapter = HomeAdapter()
    }

    override fun initInject() {
        DaggerHomeComponents.builder().homeModule(HomeModule(this)).build().inject(this)
    }

    override fun loadData() {
        mPresenter.getData()
    }

    override fun updateData() {

    }
}
