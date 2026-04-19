# TAGLINE

Print files using MIME type handlers

# TLDR

**Print** any file using default run-mailcap tool

```print filename```

Print using **run-mailcap** directly

```run-mailcap --action=print filename```

# SYNOPSIS

**print** _file_

# DESCRIPTION

**print** is an alias for **run-mailcap** that defaults to the `print` action. It processes files based on their MIME type and sends them to the appropriate print handler defined in the mailcap configuration (typically `/etc/mailcap` and `~/.mailcap`).

The related aliases **see**, **edit**, and **compose** default to the view, edit, and compose actions respectively. All of them accept the same options as run-mailcap, including `--action`, `--debug`, `--nopager`, and `--norun`.

# CAVEATS

Requires proper mailcap configuration for the file's MIME type. Print behavior depends on system print configuration.

# HISTORY

Part of the **mime-support** package, providing MIME type handling utilities for Unix-like systems.

# SEE ALSO

[run-mailcap](/man/run-mailcap)(1), [lpr](/man/lpr)(1)
