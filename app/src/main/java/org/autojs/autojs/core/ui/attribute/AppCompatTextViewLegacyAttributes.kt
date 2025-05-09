package org.autojs.autojs.core.ui.attribute

import android.view.View
import org.autojs.autojs.core.ui.inflater.ResourceParser
import androidx.appcompatlegacy.widget.AppCompatTextView
import org.autojs.autojs.runtime.ScriptRuntime

open class AppCompatTextViewLegacyAttributes(scriptRuntime: ScriptRuntime, resourceParser: ResourceParser, view: View) : TextViewAttributes(scriptRuntime, resourceParser, view) {

    override val view = super.view as AppCompatTextView

}
