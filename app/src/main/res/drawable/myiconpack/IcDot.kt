package myiconpack

import MyIconPack
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val MyIconPack.IcDot: ImageVector
    get() {
        if (_icDot != null) {
            return _icDot!!
        }
        _icDot = Builder(name = "IcDot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFFe8eaed)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 840.0f)
                quadToRelative(-42.0f, 0.0f, -71.0f, -29.0f)
                reflectiveQuadToRelative(-29.0f, -71.0f)
                quadToRelative(0.0f, -42.0f, 29.0f, -71.0f)
                reflectiveQuadToRelative(71.0f, -29.0f)
                quadToRelative(42.0f, 0.0f, 71.0f, 29.0f)
                reflectiveQuadToRelative(29.0f, 71.0f)
                quadToRelative(0.0f, 42.0f, -29.0f, 71.0f)
                reflectiveQuadToRelative(-71.0f, 29.0f)
                close()
            }
        }
        .build()
        return _icDot!!
    }

private var _icDot: ImageVector? = null
