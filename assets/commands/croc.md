# TAGLINE

secure file transfer tool

# TLDR

**Send file**

```croc send [file]```

**Send multiple files**

```croc send [file1] [file2] [file3]```

**Send directory**

```croc send [directory/]```

**Receive file**

```croc [code-phrase]```

**Send with custom code**

```croc send --code [my-secret-code] [file]```

**Use custom relay**

```croc --relay [relay.example.com:9009] send [file]```

**Run relay server**

```croc relay```

# SYNOPSIS

**croc** [_options_] send [_send_options_] _file_
**croc** [_options_] _code-phrase_

# DESCRIPTION

**croc** is a tool for securely transferring files between computers. It uses a relay server and PAKE (Password Authenticated Key Exchange) for end-to-end encryption, ensuring that transferred files cannot be read by the relay server or intercepted on the network.

The tool works across different networks without requiring port forwarding or firewall configuration. Users share a short code phrase, both parties connect to a relay server, and files are transferred through an encrypted channel. Local network transfers automatically use direct connections for faster speeds when possible.

Features include resumable transfers (if interrupted, transfers can continue from where they left off), support for sending multiple files and entire directories, cross-platform compatibility (Linux, macOS, Windows), and the option to run your own relay server for complete control.

# COMMANDS

**send**
> Send files or folders

**relay**
> Run a relay server

# PARAMETERS

**--code** _phrase_
> Use custom code phrase

**--relay** _address_
> Specify relay server

**--yes**
> Accept transfer without prompt

**--out** _path_
> Output directory for received files

**--overwrite**
> Overwrite existing files

**--curve** _type_
> Encryption curve (p256, p384, p521, siec)

**--hash** _algorithm_
> Hash algorithm (xxhash, imohash, md5)

**--no-compress**
> Disable compression

**--no-local**
> Disable local network transfer

**--ports** _range_
> Port range for local transfer

# ENVIRONMENT

**CROC_RELAY**
> Default relay server

**CROC_PASS**
> Default code phrase

# HOW IT WORKS

1. Sender generates code phrase
2. Both parties connect to relay
3. PAKE establishes encrypted channel
4. Files transfer through relay (or directly on LAN)

# CAVEATS

Default relay is public (croc.schollz.com). For sensitive transfers, run your own relay. Code phrases should be shared securely.

# SEE ALSO

[rsync](/man/rsync)(1), [scp](/man/scp)(1), [magic-wormhole](/man/magic-wormhole)(1)
