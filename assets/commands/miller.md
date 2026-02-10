# TAGLINE

like awk, sed, cut, join, and sort for name-indexed data such as CSV

# TLDR

**Convert CSV to JSON**

```mlr --csv --ojson cat [file.csv]```

**Filter records**

```mlr --csv filter '$[field] > [10]' [file.csv]```

**Select columns**

```mlr --csv cut -f [name,age] [file.csv]```

**Sort by field**

```mlr --csv sort -f [age] [file.csv]```

**Aggregate statistics**

```mlr --csv stats1 -a sum,mean -f [value] -g [category] [file.csv]```

**Transform field**

```mlr --csv put '$[total] = $[price] * $[quantity]' [file.csv]```

# SYNOPSIS

**mlr** [_options_] _verb_ [_verb-options_] _files_...

# PARAMETERS

**--csv**
> CSV input format.

**--json**
> JSON input format.

**--ojson**
> JSON output format.

**--icsv --ojson**
> CSV in, JSON out.

**cat**
> Pass through records.

**filter**
> Select matching records.

**cut**
> Select fields.

**sort**
> Sort records.

**put**
> Add/modify fields.

**stats1**
> Aggregate statistics.

# DESCRIPTION

**Miller** (mlr) is like awk, sed, cut, join, and sort for name-indexed data such as CSV, TSV, and JSON. It's designed for processing structured text data from the command line.

Miller handles heterogeneous data formats with consistent syntax.

# FORMAT CONVERSION

```bash
mlr --icsv --ojson cat data.csv
mlr --ijson --ocsv cat data.json
mlr --csv --opprint cat data.csv
```

# CAVEATS

DSL syntax differs from awk. Field names are case-sensitive. Large files processed streaming.

# HISTORY

Miller was created by **John Kerl** starting in **2015** to provide a unified tool for structured text processing.

# SEE ALSO

[jq](/man/jq)(1), [awk](/man/awk)(1), [csvkit](/man/csvkit)(1), [xsv](/man/xsv)(1)
