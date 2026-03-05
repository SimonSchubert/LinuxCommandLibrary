# TAGLINE

Dead simple secure password generator

# TLDR

**Generate a memorable passphrase**

```motus```

**Generate a random password** of specific length

```motus random -l [length]```

**Generate a numeric PIN**

```motus pin -l [digits]```

**Analyze password strength**

```motus --analyze "[password]"```

# SYNOPSIS

**motus** [_command_] [_options_]

# PARAMETERS

**random**
> Generate a random character string.

**pin**
> Generate a numeric PIN.

**-l**, **--length** _N_
> Length of the generated password or PIN.

**--analyze**
> Score entropy and flag weak password choices.

**--json**
> Output in JSON format.

# DESCRIPTION

**motus** is a CLI password generator that creates secure, memorable passphrases using the EFF word list, random character strings, or numeric PINs. Generated passwords are automatically copied to the clipboard.

Customization options include word count, separators, case, and symbol/digit inclusion. The **--analyze** flag scores password entropy and warns about weak choices.

# CAVEATS

Clipboard support requires a clipboard provider on the system. Use **--no-clipboard** in headless environments.

# HISTORY

**motus** was created by **oleiade** and is written in **Rust**.

# SEE ALSO

[pass](/man/pass)(1), [pwgen](/man/pwgen)(1)
