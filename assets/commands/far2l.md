# TAGLINE

Two-panel file manager, Linux port of FAR Manager v2

# TLDR

**Start** FAR2L (GUI if built, otherwise TTY)

```far2l```

Force **terminal** mode

```far2l --tty```

Plain TTY with **no X11** clipboard or extra key protocols

```far2l --tty --nodetect=x```

Open **left and right** panel paths

```far2l -cd [left/path] -cd [right/path]```

**View** a file in the internal viewer

```far2l -v [path/to/file]```

**Edit** a file at line 40

```far2l -e40 [path/to/file]```

Use a **separate settings** identity

```far2l -u [work]```

Print **version**

```far2l --version```

# SYNOPSIS

**far2l** [_options_] [**-cd** _apath_ [**-cd** _ppath_]]

**far2ledit** [_options_] [_filename_]

# PARAMETERS

**-h**
> Short help and exit.

**--version**
> Print version and exit.

**-cd** _path_
> Set a panel directory (folder, file, archive, or prefixed command). First **-cd** is the active panel, second is the passive panel.

**-v** _file_
> Open _file_ in the internal viewer.

**-v -** _command_
> Run _command_ and view its output.

**-e**[_line_[:_pos_]] [_file_]
> Open the internal editor, optionally at _line_ and column. Omit _file_ for an empty buffer.

**-e**[_line_[:_pos_]] **-** _command_
> Run _command_ and edit its output.

**-u** _identity_|_path_
> Alternate settings identity (under **~/.config/far2l/custom/**) or a full path. Overrides **FARSETTINGS**.

**-a**
> Do not draw characters with codes 0-31 and 255.

**-ag**
> Do not draw pseudographics above code 127.

**-an**
> Disable pseudographics entirely.

**-co**
> Load plugins from cache only.

**-m**
> Do not load macros.

**-ma**
> Do not run auto-start macros.

**-set:**_PARAMETER_=_VALUE_
> Override a **far:config** value for this run. Repeatable.

**--tty**
> Force the TTY backend (skip GUI autodetection).

**--notty**
> Do not fall back to TTY if the GUI backend fails.

**--SDL**
> Force the experimental SDL GUI backend instead of wxWidgets.

**--x11** / **--wayland**
> Force GDK_BACKEND for the GUI.

**--nodetect**[=_flags_]
> Skip TTY capability probes. Bare **--nodetect** is plain terminal mode. Letters: **x**/**xi** (X11/Xi), **f** (FAR2L extensions), **w** (win32), **a** (iTerm2), **k** (kitty), **e** (emoji VS16).

**--norgb**
> Disable 24-bit color.

**--mortal** / **--immortal**
> Exit vs background on SIGHUP. Default is mortal on a Linux VT, immortal otherwise.

**--ee=**_N_
> ESC expiration in ms (TTY without FAR2L extensions; default **100**, **0** disables).

**--maximize** / **--nomaximize** / **--size=**_WxH_
> GUI window geometry.

**--primary-selection**
> Use the X11 PRIMARY selection (GUI).

**--clipboard=**_script_
> External clipboard helper (stdin/stdout get/set).

# KEYBOARD COMMANDS

**F1**
> Contextual help.

**F3**
> View file.

**F4**
> Edit file.

**F5**
> Copy.

**F6**
> Move or rename.

**F7**
> Create directory.

**F8**
> Delete.

**F9**
> Menu bar.

**F10**
> Quit.

**Tab**
> Switch panels.

**Ctrl+O**
> Toggle panels vs the built-in terminal.

Desktop environments often steal FAR keys (**Alt+F1**, **Alt+F2**, **Ctrl+arrows**). Release those bindings globally, or use FAR2L sticky modifiers (**Ctrl+Space** / **Alt+Space**) and the exclusive-hotkey option in Input settings.

# DESCRIPTION

**far2l** is a Linux (also macOS and BSD) fork of **FAR Manager v2**, the two-panel Orthodox file manager. It browses directories and archives, copies and moves files, edits and views text, and runs a command line under the panels. Plugins include NetRocks (SFTP, SCP, FTP, SMB, NFS, WebDAV, S3), multiarc/arclite archives, Colorer syntax highlighting, and optional Python scripting.

Backends, from richest to leanest: **GUI|WX** (wxWidgets), experimental **GUI|SDL**, **TTY|Xi** (X11 + Xi for modifiers and clipboard), **TTY|X** (clipboard via X11), and plain **TTY**. far2l auto-downgrades when libraries are missing. **--tty** / **--notty** / **--nodetect** pin a backend. OSC 52 clipboard in TTY needs both the terminal and FAR2L Interface settings.

**far2ledit** is the same binary started as a standalone editor.

# CONFIGURATION

**~/.config/far2l** or **$XDG_CONFIG_HOME/far2l**
> Default profile (**settings/config.ini** and related files).

**-u** _identity_
> Profile under **~/.config/far2l/custom/**_identity_/.

**-u** _/path_
> Profile under _/path_**/.config/**.

**FARSETTINGS**
> Same as **-u**.

**FAR2L_ARGS**
> Extra command-line options (not **-h** or **-u**). Example: **export FAR2L_ARGS="--tty --nodetect"**.

# CAVEATS

Still marked beta. Only English, Russian, Ukrainian, and Belarusian translations are considered complete. Some desktop and terminal keybindings collide with FAR chords. Under Wayland, **TTY|Xi** clipboard/modifier probing is unreliable; use **far2l --tty --nodetect=x** plus OSC 52, or the GUI. Homebrew's macOS GUI cask is unsigned and scheduled for removal unless a paid Apple developer identity appears.

# HISTORY

FAR Manager originated on Windows (Eugene Roshal, then FAR Group). **elfmz** ported FAR v2 to Unix as **far2l** (GPL-2.0). Current man page version is **2.9.0** (August 2026).

# INSTALL

```apt: sudo apt install far2l```

```aur: yay -S far2l```

```brew: brew install far2l-tty```

```nix: nix profile install nixpkgs#far2l```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[mc](/man/mc)(1), [ranger](/man/ranger)(1), [vifm](/man/vifm)(1), [nnn](/man/nnn)(1), [lf](/man/lf)(1)

# RESOURCES

```[Source code](https://github.com/elfmz/far2l)```

<!-- verified: 2026-09-28 -->
