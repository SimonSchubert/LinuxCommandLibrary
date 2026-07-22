# TAGLINE

Automatic CPU speed and power optimizer

# TLDR

**Monitor** CPU frequency and power

```sudo auto-cpufreq --monitor```

Run in **live** mode (temporary optimization)

```sudo auto-cpufreq --live```

Show **statistics**

```sudo auto-cpufreq --stats```

**Install** as system service

```sudo auto-cpufreq --install```

**Remove** system service

```sudo auto-cpufreq --remove```

**Force** a specific governor

```sudo auto-cpufreq --force=powersave```

**Reset** a forced governor back to automatic behavior

```sudo auto-cpufreq --force=reset```

**Update** auto-cpufreq

```sudo auto-cpufreq --update```

# SYNOPSIS

**auto-cpufreq** [_options_]

# DESCRIPTION

**auto-cpufreq** is an automatic CPU speed and power optimizer for Linux. It dynamically adjusts CPU frequency scaling and turbo boost based on system load and power source (AC/battery) to optimize performance and battery life.

# PARAMETERS

**--monitor**
> Monitor CPU frequency, governor, and power information

**--live**
> Run in live mode with temporary optimization

**--stats**
> Display statistics from daemon mode

**--install**
> Install auto-cpufreq as a system service

**--remove**
> Remove auto-cpufreq system service

**--update**
> Update auto-cpufreq to latest version

**--force=GOVERNOR**
> Force a specific governor (powersave, performance) or use reset to return to automatic mode

**--turbo=MODE**
> Force turbo boost behavior (always, never, auto)

**--config=PATH**
> Use a custom configuration file

**--debug**
> Show debug information

**--version**
> Show the installed auto-cpufreq version

# CONFIGURATION

**/etc/auto-cpufreq.conf**
> System-wide configuration file. Defines governor and turbo boost preferences per power source (charger/battery).

**$XDG_CONFIG_HOME/auto-cpufreq/auto-cpufreq.conf**
> Per-user configuration file, checked before the system-wide path. A file given with --config takes precedence over both.

# CAVEATS

Using --install creates a systemd service for automatic operation. The --live and --monitor modes are for testing and do not persist after reboot. For laptops, auto-cpufreq automatically switches between performance and powersave based on power source.

# HISTORY

**auto-cpufreq** was created to provide automatic CPU frequency optimization without manual tuning, particularly useful for laptops to extend battery life while maintaining performance when needed.

# INSTALL

```aur: yay -S auto-cpufreq```

```nix: nix profile install nixpkgs#auto-cpufreq```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[cpupower](/man/cpupower)(1), [cpufreq-info](/man/cpufreq-info)(1), [tlp](/man/tlp)(8)

# RESOURCES

```[Source code](https://github.com/AdnanHodzic/auto-cpufreq)```

<!-- verified: 2026-06-17 -->
