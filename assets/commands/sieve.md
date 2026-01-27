# TLDR

**Compile and check** a Sieve script for errors

```sieve --compile-only [path/to/script.sieve]```

**Compile and dump** disassembled Sieve code

```sieve --dump [path/to/script.sieve]```

**Run a Sieve script** on a mailbox

```sieve [path/to/script.sieve] [path/to/mailbox]```

**Filter with verbose output**

```sieve --verbose [path/to/script.sieve] [path/to/mailbox]```

**Set debug level** for tracing

```sieve --debug=[trace4] [path/to/script.sieve]```

# SYNOPSIS

**sieve** [_options_] _script_ [_mailbox_]

# PARAMETERS

**-c**, **--compile-only**
> Compile the script and exit without executing. Used for syntax checking.

**-D**, **--dump**
> Compile the script and dump disassembled Sieve code to the terminal.

**-v**, **--verbose**
> Increase verbosity level.

**--debug=**_level_
> Set debugging level. Sieve-specific levels: **trace1** (parse tree before optimization), **trace2** (parse tree after optimization), **trace3** (parser traces), **trace4** (tests and actions executed), **trace9** (each instruction executed).

**--no-compile-only**
> Execute the script (disable compile-only mode).

**-h**, **--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**sieve** is a mail filtering tool that processes email using scripts written in the Sieve language (RFC 5228). Sieve is a domain-specific language designed for filtering email messages at delivery time, supporting actions like filing messages into folders, discarding spam, forwarding, and vacation responses.

The Sieve language provides conditional branching and pattern matching on message headers and content, but intentionally lacks variables and loops in its base specification to prevent runaway programs. Extensions to the base standard add features like variables, include files, and advanced string manipulation.

sieve can compile scripts to check for errors without executing them, or process actual mailboxes. It's commonly used with mail servers like Dovecot (via Pigeonhole) or GNU Mailutils.

# CAVEATS

The Sieve language has intentional limitations for safety: no variables or loops in the base specification. Scripts should be thoroughly tested with **--compile-only** before deployment. When filtering existing mailboxes, incorrect scripts can result in unintended message deletion. Use simulation modes when available before applying filters to production mailboxes.

# HISTORY

The Sieve language was originally standardized in **RFC 3028** (January 2001) by the IETF. The base specification was updated in **RFC 5228** (2008). The GNU Mailutils implementation provides the **sieve** command as part of its mail handling suite. Dovecot's Pigeonhole project provides another popular implementation with the **sieve-filter** command for server-side filtering.

# SEE ALSO

[sieve-filter](/man/sieve-filter)(1), [dovecot](/man/dovecot)(1), [procmail](/man/procmail)(1), [maildrop](/man/maildrop)(1)
