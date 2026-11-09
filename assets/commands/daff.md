# TAGLINE

Data diff tool for comparing tables and CSV files

# TLDR

**Compare two CSV files and show differences**

```daff [file1.csv] [file2.csv]```

**Save diff output to a file**

```daff --output [changes.csv] [file1.csv] [file2.csv]```

**Compare using a primary key column**, ignoring row order

```daff --id [column] --unordered [file1.csv] [file2.csv]```

**Compare two SQLite databases**

```daff --input-format sqlite [a.db] [b.db]```

**Apply a patch to update a file**

```daff patch [file.csv] [changes.csv]```

**Apply a patch in place**

```daff patch --inplace [file.csv] [changes.csv]```

**Three-way merge with a common parent**

```daff merge [parent.csv] [local.csv] [remote.csv]```

**Render a diff as HTML**

```daff render --output [diff.html] [diff.csv]```

**Use as git diff and merge handler** for CSV files

```daff git csv```

# SYNOPSIS

**daff** [_command_] [_options_] [_files_]

# PARAMETERS

_a.csv b.csv_
> Compare two tables and output differences (default action).

_parent.csv a.csv b.csv_
> Show a three-way comparison against a common parent.

**diff** _a.csv b.csv_
> Compare with full control over the flags below.

**patch** [**--inplace**] _a.csv patch.csv_
> Apply a patch file to a table.

**merge** [**--inplace**] _parent.csv a.csv b.csv_
> Perform a three-way merge of tables.

**render** _diff.csv_
> Render a diff as HTML.

**trim** _source.csv_
> Trim a table.

**copy** _in.csv out.tsv_
> Copy and convert between table formats.

**git** [_csv_]
> Show instructions for git integration, or install daff as diff and merge handler with **daff git csv**.

**version**
> Show daff version.

**--output** _FILE_
> Write output to file instead of stdout.

**--output-format** _FORMAT_
> Output format: csv, tsv, ssv, psv, json, copy, or html.

**--input-format** _FORMAT_
> Input format: csv, tsv, ssv, psv, json, or sqlite.

**--inplace**
> Modify the input file directly (for patch and merge).

**--color**
> Highlight changes with terminal colors (default in terminals).

**--no-color**
> Ensure terminal colors are not used.

**--www**
> Send output to a browser.

**--act** _ACT_
> Show only a certain kind of change: update, insert, delete, or column.

**--all**
> Do not prune unchanged rows or columns.

**--all-rows**
> Do not prune unchanged rows.

**--all-columns**
> Do not prune unchanged columns.

**--context** _NUM_
> Show NUM rows of context (0 for none).

**--context-columns** _NUM_
> Show NUM columns of context (0 for none).

**--fail-if-diff**
> Return status 0 if equal, 1 if different, 2 if there was a problem.

**--id** _COLUMN_
> Column to use as primary key. Repeat for a multi-column key.

**--ignore** _COLUMN_
> Column to ignore completely. Can be repeated.

**--index**
> Include row and column numbers from the original tables.

**--eol** _crlf|lf|cr|auto_
> Row separator of CSV output.

**--ordered**
> Assume row order is meaningful (default for CSV).

**--unordered**
> Assume row order is meaningless (default for JSON formats).

**--padding** _dense|sparse|smart_
> Padding method for aligning columns.

**--table** _NAME_
> Table to compare with SQL sources. Use n1:n2 if the name changed.

**-w**, **--ignore-whitespace**
> Ignore changes in leading or trailing whitespace.

**-i**, **--ignore-case**
> Ignore differences in case.

**--css** _CSS.css_
> With **render**: generate a css file to go with the html.

**--fragment**
> With **render**: generate an html fragment rather than a page.

**--plain**
> With **render**: do not use fancy utf8 characters for arrows.

**--unquote**
> With **render**: do not quote html characters in html diffs.

# DESCRIPTION

**daff** is a library and utility for comparing tables, producing a summary of their differences, and using that summary as a patch file. It is optimized for comparing tables that share a common origin, in other words multiple versions of the "same" table.

The tool can detect added, removed, and modified rows and columns, represent differences in various formats including HTML and colored terminal output, and apply patches to update data files. Formats supported are CSV, TSV, SQLite, and ndjson.

# HISTORY

**daff** is written by Paul Fitzpatrick in **Haxe**, which is translated to JavaScript, Python, Ruby, PHP and other targets; the project dates to **2013**. The command is available as **daff**, **daff.py**, or **daff.rb** depending on the implementation installed.

# SEE ALSO

[diff](/man/diff)(1), [patch](/man/patch)(1), [git](/man/git)(1), [csvlens](/man/csvlens)(1)

# RESOURCES

```[Source code](https://github.com/paulfitz/daff)```

```[Homepage](https://paulfitz.github.io/daff/)```

<!-- verified: 2026-11-09 -->
