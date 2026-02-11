# TAGLINE

Container-oriented GNOME terminal emulator

# TLDR

Open **new window**

```ptyxis --new-window```

**Execute** command

```ptyxis -x [command]```

Open **new tab**

```ptyxis --tab```

Set tab **title**

```ptyxis --tab -T "[title]"```

Set **working directory**

```ptyxis -d [path/to/directory] --tab```

# SYNOPSIS

**ptyxis** [**--new-window**] [**--tab**] [**-x** _command_] [**-d** _dir_] [**-T** _title_]

# PARAMETERS

**--new-window**
> Open in new window

**--tab**
> Open new tab in last window

**-x, --execute _command_**
> Execute command in new terminal

**-d, --working-directory _dir_**
> Set working directory

**-T, --title _title_**
> Set terminal title

# DESCRIPTION

**ptyxis** is a container-oriented terminal emulator for GNOME. It's designed to work seamlessly with Flatpak, Toolbox, and Distrobox containers, making it easy to run commands in different container environments.

The terminal provides modern features like GPU acceleration, tabs, and container integration while maintaining a clean GNOME design.

# CAVEATS

Requires GNOME environment. Container features need Flatpak/Toolbox/Distrobox installed. Still in active development.

# HISTORY

**ptyxis** was created by **Christian Hergert** (GNOME Builder developer) as a modern terminal that embraces containerized workflows. The name comes from Greek, meaning "folded tablet."

# SEE ALSO

[gnome-terminal](/man/gnome-terminal)(1), [toolbox](/man/toolbox)(1), [distrobox](/man/distrobox)(1)
