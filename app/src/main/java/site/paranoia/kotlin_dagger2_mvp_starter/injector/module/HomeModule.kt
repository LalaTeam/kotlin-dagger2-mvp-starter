package site.paranoia.kotlin_dagger2_mvp_starter.injector.module

import dagger.Module
import dagger.Provides
import site.paranoia.kotlin_base.view.home.HomePresenter
import site.paranoia.kotlin_dagger2_mvp_starter.view.home.HomeActivity
import site.paranoia.kotlin_dagger2_mvp_starter.view.home.IHomePresenter

/**
 * Created by Paranoia on 17-9-1.
 */
@Module
class HomeModule(private val mView: HomeActivity) {

    @Provides
    fun provideHomePresenter(): IHomePresenter {
        return HomePresenter(mView)
    }

}
