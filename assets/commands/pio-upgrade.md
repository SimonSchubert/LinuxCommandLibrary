# TAGLINE

Upgrade PlatformIO Core to latest version

# TLDR

**Upgrade** PlatformIO Core to the latest **stable** version

```pio upgrade```

**Upgrade** to the latest **development** version

```pio upgrade --dev```

# SYNOPSIS

**pio upgrade** [_options_]

# PARAMETERS

**--dev**
> Upgrade to the latest development version instead of stable. Provides access to new features before official release but may be less stable.

# DESCRIPTION

**pio upgrade** checks for and upgrades the PlatformIO Core CLI tool itself to the latest release. By default it installs the latest stable version. Use **--dev** to install the development version for testing new features before they are officially released.

Unlike **pio update**, which updates project platform packages and libraries, **pio upgrade** targets the underlying PlatformIO Core installation.

# CAVEATS

Requires an internet connection to download the update. May require elevated permissions depending on the installation method (e.g., system-wide pip install). After upgrading, restart any running PlatformIO processes or IDE integrations.

# SEE ALSO

[pio-update](/man/pio-update)(1), [pio](/man/pio)(1), [pip](/man/pip)(1)
