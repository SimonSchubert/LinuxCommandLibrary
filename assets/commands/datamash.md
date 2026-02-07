# TAGLINE

command-line tool for basic numeric and statistical operations

# TLDR

Get **max, min, mean, median** of a column

```seq 3 | datamash max 1 min 1 mean 1 median 1```

Get mean of **float numbers** (comma decimal)

```echo -e '1.0\n2.5\n3.1' | tr '.' ',' | datamash mean 1```

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
> First line is header

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

Float numbers must use comma as decimal separator in some locales (use tr to convert). Part of GNU datamash. Column numbering starts at 1.

# SEE ALSO

[awk](/man/awk)(1), [cut](/man/cut)(1), [sort](/man/sort)(1)
