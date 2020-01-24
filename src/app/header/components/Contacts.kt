package app.header.components

import app.functional.defaultButton
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div


class Contacts: RComponent<RProps, RState>(){
    override fun RBuilder.render() {
        div(classes="contacts__wrapper"){
            defaultButton("574-294-5678")
            defaultButton("GET MY CASH OFFER", isDark = false, onClickFunction = {_ -> js("alert('Hello')")})
        }
    }
}

fun RBuilder.contacts() = child(Contacts::class){}