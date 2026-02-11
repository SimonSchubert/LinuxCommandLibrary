# TAGLINE

Edit systemd unit override files

# TLDR

**Overlay** unit file non-destructively

```sudo systemctl edit [unit]```

**Edit** full unit file

```sudo systemctl edit [unit] --full```

**Create** new unit file

```sudo systemctl edit [unit] --full --force```

Edit **user** unit file

```systemctl edit [unit] --user```

# SYNOPSIS

**systemctl edit** [_OPTIONS_] _UNIT_...

# PARAMETERS

**-l, --full**
> Edit the main unit file instead of creating a drop-in override

**--force**
> Create a new unit file if it doesn't exist (with --full)

**--user**
> Edit user unit files

**--system**
> Edit system unit files (default)

**--runtime**
> Make changes temporary (cleared on reboot)

# DESCRIPTION

**systemctl edit** opens a text editor to modify systemd unit files. By default, it creates a drop-in override file in `/etc/systemd/system/<unit>.d/override.conf` that extends the original unit without modifying it directly.

With `--full`, the entire unit file is opened for editing. With `--full --force`, a new unit file can be created. After editing, systemd automatically reloads the configuration. The editor is determined by `SYSTEMD_EDITOR`, `EDITOR`, or `VISUAL` environment variables.

# CAVEATS

Drop-in files only add or override specific settings; they cannot remove existing configuration. The daemon reloads automatically after edit, but running units may need manual restart. Syntax errors in unit files can prevent services from starting.

# HISTORY

The **edit** subcommand was added to **systemctl** to simplify unit customization. Systemd was created by **Lennart Poettering** and **Kay Sievers** at Red Hat and has been the default init system for most major Linux distributions since **2015**. The drop-in override pattern allows safe customization that persists across package updates.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemd.unit](/man/systemd.unit)(5), [systemctl-revert](/man/systemctl-revert)(1)
