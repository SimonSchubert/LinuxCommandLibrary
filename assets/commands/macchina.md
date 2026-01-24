# TLDR

**Display system information**

```macchina```

**Use specific theme**

```macchina --theme [Hydrogen]```

**Show with custom ASCII art**

```macchina --ascii-art [/path/to/art.txt]```

**Show only specific fields**

```macchina --show [Host,Kernel,Uptime]```

**Hide specific fields**

```macchina --hide [GPU,Disk]```

**List available themes**

```macchina --list-themes```

**Export current config**

```macchina --export-config```

**Disable ASCII art**

```macchina --no-ascii```

# SYNOPSIS

**macchina** [_--theme name_] [_--show fields_] [_--hide fields_] [_options_]

# PARAMETERS

**-t**, **--theme** _NAME_
> Use specified theme.

**-o**, **--show** _FIELDS_
> Show only specified readouts.

**-x**, **--hide** _FIELDS_
> Hide specified readouts.

**-c**, **--config** _FILE_
> Use custom config file.

**--no-ascii**
> Disable ASCII art.

**--ascii-art** _FILE_
> Use custom ASCII art from file.

**--list-themes**
> List available themes.

**--export-config**
> Print current configuration.

**-d**, **--doctor**
> Check configuration for issues.

**-v**, **--version**
> Show version.

**-h**, **--help**
> Show help.

# DESCRIPTION

**macchina** is a system information fetcher written in Rust. It displays system details with customizable ASCII art and theming, similar to neofetch but with a focus on performance.

Information includes: host, kernel, OS, uptime, packages, shell, terminal, CPU, GPU, memory, disk usage, battery, and more. Each field is called a "readout" and can be individually shown or hidden.

Themes control colors, formatting, and layout. Built-in themes range from minimal to elaborate. Custom themes can be created in TOML format.

ASCII art can display distribution logos or custom artwork. The art adapts to terminal colors defined by the theme.

Configuration is stored in ~/.config/macchina/macchina.toml. It defines default theme, visible readouts, custom colors, and ASCII settings.

Performance is a key feature - macchina starts quickly and uses minimal resources compared to similar tools.

# CAVEATS

Some readouts require specific system access. GPU detection may not work on all systems. Custom themes need proper TOML syntax. Terminal color support varies. Some features are platform-specific.

# HISTORY

**macchina** was created by **Uttarayan Mondal** (grtcdr) around **2020**. Written in Rust for performance, it aimed to provide a faster alternative to neofetch while maintaining customization options. The name comes from the Italian word for "machine."

# SEE ALSO

[neofetch](/man/neofetch)(1), [fastfetch](/man/fastfetch)(1), [pfetch](/man/pfetch)(1), [onefetch](/man/onefetch)(1)
