package site.paranoia.kotlin_base.view.home

import site.paranoia.kotlin_dagger2_mvp_starter.view.home.HomeActivity
import site.paranoia.kotlin_dagger2_mvp_starter.view.home.IHomePresenter

/**
 * Created by Paranoia on 17-9-1.
 */
class HomePresenter(var mView: HomeActivity) : IHomePresenter {
    override fun getMoreData() {

    }

    override fun getData() {
        mView.updateData()
    }

}
