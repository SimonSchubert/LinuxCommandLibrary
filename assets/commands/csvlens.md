# TAGLINE

CSV file viewer with search and navigation

# TLDR

**View** a CSV file with column alignment and navigation

```csvlens [path/to/file.csv]```

**Search** for a specific pattern in the CSV

```csvlens [path/to/file.csv] -f [pattern]```

**View** with a specific delimiter instead of comma

```csvlens [path/to/file.csv] -d '[delimiter]'```

**View** only specific columns

```csvlens [path/to/file.csv] -c [1,3,5]```

# SYNOPSIS

**csvlens** [_options_] [_file_]

# PARAMETERS

**-f, --filter** _PATTERN_
> Filter rows matching the pattern

**-d, --delimiter** _CHAR_
> Specify delimiter character (default: comma)

**-c, --columns** _LIST_
> Show only specified columns (comma-separated indices)

**-H, --no-header**
> Treat the first row as data, not headers

**-n, --line-number**
> Show line numbers

**--tab**
> Use tab as delimiter

**--semi**
> Use semicolon as delimiter

**-h, --help**
> Display help and exit

**-V, --version**
> Display version and exit

# DESCRIPTION

**csvlens** is a command-line CSV file viewer designed for efficiently browsing and searching through CSV data. It provides column-aligned display, interactive search filtering, and keyboard navigation similar to less or vim.

The tool automatically detects and aligns columns for easy reading, supports various delimiters beyond commas, and allows filtering data without modifying the original file. It's particularly useful for inspecting large CSV files where traditional editors may struggle with performance.

# KEYBINDINGS

**↑/↓** or **k/j**
> Navigate up/down through rows

**←/→** or **h/l**
> Scroll horizontally

**/**
> Search/filter mode

**n/N**
> Next/previous search result

**g/G**
> Go to first/last row

**q**
> Quit

# CAVEATS

Very large CSV files may still experience performance limitations depending on available memory. Unicode and special character handling depends on terminal capabilities. Some complex CSV formats with embedded newlines may not render correctly.

# HISTORY

**csvlens** was developed to address the need for a fast, lightweight CSV viewer in the terminal. It draws inspiration from traditional Unix tools like less and grep while adding CSV-specific formatting and navigation features.

# SEE ALSO

[cat](/man/cat)(1), [less](/man/less)(1), [grep](/man/grep)(1), [awk](/man/awk)(1)
