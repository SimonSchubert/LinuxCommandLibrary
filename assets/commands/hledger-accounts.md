# TAGLINE

lists account names from the journal

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

**List declared accounts only**

```hledger accounts --declared```

**Show accounts with their types**

```hledger accounts --types```

**Drop first N account name components**

```hledger accounts --drop [1]```

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
> Show only accounts declared with account directives.

**--flat**
> Show accounts as a flat list with full names (default).

**--drop** _n_
> In flat mode, omit the first n account name components.

**--types**
> Show each account's type, if known.

# DESCRIPTION

**hledger accounts** lists account names from the journal. Part of the hledger plain text accounting tool. It shows accounts that are declared (with account directives), posted to, or both (the default). Accounts can be filtered by query pattern, limited by depth, and displayed as a flat list or tree.

# SEE ALSO

[hledger](/man/hledger)(1), [hledger-balance](/man/hledger-balance)(1), [hledger-print](/man/hledger-print)(1), [ledger](/man/ledger)(1)

