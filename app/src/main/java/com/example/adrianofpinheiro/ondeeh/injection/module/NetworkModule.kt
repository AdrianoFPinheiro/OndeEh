package com.example.adrianofpinheiro.ondeeh.injection.module

import com.example.adrianofpinheiro.ondeeh.model.Endereco
import com.example.adrianofpinheiro.ondeeh.network.EnderecoAPI
import com.example.adrianofpinheiro.ondeeh.utils.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.Reusable
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
object NetworkModule {

    @Provides
    @JvmStatic
    @Reusable
    fun provideEnderecoAPI(retrofit: Retrofit): EnderecoAPI {
        return retrofit.create(EnderecoAPI::class.java)
    }

    @Provides
    @JvmStatic
    @Reusable
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(
                RxJava2CallAdapterFactory
                    .createWithScheduler(Schedulers.io())
            )
            .build()
    }

}
