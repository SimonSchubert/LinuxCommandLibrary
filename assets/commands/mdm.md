# TLDR

**Start MDM**

```mdm```

**Configure MDM**

```mdm-config```

**Restart MDM**

```systemctl restart mdm```

**Check status**

```systemctl status mdm```

**View logs**

```journalctl -u mdm```

# SYNOPSIS

**mdm** [_options_]

# PARAMETERS

**--help**
> Display help information.

**--version**
> Show version.

# DESCRIPTION

**mdm** is the MDM Display Manager. It provides a graphical login screen for Linux Mint.

The tool handles user authentication and session selection. Fork of GDM for Cinnamon/MATE.

mdm is Mint display manager.

# CAVEATS

Linux Mint specific. Deprecated in favor of LightDM. Legacy display manager.

# HISTORY

MDM was **Linux Mint's** display manager, a fork of GDM, now largely replaced by LightDM.

# SEE ALSO

[lightdm](/man/lightdm)(1), [gdm](/man/gdm)(1), [sddm](/man/sddm)(1)

