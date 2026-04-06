package com.mozhimen.cryptok.test

import android.os.Bundle
import com.mozhimen.cryptok.basic.CryptoKAES
import com.mozhimen.cryptok.basic.mos.MCryptoAESConfig
import com.mozhimen.cryptok.test.databinding.ActivityUtilkEncryptBinding
import com.mozhimen.uik.databinding.bases.viewdatabinding.activity.BaseActivityVDB


/**
 * @ClassName UtilKEncryptActivity
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2022/12/9 10:41
 * @Version 1.0
 */
class UtilKEncryptActivity : BaseActivityVDB<ActivityUtilkEncryptBinding>() {

    override fun initView(savedInstanceState: Bundle?) {
        val content = "Lovelive9."
        var pwd = ""
        var res = ""
        vdb.utilkEncryptTxt1.text = content
        vdb.utilkEncryptBtnEncrypt.setOnClickListener {
            pwd = CryptoKAES.with(MCryptoAESConfig(secretKey = "saaierForTodoKey", ivString = "ihaierForTodo_Iv")).encryptWithBase64(content)
            vdb.utilkEncryptTxt2.text = pwd
        }
        vdb.utilkEncryptBtnDecrypt.setOnClickListener {
            res = CryptoKAES.with(MCryptoAESConfig(secretKey = "saaierForTodoKey", ivString = "ihaierForTodo_Iv")).decryptWithBase64(pwd)
            vdb.utilkEncryptTxt3.text = res
        }
    }
}