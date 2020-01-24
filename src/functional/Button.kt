package app.functional

import kotlinx.html.js.onClickFunction
import org.w3c.dom.events.Event
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div

interface ButtonProps : RProps {
    var isDark: Boolean
    var text: String
    var onClickFunction: (Event) -> Unit
}

interface ButtonState : RState {

}

class Button(properties: ButtonProps) : RComponent<ButtonProps, ButtonState>(properties) {
    override fun ButtonState.init(props: ButtonProps) {
    }

    override fun RBuilder.render() {
        div(classes = "default_button__wrapper ${if (props.isDark) "dark_button__wrapper" else "light_button__wrapper"}") {
            attrs {
                onClickFunction = props.onClickFunction
            }
            +props.text
        }
    }
}

fun RBuilder.defaultButton(
        text: String,
        onClickFunction: (Event) -> Unit = {},
        isDark: Boolean = true
) = child(Button::class) {
    attrs.isDark = isDark
    attrs.text = text
    attrs.onClickFunction = onClickFunction
}