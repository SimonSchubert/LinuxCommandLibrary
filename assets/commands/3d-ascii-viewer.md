# TAGLINE

Render 3D models as ASCII art in the terminal

# TLDR

**View an OBJ** model as ASCII art in the terminal

```3d-ascii-viewer [path/to/model.obj]```

**View an STL** model

```3d-ascii-viewer [path/to/model.stl]```

**Enable color** using materials referenced in the OBJ's MTL file

```3d-ascii-viewer --color [model.obj]```

**Show help** and list all supported options

```3d-ascii-viewer --help```

# SYNOPSIS

**3d-ascii-viewer** [_options_] _model_file_

# PARAMETERS

_model_file_
> Path to a Wavefront `.obj` or `.stl` model file.

**--color**
> Use the **diffuse color** of each material referenced in the companion MTL file. Requires a terminal supporting color redefinition and enough ncurses color pairs.

**--help**
> Print usage information and exit.

# DESCRIPTION

**3d-ascii-viewer** (by autopawn) is a minimal viewer that renders 3D models as animated ASCII art directly in the terminal, using ncurses and no graphics library. It continuously rotates the model, with characters of varying density representing surface shading and depth.

The viewer supports Wavefront `.obj` and `.stl` files. For OBJ files, an accompanying `.mtl` material file can be used together with **--color** to tint each face by its diffuse material color.

Because output is text in a standard terminal, the viewer is useful over SSH, in tmux panes, or in any environment where a full 3D GUI is not available.

# CAVEATS

Requires the ncurses developer libraries to build (`libncurses-dev` on Debian-based systems). Complex, high-polygon models may render slowly or lose detail. The visual result depends strongly on the terminal's font, aspect ratio, and color capabilities; very small windows may produce unrecognizable output. The **--color** mode needs a terminal that supports redefining colors and enough color pairs.

# HISTORY

**3d-ascii-viewer** is an open-source experiment by `autopawn` demonstrating real-time 3D rasterization to ASCII characters without any graphics libraries. It continues a long tradition of terminal 3D renderers from the demoscene and ASCII-art communities.

# SEE ALSO

[blender](/man/blender)(1), [openscad](/man/openscad)(1), [meshlab](/man/meshlab)(1), [figlet](/man/figlet)(1)
