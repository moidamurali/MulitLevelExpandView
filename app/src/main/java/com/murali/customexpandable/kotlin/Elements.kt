package com.murali.customexpandable.kotlin

class Elements{

    var author : String = ""
    var releaseDate: String = ""
    //var elementsData: List<Elements.ElementsData> = ArrayList<Elements.ElementsData>()
    lateinit var elementsData: List<Elements.ElementsData>


    class ElementsData{
        var title: String =""
        var level : Int = 0
        var id : String = ""
        var parentId :String =""
        var hasChildren : Boolean = false
        var isExpanded : Boolean = false

    }
}