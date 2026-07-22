# TAGLINE

adds new transactions from CSV or other data files to a journal

# TLDR

**Import transactions from one or more CSV files**

```hledger import [bank.csv]```

**Preview what would be imported, without changing the journal**

```hledger import --dry-run [bank.csv]```

**Import into a specific journal file**

```hledger import -f [ledger.journal] [bank.csv]```

**Use a specific CSV rules file**

```hledger import --rules [bank.rules] [bank.csv]```

**Import from every .rules file in the journal's rules/ directory**

```hledger import```

**Mark existing transactions as already imported, without importing them**

```hledger import --catchup [bank.csv]```

# SYNOPSIS

**hledger import** [_options_] [_files_]

# PARAMETERS

_FILES_
> Data file(s) to import from (CSV/SSV/TSV or any format hledger can read). If omitted, imports from every **.rules** file found in the journal's **rules/** directory.

**-f**, **--file** _[FMT:]FILE_
> Journal file to append imported transactions to. Defaults to $LEDGER_FILE or ~/.hledger.journal.

**--rules** _RULESFILE_
> Use rules defined in this file for converting the CSV/SSV/TSV input. If not given, hledger looks for **FILE.csv.rules** next to each FILE.csv.

**-g**, **--get**
> Fetch new data first, by running the **get** command (any **data/getdata** and **prices/getprices** scripts).

**--catchup**
> Don't import anything; just record all current transactions as already imported, so future imports skip them.

**--dry-run**
> Show the transactions that would be imported, in journal format, without writing them.

**--layout=hledger1|**_COL_
> How posting amounts should be aligned: right-aligned as in hledger 1 (default), or with decimal marks aligned at column COL.

# DESCRIPTION

**hledger import** detects new transactions in one or more CSV (or other supported format) data files and appends them to the main journal, which should be in journal format. It's most often used for CSV files downloaded from banks, converted using the same CSV rules hledger's file reader normally uses.

Unlike piping a CSV file through **hledger print**, **import** avoids re-importing transactions already seen: for each input file it remembers the latest record date processed, in a hidden **.latest.FILE** file next to it, and skips anything at or before that date on the next run. Run with **--dry-run** first to preview what would be added, especially the first time you import from a file.

If run with no file arguments, **import** looks in a **rules/** directory next to the main journal and reads every **.rules** file found there (skipping any whose name starts with **.** or **_**), applying each one to its corresponding data file.

# CAVEATS

Correct field mapping usually needs a matching CSV rules file; without one, hledger falls back to a generic one-field-per-column reading that rarely produces useful account names. Overlap detection relies on stable file names, dates, and row ordering across downloads; occasional violations are usually harmless if you import often. Part of the hledger suite.

# HISTORY

**import** was added to **hledger** to automate recording of bank/CSV statement downloads into a plain text journal without manual copy-pasting or duplicate entries.

# INSTALL

```apt: sudo apt install hledger```

```dnf: sudo dnf install hledger```

```pacman: sudo pacman -S hledger```

```apk: sudo apk add hledger```

```zypper: sudo zypper install hledger```

```brew: brew install hledger```

```nix: nix profile install nixpkgs#hledger```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[hledger](/man/hledger)(1), [hledger-add](/man/hledger-add)(1), [hledger-print](/man/hledger-print)(1)
