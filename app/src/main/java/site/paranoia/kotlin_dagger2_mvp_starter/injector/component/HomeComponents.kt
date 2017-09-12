package site.paranoia.kotlin_dagger2_mvp_starter.injector.component

import dagger.Component
import site.paranoia.kotlin_dagger2_mvp_starter.injector.module.HomeModule
import site.paranoia.kotlin_dagger2_mvp_starter.view.home.HomeActivity

/**
 * Created by Paranoia on 17-9-1.
 */
@Component(modules = arrayOf(HomeModule::class))
interface HomeComponents {
    fun inject(homeActivity: HomeActivity)
}
