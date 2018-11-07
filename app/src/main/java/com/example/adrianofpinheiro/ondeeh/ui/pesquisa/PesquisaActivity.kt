package com.example.adrianofpinheiro.ondeeh.ui.pesquisa


import android.os.Bundle
import android.widget.Toast
import com.example.adrianofpinheiro.ondeeh.R
import com.example.adrianofpinheiro.ondeeh.base.BaseActivity
import com.example.adrianofpinheiro.ondeeh.model.Endereco

class PesquisaActivity : BaseActivity<PesquisaPresenter>(), PesquisaView {

    override fun atualizaEndereco(endereco: Endereco) {
        Toast.makeText(this, endereco.logradouro, Toast.LENGTH_SHORT).show()
    }

    override fun showErro(erro: String) {
        Toast.makeText(this, erro, Toast.LENGTH_SHORT).show()
    }

    override fun showLoading() {
        Toast.makeText(this, "Carregando!", Toast.LENGTH_SHORT).show()

    }

    override fun hideLoading() {
        Toast.makeText(this, "FUUUUI...", Toast.LENGTH_SHORT).show()

    }

    override fun instantitePresenter(): PesquisaPresenter {
        return PesquisaPresenter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesquisa)

        presenter.pesquisar("04313110")
    }
}
