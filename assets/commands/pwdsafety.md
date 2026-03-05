# TAGLINE

Command-line tool for checking password safety

# TLDR

**Check a password from stdin**

```echo "[password]" | pwdsafety```

# SYNOPSIS

**pwdsafety** [_options_]

# DESCRIPTION

**pwdsafety** is a command-line tool that reads passwords from standard input and evaluates their safety. It checks if the password or its reverse is a known common password, verifies basic rules like uppercase, lowercase, numbers, and symbols, and calculates entropy. When the score is 68 or lower, it generates a random stronger password as a suggestion.

# CAVEATS

Does not store any password information. Reads only from standard input.

# HISTORY

**pwdsafety** was created by **edoardottt** and is written in **Go**.

# SEE ALSO

[pass](/man/pass)(1), [pwgen](/man/pwgen)(1)
