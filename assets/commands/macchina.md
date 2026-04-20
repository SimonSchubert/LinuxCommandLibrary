# TAGLINE

system information fetcher written in Rust

# TLDR

**Display system information**

```macchina```

**Use a specific theme**

```macchina --theme [Hydrogen]```

**Show only specific readouts**

```macchina --show [host,kernel,uptime]```

**Show memory and disk usage as percentages**

```macchina -m -p```

**Display full, un-truncated kernel and uptime strings**

```macchina --long-kernel --long-uptime```

**List available themes**

```macchina --list-themes```

**Diagnose configuration issues**

```macchina --doctor```

# SYNOPSIS

**macchina** [_--theme name_] [_--show fields_] [_options_]

# PARAMETERS

**-t**, **--theme** _NAME_
> Use the named theme.

**-o**, **--show** _FIELDS_
> Show only the listed readouts (comma-separated).

**-c**, **--config** _FILE_
> Use an alternate configuration file.

**-l**, **--list-themes**
> List available themes and exit.

**-d**, **--doctor**
> Check configuration for issues.

**-m**, **--memory-percentage**
> Display memory usage as a percentage.

**-p**, **--disk-space-percentage**
> Display disk-space usage as a percentage.

**-D**, **--disks**
> Show one line per detected disk.

**-C**, **--physical-cores**
> Count physical CPU cores instead of logical ones.

**-U**, **--long-uptime**
> Render uptime in a long, human-readable form.

**-K**, **--long-kernel**
> Render the full kernel version string without truncation.

**-S**, **--long-shell**
> Print the absolute path of the user shell, not just its name.

**-s**, **--current-shell**
> Report the shell of the current process instead of the login shell.

**-i**, **--interface** _NAME_
> Report the address of a specific network interface.

**--ascii-artists**
> Show the credits for the built-in ASCII art.

**-v**, **--version**
> Show version.

**-h**, **--help**
> Show help.

# DESCRIPTION

**macchina** is a system information fetcher written in Rust. It displays system details with customizable ASCII art and theming, similar to neofetch but with a focus on performance.

Information includes: host, kernel, OS, uptime, packages, shell, terminal, CPU, GPU, memory, disk usage, battery, and more. Each field is called a "readout" and can be individually shown or hidden.

Themes control colors, formatting, and layout. Built-in themes range from minimal to elaborate. Custom themes can be created in TOML format.

ASCII art can display distribution logos or custom artwork. The art adapts to terminal colors defined by the theme and is configured via the active theme rather than a dedicated CLI flag.

Configuration is stored in ~/.config/macchina/macchina.toml. It defines default theme, visible readouts, custom colors, and ASCII settings.

Performance is a key feature - macchina starts quickly and uses minimal resources compared to similar tools.

# CAVEATS

Some readouts require specific system access. GPU detection may not work on all systems. Custom themes need proper TOML syntax. Terminal color support varies. Some features are platform-specific.

# HISTORY

**macchina** was created by **Uttarayan Mondal** (grtcdr) around **2020**. Written in Rust for performance, it aimed to provide a faster alternative to neofetch while maintaining customization options. The name comes from the Italian word for "machine."

# SEE ALSO

[neofetch](/man/neofetch)(1), [fastfetch](/man/fastfetch)(1), [pfetch](/man/pfetch)(1), [onefetch](/man/onefetch)(1)
