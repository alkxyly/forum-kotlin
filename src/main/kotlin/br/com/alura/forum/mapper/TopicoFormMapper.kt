package br.com.alura.forum.mapper

import br.com.alura.forum.dto.NovoTopicoForm
import br.com.alura.forum.model.Topico
import br.com.alura.forum.service.CursoService
import br.com.alura.forum.service.UsuarioService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper(
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService
): Mapper<NovoTopicoForm, Topico> {

    override fun map(t: NovoTopicoForm): Topico {
       return Topico(
            titulo = t.titulo,
            mensagem = t.mensagem,
            curso = cursoService.buscarPorid(t.idCurso),
            autor = usuarioService.buscarPorId(t.idAutor)
        )
    }
}