package com.asheeshk.weatherapp.ui.view

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asheeshk.weatherapp.R


@Composable
fun HomeScreen() {

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModalSheet() {
    val sheetState = rememberModalBottomSheetState()
    var showSheet by remember { mutableStateOf(true) }

    ModalBottomSheet(
        onDismissRequest = { showSheet = false },
        sheetState = sheetState,
        dragHandle = {}
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF4B0082).copy(alpha = 0.9f),  // Left violet - 90%
                            Color(0xFF8A2BE2).copy(alpha = 0.8f),  // Center violet - 50%
                            Color(0xFF4B0082).copy(alpha = 0.7f),  // Right violet - 90%
                            Color(0xFF8A2BE2).copy(alpha = 0.6f),
                            Color(0xFF8A2BE2).copy(alpha = 0.5f),
                            Color(0xFF8A2BE2).copy(alpha = 0.4f),
                            Color(0xFF8A2BE2).copy(alpha = 0.6f),
                            Color(0xFF4B0082).copy(alpha = 0.8f),
                            Color(0xFF8A2BE2).copy(alpha = 0.9f)
                        ),
                        start = Offset.Zero,
                        end = Offset.Infinite,
                        tileMode = TileMode.Mirror
                    )
                )
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(
                        modifier = Modifier.weight(1f),
                        text = "Hourly forecast",
                        textAlign = TextAlign.Center,
                        color = Color.White,
                        style = MaterialTheme.typography.bodySmall
                    )
                    Text(
                        modifier = Modifier.weight(1f),
                        text = "Weekly",
                        textAlign = TextAlign.Center,
                        color = Color.White,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 5.dp)
                        .height(1.dp)
                        .background(
                            brush = Brush.linearGradient(
                                colors = listOf(
                                    Color(0xFF4B0082).copy(alpha = 0.1f),
                                    Color(0xFF4B0082).copy(alpha = 0.5f),
                                    Color.White,  // Left violet - 90%
                                    Color(0xFF8A2BE2).copy(alpha = 0.5f),  // Center violet - 50%
                                    Color(0xFF4B0082).copy(alpha = 0.1f),  // Right violet - 90%
                                )
                            )
                        )
                )
                Button(
                    onClick = { showSheet = false },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Close")

                }
            }
        }
    }
}


