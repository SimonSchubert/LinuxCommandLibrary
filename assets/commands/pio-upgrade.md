# TAGLINE

Upgrade PlatformIO Core to latest version

# TLDR

**Upgrade PlatformIO Core to the latest stable version**

```pio upgrade```

**Upgrade to the latest development version**

```pio upgrade --dev```

# SYNOPSIS

**pio upgrade** [_options_]

# PARAMETERS

**--dev**
> Upgrade to the latest development version instead of stable.

# DESCRIPTION

**pio upgrade** upgrades the PlatformIO Core CLI tool itself to the latest release. By default it installs the latest stable version. Use **--dev** to install the development version for testing new features before they are officially released.

# CAVEATS

Requires an internet connection to download the update. May require elevated permissions depending on the installation method. After upgrading, restart any running PlatformIO processes.

# SEE ALSO

[pio-update](/man/pio-update)(1), [pio](/man/pio)(1)

