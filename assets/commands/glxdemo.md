# TAGLINE

simple OpenGL rendering test

# TLDR

**Run OpenGL demo**

```glxdemo```

# SYNOPSIS

**glxdemo**

# DESCRIPTION

**glxdemo** is a simple OpenGL demonstration program that shows how to use GLX functions to create an OpenGL program running on top of an X server. It opens a window and renders a basic 3D scene to verify that OpenGL rendering is working correctly on the system.

The program is most useful when studied in source code form. If it runs successfully, OpenGL acceleration is properly configured.

# CAVEATS

Requires X11 and OpenGL. Part of mesa-utils (or mesa-demos). Basic functionality test only; accepts no command-line options.

# HISTORY

glxdemo is part of **Mesa demos**, providing simple programs for testing OpenGL rendering on Linux/Unix systems.

# INSTALL

```apt: sudo apt install mesa-utils```

```dnf: sudo dnf install mesa-demos```

```pacman: sudo pacman -S mesa-utils```

```apk: sudo apk add mesa-demos```

```nix: nix profile install nixpkgs#mesa-demos```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[glxinfo](/man/glxinfo)(1), [glxgears](/man/glxgears)(1)
