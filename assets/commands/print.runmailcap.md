# TLDR

**Print** any file using default run-mailcap tool

```print filename```

Print using **run-mailcap** directly

```run-mailcap --action=print filename```

# SYNOPSIS

**print** _file_

# DESCRIPTION

**print** is an alias to run-mailcap's print action. It processes files based on their MIME type and sends them to the appropriate print handler defined in the mailcap configuration.

Originally run-mailcap is used to process mime-type/file associations, and print provides a convenient shorthand for the print action.

# CAVEATS

Requires proper mailcap configuration for the file's MIME type. Print behavior depends on system print configuration.

# HISTORY

Part of the **mime-support** package, providing MIME type handling utilities for Unix-like systems.

# SEE ALSO

[run-mailcap](/man/run-mailcap)(1), [lpr](/man/lpr)(1)
