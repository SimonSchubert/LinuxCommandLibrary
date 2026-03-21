# TAGLINE

Manage the uv installation itself

# TLDR

**Update uv to the latest version**

```uv self update```

**Update uv to a specific version**

```uv self update [0.6.0]```

**Uninstall uv**

```uv self uninstall```

# SYNOPSIS

**uv** **self** _command_ [_options_]

# PARAMETERS

**update**
> Update uv to the latest version, or to a specified version.

**uninstall**
> Uninstall uv.

**--target-version** _version_
> Update to a specific version (used with update subcommand).

# DESCRIPTION

**uv self** manages the uv installation itself. Use to update uv to the latest version, update to a specific version, or uninstall uv entirely. The update command downloads the new binary and replaces the current installation in place.

# SEE ALSO

[uv](/man/uv)(1), [uv-version](/man/uv-version)(1), [uv-pip](/man/uv-pip)(1), [uv-tool](/man/uv-tool)(1), [pip](/man/pip)(1)
