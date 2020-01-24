package app.header.components

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div

class Logo: RComponent<RProps, RState>(){
    override fun RBuilder.render() {
        div(classes = "logo__wrapper") {  }
    }
}

fun RBuilder.logo() = child(Logo::class){}