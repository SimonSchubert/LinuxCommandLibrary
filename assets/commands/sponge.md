# TAGLINE

Soak up stdin before writing to file

# TLDR

**Overwrite file with pipeline output**

```cat [file.txt] | sort | sponge [file.txt]```

**Filter and save in place**

```grep "[pattern]" [file.txt] | sponge [file.txt]```

**Transform and overwrite**

```sed 's/old/new/g' [file.txt] | sponge [file.txt]```

**Append instead of overwrite**

```echo "new line" | sponge -a [file.txt]```

# SYNOPSIS

**sponge** [_options_] _file_

# DESCRIPTION

**sponge** reads standard input and writes to a file. Unlike shell redirection, it reads all input before opening the output file, allowing safe in-place modifications.

The tool is part of moreutils and solves the problem of using a file as both input and output in a pipeline.

# PARAMETERS

**-a**
> Append to file instead of overwriting.

# EXAMPLES

Without sponge (fails):
```
sort file.txt > file.txt  # Results in empty file!
```

With sponge (works):
```
sort file.txt | sponge file.txt
```

# CAVEATS

Loads entire input into memory. Very large files may exhaust memory. Part of moreutils package. Creates temp file internally.

# HISTORY

**sponge** is part of **moreutils**, a collection of Unix tools created by **Joey Hess**. It addresses a common shell scripting pitfall where redirection to the input file truncates it before reading.

# SEE ALSO

[tee](/man/tee)(1), [cat](/man/cat)(1), [moreutils](/man/moreutils)(7)
