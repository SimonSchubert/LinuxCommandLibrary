# TAGLINE

Filter TSV files by column values

# TLDR

**Filter by numeric value**

```tsv-filter --eq [1]:[100] [file.tsv]```

**Filter by string value**

```tsv-filter --str-eq [1]:[value] [file.tsv]```

**Greater than**

```tsv-filter --gt [2]:[100] [file.tsv]```

**Field contains a string**

```tsv-filter --str-in-fld [1]:[pattern] [file.tsv]```

**Field matches a regular expression**

```tsv-filter --regex [1]:'[^abc]' [file.tsv]```

**Multiple conditions**

```tsv-filter --ge [2]:[10] --le [2]:[100] [file.tsv]```

**Match any condition**

```tsv-filter --or --str-eq [1]:[a] --str-eq [1]:[b] [file.tsv]```

**Use header field names**

```tsv-filter -H --gt [Price]:[100] [file.tsv]```

**Invert the filter**

```tsv-filter --invert --eq [1]:[100] [file.tsv]```

# SYNOPSIS

**tsv-filter** [_options_] [_file_...]

# PARAMETERS

**--eq**, **--ne**, **--lt**, **--le**, **--gt**, **--ge** _FIELD:NUM_
> Numeric comparisons.

**--str-eq**, **--str-ne** _FIELD:STR_
> String equal or not equal.

**--istr-eq**, **--istr-ne** _FIELD:STR_
> Case-insensitive string equal or not equal.

**--str-in-fld**, **--str-not-in-fld** _FIELD:STR_
> Field contains or does not contain a string.

**--regex**, **--not-regex** _FIELD:REGEX_
> Field matches or does not match a regular expression.

**--empty**, **--not-empty**, **--blank**, **--not-blank** _FIELD_
> Empty and blank field tests.

**--is-numeric** _FIELD_
> Field can be interpreted as a number.

**--or**
> Evaluate tests as OR rather than AND.

**-v**, **--invert**
> Print lines that do not match.

**-c**, **--count**
> Print only a count of matched lines.

**-H**, **--header**
> Treat the first line of each file as a header.

**-d**, **--delimiter** _CHR_
> Field delimiter (default: TAB).

**--label** _STR_
> Add a field marking whether each record passed, rather than filtering.

**--help-verbose**
> Print detailed help.

# DESCRIPTION

**tsv-filter** selects rows from tab-separated value files based on column conditions. It supports numeric comparisons, string operations, regular expressions, field length tests and field-to-field comparisons.

Multiple conditions are joined with AND logic by default, so all conditions must match for a row to be included. The **--or** flag changes this to match any condition, and **--invert** outputs non-matching rows instead.

Part of the **tsv-utils** suite, tsv-filter is written in D for high performance on large datasets. Fields are numbered from 1, and with **-H** they can also be referenced by header name.

# CAVEATS

**--eq** and the related tests compare numerically; use **--str-eq** for text. The delimiter must be a single-byte character. The tsv-utils repository has seen little activity since 2022.

# HISTORY

**tsv-filter** is part of **tsv-utils**, a collection of high-performance command-line tools for TSV files.

# SEE ALSO

[awk](/man/awk)(1), [cut](/man/cut)(1), [miller](/man/miller)(1)

# RESOURCES

```[Homepage](https://opensource.ebay.com/tsv-utils/)```

```[Source code](https://github.com/eBay/tsv-utils)```

<!-- verified: 2026-11-09 -->
