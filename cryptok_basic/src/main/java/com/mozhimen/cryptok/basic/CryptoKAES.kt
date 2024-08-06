package com.mozhimen.cryptok.basic

import com.mozhimen.cryptok.basic.commons.ICrypto
import com.mozhimen.cryptok.basic.helpers.CryptoAESProvider
import com.mozhimen.cryptok.basic.mos.MCryptoAESConfig

/**
 * @ClassName UtilKEncryptAES
 * @Description  AESUtil.with("xxx","xxx").encrypt("xxx")
 * @Author Kolin Zhao
 * @Version 1.0
 */
object CryptoKAES : ICrypto<MCryptoAESConfig, CryptoAESProvider> {

    /**
     * 默认参数配置
     *
     * secretKey: String = "saaierForTodoKey",
     * ivString: String = "ihaierForTodo_Iv",
     * secureKeyLength: Int = 16,
     * defaultFill: String = "0",
     * charset: Charset = Charsets.UTF_8,
     * cipherAlgorithm: String = "AES/CBC/PKCS5Padding"
     *
     * @return EncryptAESProvider
     */
    override fun with(config: MCryptoAESConfig): CryptoAESProvider =
        CryptoAESProvider(config)

    override fun with(): CryptoAESProvider =
        with(MCryptoAESConfig())
}