package im.mingxi.debug

import im.mingxi.loader.bridge.XPBridge

object DebugUtil {

    fun printAllFieldStatic(clz: Class<*>) {
        clz.declaredFields.forEach {
            it.isAccessible = true
            XPBridge.log("${it.name}->${it.get(null)}")
        }
    }

    fun printAllField(obj: Any) {
        obj.javaClass.superclass.superclass.declaredFields.forEach {
            it.isAccessible = true
            XPBridge.log("${it.name}->${it.get(obj)}")
        }

    }


}