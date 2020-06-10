package ru.capjack.tool.depin

import kotlin.reflect.KClass

@Target(AnnotationTarget.CLASS)
annotation class Inject

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY)
annotation class Bind(val name: String = "")

@Target(AnnotationTarget.CLASS)
annotation class Proxy

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
annotation class Implementation(val type: KClass<*>)

@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class Named(val name: String = "")
