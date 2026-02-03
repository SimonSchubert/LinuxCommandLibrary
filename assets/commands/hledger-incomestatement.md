# TLDR

**Show income statement**

```hledger incomestatement```

**Show from specific file**

```hledger incomestatement -f [journal.ledger]```

**Show for specific period**

```hledger incomestatement -p "[this month]"```

**Show monthly breakdown**

```hledger incomestatement --monthly```

**Limit account depth**

```hledger incomestatement --depth [2]```

# SYNOPSIS

**hledger** **incomestatement** | **is** [_options_]

# PARAMETERS

**-f**, **--file** _file_
> Use specified journal file.

**-p**, **--period** _expr_
> Report period (e.g., "this month", "2024").

**--monthly**
> Show monthly columns.

**--quarterly**
> Show quarterly columns.

**--yearly**
> Show yearly columns.

**--depth** _n_
> Limit account depth.

**--tree**
> Show accounts as tree.

# DESCRIPTION

**hledger incomestatement** (alias **is**) displays an income statement (profit & loss report) showing revenues and expenses for the report period, and their difference as net income. Part of hledger's standard financial reports alongside balance sheet and cash flow.

# SEE ALSO

[hledger](/man/hledger)(1), [hledger-balancesheet](/man/hledger-balancesheet)(1)

