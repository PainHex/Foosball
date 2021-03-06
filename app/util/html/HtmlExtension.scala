package util.html

import play.api.libs.json._
import play.api.templates.Html

object HtmlExtension {

  implicit object HtmlFormat extends Format[Html] {
    def reads(json: JsValue) = JsSuccess(Html(json.as[String]))
    def writes(html: Html) = JsString(html.toString)
  }  
}