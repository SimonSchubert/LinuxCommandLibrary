# TAGLINE

EGL graphics library information display

# TLDR

Display **full** platform EGL information

```eglinfo```

Display **brief** platform information

```eglinfo -B```

Display information for a **specific platform**

```eglinfo -p [x11|wayland|gbm|surfaceless]```

Display **help**

```eglinfo -h```

# SYNOPSIS

**eglinfo** [_options_]

# DESCRIPTION

**eglinfo** displays information about EGL (Embedded-System Graphics Library) implementations on the system. It shows available displays, configurations, extensions, and rendering APIs.

Useful for debugging graphics issues and verifying GPU driver configuration.

# PARAMETERS

**-B**
> Brief output, showing only essential information.

**-s**
> Print one extension per line.

**-v**
> Print configuration details in verbose form.

**-l**
> Show OpenGL limits (requires EGL 1.2+).

**-a** _api_
> Display information for a specific API (gl, glcore, gles).

**-p** _platform_
> Display information for a specific platform (x11, wayland, gbm, surfaceless, android).

**-h**
> Display help information.

# CAVEATS

Requires a working EGL implementation. Output depends on graphics drivers installed. May not work in headless environments without display.

# SEE ALSO

[glxinfo](/man/glxinfo)(1), [vulkaninfo](/man/vulkaninfo)(1)
