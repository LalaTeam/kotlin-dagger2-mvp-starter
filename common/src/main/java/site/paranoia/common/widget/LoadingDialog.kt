package site.paranoia.common.widget

import android.app.Activity
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.loading_dialog_layout.view.*
import site.paranoia.common.R

/**
 * Created by Paranoia on 17-8-31.
 */
class LoadingDialog(activity: Activity) : AlertDialog(activity, R.style.LoadingDialog) {
    private val customView = LayoutInflater.from(activity).inflate(R.layout.loading_dialog_layout, null, false)

    init {
        setView(customView)
        ownerActivity = activity
    }

    fun show(message: CharSequence?) {
        customView.tv_loading_dialog_title.text = message
        super.show()
        val lp = window.attributes
        lp.dimAmount = 0f
        onWindowAttributesChanged(lp)
    }

    fun dissmiss() {
        if (ownerActivity != null && !ownerActivity.isDestroyed) {
            super.dismiss()
        }
    }
}