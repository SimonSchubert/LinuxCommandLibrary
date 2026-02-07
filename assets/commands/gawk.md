# TAGLINE

GNU implementation of AWK text processor

# TLDR

**Print specific columns** from a file

```gawk '{print $1, $3}' [path/to/file]```

**Use a different field separator**

```gawk -F':' '{print $1}' [/etc/passwd]```

**Sum values in a column**

```gawk '{sum += $1} END {print sum}' [file]```

**Filter lines matching a pattern**

```gawk '/pattern/ {print}' [file]```

**Print line numbers** with content

```gawk '{print NR": "$0}' [file]```

**Run an awk program from a file**

```gawk -f [program.awk] [file]```

**Use variables from command line**

```gawk -v name="[value]" '{print name, $0}' [file]```

**Print lines where column 3 > 100**

```gawk '$3 > 100 {print}' [file]```

# SYNOPSIS

**gawk** [_-F fs_] [_-v var=val_] [_-f progfile_] [_'program'_] [_file ..._]

# PARAMETERS

**-F** _fs_
> Set field separator (default: whitespace).

**-f** _progfile_
> Read program from file instead of command line.

**-v** _var=value_
> Assign value to variable before program execution.

**-b**, **--characters-as-bytes**
> Treat all input data as single-byte characters.

**-c**, **--traditional**
> Run in POSIX-compatible mode.

**-e** _'program'_
> Specify program text (can use multiple -e options).

**-i** _file_
> Include library file.

**-l** _lib_
> Load extension library.

**-n**, **--non-decimal-data**
> Recognize octal and hexadecimal values in input.

**-o** _file_
> Pretty-print program to file.

**-p** _file_
> Enable profiling, output to file.

**-S**, **--sandbox**
> Disable system commands and file access.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**gawk** (GNU awk) is the GNU implementation of the AWK programming language, designed for text processing and data extraction. It processes input line by line, splitting each into fields that can be manipulated and transformed.

An AWK program consists of patterns and actions: **pattern { action }**. When a line matches a pattern, the associated action executes. Special patterns **BEGIN** and **END** run before/after processing any input.

Built-in variables include: **$0** (entire line), **$1-$n** (fields), **NR** (record/line number), **NF** (number of fields), **FS** (field separator), **OFS** (output field separator), and **RS** (record separator).

Gawk extends standard AWK with features like: network programming (TCP/UDP connections), time functions, bit manipulation, internationalization, and extension loading. It also supports regular expressions, arrays, user-defined functions, and getline for reading from files/pipes.

Common uses include: log analysis, CSV/TSV processing, report generation, data transformation, and quick text manipulation tasks that would be verbose in other languages.

# CAVEATS

Complex programs may be better suited for Python or Perl. Floating-point precision can be surprising. Different AWK implementations have subtle incompatibilities. Default field splitting may not handle quoted CSV properly (consider csvkit for that).

# HISTORY

AWK was created by Alfred Aho, Peter Weinberger, and Brian Kernighan at Bell Labs in **1977** (the name is their initials). **gawk** (GNU AWK) was developed by the GNU Project starting in **1986**, adding significant extensions while maintaining compatibility. It remains the most feature-rich AWK implementation.

# SEE ALSO

[awk](/man/awk)(1), [sed](/man/sed)(1), [perl](/man/perl)(1), [cut](/man/cut)(1), [grep](/man/grep)(1)
