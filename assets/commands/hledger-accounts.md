# TLDR

**List all accounts**

```hledger accounts```

**List accounts from specific file**

```hledger accounts -f [journal.ledger]```

**List accounts matching pattern**

```hledger accounts [expenses]```

**List with depth limit**

```hledger accounts --depth [2]```

**Show account tree**

```hledger accounts --tree```

**List used accounts only**

```hledger accounts --used```

# SYNOPSIS

**hledger** **accounts** [_options_] [_query_]

# PARAMETERS

**-f**, **--file** _file_
> Use specified journal file.

**--depth** _n_
> Limit account depth shown.

**--tree**
> Show accounts as tree structure.

**--used**
> Show only accounts with transactions.

**--declared**
> Show only declared accounts.

# DESCRIPTION

**hledger accounts** lists account names from the journal. Part of the hledger plain text accounting tool. Accounts can be filtered by query pattern, limited by depth, and displayed as a flat list or tree. Use with **--used** to see only accounts that have transactions.

# SEE ALSO

[hledger](/man/hledger)(1), [hledger-balance](/man/hledger-balance)(1), [ledger](/man/ledger)(1)

