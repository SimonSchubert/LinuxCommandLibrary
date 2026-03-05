# TAGLINE

TUI file-sharing tool using the LocalSend protocol

# TLDR

**Launch jocalsend** to discover devices and share files

```jocalsend```

**Send a specific file**

```jocalsend -f [path/to/file]```

**Send text**

```jocalsend -t "[message]"```

# SYNOPSIS

**jocalsend** [**-f** _file_] [**-t** _text_] [_options_]

# DESCRIPTION

**jocalsend** is a terminal-based implementation of the **LocalSend** protocol, providing a TUI for sending and receiving files and text across devices on the local network. It is compatible with the official LocalSend app and any other LocalSend-compatible client.

The tool automatically discovers nearby devices on the local subnet and provides a keyboard-driven interface for selecting recipients and transferring files. No internet connection or account is required — all transfers happen directly over the local network.

# CAVEATS

Only works on the local network. Both sender and receiver must be running a LocalSend-compatible client. Tested primarily on Linux; macOS support is expected but less tested.

# HISTORY

**jocalsend** was created by **nebkor** and is written in **Rust** using the **Ratatui** TUI library. It was designed for users who want LocalSend functionality in a terminal environment.

# SEE ALSO

[scp](/man/scp)(1), [rsync](/man/rsync)(1)
