# TLDR

Display a **wireframe icosahedron** that changes position

```ico -sleep [0.1]```

Display a **solid** icosahedron with colored faces

```ico -faces -noedges -colors [red] -bg [blue]```

Display a **cube** with specific size and movement delta

```ico -obj cube -size [100x100] -delta +1+2```

Display **inverted wireframe** with line width and threads

```ico -i -lw [10] -threads [5]```

# SYNOPSIS

**ico** [_options_]

# PARAMETERS

**-sleep** _SECONDS_
> Delay between position updates

**-obj** _OBJECT_
> Polyhedron to display (icosahedron, cube, octahedron, etc.)

**-size** _WxH_
> Size of the polyhedron in pixels

**-delta** _+X+Y_
> Movement per frame

**-faces**
> Draw solid faces instead of wireframe

**-noedges**
> Don't draw edges

**-colors** _COLOR_
> Color for faces or edges

**-bg** _COLOR_
> Background color

**-lw** _WIDTH_
> Line width for wireframe edges

**-i**
> Invert (swap foreground and background)

**-threads** _N_
> Number of rendering threads

# DESCRIPTION

**ico** displays an animated wireframe or solid polyhedron bouncing around an X11 window. It's a simple demonstration program that shows various geometric shapes including icosahedrons, cubes, and octahedrons.

The animation continuously moves the polyhedron around the window, bouncing off the edges. Various options control the appearance, speed, and rendering style.

# CAVEATS

Requires X11 display server. Primarily a demonstration program with no practical purpose. May consume significant CPU when using multiple threads.

# HISTORY

ico is one of the classic X11 demonstration programs, originating from the early days of the X Window System at MIT in the mid-**1980s**. It has been included in X.Org releases as part of the standard distribution.

# SEE ALSO

[xeyes](/man/xeyes)(1), [xlogo](/man/xlogo)(1)
