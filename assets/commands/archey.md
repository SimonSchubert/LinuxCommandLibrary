# TAGLINE

Display system information with ASCII art logo

# TLDR

Show **system information**

```archey```

# SYNOPSIS

**archey** [_options_]

# DESCRIPTION

**archey** is a simple tool for stylishly displaying system information in the terminal. It shows an ASCII art logo of the Linux distribution alongside system details like OS, kernel, uptime, packages, shell, resolution, desktop environment, and hardware information.

# PARAMETERS

**-c, --color**
> Force colored output

**-n, --no-color**
> Disable colored output

# CONFIGURATION

**~/.config/archey4/config.yaml**
> User-specific configuration for archey4, controlling which entries to display, colors, and logo.

**/etc/archey4/config.yaml**
> System-wide configuration for archey4.

# CAVEATS

Different versions exist for different distributions (archey, archey3, archey4). Display varies based on the distribution and available system information.

# HISTORY

Originally created for **Arch Linux** by Melik Manukyan. Various forks exist including archey3 (Python 3) and archey4.

# SEE ALSO

[neofetch](/man/neofetch)(1), [screenfetch](/man/screenfetch)(1), [fastfetch](/man/fastfetch)(1)