@Composable
fun MyScreen() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.Blue)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Close",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 5.sp,
                modifier = Modifier
                    .weight(1f)
                    .paddingFromBaseline(bottom = 20.dp)
            )
            Text("Close", color = Color.White, modifier = Modifier
                .weight(1f)
                .padding(10.dp))
            Text("Close", color = Color.White, modifier = Modifier
                .weight(1f)
                .padding(10.dp))
        }


    }
}
@Composable
fun MyCarScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Box(modifier = Modifier) {
            Image(
                modifier = Modifier.width(200.dp),
                painter = painterResource(id = R.drawable.car),
                contentScale = ContentScale.Crop,
                contentDescription = "Car Image"
            )
        }
    }

}
@Preview(showBackground = true)
@Composable
fun CarParkingAnimatedView() {

    var imageSize by remember { mutableStateOf(IntSize.Zero) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {

        Box {

            // --- CAR IMAGE ---
            Image(
                painter = painterResource(id = R.drawable.car),
                contentDescription = "Car",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(300.dp)
                    .onSizeChanged { imageSize = it }
            )

            // Headlights Left
            LightImageOverlay(
                imageSize = imageSize,
                xPercent = 0.1f,
                yPercent = 0.05f,
                lightRes = R.drawable.ic_launcher_background
            )
            // Headlights Right
            LightImageOverlay(
                imageSize = imageSize,
                xPercent = 0.8f,
                yPercent = 0.05f,
                lightRes = R.drawable.ic_launcher_background
            )
            // Taillight Left
            LightImageOverlay(
                imageSize = imageSize,
                xPercent = 0.1f,
                yPercent = 0.9f,
                lightRes = R.drawable.ic_launcher_background
            )
            // Taillight Right
            LightImageOverlay(
                imageSize = imageSize,
                xPercent = 0.8f,
                yPercent = 0.9f,
                lightRes = R.drawable.ic_launcher_background
            )

            // --- ANIMATED HEADLIGHTS ---
            AnimatedLight(
                imageSize = imageSize,
                xPercent = 0.1f,
                yPercent = 0.05f,
                color = Color.Yellow,
                isOn = true,            // headlights always ON
                pulse = false
            )

            AnimatedLight(
                imageSize = imageSize,
                xPercent = 0.8f,
                yPercent = 0.05f,
                color = Color.Yellow,
                isOn = true,
                pulse = false
            )

            // --- ANIMATED TAIL LIGHTS (BRAKE EFFECT) ---
            AnimatedLight(
                imageSize = imageSize,
                xPercent = 0.1f,
                yPercent = 0.9f,
                color = Color.Red,
                isOn = true,
                pulse = true,          // brake blinking pulse
            )


            AnimatedLight(
                imageSize = imageSize,
                xPercent = 0.8f,
                yPercent = 0.9f,
                color = Color.Red,
                isOn = true,
                pulse = true
            )
        }
    }
}
@Composable
fun LightImageOverlay(
    imageSize: IntSize,
    xPercent: Float,
    yPercent: Float,
    lightRes: Int,    // PNG drawable
    lightSizeDp: Dp = 30.dp
) {
    if (imageSize.width == 0) return

    val xPos = (imageSize.width * xPercent).toInt()
    val yPos = (imageSize.height * yPercent).toInt()

    Image(
        painter = painterResource(lightRes),
        contentDescription = "Light",
        modifier = Modifier
            .offset { IntOffset(xPos, yPos) }
            .size(lightSizeDp)
    )
}

@Composable
fun AnimatedLight(
    imageSize: IntSize,
    xPercent: Float,
    yPercent: Float,
    color: Color,
    isOn: Boolean,
    pulse: Boolean
) {
    if (imageSize.width == 0) return

    val xPos = imageSize.width * xPercent
    val yPos = imageSize.height * yPercent

    // --- PULSE ANIMATION ---
    val infinite = rememberInfiniteTransition()
    val glow by infinite.animateFloat(
        initialValue = if (pulse) 0.3f else 0.6f,
        targetValue = if (pulse) 1.2f else 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(800, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        )
    )

    Box(
        modifier = Modifier
            .offset { IntOffset(xPos.toInt(), yPos.toInt()) }
            .size((35 * glow).dp)  // grows and shrinks
            .graphicsLayer {
                shadowElevation = 50f * glow
                shape = CircleShape
                clip = false
            }
            .background(
                color = if (isOn)
                    color.copy(alpha = 0.7f * glow)
                else
                    Color.Transparent,
                shape = CircleShape
            )
    )
}



@Preview(showBackground = true)
@Composable
fun SimpleVerticalDash() {
    Canvas(
        modifier = Modifier
            .fillMaxHeight() // Fill the parent's height
            .width(10.dp)    // Total width of the drawing area
    ) {
        // Define the dash pattern: 20f is the line length, 10f is the gap length
        val dashPathEffect = PathEffect.dashPathEffect(floatArrayOf(0.5f, 0.5f), 0f)

        drawLine(
            color = Color.Black,
            start = Offset(x = size.width / 2, y = 0f),
            end = Offset(x = size.width / 2, y = size.height),
            strokeWidth = 10.dp.toPx(), // The requested "10 width"
            pathEffect = dashPathEffect
        )
    }
}
@Composable
fun RoadLaneDivider(
    modifier: Modifier = Modifier,
    laneColor: Color = Color.White, // Default to white road paint
    thickness: Dp = 10.dp,          // Your requested 10 width
    dashLength: Dp = 50.dp,         // Longer dashes for road look
    gapLength: Dp = 30.dp           // Gap between lines
) {
    Canvas(
        modifier = modifier
            .fillMaxHeight()
            .width(thickness)
    ) {
        val dashEffect = PathEffect.dashPathEffect(
            floatArrayOf(dashLength.toPx(), gapLength.toPx()),
            0f
        )

        drawLine(
            color = laneColor,
            start = Offset(x = size.width / 2, y = 0f),
            end = Offset(x = size.width / 2, y = size.height),
            strokeWidth = thickness.toPx(),
            pathEffect = dashEffect,
            cap = StrokeCap.Butt // Road lines usually have flat ends
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MidLaneRoadView() {
    // 1. The Road Surface (Container)
    Box(
        modifier = Modifier
            .height(500.dp) // Height of your road view
            .background(Color.Black) // Dark Asphalt Gray
    ) {

        // 2. The Mid Lane Divider
        Canvas(
            modifier = Modifier
                // Key: Centers it horizontally
                .fillMaxHeight()
                .padding(horizontal = 10.dp)// Stretches top to bottom
                .width(10.dp)            // Your 10 width
        ) {
            // Highway Pattern: 40dp paint, 40dp gap
            val dashPattern = floatArrayOf(40.dp.toPx(), 40.dp.toPx())

            drawLine(
                color = Color(0xFFFFC107), // Standard "Highway Yellow"
                start = Offset(x = size.width / 2, y = 0f),
                end = Offset(x = size.width / 2, y = size.height),
                strokeWidth = size.width,
                pathEffect = PathEffect.dashPathEffect(dashPattern, 0f),
                cap = StrokeCap.Butt
            )
        }
    }
}


