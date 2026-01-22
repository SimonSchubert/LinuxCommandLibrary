# TLDR

Display **system information**

```nitch```

Display **help**

```nitch -h```

Display **version**

```nitch -v```

# SYNOPSIS

**nitch** [**-h**|**--help**] [**-v**|**--version**]

# PARAMETERS

**-h, --help**
> Display help information

**-v, --version**
> Display version information

# DESCRIPTION

**nitch** is a small, fast system fetch utility written in Nim. It displays system information including hostname, username, operating system, kernel version, uptime, shell, packages, and memory usage.

The tool is designed for speed and minimalism, with no configuration options. It focuses on displaying essential system information quickly with a clean, colorful output format.

# OUTPUT

Displays:
- User and hostname
- Operating system
- Kernel version
- Uptime
- Shell
- Package count
- Memory usage (used/total)

# CAVEATS

Package count accuracy depends on the package manager detected. Some information may not be available on all systems. No configuration or customization options.

# HISTORY

**nitch** was developed by **ssleert** as an alternative to heavier system fetch tools like neofetch and fastfetch. Written in Nim for high performance, it focuses on displaying only essential system information with minimal resource usage.

# SEE ALSO

[neofetch](/man/neofetch)(1), [fastfetch](/man/fastfetch)(1), [screenfetch](/man/screenfetch)(1)
