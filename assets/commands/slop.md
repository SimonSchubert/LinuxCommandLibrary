# TLDR

Get a **screen selection** and output geometry

```slop```

**Double click** instead of click-and-drag

```slop -D```

**Highlight** selection instead of outline

```slop -l```

Specify **output format**

```slop -f "%g"```

Set selection **color**

```slop -c [red],[green],[blue],[alpha]```

Set **border size**

```slop -b [thickness]```

# SYNOPSIS

**slop** [**-klqnD**] [_OPTIONS_]

# PARAMETERS

**-f, --format** _string_
> Output format using specifiers: %x, %y, %w, %h, %i (window ID), %c (cancel), %g (geometry)

**-b, --bordersize** _float_
> Selection rectangle border thickness

**-p, --padding** _float_
> Padding around selection (negative values shrink)

**-c, --color** _r,g,b,a_
> Selection box color as RGBA floats (0.0-1.0)

**-t, --tolerance** _float_
> Pixel threshold to distinguish click from drag

**-D, --nodrag**
> Use two-click mode instead of click-and-drag

**-l, --highlight**
> Fill selection area instead of drawing outline

**-n, --nodecorations** _int_
> Window decoration removal aggressiveness (0-2)

**-k, --nokeyboard**
> Disable keyboard cancellation

**-q, --quiet**
> Suppress warning messages

**-r, --shader** _string_
> Custom shader from ~/.config/slop

**-o, --noopengl**
> Disable OpenGL acceleration

**-x, --xdisplay** _display_
> Specify X display to use

**-v, --version**
> Display version

**-h, --help**
> Display help

# DESCRIPTION

**slop** (Select Operation) queries the user for a screen region selection and outputs the geometry to stdout. Users can click and drag to create a selection rectangle, or select an existing window. The output format is configurable for integration with other tools.

Common use cases include screenshot region selection, window geometry capture, and integration with screen recording tools. The output can be parsed by scripts to perform operations on the selected area.

# CAVEATS

Requires X11; does not work on Wayland without XWayland. OpenGL acceleration requires appropriate drivers. Custom shaders must be placed in ~/.config/slop directory. Selection may include window decorations unless **-n** flag is used.

# HISTORY

**slop** was created by **naelstrof** as a successor to the selection functionality in **scrot**. The tool is designed to be modular and integrate with other utilities via shell pipelines. It is commonly used alongside **maim** for screenshots and various screen recording tools.

# SEE ALSO

[maim](/man/maim)(1), [scrot](/man/scrot)(1), [xdotool](/man/xdotool)(1), [xwininfo](/man/xwininfo)(1)
