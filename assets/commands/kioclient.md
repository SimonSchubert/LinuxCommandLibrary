# TAGLINE

KDE command-line client for KIO network-transparent file operations

# TLDR

**Open a URL** with its default KDE handler

```kioclient exec [url]```

**Print the contents** of a remote file to stdout

```kioclient cat [sftp://user@host/path/to/file]```

**List the contents** of a remote directory

```kioclient ls [smb://server/share]```

**Copy one or more files** via KIO

```kioclient cp [path/to/source1] [path/to/source2] [path/to/destination]```

**Move a file** via KIO

```kioclient mv [path/to/source] [path/to/destination]```

**Remove a file** via KIO

```kioclient rm [url]```

**Create a new directory** via KIO

```kioclient mkdir [url]```

**Open the KDE Properties dialog** for a URL

```kioclient5 openProperties [url]```

# SYNOPSIS

**kioclient** _command_ [_arguments_] [_options_]

**kioclient5** _command_ [_arguments_] [_options_]

**kioclient6** _command_ [_arguments_] [_options_]

# COMMANDS

**exec** _url_ [_mimetype_]
> Open _url_ with the default handler registered for its MIME type. If _mimetype_ is given, that handler is used instead of the detected type.

**cat** _url_
> Write the contents of the file at _url_ to standard output.

**ls** _url_
> List entries in the directory at _url_.

**cp** _source_ ... _destination_
> Copy one or more sources to _destination_ via KIO. Sources and destination may be any supported URL scheme.

**mv** _source_ ... _destination_
> Move sources to _destination_ via KIO.

**rm** _url_
> Delete the file or directory at _url_ via KIO.

**mkdir** _url_
> Create a new directory at _url_.

**download** [_url_]
> Copy _url_ to a local file selected through a save dialog. If no URL is given, a file picker opens.

**openProperties** _url_
> Display the KDE Properties dialog for _url_.

# PARAMETERS

**--commands**
> Print the list of available commands.

**--overwrite**
> Overwrite destination files when copying or moving.

**--interactive**
> Use interactive dialogs (default for GUI usage).

**--noninteractive**
> Suppress dialogs; useful for scripts.

**--platform** _name_
> Choose the Qt Platform Abstraction plugin (e.g. _xcb_, _wayland_, _offscreen_).

**--help**
> Print help and exit.

**--version**
> Print the program version.

# DESCRIPTION

**kioclient** is a thin command-line front-end to the **KIO** framework that powers file access throughout KDE (Dolphin, Konqueror, Gwenview, and many others). It lets shell scripts and users invoke the same network-transparent virtual filesystem that KDE applications use, treating remote shares, archives, and even the trash bin as if they were local paths.

Any URL scheme implemented by an installed KIO worker can be used: **file:** for local paths, **sftp:** and **fish:** for SSH-based access, **smb:** for Windows shares, **ftp:** and **webdav:** for legacy network shares, **trash:** for the recycle bin, **tar:** and **zip:** for archive contents, and protocol-specific schemes such as **man:**, **info:**, **mtp:**, **gdrive:**, and many more. The available list depends on which **kio-extras** plugins are installed.

In addition to plain file operations (**cp**, **mv**, **rm**, **mkdir**, **ls**, **cat**, **download**), kioclient can launch the default GUI handler for a resource through **exec**, which is the easiest way to script "open this URL in the right KDE app". The **openProperties** command displays the same Properties dialog that Dolphin shows on right-click.

On modern distributions, **kioclient** is split into a Qt5 binary (**kioclient5**) and a Qt6 binary (**kioclient6**). The unversioned **kioclient** symlink, where present, points at whichever build the distribution treats as default.

# CAVEATS

**kioclient** requires a running D-Bus session and the appropriate Qt platform plugin. On a headless server, set _QT_QPA_PLATFORM=offscreen_ or pass **--platform offscreen**, otherwise the command may fail to connect to the display.

Authentication for remote protocols is delegated to **kwalletd** / **kwallet6**. The first time a credential is needed, a graphical password dialog is shown; in non-interactive shells the operation will hang or fail unless the credential is already cached.

The set of usable URL schemes depends on installed KIO worker packages. A scheme that works in Dolphin but not from a fresh **kioclient** invocation usually means the worker plugin is installed but its D-Bus session has not been started.

# HISTORY

**kioclient** has shipped with KDE since the **KDE 3** era as a way for shell scripts and other applications to drive the **KIO** framework that Konqueror introduced. It was rewritten for **KDE 4** alongside KIO itself and renamed to **kioclient4** to coexist with the KDE 3 version. The Qt5-based **kioclient5** appeared with **KDE Frameworks 5** in **2014**, and **kioclient6** followed the **KDE Frameworks 6** release in **2024**.

# INSTALL

```apt: sudo apt install kde-cli-tools```

```dnf: sudo dnf install kde-cli-tools```

```pacman: sudo pacman -S kde-cli-tools```

```apk: sudo apk add kde-cli-tools```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dolphin](/man/dolphin)(1), [kdialog](/man/kdialog)(1), [xdg-open](/man/xdg-open)(1), [gio](/man/gio)(1)
