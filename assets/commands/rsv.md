# TAGLINE

Fast CLI toolkit for CSV, TXT, and Excel files

# TLDR

**Show head** rows

```rsv head [data.csv]```

**Head with limit**

```rsv head -n [5] [data.csv]```

**Show headers**

```rsv headers [data.csv]```

**Count lines**

```rsv count [data.csv]```

**Frequency table** for columns

```rsv frequency [data.csv]```

**Column statistics**

```rsv stats [data.csv]```

**Select/filter rows**

```rsv select [data.csv]```

**Search with regex**

```rsv search [data.csv]```

**Excel to CSV**

```rsv excel2csv [data.xlsx]```

**Format as table**

```rsv table [data.csv]```

# SYNOPSIS

**rsv** *command* [*options*] [*file*]

# DESCRIPTION

**rsv** is a Rust command-line tool for inspecting and transforming CSV, TXT, and Excel files. It emphasizes speed (Rayon parallel processing where marked), progress bars on long jobs, and pipeline-friendly subcommands.

Commands include **head**, **tail**, **header**/**headers**, **count**, **estimate**, **clean**, **unique**, **frequency**, **split**, **select**, **flatten**, **slice**, **search**, **sort**, **sample**, **stats**, **excel2csv**, **to** (export), and **table**. Most commands can be chained except **clean** and **excel2csv**. Excel defaults to the first sheet; use **--sheet** where supported.

Install from GitHub releases (add the binary to **PATH**). Use **rsv** *command* **--help** for flags.

# PARAMETERS

**head** / **tail** [**-n** *n*] [*file*]

> Preview first/last rows (default 10).

**headers** [**-s** *sep*] [*file*]

> Print column headers.

**count** / **estimate** [*file*]

> Exact or fast approximate line counts.

**frequency** / **stats** / **unique** / **select** / **search** / **sort** / **sample** / **split** / **slice** / **flatten**

> Analysis and reshaping (several support parallel processing and progress bars).

**excel2csv** / **to** / **table** / **clean**

> Convert, export, format, or clean fields.

# CAVEATS

**sort** is in-memory and limited (at most two columns per upstream docs). Very wide or huge Excel sheets may need more RAM. Confirm separator flags for TSV/non-CSV text.

# INSTALL

```aur: yay -S rsv```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[xsv](/man/xsv)(1), [csvkit](/man/csvkit)(1), [qsv](/man/qsv)(1), [mlr](/man/mlr)(1)

# RESOURCES

```[Source code](https://github.com/ribbondz/rsv)```

<!-- verified: 2026-07-19 -->
