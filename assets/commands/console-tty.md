# TAGLINE

Terminal sessions in a browser developer-tools console

# TLDR

Register the extension's **native host**

```console-tty native-host install [extension-id]```

**Approve** a browser enrollment

```console-tty pair [request-id]```

**Start** the background daemon

```console-tty daemon start```

Show daemon **status**

```console-tty daemon status```

Create a default **config**

```console-tty config init```

Print the config **path**

```console-tty config path```

# SYNOPSIS

**console-tty** _command_ [_options_]

# PARAMETERS

**daemon start**
> Start the background daemon.

**daemon stop**
> Stop the daemon and its shells.

**daemon foreground**
> Run the daemon in the foreground.

**daemon status**
> Show whether the daemon is running.

**pair** [_request-id_]
> Approve a pending browser enrollment. The request id is the one the page prints.

**client list**
> List paired client ids, not credentials.

**client revoke** _id_
> Revoke a client and disconnect it.

**config init**
> Create a config file with defaults. Does not overwrite an existing file. Prints the path.

**config path**
> Print the config path. Does not create the file.

**native-host install** _extension-id_
> Register this executable as the browser extension's local connection. **--browser** is **chrome** (the default), **chromium**, or **edge**.

# DESCRIPTION

**console-tty** runs a local terminal and connects it to a browser extension so the session is used from the developer-tools console. The shell itself is a normal local shell. The extension is only the display and the keyboard.

After the extension is loaded unpacked, **native-host install** writes the native-messaging manifest for the current user. **daemon start** keeps the session host running. In the page console, the extension's pair function prints a request id; **pair** approves it. A shell is then started from the page.

The config file sets the terminal size, the shell, the working directory, and render limits. **config init** writes defaults. Existing files are never overwritten.

# CONFIGURATION

**config path** prints the file even when it does not exist yet. Settings cover columns, rows, scrollback, the shell program, and the starting directory. The shell defaults to the SHELL environment variable, or a basic POSIX shell.

# CAVEATS

The browser extension and this binary are installed separately. Repeating **native-host install** is required when the extension id or the executable path changes. That command does not start the daemon and does not approve pairing. The tool is a bridge into a local shell: treat the extension id and the pairing step as access to that shell.

# SEE ALSO

[bash](/man/bash)(1), [tmux](/man/tmux)(1)

# RESOURCES

```[Source code](https://github.com/cpendery/console.tty)```

<!-- verified: 2026-11-26 -->
