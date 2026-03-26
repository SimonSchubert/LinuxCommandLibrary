# TAGLINE

shows transactions and running balance for a single account in bank-statement format

# TLDR

**Show account register**

```hledger aregister [checking]```

**Show with a specific journal file**

```hledger aregister -f [journal.ledger] [assets:bank]```

**Show monthly summary**

```hledger aregister [checking] --monthly```

**Include historical balance from before report period**

```hledger aregister [checking] -H```

**Limit output width**

```hledger aregister [checking] -w [80]```

**Include zero-change transactions**

```hledger aregister [checking] -E```

**Output as CSV**

```hledger aregister [checking] -O csv```

# SYNOPSIS

**hledger** **aregister** | **areg** [_options_] _account_

# PARAMETERS

**-f**, **--file** _file_
> Use specified journal file.

**--daily**
> Show daily summaries.

**--weekly**
> Show weekly summaries.

**--monthly**
> Show monthly summaries.

**-H**, **--historical**
> Include balance from before report period.

**-E**, **--empty**
> Show transactions making a net change of zero.

**--txn-dates**
> Filter by transaction date instead of posting date.

**--depth** _n_
> Limit account depth.

**-w**, **--width** _n_
> Set output width.

**-O**, **--output-format** _fmt_
> Output format: txt, csv, tsv, html, fods, json.

**--quarterly**
> Show quarterly summaries.

**--yearly**
> Show yearly summaries.

# DESCRIPTION

**hledger aregister** (alias **areg**) shows transactions and running balance for a single account in bank-statement format. Each transaction appears on one line with the date, description, other accounts involved, amount, and running balance. Unlike **register**, which shows one line per posting, aregister groups postings by transaction. The account can be specified by full name or a case-insensitive regular expression matching the first account alphabetically.

# SEE ALSO

[hledger](/man/hledger)(1), [hledger-balance](/man/hledger-balance)(1), [hledger-print](/man/hledger-print)(1)

