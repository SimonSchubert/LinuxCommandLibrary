# TAGLINE

MDM Display Manager, Linux Mint's former login screen

# TLDR

**Start the MDM daemon** in the foreground (for debugging)

```sudo mdm -nodaemon```

**Open the graphical configuration tool**

```sudo mdmsetup```

**Restart MDM** (ends all running sessions)

```sudo systemctl restart mdm```

**Restart MDM** once all users have logged out

```sudo mdm-safe-restart```

**Check status**

```systemctl status mdm```

**View logs**

```journalctl -u mdm```

# SYNOPSIS

**mdm** [_options_]

**mdmsetup** [_options_]

# PARAMETERS

**-nodaemon**
> Do not fork into the background.

**--no-console**
> Do not run local (console) X servers; only serve remote XDMCP logins.

**--preserve-ld-vars**
> Preserve LD_* environment variables.

**--help**
> Display help information.

**--version**
> Show version.

# DESCRIPTION

**mdm** is the MDM Display Manager. It starts and manages X servers for local logins and remote logins via XDMCP, and provides a graphical login screen with user authentication and session selection. It was the default display manager of Linux Mint editions with Cinnamon and MATE.

**mdmsetup** is a graphical tool for changing the most common options, such as the greeter theme and automatic login. Other helpers include **mdmflexiserver** (start an additional login on a new display), **mdm-restart**, **mdm-safe-restart**, and **mdm-stop**.

# CONFIGURATION

**/etc/mdm/mdm.conf**
> Local overrides of the defaults, set in **[section]** blocks such as **[daemon]** and **[security]**.

**/usr/share/mdm/defaults.conf**
> Default settings shipped with the package; do not edit, override in **mdm.conf** instead.

**/etc/mdm/Init/**, **/etc/mdm/PostLogin/**, **/etc/mdm/PreSession/**, **/etc/mdm/PostSession/**
> Scripts run at the corresponding stages of a login.

# CAVEATS

Discontinued and no longer maintained: Linux Mint replaced MDM with **LightDM** and the Slick Greeter as the default in Linux Mint 18.2 (2017), and the upstream repository is archived. MDM is not available in current distribution releases.

# HISTORY

MDM was created by **Linux Mint** in **2011** as a fork of **GDM 2.20**, keeping the older, highly configurable GDM codebase that GNOME had replaced with a rewrite starting in GDM 2.22. Its last release was **2.0.19** in **2017**.

# SEE ALSO

[gdm](/man/gdm)(1), [dm-tool](/man/dm-tool)(1), [cinnamon](/man/cinnamon)(1)

# RESOURCES

```[Source code](https://github.com/linuxmint/mdm)```

<!-- verified: 2026-11-23 -->
