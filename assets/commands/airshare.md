# TAGLINE

Share files between devices on the local network

# TLDR

**Send** a file with a code

```airshare [mycode] [file.txt]```

**Receive** files using a code

```airshare [mycode]```

**Send** multiple files

```airshare [mycode] [file1.txt] [file2.txt]```

**Send text** content directly

```airshare [mycode] -t "[Hello, World!]"```

**Host a receiving** (upload) server

```airshare [mycode] -u```

**Send clipboard** contents as text

```airshare [mycode] -cs```

**Specify a custom port**

```airshare [mycode] [file.txt] -p [9000]```

# SYNOPSIS

**airshare** [_options_] _code_ [_files_]

# DESCRIPTION

**airshare** is a Python-based cross-platform file sharing tool that transfers files between devices on the same local network. It uses mDNS for device discovery and identifies transfers with a simple code word. Recipients access shared content by using the same code.

The tool provides a simple alternative to complex file sharing setups, requiring no server configuration or account creation. Shared content can also be accessed via a web browser at `http://<code>.local:8000`.

# PARAMETERS

_CODE_
> An identifying code word for the sharing session.

_FILES_
> File(s) or directories to send.

**-p**, **--port** _INTEGER_
> Specify the port number for the server (default: 8000).

**-t**, **--text** _TEXT_
> Send text content directly. Enclose multiple words in quotes.

**-u**, **--upload**
> Host a receiving server to accept uploaded files.

**-cs**, **--clip-send**
> Send clipboard contents as text.

**-cr**, **--clip-receive**
> Receive content and copy it to the clipboard.

**-fp**, **--file-path**
> Send files whose paths have been copied to the clipboard.

**--version**
> Display version information.

# CAVEATS

Both devices must be on the same local network. Large files are processed in chunks but may take time depending on network speed. The tool requires mDNS support on the network.

# HISTORY

**airshare** was developed as a Python-based alternative to AirDrop for cross-platform local file sharing, leveraging mDNS for zero-configuration networking.

# SEE ALSO

[croc](/man/croc)(1), [wormhole](/man/wormhole)(1), [scp](/man/scp)(1)
