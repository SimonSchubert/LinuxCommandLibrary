# TAGLINE

Age-based password and secret manager (pass-compatible)

# TLDR

**Initialize** the password store

```passage init```

**Insert a new password** (multiline supported)

```passage insert path/to/entry```

**Show a password**

```passage path/to/entry```

**Copy password to clipboard**

```passage -c path/to/entry```

**Generate a password**

```passage generate path/to/entry 20```

**List the store**

```passage ls```

**Edit or remove an entry**

```passage edit path/to/entry```

```passage rm path/to/entry```

# SYNOPSIS

**passage** [_options_] _command_ [_args_]

# DESCRIPTION

**passage** is a password manager that stores secrets in age-encrypted files, modeled after the classic `pass` (password-store) tool but using the modern `age` encryption instead of GPG.

Each secret lives in its own file under `~/.passage/store` (or `$PASSAGE_DIR`). The directory can be tracked with Git. passage supports insert, generate, edit, show, copy, list, and remove operations with a simple CLI.

It is designed for simplicity and can be extended with shell scripts because the store is just a directory tree of encrypted files.

# PARAMETERS

Common subcommands and flags:

**init**
> Initialize the store and generate or import an age identity.

**-c**, **--clip**
> Copy the secret to the clipboard instead of printing.

**insert** [_-m_ | _--multiline_] _name_
> Add or overwrite an entry. `-m` for multiline.

**generate** _name_ [_length_]
> Generate and store a random password.

**edit** _name_
> Edit an entry in $EDITOR.

**ls**, **list**
> Show the store tree.

**rm**, **remove** _name_
> Delete an entry.

# CAVEATS

The age identity (private key) must be available when decrypting. Unlike GPG, age keys are not usually on keyservers; you are responsible for backups. Clipboard support depends on platform tools (xclip, pbcopy, wl-copy, etc.).

# SEE ALSO

pass, age, age-keygen

# RESOURCES

```[Source code](https://github.com/FiloSottile/passage)```

```[Homepage](https://www.passwordstore.org/)```

<!-- verified: 2026-07-09 -->
