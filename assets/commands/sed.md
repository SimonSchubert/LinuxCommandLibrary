# TLDR

**Substitute** all occurrences of "apple" with "mango" on all lines

```[command] | sed 's/apple/mango/g'```

**Replace in-place** in a file (overwriting original)

```sed -i 's/apple/mango/g' [path/to/file]```

Run **multiple substitutions** in one command

```[command] | sed -e 's/apple/mango/g' -e 's/orange/lime/g'```

Use a **custom delimiter** (useful when pattern contains slashes)

```[command] | sed 's#////#____#g'```

**Delete lines** 1 to 5 and backup original with .orig extension

```sed -i.orig '1,5d' [path/to/file]```

**Print only** the first line to stdout

```[command] | sed -n '1p'```

**Insert** a new line at the beginning of a file

```sed -i '1i\your new line text\' [path/to/file]```

**Delete blank lines** from a file

```sed -i '/^[[:space:]]*$/d' [path/to/file]```

# SYNOPSIS

**sed** [_options_] '_script_' [_input-file_...]

# PARAMETERS

**-i**[_suffix_], **--in-place**[=_suffix_]
> Edit files in place; optionally create backup with suffix

**-e** _script_, **--expression=**_script_
> Add script commands to execute

**-f** _file_, **--file=**_file_
> Read script from file

**-n**, **--quiet**, **--silent**
> Suppress automatic printing; only print when p command used

**-r**, **-E**, **--regexp-extended**
> Use extended regular expressions

**-s**, **--separate**
> Treat files as separate rather than single stream

**-z**, **--null-data**
> Separate lines by NUL characters

**--debug**
> Annotate program execution

**--help**
> Display help

**--version**
> Display version

# DESCRIPTION

**sed** (stream editor) is a powerful text processing tool that performs basic transformations on input streams (files or piped data). It reads input line by line, applies specified editing commands, and writes to standard output.

Common operations include search and replace (s///), deletion (d), insertion (i), and printing (p). sed uses regular expressions for pattern matching and supports both basic and extended regex syntax. Address ranges (line numbers or patterns) can target specific lines.

# CAVEATS

The **-i** option modifies files directly; always test with output to stdout first or use backup suffix. Behavior of **-i** without suffix varies between GNU sed and BSD sed. Regular expression syntax differs between basic (default) and extended (**-r**) modes.

# HISTORY

Created by Lee McMahon at **Bell Labs in 1973-1974** as part of Unix. Based on the ed editor's scripting capabilities but designed for non-interactive stream processing. GNU sed extended the original with features like in-place editing and extended regex support.

# SEE ALSO

[awk](/man/awk)(1), [grep](/man/grep)(1), [tr](/man/tr)(1), [ed](/man/ed)(1), [perl](/man/perl)(1)
