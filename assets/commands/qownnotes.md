# TAGLINE

Plain-text markdown note-taking with cloud sync

# TLDR

**Start QOwnNotes**

```QOwnNotes```

**Start in portable mode** (settings stored alongside the executable)

```QOwnNotes --portable```

**Start with a different session** context for settings

```QOwnNotes --session [session_name]```

**Dump current settings** and environment info in Markdown format

```QOwnNotes --dump-settings```

**Clear settings** and start fresh

```QOwnNotes --clear-settings```

**Trigger a menu action** after startup

```QOwnNotes --action [actionShow_Todo_List]```

**Allow multiple instances** even if disallowed in settings

```QOwnNotes --allow-multiple-instances```

# SYNOPSIS

**QOwnNotes** [_options_]

# PARAMETERS

**--portable**
> Run in portable mode, storing settings alongside the executable.

**--session** _name_
> Run with a different context for settings and internal files. Useful for troubleshooting without losing current settings.

**--clear-settings**
> Clear all settings before starting the application.

**--dump-settings**
> Print a dump of current settings and environment in GitHub Markdown format, then exit.

**--action** _name_
> Trigger a menu action after startup. Use **customAction_**_identifier_ for scripted custom actions.

**--allow-multiple-instances**
> Allow multiple instances of QOwnNotes even if disallowed in settings.

**--completion** _shell_
> Generate shell completion code. Supports **fish** and **bash**.

**--version**
> Print version number and exit.

**--help**
> Show available command-line options.

# DESCRIPTION

**QOwnNotes** is a plain-text note-taking application that stores notes as standard Markdown files on disk. Notes are fully portable and can be edited with any text editor, while QOwnNotes provides a rich interface with syntax highlighting, a preview panel, tagging, note searching, and hierarchical folder organization.

Optional integration with ownCloud or Nextcloud enables cloud synchronization across devices, including server-side encryption and versioning. The application also supports scripting for custom workflows, Vim keybindings, and portable mode for running from removable media.

# CAVEATS

Qt-based application requiring a display server. The binary name may vary by platform: **QOwnNotes** on Linux (native), **qownnotes** on Snap. Cloud sync requires a separate ownCloud or Nextcloud server. When only one instance is allowed (default), launching a second instance with **--action** triggers the action in the already-running instance.

# HISTORY

QOwnNotes was created by **Patrizio Bekerle** as an open-source, cross-platform plain-text Markdown note-taking application. It is built with Qt/C++ and focuses on keeping notes in standard Markdown files that remain portable and editable outside the application. Optional Nextcloud/ownCloud integration provides cloud sync with server-side versioning and encryption.

# SEE ALSO

[joplin](/man/joplin)(1), [notable](/man/notable)(1)

