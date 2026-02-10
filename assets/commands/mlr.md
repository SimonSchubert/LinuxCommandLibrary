# TAGLINE

processes structured text data

# TLDR

**Convert CSV to JSON**

```mlr --csv --ojson cat [data.csv]```

**Filter records**

```mlr --csv filter '$status == "active"' [data.csv]```

**Select fields**

```mlr --csv cut -f [name,email] [data.csv]```

**Sort records**

```mlr --csv sort -f [age] [data.csv]```

**Calculate statistics**

```mlr --csv stats1 -a mean -f [price] [data.csv]```

**Transform field**

```mlr --csv put '$total = $price * $quantity' [data.csv]```

# SYNOPSIS

**mlr** [_options_] _verbs_ _file_

# PARAMETERS

_VERBS_
> Operations to perform.

**--csv**
> CSV format.

**--json**
> JSON format.

**--ojson**
> Output as JSON.

**filter**
> Filter records.

**cut**
> Select fields.

**sort**
> Sort records.

**--help**
> Display help information.

# DESCRIPTION

**mlr** (Miller) processes structured text data. It handles CSV, JSON, and other formats.

The tool provides awk-like processing for structured data. Powerful for data transformation.

# CAVEATS

Many verbs to learn. Format-aware. Go-based rewrite.

# HISTORY

Miller was created by **John Kerl** as "like awk/sed/cut for name-indexed data."

# SEE ALSO

[jq](/man/jq)(1), [awk](/man/awk)(1), [csvtool](/man/csvtool)(1)

