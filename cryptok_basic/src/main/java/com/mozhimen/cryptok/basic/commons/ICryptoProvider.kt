package com.mozhimen.cryptok.basic.commons

/**
 * @ClassName IEncrypt
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Version 1.0
 */
interface ICryptoProvider {
    fun encryptWithBase64(str: String): String
    fun decryptWithBase64(str: String): String
    fun encrypt(bytes: ByteArray): ByteArray
    fun decrypt(bytes: ByteArray): ByteArray
}