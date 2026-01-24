# TLDR

**View a 3D model** as ASCII art in the terminal

```3d-ascii-viewer [path/to/model.obj]```

**View with specific dimensions**

```3d-ascii-viewer -w [80] -h [40] [model.obj]```

**Render with colored output**

```3d-ascii-viewer --color [model.obj]```

**View STL file** with rotation

```3d-ascii-viewer --rotate-x [45] --rotate-y [30] [model.stl]```

**Set custom ASCII characters** for shading

```3d-ascii-viewer --charset " .:-=+*#%@" [model.obj]```

**Enable wireframe mode**

```3d-ascii-viewer --wireframe [model.obj]```

**Output to file** instead of terminal

```3d-ascii-viewer [model.obj] > [output.txt]```

# SYNOPSIS

**3d-ascii-viewer** [_options_] _model_file_

# PARAMETERS

**-w**, **--width** _n_
> Set output width in characters.

**-h**, **--height** _n_
> Set output height in characters.

**--color**
> Enable colored ASCII output using ANSI codes.

**--rotate-x** _degrees_
> Rotate model around the X axis.

**--rotate-y** _degrees_
> Rotate model around the Y axis.

**--rotate-z** _degrees_
> Rotate model around the Z axis.

**--wireframe**
> Render as wireframe instead of solid.

**--charset** _chars_
> Custom characters for brightness levels (dark to light).

**--scale** _factor_
> Scale the model by the specified factor.

**--fps** _n_
> Frames per second for animation mode.

**--animate**
> Continuously rotate the model.

**--help**
> Display help information.

# DESCRIPTION

**3d-ascii-viewer** renders 3D model files as ASCII art in the terminal. It converts 3D geometry into text-based representations using characters of varying density to simulate shading and depth.

The tool supports common 3D formats including OBJ and STL files. Models are rendered using a simple rasterization approach where surface brightness determines which ASCII character is used. Darker areas use sparse characters like dots while brighter areas use dense characters like @ or #.

For interactive exploration, the animate mode continuously rotates the model, creating a spinning effect in the terminal. The color mode adds ANSI color codes for enhanced visual output on terminals that support them.

Output dimensions default to the terminal size but can be overridden for specific use cases like generating ASCII art for text files or documentation. The tool is useful for quick model inspection without launching a full 3D viewer.

# CAVEATS

Complex models with many polygons may render slowly or lose detail. Terminal font and aspect ratio affect the visual output. Color support depends on terminal capabilities. Very small output dimensions may produce unrecognizable results.

# HISTORY

ASCII art renderers for 3D content emerged alongside the demoscene and terminal art communities. Various implementations exist across programming languages, with modern versions supporting standard 3D file formats. The technique builds on decades of ASCII art tradition dating back to early computing.

# SEE ALSO

[meshlab](/man/meshlab)(1), [openscad](/man/openscad)(1), [blender](/man/blender)(1), [figlet](/man/figlet)(1)
