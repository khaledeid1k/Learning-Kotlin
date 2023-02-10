package diffrent_objects.SingleAbstractMethod

class Image {
    private var listener:Listener?=null
    fun setOnTouch(listener: Listener){
        this.listener=listener
    }
}