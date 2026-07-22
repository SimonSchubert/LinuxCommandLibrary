# TAGLINE

Command-line tool for checking password safety

# TLDR

**Check a password from stdin**

```echo "[password]" | pwdsafety```

# SYNOPSIS

**pwdsafety** [_options_]

# DESCRIPTION

**pwdsafety** is a command-line tool that reads a password from standard input and evaluates its safety. The score combines several checks: whether the password (or its reverse) appears in a built-in dictionary of known weak passwords, the presence of uppercase letters, lowercase letters, digits, and symbols, the password length, and a Shannon-entropy calculation.

The tool prints the numeric score along with explanations of which rules passed or failed. When the score is 68 or lower, **pwdsafety** also suggests a random, stronger password.

# EXIT STATUS

Returns **0** when a password is evaluated successfully (regardless of score) and non-zero on input errors.

# CAVEATS

Does not store, log, or transmit any password information — evaluation is fully local. Reads only from standard input, so passwords supplied on a shell command line will be visible in the process list and shell history; pipe from a secure source instead.

# HISTORY

**pwdsafety** was created by **edoardottt** and is written in **Go**.

# INSTALL

```nix: nix profile install nixpkgs#pwdsafety```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pass](/man/pass)(1), [pwgen](/man/pwgen)(1)
