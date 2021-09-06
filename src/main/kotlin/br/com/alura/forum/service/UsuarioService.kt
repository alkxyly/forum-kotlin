package br.com.alura.forum.service

import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*
import kotlin.collections.ArrayList

@Service
class UsuarioService(private var usuarios: List<Usuario> = ArrayList()) {

    init {
        val usuario = Usuario(
            id = 1,
            nome = "Jose",
            email = "jose@gmail.com"
        )

        usuarios = Arrays.asList(usuario)
    }

    fun buscarPorId(idUsuario: Long): Usuario{
        return usuarios.stream().filter { usuario -> usuario.id == idUsuario }.findFirst().get()
    }
}