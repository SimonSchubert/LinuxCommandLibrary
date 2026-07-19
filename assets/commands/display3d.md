# TAGLINE

Render and animate 3D models in the terminal

# TLDR

**Show help**

```display3d --help```

**Render** an OBJ model with translation

```display3d [model.obj] -t [0,0,5.5]```

**Render** the example shark (from repo resources)

```display3d blahaj.obj -t 0,0,5.5```

# SYNOPSIS

**display3d** [*options*] *model-file*

# DESCRIPTION

**display3d** is a command-line interface for rendering and animating 3D objects in the terminal using ANSI escape codes. It is written in Rust with the **gemini-engine** crate.

Supported formats:

- **.obj** (with optional **.mtl** for colours; when exporting from Blender, set forward axis to +Z and up axis to +Y)
- **.stl**

Install via **cargo install display3d**, the AUR package **display3d**, nixpkgs (**pkgs.display3d** / **nix run nixpkgs#display3d**), or by building from source (**cargo build --release**).

# PARAMETERS

See **display3d --help** for the full set of camera, transform, animation, and display options of your installed version. Common usage passes a model path and optional transform flags such as **-t** for translation.

# CAVEATS

Requires a terminal with reliable ANSI escape code support (often unreliable on Windows). Colourful OBJ rendering needs a matching **.mtl** beside the **.obj**. Performance depends on model complexity and terminal size.

# SEE ALSO

[chafa](/man/chafa)(1), [timg](/man/timg)(1), [ascii-image-converter](/man/ascii-image-converter)(1)

# RESOURCES

```[Source code](https://github.com/renpenguin/display3d)```

<!-- verified: 2026-07-19 -->
