# TAGLINE

Reset unit enablement to defaults

# TLDR

Reset to **preset** defaults

```systemctl preset [unit1 unit2 ...]```

**Enable** only mode

```systemctl preset [unit] --preset-mode enable-only```

**Disable** only mode

```systemctl preset [unit] --preset-mode disable-only```

**Quiet** mode

```systemctl preset [unit] -q```

# SYNOPSIS

**systemctl preset** [_OPTIONS_] _UNIT_...

# PARAMETERS

**--preset-mode=** _MODE_
> full (default), enable-only, or disable-only

**-q, --quiet**
> Suppress output, return only exit code

**--user**
> Operate on user units

# DESCRIPTION

**systemctl preset** resets the enablement state of specified unit files to the defaults defined in preset policy files. Preset files in `/usr/lib/systemd/system-preset/` and `/etc/systemd/system-preset/` define which units should be enabled or disabled by default.

This is typically used after package installation to set the initial enablement state according to distribution policy.

# CAVEATS

Preset policies are distribution-specific. Running preset on a unit may change whether it starts at boot. Use `--preset-mode` to limit changes to only enabling or disabling.

# HISTORY

The **preset** subcommand implements policy-based enablement, allowing distributions to define default service states while letting administrators override them.

# SEE ALSO

[systemctl-preset-all](/man/systemctl-preset-all)(1), [systemctl-enable](/man/systemctl-enable)(1), [systemd.preset](/man/systemd.preset)(5)
