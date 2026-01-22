# TLDR

**Display system information** with distro logo

```screenfetch```

**Take a screenshot** after displaying information

```screenfetch -s```

**Use a specific distro's logo**

```screenfetch -D [arch]```

**Display without ASCII art**

```screenfetch -n```

**Display ASCII art only** (no system info)

```screenfetch -L```

**Output in a format** suitable for screenshot software

```screenfetch -p```

**Display with verbose error messages**

```screenfetch -v```

# SYNOPSIS

**screenfetch** [_-v_] [_-o 'OPTIONS'_] [_-d '+STEAM quance'_] [_-n_] [_-N_] [_-t_] [_-p_] [_-s_] [_-c string_] [_-D distro_] [_-A distro_] [_-E_] [_-V_] [_-h_]

# PARAMETERS

**-v**
> Verbose output for error checking

**-o** _'OPTIONS'_
> Allows for setting screenshot options

**-n**
> Do not display ASCII art

**-N**
> Strip all color from output

**-t**
> Truncate output based on terminal width

**-p**
> Output in screenshot-friendly format

**-s**
> Take a screenshot after displaying info

**-c** _string_
> Set colors (string of 2 numbers 0-9)

**-D** _distro_
> Set specific distro for detection override

**-A** _distro_
> Set specific distro for ASCII art only

**-L**
> Display ASCII art only (no system info)

**-E**
> Suppress errors

**-V**
> Display version and exit

**-h**
> Display help and exit

# DESCRIPTION

**screenfetch** is a bash script that displays system information alongside an ASCII representation of your operating system's logo. It fetches and displays details about the OS, kernel, uptime, packages, shell, resolution, desktop environment, window manager, theme, icons, font, CPU, GPU, and RAM.

The tool is designed for creating screenshots that showcase system configurations, commonly used in the Unix customization ("ricing") community. It detects the running distribution or operating system and selects the appropriate ASCII art logo automatically.

Screenfetch supports a wide variety of Linux distributions, BSDs, macOS, and other Unix-like systems. The output is highly customizable through command-line options and environment variables.

# CAVEATS

Some system information may not be available on all platforms or configurations. Screenshot functionality requires **scrot** or **import** (ImageMagick) to be installed. Verbose mode is helpful for troubleshooting detection issues. GPU detection may fail on systems with proprietary drivers.

# HISTORY

**screenfetch** was created by **KittyKatt** (Brett Bohnenkamper) and first released in **2010**. It was one of the first popular system information tools designed for Unix customization screenshots. The project gained significant popularity in the Linux community before the emergence of **neofetch** in 2015, which offered more features and customization options. Screenfetch remains available and functional, though it receives less active development than its successors.

# SEE ALSO

[neofetch](/man/neofetch)(1), [fastfetch](/man/fastfetch)(1), [inxi](/man/inxi)(1), [lshw](/man/lshw)(1), [hwinfo](/man/hwinfo)(1)
