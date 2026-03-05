# TAGLINE

Command-line file transfer between computers with end-to-end encryption

# TLDR

**Send files**

```portal send [file1] [file2] [folder1]```

**Receive files using the password**

```portal receive [1-inertia-elliptical-celestial]```

**Run a relay server on a custom port**

```portal serve --port [1337]```

# SYNOPSIS

**portal** _command_ [_options_] [_args_...]

# PARAMETERS

**send** _FILES_...
> Send files or directories to another computer.

**receive** _PASSWORD_
> Receive files using the temporary password displayed by the sender.

**serve**
> Run a relay server.

**-r**, **--relay** _ADDRESS_
> Specify a custom relay server address.

**-y**, **--yes**
> Auto-overwrite existing files without prompting (receiver only).

# DESCRIPTION

**portal** is a command-line file transfer utility for sending files between any two computers using temporary passwords. It uses PAKE2 for end-to-end encryption and parallel gzip compression. Portal attempts a direct peer-to-peer connection first, falling back to routing through a relay server when needed.

# HISTORY

**portal** was created by **Arvid Gotthard** (mellonnen) and **Zino Kader** (ZinoKader) and is written in **Go**.

# SEE ALSO

[croc](/man/croc)(1), [magic-wormhole](/man/magic-wormhole)(1), [scp](/man/scp)(1)
