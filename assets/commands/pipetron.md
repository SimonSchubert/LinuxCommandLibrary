# TAGLINE

PipeWire node manager for Electron audio streams

# TLDR

**Start** the pipetron daemon

```pipetron --daemon```

**Start** the volume daemon only

```pipetron --volume-daemon```

**Start** the audio daemon (experimental)

```pipetron --audio-daemon```

**Show version** information

```pipetron --version```

# SYNOPSIS

**pipetron** [**-d**|**-vd**|**-ad**] [**-h**] [**-v**]

# PARAMETERS

**-d**, **--daemon**
> Start the daemon as specified in the configuration file.

**-vd**, **--volume-daemon**
> Start the volume daemon specifically.

**-ad**, **--audio-daemon**
> Start the audio daemon (experimental).

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Show version details.

# DESCRIPTION

**pipetron** is a PipeWire node manager that fixes a long-standing issue with Electron applications showing all their audio streams as "Chromium" in PipeWire-based audio managers. This makes it impossible to distinguish between different Electron apps in volume controllers like **pavucontrol**.

Pipetron replicates each Electron audio stream with its actual application name and icon, then performs a one-way volume sync from the replicated stream to the corresponding Electron stream. As a result, **WirePlumber** correctly saves per-application volume settings.

The tool typically runs as a **systemd user service** in the background, starting automatically on login.

# CONFIGURATION

Configuration is stored in **~/.config/pipetron/config.toml**. The TOML file specifies which daemon type to run and related settings.

# CAVEATS

Requires **PipeWire** as the audio server. Only affects Electron-based applications. The audio daemon mode is experimental. The tool runs as a background service and provides no interactive terminal interface.

# HISTORY

**pipetron** (a portmanteau of PipeWire and Electron) was created to address the widespread issue of Electron applications being unable to set proper audio stream names under PipeWire. The project is available on **Codeberg** and mirrored on GitHub, and is packaged in the **Arch Linux AUR**.

# SEE ALSO

[pipewire](/man/pipewire)(1), [pavucontrol](/man/pavucontrol)(1), [wireplumber](/man/wireplumber)(1)
