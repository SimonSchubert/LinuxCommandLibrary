# TLDR

Reset **all** units to preset defaults

```sudo systemctl preset-all```

**Enable** only mode

```sudo systemctl preset-all --preset-mode enable-only```

**Disable** only mode

```sudo systemctl preset-all --preset-mode disable-only```

**Quiet** mode

```sudo systemctl preset-all -q```

# SYNOPSIS

**systemctl preset-all** [_OPTIONS_]

# PARAMETERS

**--preset-mode=** _MODE_
> full (default), enable-only, or disable-only

**-q, --quiet**
> Suppress output, return only exit code

**--user**
> Operate on user units

# DESCRIPTION

**systemctl preset-all** resets the enablement state of all installed unit files to the defaults defined in preset policy files. This applies distribution default settings to every unit on the system.

This is typically run once after initial system installation or when resetting to distribution defaults.

# CAVEATS

This is a system-wide operation that can change many service enablement states. Use `--preset-mode` to limit to only enabling or disabling. Backup your current configuration before running.

# HISTORY

The **preset-all** subcommand provides a way to reset the entire system to distribution-default service configuration, useful for recovery or standardization.

# SEE ALSO

[systemctl-preset](/man/systemctl-preset)(1), [systemctl-enable](/man/systemctl-enable)(1), [systemd.preset](/man/systemd.preset)(5)
