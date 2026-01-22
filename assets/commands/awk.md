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

The **cat** command (_concatenate_) is a core Unix utility for reading files sequentially and writing their contents to standard output. It excels at quick file inspection, merging multiple files, and feeding data into pipelines.  
  
Basic usage: **cat file.txt** prints a file's content. For concatenation: **cat file1.txt file2.txt > combined.txt** merges files. It processes files in order, reading from stdin if no files are given or if **-** is specified.  
  
Options enhance visibility: **-n** numbers lines, **-A** shows all non-printing characters, tabs as **^I**, and line ends as **$**. Suppress blank lines with **-s**. Ideal for scripts and pipes, e.g., **cat data.txt | sort | uniq**.  
  
Though simple, **cat** is ubiquitous in shell scripting for input/output manipulation. Avoid for very large files without redirection or piping to pagers like **less**, as it dumps everything at once. Supports text and binary files but may garble terminals with binaries.

# FIELD ACCESS

**\$0**: Full line
**\$1**: First field
**NF**: Fields count
**NR**: Record (line) number
Use **\$(n)** for nth field

# CAVEATS

Binary files may corrupt terminal display; use **hexdump** or **xxd**. No built-in paging for large files—pipe to **less**. Processes entire files sequentially without seeking.

# HISTORY

Originated in 1971 for first Edition Unix by Ken Thompson at Bell Labs. Core POSIX utility, evolved in GNU coreutils with enhanced options.

# SEE ALSO

[screenfetch](/man/screenfetch)(1), [fastfetch](/man/fastfetch)(1), [inxi](/man/inxi "inxi man page")(1), [hwinfo](/man/hwinfo)(1), [lshw](/man/lshw)(1)
