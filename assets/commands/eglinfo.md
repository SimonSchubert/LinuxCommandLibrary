# TAGLINE

EGL graphics library information display

# TLDR

Display **full** platform EGL information

```eglinfo```

Display **brief** platform information

```eglinfo -B```

Display **help**

```eglinfo -h```

# SYNOPSIS

**eglinfo** [_options_]

# DESCRIPTION

**eglinfo** displays information about EGL (Embedded-System Graphics Library) implementations on the system. It shows available displays, configurations, extensions, and rendering APIs.

Useful for debugging graphics issues and verifying GPU driver configuration.

# PARAMETERS

**-B**
> Brief output format

**-h**
> Display help information

# CAVEATS

Requires a working EGL implementation. Output depends on graphics drivers installed. May not work in headless environments without display.

# SEE ALSO

[glxinfo](/man/glxinfo)(1), [vulkaninfo](/man/vulkaninfo)(1)
