# TLDR

**Extract** fields

```cut -f [1,3] [file.txt]```

**Extract** columns by character

```cut -c [1-10] [file.txt]```

**Custom** delimiter

```cut -d [:] -f [1,7] [/etc/passwd]```

**Extract** bytes

```cut -b [1-5] [file.txt]```

# SYNOPSIS

**cut** [_options_] [_file_...]

# DESCRIPTION

**cut** removes sections from each line of files. It extracts columns by character position, byte position, or field delimiter, making it useful for processing structured text data.

The command is commonly used in shell scripts for parsing columnar data.

# PARAMETERS

**-f**, **--fields** _list_
> Select fields (delimiter-separated)

**-c**, **--characters** _list_
> Select characters

**-b**, **--bytes** _list_
> Select bytes

**-d**, **--delimiter** _char_
> Field delimiter (default: TAB)

**--output-delimiter** _string_
> Output delimiter

**-s**, **--only-delimited**
> Don't print lines without delimiter

**--complement**
> Complement the selection

# RANGE SPECIFICATION

- **N** - Nth item
- **N-** - From Nth to end
- **N-M** - From Nth to Mth
- **-M** - From beginning to Mth
- **N,M** - Nth and Mth

# WORKFLOW

```bash
# Extract first field (default TAB delimiter)
cut -f 1 data.tsv

# Extract multiple fields
cut -f 1,3,5 data.tsv

# CSV with custom delimiter
cut -d ',' -f 2 data.csv

# Extract username from /etc/passwd
cut -d ':' -f 1 /etc/passwd

# Extract characters 1-10
cut -c 1-10 file.txt

# Extract first 20 bytes
cut -b 1-20 file.txt

# Change output delimiter
cut -d ',' -f 1,2 --output-delimiter=':' data.csv
```

# COMMON USES

**Parse CSV:**
```bash
cut -d ',' -f 2,4 data.csv
```

**Extract columns from ps:**
```bash
ps aux | cut -c 1-20,50-70
```

**Get usernames:**
```bash
cut -d ':' -f 1 /etc/passwd
```

**Field range:**
```bash
cut -f 2-5 data.tsv
```

# CAVEATS

Cannot handle varying amounts of whitespace (use awk instead). Delimiter must be single character. Cannot reorder fields (use awk). No regular expression support. Quote handling in CSV requires other tools. Only operates on bytes/characters/fields, not by column width.

# HISTORY

**cut** has been part of Unix since the early **1980s**, part of System III and later POSIX standards.

# SEE ALSO

[paste](/man/paste)(1), [awk](/man/awk)(1), [tr](/man/tr)(1), [column](/man/column)(1)
