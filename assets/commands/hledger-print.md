# TAGLINE

outputs transactions from the journal

# TLDR

**Print all transactions**

```hledger print```

**Print specific account**

```hledger print [account-pattern]```

**Print date range**

```hledger print -b [2024-01-01] -e [2024-12-31]```

**Print with cost**

```hledger print --cost```

**Output as CSV**

```hledger print -O csv```

# SYNOPSIS

**hledger print** [_options_] [_patterns_]

# PARAMETERS

_PATTERNS_
> Account or description patterns.

**-b** _DATE_
> Begin date.

**-e** _DATE_
> End date.

**--cost**
> Convert to cost basis.

**--explicit**
> Make amounts explicit.

**-O** _FORMAT_
> Output format (txt, csv).

**--help**
> Display help information.

# DESCRIPTION

**hledger print** outputs transactions from the journal. It reproduces transaction records, optionally filtered or transformed.

The command is useful for extracting subsets of transactions or converting between formats. Output is valid journal syntax.

# CAVEATS

Outputs in journal format by default. Filtering reduces output. Part of hledger suite.

# HISTORY

Print is a core **hledger** command for displaying and extracting transactions from journals.

# SEE ALSO

[hledger](/man/hledger)(1), [hledger-register](/man/hledger-register)(1), [hledger-import](/man/hledger-import)(1)
