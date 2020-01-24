package app.body

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

interface BodyState: RState{

}

class Body : RComponent<RProps, RState>(){
    override fun RState.init() {
    }

    override fun RBuilder.render() {
    }
}

fun  RBuilder.appBody() = child(Body::class){}