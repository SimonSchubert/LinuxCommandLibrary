# TLDR

**Display system information**

```fastfetch```

**Use specific config preset**

```fastfetch --config [paleofetch]```

**Show specific modules only**

```fastfetch --structure "Title:Separator:OS:Host:Kernel:Uptime"```

**Hide logo**

```fastfetch --logo none```

**Use specific logo**

```fastfetch --logo [arch]```

**Use small logo**

```fastfetch --logo-type small```

**List available presets**

```fastfetch --list-presets```

**Generate config file**

```fastfetch --gen-config```

# SYNOPSIS

**fastfetch** [_options_]

# DESCRIPTION

**fastfetch** is a fast, highly customizable system information tool written in C. It displays information about your operating system, software, and hardware in a visually appealing format with ASCII art logos.

The tool is designed as a faster alternative to neofetch, screenfetch, and similar system info tools. It's highly configurable through JSON config files and command-line options, supporting custom module orders, colors, and logos.

fastfetch detects and displays OS, kernel, DE/WM, terminal, shell, CPU, GPU, memory, disk, battery, and many other system properties. It supports multiple platforms including Linux, macOS, Windows, and FreeBSD.

# PARAMETERS

**--config** _file_
> Use specified configuration file.

**--structure** _modules_
> Specify modules to display.

**--logo** _name_
> Logo to display (or "none").

**--logo-type** _type_
> Logo type (normal, small, builtin).

**--color** _colors_
> Set output colors.

**--separator** _string_
> String between label and value.

**--gen-config** [_file_]
> Generate configuration file.

**--list-presets**
> List available config presets.

**--list-logos**
> List available logos.

**--list-modules**
> List available modules.

**--help**
> Display help information.

**--version**
> Display version information.

# CAVEATS

Some modules require specific system support or libraries. GPU detection may need proper drivers. Custom logos require appropriate terminal font. Configuration file format has changed between versions.

# HISTORY

**fastfetch** was created by **Linus Dierheimer** (LinusDierheimer) in **2021** as a faster alternative to neofetch. It was written in C for performance, addressing complaints about neofetch's bash implementation being slow. The project gained popularity rapidly due to its speed and extensive customization options.

# SEE ALSO

[neofetch](/man/neofetch)(1), [screenfetch](/man/screenfetch)(1), [inxi](/man/inxi)(1), [hwinfo](/man/hwinfo)(1)
