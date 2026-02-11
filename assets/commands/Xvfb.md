# TAGLINE

Virtual framebuffer X server

# TLDR

**Start virtual display**

```Xvfb :99```

**Start with specific screen size**

```Xvfb :99 -screen 0 [1920x1080x24]```

**Start with multiple screens**

```Xvfb :1 -screen 0 [1280x1024x24] -screen 1 [800x600x16]```

**Use shared memory**

```Xvfb :99 -shmem -screen 0 [1024x768x24]```

**Store framebuffer in directory**

```Xvfb :99 -fbdir [/tmp/xvfb]```

**Run application with xvfb-run**

```xvfb-run -a [application]```

**xvfb-run with custom screen**

```xvfb-run -s "-screen 0 1280x1024x24" [application]```

# SYNOPSIS

**Xvfb** [:_display_] [_options_]

# PARAMETERS

**:display**
> Display number (default: 0).

**-screen** _num_ _WxHxD_
> Configure screen: number, width x height x depth.

**-pixdepths** _list_
> Additional pixmap depths to support.

**-fbdir** _dir_
> Directory for memory-mapped framebuffer files.

**-shmem**
> Use shared memory for framebuffer.

**-linebias** _n_
> Adjust line pixelization.

**-blackpixel** _value_
> Set black pixel value.

**-whitepixel** _value_
> Set white pixel value.

# XVFB-RUN OPTIONS

**-a**, **--auto-servernum**
> Find available display number automatically.

**-s** _args_
> Arguments to pass to Xvfb.

**-e** _file_
> File to store Xvfb error output.

**-f** _file_
> Authority file to use.

**-n** _num_
> Server number to use.

# DESCRIPTION

**Xvfb** (X Virtual FrameBuffer) is an X server that performs all graphical operations in memory without any physical display. It implements the X11 protocol, allowing X applications to run without visible output.

Common use cases include running GUI applications on headless servers, automated testing of graphical applications, rendering graphics for web services, and CI/CD pipelines that require X applications.

The **xvfb-run** wrapper script simplifies usage by automatically selecting a display number and handling authentication.

Default screen configuration is 1280x1024x24 (width x height x depth in bits).

# CAVEATS

No GPU acceleration. Some applications may behave differently without real display. Memory usage scales with screen size and depth. Applications expecting specific display features may fail.

# HISTORY

**Xvfb** has been part of the X.Org server distribution since the X11R5 release. It was developed to enable X applications to run on systems without display hardware, supporting server-side rendering and automated testing long before headless browser technologies.

# SEE ALSO

[X](/man/X)(7), [Xserver](/man/Xserver)(1), [xvfb-run](/man/xvfb-run)(1), [xdpyinfo](/man/xdpyinfo)(1)
