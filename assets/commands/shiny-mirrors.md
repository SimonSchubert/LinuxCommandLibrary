# TAGLINE

Manage Manjaro Linux mirror lists

# TLDR

Get **status** of current mirrors

```shiny-mirrors status```

**Generate** a mirror list using defaults

```sudo shiny-mirrors refresh```

Display current **configuration**

```shiny-mirrors config show```

Switch to a different **branch** interactively

```sudo shiny-mirrors config --branch```

Refresh mirrors for a **specific country**

```sudo shiny-mirrors refresh --country [country_code]```

# SYNOPSIS

**shiny-mirrors** _command_ [_OPTIONS_]

# PARAMETERS

**status**
> Display current mirror status and health

**refresh**
> Generate and update the mirror list based on configured criteria

**config show**
> Display the current configuration file

**config --branch**
> Interactively switch to a different Manjaro branch (stable, testing, unstable)

**--country** _code_
> Filter mirrors by country code

**--protocol** _protocol_
> Filter by protocol (https, http)

**--help**
> Display usage information

# DESCRIPTION

**shiny-mirrors** generates and manages pacman mirror lists for Manjaro Linux. It tests available mirrors for speed and reliability, then creates an optimized mirror list for package downloads.

The tool selects mirrors based on geographic location, response time, and synchronization status. After running shiny-mirrors, you must synchronize your database and update your system using **sudo pacman -Syyu** to apply the new mirror configuration.

# CAVEATS

Requires root privileges for refresh operations that modify system files. Mirror selection may vary based on network conditions at test time. Always run **pacman -Syyu** after refreshing mirrors to avoid partial upgrades. Branch switching affects which package versions are available.

# HISTORY

**shiny-mirrors** is a Manjaro-specific tool developed as a modern replacement for **pacman-mirrors**. It is designed to provide faster and more reliable mirror management for Manjaro Linux users. The tool is actively maintained as part of the Manjaro ecosystem.

# SEE ALSO

[pacman](/man/pacman)(8), [pacman-mirrors](/man/pacman-mirrors)(1), [reflector](/man/reflector)(1)
