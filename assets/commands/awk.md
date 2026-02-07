# TAGLINE

Pattern scanning and text processing language

# TLDR

Print the **fifth column** (a.k.a. field) in a space-separated file

```awk '{print $5}' [path/to/file] ```

Print the second column of the **lines containing "foo"** in a space-separated file

```awk '/[foo]/ {print $2}' [path/to/file] ```

Print the **last column** of each line in a file, using a **comma** (instead of space) as a field separator

```awk -F ',' '{print $NF}' [path/to/file]```

**Sum the values** in the first column of a file and print the total

```awk '{s+=$1} END {print s}' [path/to/file]```

Print different values **based on conditions**

```awk '{if ($1 == "foo") print "Exact match foo"; else if ($1 ~ "bar") print "Partial match bar"; else print "Baz"}' [path/to/file]```

Print all the lines which the 10th column value is **between a min and a max**

```awk '($10 >= [min_value] && $10 <= [max_value])'```

# SYNOPSIS

**awk** [_-F fs_] [_-v var=val_] [_-f progfile_] [_--posix_] [_--_] '_program_' [_files_]

# PARAMETERS

**-F  _fs_**  
> Field separator (_fs_); default whitespace or TAB  
  
**-f  _file_**  
> Read awk program from _file_ instead of command line  
  
**-v  _var_=_val_**  
> Assign _val_ to _var_ before program runs (repeatable)  
  
**--**  
> End options; treat following as filenames  
  
**-V**  
> Print version and exit (gawk)  
  
**--help**  
> Print help and exit (gawk)  
  
**--posix**  
> Enforce POSIX compatibility (gawk)  
  
**-mf  _n_**  
> Limit function args to _n_ (debugging; gawk)  
  
**-mr  _n_**  
> Limit record size to _n_ bytes (debugging; gawk)  
  
**-W  _traditional_**  
> Use original awk behavior (gawk)

# DESCRIPTION

**awk** is a pattern-scanning and text-processing language designed for extracting and transforming structured data. It reads input line by line, splits each line into fields, and applies user-defined rules consisting of patterns and actions.

An awk program is a sequence of **pattern { action }** rules. For each input line, awk tests the patterns and executes the associated actions for any that match. If no pattern is given, the action applies to every line. If no action is given, matching lines are printed.

Fields are accessed as **$1**, **$2**, etc., with **$0** representing the entire line. The default field separator is whitespace, changeable with **-F**. Built-in variables include **NR** (current line number), **NF** (number of fields in current line), **FS** (field separator), and **OFS** (output field separator).

Special patterns **BEGIN** and **END** execute actions before and after all input is processed, useful for initialization and summary output. Awk supports variables, arrays, arithmetic, string functions, printf formatting, and control flow statements, making it a complete programming language for text processing.

# FIELD ACCESS

**\$0**: Full line
**\$1**: First field
**NF**: Fields count
**NR**: Record (line) number
Use **\$(n)** for nth field

# CAVEATS

Different awk implementations (gawk, mawk, nawk) have varying feature sets. Regular expressions and string functions may behave differently across implementations. Associative arrays are unordered. Floating-point arithmetic may produce rounding errors. Very large files are processed efficiently but complex programs with many arrays can consume significant memory.

# HISTORY

**awk** was created by **Alfred Aho**, **Peter Weinberger**, and **Brian Kernighan** at Bell Labs in **1977**, with the name derived from their initials. It was redesigned and expanded in **1985** as "new awk" (nawk). **GNU awk** (gawk) added many extensions including networking and internationalization. Awk is a standard POSIX utility available on virtually all Unix-like systems.

# SEE ALSO

[sed](/man/sed)(1), [grep](/man/grep)(1), [cut](/man/cut)(1), [perl](/man/perl)(1), [gawk](/man/gawk)(1)
