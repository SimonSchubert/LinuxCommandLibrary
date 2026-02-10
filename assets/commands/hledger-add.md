# TAGLINE

interactively prompts for new transactions and appends them to the journal file

# TLDR

**Add transactions interactively**

```hledger add```

**Add to specific file**

```hledger add -f [journal.ledger]```

**Dry run without writing**

```hledger add --dry-run```

**Disable history suggestions**

```hledger add --no-history```

# SYNOPSIS

**hledger** **add** [_options_]

# PARAMETERS

**-f**, **--file** _file_
> Use specified journal file.

**--dry-run**
> Print entry without writing.

**--no-history**
> Disable suggestion of past values.

# DESCRIPTION

**hledger add** interactively prompts for new transactions and appends them to the journal file. It guides through date (defaults to today), description, account names, and amounts with auto-completion from existing entries. Ensures transactions balance before writing. Enter **.** when finished adding transactions.

# CAVEATS

This is the only hledger command that writes to the journal file. Existing transactions are never modified.

# SEE ALSO

[hledger](/man/hledger)(1), [hledger-accounts](/man/hledger-accounts)(1)

