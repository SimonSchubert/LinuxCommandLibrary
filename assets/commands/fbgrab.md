# TLDR

**Take a screenshot** of the current framebuffer

```fbgrab [screenshot.png]```

**Take a screenshot** from a specific framebuffer device

```fbgrab -d [/dev/fb0] [screenshot.png]```

**Take a screenshot** of a specific virtual terminal

```fbgrab -c [1] [screenshot.png]```

**Wait 5 seconds** before taking a screenshot

```fbgrab -s [5] [screenshot.png]```

**Convert a framebuffer dump** to PNG

```fbgrab -w [1920] -h [1080] -b [32] -f [framebuffer.dump] [screenshot.png]```

**Disable interlacing** in the output PNG

```fbgrab -i [screenshot.png]```

# SYNOPSIS

**fbgrab** [_options_] _filename_

# PARAMETERS

**-?**
> Display usage information.

**-a**
> Ignore the alpha channel. Useful for pixel formats like BGR32 where drivers incorrectly report alpha.

**-b** _bitdepth_
> The number of bits per pixel. Optional when reading from device.

**-c** _console_
> Specifies which console (virtual terminal) to grab.

**-C** _console_
> Switch console with a delay before capturing.

**-d** _device_
> Framebuffer device to use. Defaults to FRAMEBUFFER environment variable or /dev/fb0.

**-f** _filename_
> Read from file instead of device. Requires -w, -h, and -b options.

**-h** _height_
> The height of the framebuffer in pixels. Optional when reading from device.

**-i**
> Turns off ADAM7 interlacing in the output PNG.

**-l** _line_length_
> Line length (stride) in pixels between the start of each row. Optional when reading from device.

**-s** _seconds_
> Seconds to wait before grabbing the screenshot.

**-v**
> Enable verbose output.

**-w** _width_
> The width of the framebuffer in pixels. Optional when reading from device.

**-z** _compression_
> Set PNG compression level (0=fast, 9=best).

# DESCRIPTION

**fbgrab** reads the Linux framebuffer device (/dev/fb*) or a dump thereof and saves a PNG image file. It can capture screenshots of virtually any application, from traditional text applications to X-windows desktops and framebuffer applications.

The tool is particularly useful for capturing screenshots on systems without a running X server, embedded systems, or when working directly with the Linux console.

# CAVEATS

The **-c** option may require root privileges or the CAP_SYS_TTY_CONFIG capability. When reading from a raw dump file, the **-w**, **-h**, and **-b** options must all be specified. The framebuffer device must be accessible with appropriate permissions.

# HISTORY

**fbgrab** was written by Gunnar Monell as a rewrite of fbshot by Stephan Beyer. The tool has been maintained since 2002 and is licensed under GPL version 2.

# SEE ALSO

[scrot](/man/scrot)(1), [import](/man/import)(1), [xwd](/man/xwd)(1), [screenshot](/man/screenshot)(1)
