# TAGLINE

Securely transfer files between computers with TUI

# TLDR

**Open the file browser TUI**

```tran```

**Open TUI in a specific directory**

```tran --start-dir [/path/to/dir]```

**Send a file or directory to a remote computer**

```tran send [file_or_directory]```

**Receive files from a remote computer**

```tran receive [password]```

**Authenticate with GitHub**

```tran auth login```

**Sync tran config file**

```tran sync start```

# SYNOPSIS

**tran** [_options_] [_command_]

# PARAMETERS

**--start-dir** _path_
> Set the starting directory for the TUI.

# SUBCOMMANDS

**send** _file_or_directory_
> Send a file or directory to a remote computer.

**receive** _password_
> Receive files from a remote computer using a password.

**auth login**
> Authenticate with GitHub.

**sync start**
> Sync your tran config file.

# DESCRIPTION

**tran** is a command-line tool and TUI that allows secure transfer and sending of files and directories between computers. It provides a file browser interface for selecting files and uses password-based authentication for receiving transfers.

Configuration is stored in **~/.config/tran/tran.yml**.

# HISTORY

**tran** was created by **abdfnx** and is written in **Go**.

# SEE ALSO

[croc](/man/croc)(1), [portal](/man/portal)(1)
