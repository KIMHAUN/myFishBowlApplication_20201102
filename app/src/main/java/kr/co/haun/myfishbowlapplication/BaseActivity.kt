package kr.co.haun.myfishbowlapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

abstract class BaseActivity : AppCompatActivity() {
    val mContext = this

    abstract fun setEvent()
    abstract fun setValues()

}