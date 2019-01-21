package ru.capjack.kt.inject

import kotlin.reflect.KClass
import kotlin.reflect.KParameter

interface Injector {
	fun <T : Any> get(clazz: KClass<T>): T
	
	fun <T : Any> get(name: TypedName<T>): T
	
	fun get(parameter: KParameter): Any
	
	companion object {
		operator fun invoke(strong: Boolean = true, init: Binder.() -> Unit): Injector {
			return Injection(init).build(strong)
		}
	}
}