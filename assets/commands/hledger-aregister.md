# TLDR

**Show account register**

```hledger aregister [checking]```

**Show with file**

```hledger aregister -f [journal.ledger] [assets:bank]```

**Show monthly summary**

```hledger aregister [checking] --monthly```

**Include historical balance**

```hledger aregister [checking] -H```

**Limit output width**

```hledger aregister [checking] -w [80]```

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

**--depth** _n_
> Limit account depth.

**-w**, **--width** _n_
> Set output width.

# DESCRIPTION

**hledger aregister** (alias **areg**) shows transactions and running balance for a single account in bank-statement format. Each transaction appears on one line with the date, description, other accounts involved, and running balance. Unlike **register**, which shows one line per posting, aregister groups postings by transaction.

# SEE ALSO

[hledger](/man/hledger)(1), [hledger-register](/man/hledger-register)(1)

