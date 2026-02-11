# TAGLINE

Summarize system process accounting data

# TLDR

Display **executable invocations** per user

```sudo sa```

Display invocations with **usernames**

```sudo sa --print-users```

List **resources used** per user

```sudo sa --user-summary```

# SYNOPSIS

**sa** [_options_] [_file_]

# PARAMETERS

**--print-users**
> Show responsible usernames

**--user-summary**
> Display per-user resource summary

# DESCRIPTION

**sa** summarizes accounting information about commands executed by users. It reports CPU time spent, I/O operations, and other resource usage from process accounting data.

Part of the acct package, it requires process accounting to be enabled for data collection.

# CAVEATS

Requires process accounting to be enabled (accton). Historical data depends on accounting file rotation.

# HISTORY

Part of **acct** (process accounting) package, providing system-wide command usage statistics.

# SEE ALSO

[lastcomm](/man/lastcomm)(1), [accton](/man/accton)(8), [ac](/man/ac)(1)
