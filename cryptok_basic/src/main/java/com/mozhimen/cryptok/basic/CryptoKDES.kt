package com.mozhimen.cryptok.basic

import com.mozhimen.cryptok.basic.commons.ICrypto
import com.mozhimen.cryptok.basic.helpers.CryptoDESProvider
import com.mozhimen.cryptok.basic.mos.MCryptoDESConfig

/**
 * @ClassName UtilKDES
 * @Description TODO
 * @Author Kolin Zhao / Mozhimen
 * @Date 2022/2/16 20:21
 * @Version 1.0
 */
object CryptoKDES : ICrypto<MCryptoDESConfig, CryptoDESProvider> {

    /**
     * With
     *
     * secretKey: String = "saaierForTodoKey",
     * charset: Charset = Charsets.UTF_8
     *
     * @return EncryptDESProvider
     */
    override fun with(
        config: MCryptoDESConfig
    ): CryptoDESProvider =
        CryptoDESProvider(config)


    override fun with(): CryptoDESProvider =
        with(MCryptoDESConfig())
}