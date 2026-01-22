# TLDR

**View man page**

```groffer [man-page]```

**View file in X window**

```groffer --x [file.roff]```

**View as PDF**

```groffer --pdf [file.roff]```

**View as text in terminal**

```groffer --tty [file.roff]```

**Specify viewer**

```groffer --viewer [evince] [file.roff]```

# SYNOPSIS

**groffer** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files or man pages to display.

**--pdf**
> Output as PDF.

**--ps**
> Output as PostScript.

**--tty**
> Output to terminal.

**--x**
> Display in X window.

**--viewer** _PROG_
> Specify viewer program.

**--mode** _MODE_
> Display mode.

**--help**
> Display help information.

# DESCRIPTION

**groffer** is a wrapper for groff that automatically selects the best display method. It can handle man pages, roff files, and various input formats.

The tool detects the environment and chooses between X viewers, PDF viewers, or terminal display. It simplifies the groff workflow significantly.

groffer provides convenient groff document viewing.

# CAVEATS

Part of groff package. Viewer selection depends on installed applications. Some modes require X display.

# HISTORY

groffer was developed as part of **GNU groff** to provide a user-friendly interface for viewing groff documents.

# SEE ALSO

[groff](/man/groff)(1), [man](/man/man)(1), [xpdf](/man/xpdf)(1)
