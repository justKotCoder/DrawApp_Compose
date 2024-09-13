# DrawApp

DrawApp is a mobile drawing application built using Jetpack Compose. It allows users to draw on the screen, choose different colors, line widths, and stroke caps.

## Features

- Draw on the canvas with touch gestures.
- Select different colors for drawing.
- Adjust line width using a slider.
- Choose different stroke caps (round, square, butt).

## Files

### 1. BottomPanel.kt

Defines the bottom panel of the drawing application UI. It consists of color selection, line width adjustment, and stroke cap selection.

#### Components

1. **BottomPanel**
    - Main function that assembles the components: `ColorList`, `CustomSlider`, and `ButtonPanel`.
    - Parameters:
        - `onClick`: Callback for color selection.
        - `onLineWidthChange`: Callback for line width change.
        - `onBackClick`: Callback for the back button.
        - `onCapClick`: Callback for stroke cap selection.

2. **ColorList**
    - Displays a horizontal list of color options.
    - Parameters:
        - `onClick`: Callback when a color is selected.

3. **CustomSlider**
    - A slider for adjusting the line width.
    - Displays the current line width as a text.
    - Parameters:
        - `onChange`: Callback when the line width changes.

4. **ButtonPanel**
    - Contains buttons for back navigation and stroke cap selection (round, square, butt).
    - Parameters:
        - `onClick`: Callback for the back button.
        - `onCapClick`: Callback for stroke cap selection.

### 2. MainActivity.kt

Defines the main activity for the drawing application.

#### Components

1. **MainActivity**
    - `onCreate`: Initializes the application's state and sets the content using `setContent`.
    - Initializes `pathData` and `pathList` to manage the current drawing path and the list of all paths.
    - Uses `DrawAppTheme` to apply the application's theme.
    - Contains `Column` layout which hosts `DrawCanvas` and `BottomPanel`.

2. **DrawCanvas**
    - A composable function for drawing on the screen.
    - Handles drag gestures to create lines.
    - Manages the state of the path and updates the list of paths on each drag gesture.
    - Parameters:
        - `pathData`: Current path data state.
        - `pathList`: List of all path data states.

### 3. PathData.kt

Defines a data class for storing information about a drawing path.

#### Components

1. **PathData**
    - Data class that includes:
        - `path`: A Path object representing the drawing path.
        - `color`: The color of the path (default is black).
        - `lineWidth`: The width of the line (default is 5f).
        - `cap`: The stroke cap type (default is round).

## Installation

To use this project, clone the repository and open it in Android Studio.


```sh
git clone https://github.com/justKotCoder/DrawApp_Compose.git
```



### Видео проекта



https://github.com/user-attachments/assets/d98ee1e8-d106-48d9-a2ca-0ea1faf2a671



