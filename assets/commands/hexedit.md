# TLDR

**Open a file** in hex editor

```hexedit [path/to/file]```

**Open in read-only mode**

```hexedit -r [path/to/file]```

**Open with a specific sector size** (for disks)

```hexedit -s [512] [/dev/sda]```

**Open without showing ASCII column**

```hexedit --nocolor [path/to/file]```

# SYNOPSIS

**hexedit** [_-s sectorsize_] [_-r_] [_-h_] [_file_]

# PARAMETERS

**-s**, **--sector** _size_
> Set sector size for disk editing (default: 512).

**-r**, **--readonly**
> Open file in read-only mode.

**-h**, **--help**
> Display help information.

**--nocolor**
> Disable color output.

# KEYBOARD COMMANDS

**Arrow keys**
> Navigate through the file.

**Page Up/Down**
> Move one page up/down.

**Home/End**
> Go to beginning/end of file.

**Tab**
> Toggle between hex and ASCII editing.

**Ctrl-G**
> Go to specific offset (hex or decimal).

**Ctrl-S**
> Save changes.

**Ctrl-X**
> Save and exit.

**Ctrl-C**
> Exit without saving.

**Ctrl-F** or **/**
> Search forward (hex or ASCII).

**Ctrl-R**
> Search backward.

**Ctrl-Space**
> Set mark.

**Ctrl-Y**
> Paste (fill with copied byte).

**Ctrl-U**
> Undo all changes.

**F2**
> Save.

**F3**
> View modified bytes.

# DESCRIPTION

**hexedit** is a terminal-based hex editor for viewing and editing binary files at the byte level. It displays file contents in hexadecimal alongside ASCII representation, allowing direct modification of individual bytes.

The interface shows three columns: byte offset on the left, hexadecimal values in the middle, and ASCII characters on the right. Pressing Tab switches between editing hex values and ASCII characters. Modified bytes are highlighted.

Navigation is efficient for both small files and large binaries (or even block devices). The Ctrl-G command accepts offsets in hex (prefix with 0x) or decimal. Search works for both hex patterns and ASCII strings.

For disk editing, the sector size option (-s) affects how the editor handles reads and writes. Changes to block devices require appropriate permissions and extreme caution.

hexedit uses a simple memory model - changes are held in memory until explicitly saved. The Ctrl-U command reverts all unsaved changes. For large files, it memory-maps the file for efficient access.

# CAVEATS

Editing block devices or system files requires root. No undo history - only revert all changes. Limited to files that fit in virtual memory (or are memory-mappable). Cannot insert or delete bytes, only overwrite. Search patterns must be contiguous.

# HISTORY

**hexedit** was written by Pixel (Pascal Rigaux) and released in the 1990s. It filled the need for a simple, fast hex editor for Unix terminals. Despite its age, it remains popular due to its simplicity, low resource usage, and availability in virtually all Linux distribution repositories.

# SEE ALSO

[xxd](/man/xxd)(1), [hexdump](/man/hexdump)(1), [od](/man/od)(1), [bless](/man/bless)(1), [ghex](/man/ghex)(1)
