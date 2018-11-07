package com.example.adrianofpinheiro.ondeeh.base

import com.example.adrianofpinheiro.ondeeh.injection.component.DaggerPresenterInjector
import com.example.adrianofpinheiro.ondeeh.injection.component.PresenterInjector
import com.example.adrianofpinheiro.ondeeh.injection.module.ContextModule
import com.example.adrianofpinheiro.ondeeh.injection.module.NetworkModule
import com.example.adrianofpinheiro.ondeeh.ui.pesquisa.PesquisaPresenter

abstract class BasePresenter<out v : BaseView>(protected val view: v) {

    private val injector: PresenterInjector = DaggerPresenterInjector
        .builder()
        .baseView(view)
        .contextModule(ContextModule)
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    open fun onViewCreated() {}

    open fun onViewDestroyed() {}

    private fun inject() {
        when(this){
            is PesquisaPresenter -> injector.inject(this)
        }
    }
}