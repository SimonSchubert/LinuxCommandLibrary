# TAGLINE

Suite of command-line CSV processing tools

# TLDR

**Display CSV file** in a readable table format

```csvlook [data.csv]```

**Get statistics** about a CSV file

```csvstat [data.csv]```

**Select specific columns**

```csvcut -c [col1,col2] [data.csv]```

**Sort by a column**

```csvsort -c [column] [data.csv]```

**Query CSV with SQL**

```csvsql --query "[SELECT * FROM data WHERE id > 100]" [data.csv]```

**Filter rows** matching a pattern

```csvgrep -c [column] -m "[value]" [data.csv]```

**Convert an Excel file to CSV**

```in2csv [data.xlsx] > [data.csv]```

**Stack multiple CSV files** vertically

```csvstack [file1.csv] [file2.csv]```

# SYNOPSIS

_tool_ [_options_] [_file_]

# INCLUDED TOOLS

**in2csv**
> Convert various formats (Excel, JSON, fixed-width) to CSV.

**sql2csv**
> Execute a SQL query on a database and output results as CSV.

**csvlook**
> Display CSV in a human-readable table format.

**csvstat**
> Generate statistics for CSV columns.

**csvcut**
> Select and reorder columns.

**csvgrep**
> Filter rows by column values.

**csvsort**
> Sort rows by columns.

**csvjoin**
> Join two CSV files on common columns.

**csvstack**
> Concatenate CSV files vertically.

**csvsql**
> Generate SQL statements or execute queries against a database.

**csvjson**
> Convert CSV to JSON.

**csvpy**
> Load CSV into a Python shell for interactive exploration.

**csvclean**
> Validate and fix CSV formatting issues.

**csvformat**
> Convert CSV to other delimited formats.

# DESCRIPTION

**csvkit** is a comprehensive suite of command-line tools for working with CSV files. It brings database-like operations to tabular data without requiring a database, following Unix philosophy principles.

The tools handle CSV quoting and escaping correctly, avoiding the pitfalls of using awk, sed, or cut directly on CSV data. They support various input encodings and delimiters, making them versatile for real-world data processing.

csvkit is particularly useful for data journalism, quick data exploration, ETL processes, and as part of data pipelines. All tools can read from stdin and write to stdout for easy chaining.

# CAVEATS

Some operations load entire files into memory. Type inference can sometimes misclassify data. Performance may be slower than specialized tools for very large files. Requires Python installation.

# HISTORY

csvkit was created by Christopher Groskopf and first released in **2011**. It was designed to provide data journalists and analysts with powerful command-line tools for processing CSV data, becoming a standard toolkit in the data science community.

# SEE ALSO

[miller](/man/miller)(1), [xsv](/man/xsv)(1), [jq](/man/jq)(1), [awk](/man/awk)(1), [cut](/man/cut)(1)
