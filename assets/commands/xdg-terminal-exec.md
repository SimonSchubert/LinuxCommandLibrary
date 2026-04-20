# TAGLINE

Launch the user's preferred terminal emulator

# TLDR

**Open the default terminal** without running a command

```xdg-terminal-exec```

**Run a command** inside the preferred terminal

```xdg-terminal-exec [command] [args...]```

**Set a window title** for the spawned terminal

```xdg-terminal-exec --title=[My Shell] [command]```

**Set a working directory** before executing the command

```xdg-terminal-exec --dir=[path/to/dir] [command]```

**Keep the terminal open** after the command exits

```xdg-terminal-exec --hold [command]```

**Print the selected Desktop Entry ID** instead of launching it

```xdg-terminal-exec --print-id```

**Show the resolved command line** that would be executed

```xdg-terminal-exec --print-cmd [command]```

# SYNOPSIS

**xdg-terminal-exec** [_options_] [**--**] [_command_ [_arguments_ ...]]

# PARAMETERS

**--app-id=**_app_id_
> Set the Wayland app-id (or X11 class) of the spawned window.

**--title=**_title_
> Set the terminal window title.

**--dir=**_workdir_
> Change to _workdir_ before running the command.

**--hold**
> Keep the terminal window open after the command terminates.

**--print-id**
> Print the Desktop Entry ID that was selected.

**--print-path**
> Print the filesystem path of the selected Desktop Entry.

**--print-content**
> Print the full content of the selected Desktop Entry.

**--print-cmd**[=_printf_seq_]
> Print the final command line that would be executed instead of running it.

**--print-delimiter=**_printf_seq_
> Set the delimiter used between multiple print outputs.

**--**
> Treat all following arguments as the command to execute.

# DESCRIPTION

**xdg-terminal-exec** launches the user's preferred terminal emulator, optionally with a command to execute inside it. It is the reference implementation of the proposed XDG Default Terminal Execution Specification from freedesktop.org.

Candidate terminals are discovered from Desktop Entries installed on the system that declare the **TerminalEmulator** category and provide an **X-TerminalArgExec** key. The user chooses which of those entries to prefer by listing Desktop Entry IDs in a configuration file.

This mirrors tools like **xdg-open**: instead of hard-coding a terminal in scripts, desktop launchers, or applications, callers invoke **xdg-terminal-exec** and the system resolves the user's choice at runtime.

# CONFIGURATION

Preferred terminals are listed in the following files, searched in order of XDG config/data priority:

```
${desktop}-xdg-terminals.list
xdg-terminals.list
```

Where _${desktop}_ is a lowercased item from **XDG_CURRENT_DESKTOP**. Each line is a Desktop Entry ID, optionally with an action suffix:

```
foot.desktop
kitty.desktop
org.gnome.Terminal.desktop:new-window
```

Lines starting with **#** are comments. Special directives include **/enable_cache**, **/disable_cache**, **/execarg_compat**, **/execarg_strict**, and **/execarg_default:entry.desktop:arg**.

# ENVIRONMENT

**XTE_CACHE_ENABLED**
> Enable or disable caching of the resolved terminal.

**XTE_DEBUG**, **DEBUG**
> Print debug information to stderr.

**XDG_CURRENT_DESKTOP**, **XDG_CONFIG_HOME**, **XDG_CONFIG_DIRS**, **XDG_DATA_DIRS**
> Standard XDG variables used for desktop detection and config lookup.

# CAVEATS

The specification is still a **proposal** on the freedesktop.org **terminal-wg** tracker; backwards compatibility is maintained on a best-effort basis. Not every terminal emulator ships the **X-TerminalArgExec** key yet, so some installed terminals may be invisible to the selector until their Desktop Entry is patched.

# HISTORY

**xdg-terminal-exec** was created by **Vladimir Kudrya** (Vladimir-csp) as a shell-based reference implementation accompanying a merge request against the freedesktop.org terminal-wg specifications repository. It is packaged by several distributions (Debian, Arch, Fedora) as a dependency of modern desktop launchers that need a generic way to spawn terminals.

# SEE ALSO

[xdg-open](/man/xdg-open)(1), [xdg-mime](/man/xdg-mime)(1), [xdg-settings](/man/xdg-settings)(1)
