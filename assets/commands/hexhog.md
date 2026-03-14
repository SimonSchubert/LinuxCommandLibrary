# TAGLINE

Configurable hex viewer and editor

# TLDR

**Open a file** in the hex editor

```hexhog [path/to/file]```

# SYNOPSIS

**hexhog** [_file_]

# DESCRIPTION

**hexhog** is a configurable hex viewer and editor for the terminal, written in Rust. It provides basic hex editing features including editing, deleting, and inserting bytes, as well as selecting and copy/pasting byte ranges. The interface displays offset addresses, hex values, and ASCII representation in a customizable layout.

Color themes and key bindings can be configured. Byte types such as null, printable ASCII, whitespace, and extended characters are displayed with distinct colors.

# CAVEATS

Primarily designed for smaller binary files. Very large files may impact performance and memory usage.

# HISTORY

**hexhog** was created by **DVDTSB** and provides a simple, configurable approach to hex editing in the terminal. The source is available on GitHub at **github.com/DVDTSB/hexhog**.

# SEE ALSO

[hexyl](/man/hexyl)(1), [xxd](/man/xxd)(1), [heh](/man/heh)(1)
