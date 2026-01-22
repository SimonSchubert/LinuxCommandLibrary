# TLDR

**Show all balances**

```hledger balance```

**Show assets only**

```hledger balance assets```

**Show with hierarchy**

```hledger balance --tree```

**Show flat list**

```hledger balance --flat```

**Monthly breakdown**

```hledger balance -M```

**Show percentages**

```hledger balance --percent```

# SYNOPSIS

**hledger balance** [_options_] [_patterns_]

# PARAMETERS

_PATTERNS_
> Account name patterns.

**--tree**
> Hierarchical display.

**--flat**
> Flat account list.

**-M**, **--monthly**
> Monthly breakdown.

**-Q**, **--quarterly**
> Quarterly breakdown.

**-Y**, **--yearly**
> Yearly breakdown.

**--percent**
> Show percentages.

**--depth** _N_
> Limit account depth.

**--help**
> Display help information.

# DESCRIPTION

**hledger balance** shows account balances from the journal. It summarizes debits and credits across all matching accounts.

The command supports filtering by account pattern, time period, and display format. It's the primary tool for checking financial status.

hledger balance shows account balances.

# CAVEATS

Zero balances hidden by default. Requires valid journal. Part of hledger suite.

# HISTORY

Balance is a core command in **hledger** for displaying account summaries in plain text accounting.

# SEE ALSO

[hledger](/man/hledger)(1), [hledger-register](/man/hledger-register)(1), [hledger-incomestatement](/man/hledger-incomestatement)(1)
