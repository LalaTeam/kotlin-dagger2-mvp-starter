package site.paranoia.common.base

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import site.paranoia.common.R
import site.paranoia.common.widget.LoadingDialog
import site.paranoia.common.widget.ShowToast

/**
 * Created by Paranoia on 17-8-30.
 */
abstract class BaseActivity: AppCompatActivity() {
    lateinit var mContext: Context

    private lateinit var loadingDialog: LoadingDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this
        setContentView(bindLayout())
        window.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(mContext, R.color.background)))
        loadingDialog = LoadingDialog(this)
        initWidget()
        initInject()
        setListener()
    }

    fun showLoading(message: CharSequence? = "") {
        loadingDialog.show(message)
    }

    fun dismiss() {
        loadingDialog.dissmiss()
    }

    fun showToast(message: CharSequence?) {
        ShowToast.shortToast(message)
    }

    abstract fun initWidget()

    open fun initInject() {

    }

    abstract fun bindLayout(): Int

    open fun setListener(){

    }

    open fun loadData(){

    }
}