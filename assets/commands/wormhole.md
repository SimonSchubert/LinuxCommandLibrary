# TLDR

**Send a file**

```wormhole send [file]```

**Send a directory** (will be zipped automatically)

```wormhole send [directory/]```

**Send text** instead of a file

```wormhole send --text "[message]"```

**Send with a custom code**

```wormhole send --code [custom-code] [file]```

**Receive a file**

```wormhole receive [code]```

**Receive and automatically accept**

```wormhole receive --accept-file [code]```

**Receive to specific output file**

```wormhole receive --output-file [filename] [code]```

# SYNOPSIS

**wormhole** _command_ [_options_] [_arguments_]

# PARAMETERS

**send**
> Send a file, directory, or text message.

**receive**
> Receive a file or text message.

**--text**, **-t**
> Send a text message instead of file.

**--code** _code_
> Use a specific wormhole code instead of generating one.

**-c**, **--code-length** _n_
> Number of words in generated code.

**--verify**
> Request receiver to verify data checksum.

**--accept-file**
> Automatically accept incoming file (use with caution).

**--output-file** _file_
> Save received data to specified filename.

**--relay-url** _url_
> Use a custom rendezvous server.

**--hide-progress**
> Don't show progress bar during transfer.

**--help**
> Display help message.

**--version**
> Display version information.

# DESCRIPTION

**Magic-Wormhole** provides secure, simple file transfer between two computers. The sender generates a short, human-readable code that the receiver types to establish an encrypted connection.

Security is based on SPAKE2+ password-authenticated key exchange, ensuring strong encryption from a simple code. Data transfers directly peer-to-peer when possible; otherwise, an encrypted relay tunnels the data. Neither servers see unencrypted content.

Directories are automatically zipped for transfer and unzipped on receipt. Text messages can be sent for quick sharing of passwords or small data.

# CAVEATS

Both sender and receiver must have wormhole installed. The wormhole code must be communicated securely (ideally spoken or via trusted channel). Using **--accept-file** with untrusted senders is risky as files are saved without confirmation.

# HISTORY

Magic-Wormhole was created by **Brian Warner** and first released in **2015**. It was designed to solve the problem of securely transferring files between computers without complex setup. The PAKE-based security model allows strong encryption from easy-to-type codes. Alternative implementations exist in Go (wormhole-william) and Rust.

# SEE ALSO

[scp](/man/scp)(1), [rsync](/man/rsync)(1), [croc](/man/croc)(1), [ffsend](/man/ffsend)(1)
