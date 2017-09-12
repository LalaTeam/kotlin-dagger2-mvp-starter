package site.paranoia.kotlin_dagger2_mvp_starter.view.login
import kotlinx.android.synthetic.main.activity_login.*
import site.paranoia.kotlin_dagger2_mvp_starter.R
import site.paranoia.common.base.TitleBarActivity

class LoginActivity : TitleBarActivity() {
    override fun bindLayout() = R.layout.activity_login

    override fun initWidget() {
    }

    override fun initInject() {
    }

    override fun setListener() {
        button.setOnClickListener {}
    }


}
