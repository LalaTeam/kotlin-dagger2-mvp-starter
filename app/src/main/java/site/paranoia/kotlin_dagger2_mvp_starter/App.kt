package site.paranoia.kotlin_dagger2_mvp_starter

import android.app.Application
import site.paranoia.common.Common

/**
 * Created by Paranoia on 17-8-31.
 */
class App : Application(){

    override fun onCreate() {
        super.onCreate()
        Common.with(this)
    }
}