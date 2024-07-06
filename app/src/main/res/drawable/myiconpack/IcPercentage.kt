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

public val MyIconPack.IcPercentage: ImageVector
    get() {
        if (_icPercentage != null) {
            return _icPercentage!!
        }
        _icPercentage = Builder(name = "IcPercentage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFFe8eaed)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(300.0f, 440.0f)
                quadToRelative(-58.0f, 0.0f, -99.0f, -41.0f)
                reflectiveQuadToRelative(-41.0f, -99.0f)
                quadToRelative(0.0f, -58.0f, 41.0f, -99.0f)
                reflectiveQuadToRelative(99.0f, -41.0f)
                quadToRelative(58.0f, 0.0f, 99.0f, 41.0f)
                reflectiveQuadToRelative(41.0f, 99.0f)
                quadToRelative(0.0f, 58.0f, -41.0f, 99.0f)
                reflectiveQuadToRelative(-99.0f, 41.0f)
                close()
                moveTo(300.0f, 360.0f)
                quadToRelative(25.0f, 0.0f, 42.5f, -17.5f)
                reflectiveQuadTo(360.0f, 300.0f)
                quadToRelative(0.0f, -25.0f, -17.5f, -42.5f)
                reflectiveQuadTo(300.0f, 240.0f)
                quadToRelative(-25.0f, 0.0f, -42.5f, 17.5f)
                reflectiveQuadTo(240.0f, 300.0f)
                quadToRelative(0.0f, 25.0f, 17.5f, 42.5f)
                reflectiveQuadTo(300.0f, 360.0f)
                close()
                moveTo(660.0f, 800.0f)
                quadToRelative(-58.0f, 0.0f, -99.0f, -41.0f)
                reflectiveQuadToRelative(-41.0f, -99.0f)
                quadToRelative(0.0f, -58.0f, 41.0f, -99.0f)
                reflectiveQuadToRelative(99.0f, -41.0f)
                quadToRelative(58.0f, 0.0f, 99.0f, 41.0f)
                reflectiveQuadToRelative(41.0f, 99.0f)
                quadToRelative(0.0f, 58.0f, -41.0f, 99.0f)
                reflectiveQuadToRelative(-99.0f, 41.0f)
                close()
                moveTo(660.0f, 720.0f)
                quadToRelative(25.0f, 0.0f, 42.5f, -17.5f)
                reflectiveQuadTo(720.0f, 660.0f)
                quadToRelative(0.0f, -25.0f, -17.5f, -42.5f)
                reflectiveQuadTo(660.0f, 600.0f)
                quadToRelative(-25.0f, 0.0f, -42.5f, 17.5f)
                reflectiveQuadTo(600.0f, 660.0f)
                quadToRelative(0.0f, 25.0f, 17.5f, 42.5f)
                reflectiveQuadTo(660.0f, 720.0f)
                close()
                moveTo(216.0f, 800.0f)
                lineTo(160.0f, 744.0f)
                lineTo(744.0f, 160.0f)
                lineTo(800.0f, 216.0f)
                lineTo(216.0f, 800.0f)
                close()
            }
        }
        .build()
        return _icPercentage!!
    }

private var _icPercentage: ImageVector? = null
