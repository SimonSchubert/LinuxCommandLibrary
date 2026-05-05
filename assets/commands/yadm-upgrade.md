# TAGLINE

Migrate yadm configuration version

# TLDR

**Upgrade yadm configuration**

```yadm upgrade```

# SYNOPSIS

**yadm** **upgrade**

# DESCRIPTION

**yadm upgrade** migrates an existing yadm installation to the layout used by the current version. In particular, it relocates the yadm repository and configuration from the legacy **~/.yadm** directory to the XDG-compliant locations under **$XDG_DATA_HOME/yadm** and **$XDG_CONFIG_HOME/yadm** (typically **~/.local/share/yadm** and **~/.config/yadm**).

It also normalizes encrypted file storage and other on-disk layouts that have changed across yadm releases. Run this once after upgrading yadm so subsequent commands find files in the expected places.

# CAVEATS

The upgrade is a one-time, mostly idempotent operation; running it on an already-upgraded repository is safe but performs no work. Back up your dotfiles repository before running it on systems with custom yadm hooks or unusual configurations.

# SEE ALSO

[yadm](/man/yadm)(1), [git](/man/git)(1)

