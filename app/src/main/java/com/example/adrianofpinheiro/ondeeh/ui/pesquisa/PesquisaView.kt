package com.example.adrianofpinheiro.ondeeh.ui.pesquisa

import com.example.adrianofpinheiro.ondeeh.base.BaseView
import com.example.adrianofpinheiro.ondeeh.model.Endereco

interface PesquisaView : BaseView{

    fun atualizaEndereco(endereco: Endereco)

    fun showErro(erro: String)

    fun showLoading()

    fun  hideLoading()

}