package com.example.adrianofpinheiro.ondeeh.injection.component

import com.example.adrianofpinheiro.ondeeh.base.BaseView
import com.example.adrianofpinheiro.ondeeh.injection.module.ContextModule
import com.example.adrianofpinheiro.ondeeh.injection.module.NetworkModule
import com.example.adrianofpinheiro.ondeeh.ui.pesquisa.PesquisaPresenter


import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(ContextModule::class), (NetworkModule::class)])
interface PresenterInjector {

    fun inject(pesquisaPresenter: PesquisaPresenter)

    @Component.Builder
    interface Builder {

        fun build(): PresenterInjector

        fun networkModule(networkModule: NetworkModule): Builder
        fun contextModule(contextModule: ContextModule): Builder

        @BindsInstance
        fun baseView(baseView: BaseView): Builder
    }
}


