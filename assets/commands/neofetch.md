# TAGLINE

command-line system information tool that displays information about your

# TLDR

**Display system information** with distro logo

```neofetch```

**Use a custom ASCII art** from a file

```neofetch --source [path/to/ascii.txt]```

**Use a specific distro's logo**

```neofetch --ascii_distro [arch]```

**Display only specific info** lines

```neofetch --disable [gpu] [memory]```

**Use an image** instead of ASCII art

```neofetch --backend [kitty] --source [path/to/image.png]```

**Display without ASCII art**

```neofetch --off```

**Save output to file**

```neofetch --stdout > [neofetch.txt]```

# SYNOPSIS

**neofetch** [_options_]

# PARAMETERS

**--disable** _info_
> Disable specific info lines (e.g., gpu, memory, uptime)

**--ascii_distro** _distro_
> Use specified distro's ASCII art

**--source** _path_
> Path to custom ASCII or image file

**--backend** _backend_
> Image backend (ascii, kitty, iterm2, sixel, w3m, etc.)

**--off**
> Disable ASCII art entirely

**--color_blocks** _on/off_
> Enable or disable color blocks

**--colors** _x x x x x x_
> Change text colors (title, @, underline, subtitle, colon, info)

**--ascii_colors** _x x x x x x_
> Change ASCII art colors

**--bold** _on/off_
> Enable or disable bold text

**--stdout**
> Print output to stdout (useful for piping/saving)

**--config** _path_
> Use specified config file

**--print_config**
> Print current config to stdout

**--help**
> Display help message

**--version**
> Display version

# DESCRIPTION

**neofetch** is a command-line system information tool that displays information about your operating system, software, and hardware in an aesthetically pleasing format alongside your distribution's ASCII logo or a custom image.

The information displayed includes the operating system, kernel version, uptime, packages installed, shell, resolution, desktop environment, window manager, terminal, CPU, GPU, and memory usage. All aspects of the output are highly configurable through command-line options or a configuration file.

Neofetch is popular for showing off system setups in screenshots, particularly in the Unix and Linux customization communities. It supports a wide range of operating systems including Linux, BSD, macOS, iOS, and Windows.

# CAVEATS

Image display requires a compatible terminal emulator (kitty, iTerm2, or one supporting sixel/w3m). Some information may not be available on all systems or may require additional tools. First run creates a config file which can significantly alter default behavior.

# HISTORY

**neofetch** was created by **Dylan Araps** and first released in **2015** as a bash script. It quickly gained popularity as a more feature-rich alternative to **screenfetch**. The project became well-known in the Unix rice (customization) community for its extensive customization options and wide distribution support. In **April 2024**, the original developer archived the project, though community forks like **hyfetch** and **fastfetch** continue its legacy.

# SEE ALSO

[screenfetch](/man/screenfetch)(1), [fastfetch](/man/fastfetch)(1), [inxi](/man/inxi)(1), [hwinfo](/man/hwinfo)(1), [lshw](/man/lshw)(1)
