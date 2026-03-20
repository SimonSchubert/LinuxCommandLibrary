# TAGLINE

Data diff tool for comparing tables and CSV files

# TLDR

**Compare two CSV files and show differences**

```daff [file1.csv] [file2.csv]```

**Compare with colored output**

```daff --color [file1.csv] [file2.csv]```

**Save diff output to a file**

```daff --output [changes.csv] [file1.csv] [file2.csv]```

**Apply a patch to update a file**

```daff patch [file.csv] [changes.csv]```

**Apply a patch in place**

```daff patch --inplace [file.csv] [changes.csv]```

**Three-way merge with a common parent**

```daff merge [parent.csv] [local.csv] [remote.csv]```

**Render a diff as HTML**

```daff render --output [diff.html] [diff.csv]```

**Copy/convert between formats**

```daff copy [input.csv] [output.tsv]```

# SYNOPSIS

**daff** [_command_] [_options_] [_files_]

# DESCRIPTION

**daff** is a data diffing tool designed for comparing tabular data such as CSV files, database tables, and spreadsheets. It provides git-like diff and patch operations specifically optimized for structured data formats.

The tool can detect added, removed, and modified rows and columns, represent differences in various formats including HTML and colored terminal output, and apply patches to update data files. It's particularly useful for tracking changes in data exports, database dumps, and collaborative data editing workflows.

# COMMANDS

_a.csv b.csv_ (default)
> Compare two tables and output differences.

**patch** [**--inplace**] _a.csv patch.csv_
> Apply a patch file to a table.

**merge** [**--inplace**] _parent.csv a.csv b.csv_
> Perform a three-way merge of tables.

**render** _diff.csv_
> Render a diff as HTML.

**trim** _source.csv_
> Trim whitespace from a table.

**copy** _in.csv out.tsv_
> Copy and convert between table formats.

**git**
> Use as a git diff driver for tabular files.

**version**
> Show daff version.

# OPTIONS

**--color**
> Force colored output (default: auto-detect)

**--no-color**
> Disable colored output

**--output** _FILE_
> Write output to file instead of stdout.

**--input-format** _FORMAT_
> Input format (e.g., sqlite for comparing databases).

**--www**
> Open diff in web browser.

**--inplace**
> Modify input file directly (for patch and merge).

**--unordered**
> Treat rows as unordered during comparison.

**-h**, **--help**
> Display help and exit.

# CAVEATS

Data types are inferred from content; explicit type declarations are not supported. Very large files may require significant memory. Comparison of unordered data requires more computational resources. Binary data and special characters may not be handled correctly in all output formats.

# HISTORY

**daff** was originally created by Paul Fitzpatrick as a tool for data versioning and collaboration. The name comes from "data diff." It has been implemented in multiple languages including JavaScript, Python, and Java. The tool was designed to bring version control concepts to data files, making it easier to track changes in datasets over time.

# SEE ALSO

[diff](/man/diff)(1), [patch](/man/patch)(1), [git](/man/git)(1), [csvlens](/man/csvlens)(1)
