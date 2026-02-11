# TAGLINE

Print files in reverse line order

# TLDR

**Reverse lines** of a file

```tac [file.txt]```

**Reverse lines** from multiple files

```tac [file1.txt] [file2.txt]```

**Reverse with custom separator**

```tac -s "[separator]" [file.txt]```

**Reverse with regex separator**

```tac -r -s "[pattern]" [file.txt]```

**Reverse stdin**

```cat [file.txt] | tac```

**Reverse before separator** (attach separator to following)

```tac -b -s "[separator]" [file.txt]```

# SYNOPSIS

**tac** [_options_] [_file_...]

# DESCRIPTION

**tac** concatenates and prints files in reverse, line by line. The name is "cat" spelled backwards, reflecting its reversed functionality.

By default, tac uses newline as the record separator, reversing line order. Custom separators can be specified, making it useful for reversing records in various file formats.

The tool is handy for viewing log files (newest first), reversing sorted output, or processing data that needs to be in reverse order.

# PARAMETERS

**-b**, **--before**
> Attach separator before instead of after record.

**-r**, **--regex**
> Interpret separator as regular expression.

**-s** _string_, **--separator=** _string_
> Use string as separator instead of newline.

**--help**
> Display help information.

**--version**
> Display version information.

# CAVEATS

Reads entire input into memory (inefficient for very large files). Binary files may produce unexpected results. Regex separators may have performance impact. Does not reverse characters within lines.

# HISTORY

**tac** is part of **GNU coreutils**, following the Unix tradition of tools that reverse operations (like rev which reverses characters). The name playfully reverses "cat". It provides functionality not available in standard Unix, though some BSD systems have alternatives.

# SEE ALSO

[cat](/man/cat)(1), [rev](/man/rev)(1), [tail](/man/tail)(1), [head](/man/head)(1)
