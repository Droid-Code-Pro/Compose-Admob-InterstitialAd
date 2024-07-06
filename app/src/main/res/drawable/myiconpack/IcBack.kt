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

public val MyIconPack.IcBack: ImageVector
    get() {
        if (_icBack != null) {
            return _icBack!!
        }
        _icBack = Builder(name = "IcBack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFFe8eaed)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(520.0f, 760.0f)
                lineTo(80.0f, 480.0f)
                lineToRelative(440.0f, -280.0f)
                lineToRelative(-137.0f, 240.0f)
                horizontalLineToRelative(497.0f)
                verticalLineToRelative(80.0f)
                lineTo(383.0f, 520.0f)
                lineToRelative(137.0f, 240.0f)
                close()
            }
        }
        .build()
        return _icBack!!
    }

private var _icBack: ImageVector? = null
