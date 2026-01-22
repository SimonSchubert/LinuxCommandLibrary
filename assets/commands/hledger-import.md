# TLDR

**Import transactions**

```hledger import [file.csv]```

**Dry run import**

```hledger import --dry-run [file.csv]```

**Import with rules**

```hledger import --rules-file [bank.rules] [file.csv]```

**Import to specific file**

```hledger import -f [ledger.journal] [file.csv]```

# SYNOPSIS

**hledger import** [_options_] _files_

# PARAMETERS

_FILES_
> Files to import.

**--dry-run**
> Show what would be imported.

**--rules-file** _FILE_
> CSV rules file.

**-f**, **--file** _FILE_
> Target journal.

**--new**
> Import only new entries.

**--help**
> Display help information.

# DESCRIPTION

**hledger import** adds transactions from CSV or other files to a journal. It uses rules files to map CSV columns to journal fields.

The command detects duplicates and only imports new transactions by default. Rules files define field mappings and transformations.

hledger import converts CSV to journal entries.

# CAVEATS

Requires rules file for CSV format. May need manual review. Part of hledger suite.

# HISTORY

Import is an **hledger** command for automating bank statement import into plain text journals.

# SEE ALSO

[hledger](/man/hledger)(1), [hledger-print](/man/hledger-print)(1)
