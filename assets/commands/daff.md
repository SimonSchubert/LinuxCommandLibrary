# TAGLINE

Data diff tool for comparing tables and CSV files

# TLDR

**Compare** two CSV files and show differences

```daff diff [file1.csv] [file2.csv]```

**Create** a patch file from differences

```daff diff [file1.csv] [file2.csv] > [changes.patch]```

**Apply** a patch to update a file

```daff patch [file.csv] [changes.patch]```

**Merge** three versions of a file

```daff merge [parent.csv] [local.csv] [remote.csv]```

**Format** a CSV file with aligned columns

```daff render [file.csv]```

# SYNOPSIS

**daff** [_command_] [_options_] [_files_]

# DESCRIPTION

**daff** is a data diffing tool designed for comparing tabular data such as CSV files, database tables, and spreadsheets. It provides git-like diff and patch operations specifically optimized for structured data formats.

The tool can detect added, removed, and modified rows and columns, represent differences in various formats including HTML and colored terminal output, and apply patches to update data files. It's particularly useful for tracking changes in data exports, database dumps, and collaborative data editing workflows.

# COMMANDS

**diff**
> Compare two tables and output differences

**patch**
> Apply a patch file to a table

**merge**
> Perform a three-way merge of tables

**render**
> Display a table with formatting

**convert**
> Convert between table formats

# OPTIONS

**--color**
> Force colored output (default: auto-detect)

**--no-color**
> Disable colored output

**--format** _FORMAT_
> Output format: csv, tsv, html, json, markdown

**--output** _FILE_
> Write output to file instead of stdout

**--git**
> Use git-style diff format

**--padding** _N_
> Set column padding (default: 2)

**--unordered**
> Treat rows as unordered during comparison

**-h, --help**
> Display help and exit

**--version**
> Display version and exit

# CAVEATS

Data types are inferred from content; explicit type declarations are not supported. Very large files may require significant memory. Comparison of unordered data requires more computational resources. Binary data and special characters may not be handled correctly in all output formats.

# HISTORY

**daff** was originally created by Paul Fitzpatrick as a tool for data versioning and collaboration. The name comes from "data diff." It has been implemented in multiple languages including JavaScript, Python, and Java. The tool was designed to bring version control concepts to data files, making it easier to track changes in datasets over time.

# SEE ALSO

[diff](/man/diff)(1), [patch](/man/patch)(1), [git](/man/git)(1), [csvlens](/man/csvlens)(1)
