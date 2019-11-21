package capitulo4.bloco8.exemplo7

class MouseEvent (val posicaoX: Int, val posicaoY: Int)

interface EventoClick {
    fun mouseClicked (mouseEvent: MouseEvent)
    fun mouseEndered (mouseEvent: MouseEvent)
}

class Window {
    companion object {
        fun addMouseListener (evento: EventoClick) {
            println (evento)
        }
    }
}

fun main() {
    Window.addMouseListener(object: EventoClick {
        override fun mouseClicked(mouseEvent: MouseEvent) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun mouseEndered(mouseEvent: MouseEvent) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    })

    val click = object : EventoClick {
        override fun mouseClicked(mouseEvent: MouseEvent) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun mouseEndered(mouseEvent: MouseEvent) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }
    Window.addMouseListener(click)
}