# TAGLINE

Pattern scanning and text processing language

# TLDR

Print a **single field** from every line

```awk '{print $3}' [path/to/file]```

Print the **last field**, whatever the field count

```awk '{print $NF}' [path/to/file]```

Split on something other than whitespace

```awk -F ':' '{print $1, $7}' /etc/passwd```

Print a field only from lines **matching a pattern**

```awk '/[error]/ {print $1}' [path/to/file]```

Keep the lines where a field **passes a numeric test**

```awk '$3 > [100]' [path/to/file]```

Combine a **field test with an action**

```awk -F ',' '$2 == "[EU]" {print $1}' [path/to/file]```

**Sum** a column

```awk '{sum += $1} END {print sum}' [path/to/file]```

**Average** a column

```awk '{sum += $2} END {print sum / NR}' [path/to/file]```

**Count how often** each value appears

```awk '{count[$1]++} END {for (key in count) print count[key], key}' [path/to/file]```

Select a **range of line numbers**

```awk 'NR >= [10] && NR <= [20]' [path/to/file]```

Skip the **header line**

```awk 'NR > 1' [path/to/file]```

Read one separator and **write another**

```awk -F ',' -v OFS='\t' '{print $1, $3}' [path/to/file]```

Pass a **shell value** into the program

```awk -v threshold=[100] '$1 > threshold' [path/to/file]```

Drop **duplicate lines** while keeping the original order

```awk '!seen[$0]++' [path/to/file]```

Print a **formatted table** with a header

```awk -F ':' 'BEGIN {printf "%-20s %6s\n", "USER", "UID"} $3 >= 1000 {printf "%-20s %6d\n", $1, $3}' /etc/passwd```

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
**FILENAME**: Current input file
**FS** / **OFS**: Input / output field separator
**RS** / **ORS**: Input / output record separator
Use **\$(n)** for nth field

# CAVEATS

Different awk implementations (gawk, mawk, nawk) have varying feature sets. Regular expressions and string functions may behave differently across implementations. Associative arrays are unordered. Floating-point arithmetic may produce rounding errors. Very large files are processed efficiently but complex programs with many arrays can consume significant memory.

# HISTORY

**awk** was created by **Alfred Aho**, **Peter Weinberger**, and **Brian Kernighan** at Bell Labs in **1977**, with the name derived from their initials. It was redesigned and expanded in **1985** as "new awk" (nawk). **GNU awk** (gawk) added many extensions including networking and internationalization. Awk is a standard POSIX utility available on virtually all Unix-like systems.

# INSTALL

```dnf: sudo dnf install gawk```

```pacman: sudo pacman -S gawk```

```apk: sudo apk add gawk```

```zypper: sudo zypper install gawk```

```brew: brew install gawk```

```nix: nix profile install nixpkgs#gawk```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[sed](/man/sed)(1), [grep](/man/grep)(1), [cut](/man/cut)(1), [perl](/man/perl)(1), [gawk](/man/gawk)(1)

# RESOURCES

```[Source code](https://cgit.git.savannah.gnu.org/cgit/gawk.git)```

```[Homepage](https://www.gnu.org/software/gawk/)```

```[Documentation](https://www.gnu.org/software/gawk/manual/)```

<!-- verified: 2026-06-09 -->
