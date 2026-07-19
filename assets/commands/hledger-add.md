# TAGLINE

interactively prompts for new transactions and appends them to the journal file

# TLDR

**Add transactions interactively**

```hledger add```

**Add to specific file**

```hledger add -f [journal.ledger]```

**Don't allow creating new accounts**

```hledger add --no-new-accounts```

**Pre-fill the first prompts** (date, description, account, amount) from the command line

```hledger add [today] ["best buy"] [expenses:supplies] [$20]```

**Ignore balance assertions while adding**

```hledger add -I```

# SYNOPSIS

**hledger** **add** [_options_] [_entry-fields_]

# PARAMETERS

**-f**, **--file** _file_
> Use specified journal file (the entry is appended to the first one given).

**--no-new-accounts**
> Don't allow creating new accounts; only accounts already used in the journal may be entered.

**--layout=hledger1|**_COL_
> How posting amounts should be aligned: right-aligned as in hledger 1 (default), or with decimal marks aligned at column COL.

**-I**, **--ignore-assertions**
> Disable balance assertion checking while entering amounts.

# DESCRIPTION

**hledger add** interactively prompts for new transactions and appends them to the journal file. It guides through date (defaults to today, accepting words like "yesterday"/"today"/"tomorrow"), an optional transaction code, description, account names, and amounts, with tab-completion drawn from existing entries.

It tries to provide useful defaults, using the most similar (by description) and nearest-dated existing transaction as a template. Initial values for the first few prompts can also be given as arguments on the command line. Readline-style edit keys work during entry; enter **<** at any prompt to go back a step. Amounts can include a balance assertion (**AMOUNT = BALANCE**) or balance assignment (**= BALANCEAMOUNT**), and hledger re-checks the journal's balance assertions after each amount, rejecting ones that would fail. Enter **.**, or press Control-d or Control-c, when finished adding transactions.

# CAVEATS

This is one of the only hledger commands that writes to the journal file (see also **import**); existing transactions are never changed. It works only with journal-format files, not timeclock or timedot files. **add** won't let you record a posting dated earlier than an existing balance assignment in that account; run with **-I** to work around this.

# SEE ALSO

[hledger](/man/hledger)(1), [hledger-import](/man/hledger-import)(1), [hledger-accounts](/man/hledger-accounts)(1)
