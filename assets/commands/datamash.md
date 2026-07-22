# TAGLINE

command-line tool for basic numeric and statistical operations

# TLDR

Get **max, min, mean, median** of a column

```seq 3 | datamash max 1 min 1 mean 1 median 1```

**Group by** first column and sum the second (CSV input)

```datamash -t, -g 1 sum 2 < [file.csv]```

Get mean with **specific precision**

```echo -e '1\n2\n3' | datamash -R [decimals] mean 1```

Get mean **ignoring NA/NaN** values

```echo -e '1\n2\nNa\n3\nNaN' | datamash --narm mean 1```

# SYNOPSIS

**datamash** [_options_] _operation_ _column_ [_operation_ _column_...]

# DESCRIPTION

**datamash** performs basic numeric, textual, and statistical operations on input data from the command line. It's designed for quick data analysis tasks that would otherwise require scripting or statistical software, supporting operations like sum, mean, median, standard deviation, variance, and more.

Input is read from stdin or files, with columns separated by whitespace or a specified delimiter. The tool can group data by fields and compute aggregate statistics for each group, similar to SQL's GROUP BY functionality.

datamash is part of the GNU project and excels at one-liners for data exploration. It's commonly used in pipelines to analyze CSV files, log data, or any tabular text data. The tool can handle both numeric and textual operations, including counting unique values, string operations, and random sampling.

# PARAMETERS

**-R, --round** _digits_
> Round numeric output to specified decimals

**--narm**
> Ignore NA and NaN values

**-t** _char_
> Use specified field separator

**-g, --group** _fields_
> Group by specified fields

**-H, --headers**
> First line is header (both input and output)

**-s, --sort**
> Sort the input before grouping (required if input is not already sorted by the group fields)

**-W, --whitespace**
> Use whitespace (one or more spaces/tabs) as field separator

**--full**
> Print entire input line before the operation results

# OPERATIONS

**sum, min, max, mean, median**
> Basic statistics

**pstdev, sstdev**
> Population/sample standard deviation

**count, unique, collapse**
> Counting and grouping

**first, last, rand**
> Selection operations

# CAVEATS

The decimal separator follows the current locale (period in the C locale, comma in e.g. German locales). Grouping (-g) expects sorted input unless -s is given. Column numbering starts at 1.

# INSTALL

```apt: sudo apt install datamash```

```dnf: sudo dnf install datamash```

```pacman: sudo pacman -S datamash```

```apk: sudo apk add datamash```

```zypper: sudo zypper install datamash```

```brew: brew install datamash```

```nix: nix profile install nixpkgs#datamash```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[awk](/man/awk)(1), [cut](/man/cut)(1), [sort](/man/sort)(1)

# RESOURCES

```[Homepage](https://www.gnu.org/software/datamash/)```

```[Documentation](https://www.gnu.org/software/datamash/manual/)```

<!-- verified: 2026-07-11 -->
