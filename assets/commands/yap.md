# TAGLINE

Bidirectional text pager

# TLDR

**View file contents**

```yap [file]```

**View with specific page size**

```yap -[20] [file]```

**View without screen clearing**

```yap -c [file]```

**Suppress underline handling**

```yap -u [file]```

**Start at specific line**

```yap +[100] [file]```

# SYNOPSIS

**yap** [-cnuq] [-_num_] [+_command_] [_file_...]

# PARAMETERS

**-**_num_
> Set page size to num lines.

**-c**
> Scroll instead of clearing screen for each page.

**-u**
> Suppress underline processing for nroff output.

**-n**
> Display line numbers.

**-q**
> Only exit on explicit quit command.

**+**_command_
> Execute command on startup.

# COMMANDS

**SPACE**: Display next page.

**RETURN**: Display next line.

**b**: Page backwards.

**s**: Skip lines forward.

**f**: Skip pages forward.

**g**: Go to beginning of file.

**G**: Go to end of file.

**/pattern**: Search forward for pattern.

**?pattern**: Search backward for pattern.

**n**: Repeat last search.

**m**: Set mark on current page.

**'**: Return to mark.

**h**: Display help.

**q** or **Q**: Quit.

# DESCRIPTION

**yap** (Yet Another Pager) is a text file viewer that displays content one screenful at a time. Its distinguishing feature is bidirectional paging, allowing navigation both forwards and backwards even when reading from standard input.

The pager handles nroff-formatted text, processing underline and bold sequences appropriately for the terminal. It supports searching, marking positions, and various navigation commands similar to other Unix pagers.

# ENVIRONMENT

**YAP**: Pre-set default flags.

**TERM**: Terminal type for screen handling.

# CAVEATS

Limited availability on modern systems. Most users prefer less or more which offer similar functionality with additional features.

# HISTORY

**yap** was developed for MINIX, Andrew S. Tanenbaum's Unix-like educational operating system. It provided essential paging functionality with the notable addition of backward scrolling, which was not available in the original more command. The less pager later became the standard solution offering similar bidirectional capabilities.

# SEE ALSO

[less](/man/less)(1), [more](/man/more)(1), [pg](/man/pg)(1), [cat](/man/cat)(1)
