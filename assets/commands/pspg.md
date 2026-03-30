# TAGLINE

Unix pager designed for tables and PostgreSQL output

# TLDR

**Use as the pager for psql**

```export PAGER=pspg```

**View a CSV file**

```pspg --csv < [file.csv]```

**View a TSV file**

```pspg --tsv < [file.tsv]```

**Open a file directly**

```pspg -f [file.txt]```

**Set color style**

```pspg -s [5] < [file.csv]```

**Freeze first N columns while scrolling**

```pspg --csv -c [2] < [file.csv]```

**Exit if content fits on one screen**

```pspg -F < [file.txt]```

**Use with psql in streaming mode**

```psql -c "SELECT * FROM table" | pspg --stream```

# SYNOPSIS

**pspg** [_options_] [**-f** _file_]

# PARAMETERS

**-f**, **--file** _FILE_
> Open specified file.

**-F**, **--quit-if-one-screen**
> Exit if content fits on one screen.

**--csv**
> Read input as CSV format.

**--csv-separator** _CHAR_
> Specify CSV field separator character.

**--csv-header** _on|off_
> Control header line usage for CSV input.

**--tsv**
> Read input as TSV format.

**--stream**
> Read input continuously in streaming mode.

**--querystream**
> Read a stream of queries from pipe or file.

**-c**, **--freezecols** _N_
> Freeze first N columns (0-9).

**-s**, **--style** _N_
> Set color style (0-22).

**-b**, **--blackwhite**
> Use black and white color style.

**-a**, **--ascii**
> Force ASCII characters for borders.

**-i**, **--ignore-case**
> Ignore case in searches without uppercase characters.

**-I**, **--IGNORE-CASE**
> Ignore case in all searches.

**-g**, **--hlite-search**
> Don't highlight search results.

**-G**, **--HILITE-SEARCH**
> Don't highlight search result lines.

**--line-numbers**
> Show line number column.

**--no-mouse**
> Disable custom mouse handling.

**--no-bars**
> Hide bottom and top bars.

**--no-cursor**
> Hide row cursor.

**--no-scrollbar**
> Hide scrollbar.

**--no-sound**
> Disable beep on scroll limit.

**--vertical-cursor**
> Display vertical column cursor.

**--bold-labels**
> Make row and column labels bold.

**--force-uniborder**
> Replace ASCII borders with Unicode borders.

**--only-for-tables**
> Use standard pager when content is not a table.

**--on-sigint-exit**
> Exit on Ctrl+C or Escape.

**-X**, **--reprint-on-exit**
> Preserve content in terminal after exit.

**--ni**
> Non-interactive mode (CSV and query only).

**-q**, **--query** _QUERY_
> Execute specified query.

**-w**, **--watch** _N_
> Repeat query or file read every N seconds.

**-d**, **--dbname** _NAME_
> Specify database name for direct queries.

**-h**, **--host** _HOST_
> Database server host.

**-p**, **--port** _PORT_
> Database server port.

**-U**, **--username** _USER_
> Database user name.

**-V**, **--version**
> Show version information.

**--help**
> Show help message.

# DESCRIPTION

**pspg** is a Unix pager with rich functionality designed for working with tables. Originally created for PostgreSQL's psql, it also supports MySQL and works as a general CSV/TSV viewer. It features frozen column headers, searching, row/column/block selection, clipboard export, and mouse support.

Key features include freezable columns with **-c**, multiple color styles selectable with **-s**, vertical and horizontal scrolling, and the ability to directly query databases with **-q**. In streaming mode (**--stream**), it can display continuously updating output such as psql's **\watch** results.

# HISTORY

**pspg** was created by **Pavel Stehule** (okbob) and is written in **C**.

# SEE ALSO

[less](/man/less)(1), [psql](/man/psql)(1), [mysql](/man/mysql)(1), [ov](/man/ov)(1)
