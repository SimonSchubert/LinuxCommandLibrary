# TAGLINE

Age-based password and secret manager (pass-compatible)

# TLDR

**Create an age identity** for the store (one-time setup; there is no `init`)

```mkdir -p ~/.passage && age-keygen >> ~/.passage/identities```

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

**passage** is a fork of the classic `pass` (password-store) tool that stores secrets in age-encrypted files instead of GPG.

Each secret lives in its own file under `~/.passage/store` (or `$PASSAGE_DIR`). The directory can be tracked with Git. passage supports insert, generate, edit, show, copy, list, and remove operations with a simple CLI.

For decryption, age identities at `~/.passage/identities` (or `$PASSAGE_IDENTITIES_FILE`) are used. For encryption, the nearest `.age-recipients` file is preferred; if none is found, the identities file is used.

**There is no `init` command.** Set up identities yourself (for example with `age-keygen`), then start inserting secrets. Moving or copying a secret always re-encrypts it.

# PARAMETERS

Common subcommands and flags (password-store–compatible where applicable):

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

**show** _name_ (or just _name_)
> Decrypt and print an entry.

# ENVIRONMENT

**PASSAGE_DIR**
> Password store location (default: `~/.passage/store`).

**PASSAGE_IDENTITIES_FILE**
> Identities file location (default: `~/.passage/identities`).

**PASSAGE_AGE**
> age binary to use (tested with `age` and `rage`).

**PASSAGE_RECIPIENTS_FILE** / **PASSAGE_RECIPIENTS**
> Override encryption recipients (`-R` / `-r` to age).

Other password-store variables such as `PASSWORD_STORE_CLIP_TIME` and `PASSWORD_STORE_GENERATED_LENGTH` are respected.

# CAVEATS

The `init` command is **not available**. Create `~/.passage/identities` with `age-keygen` (or a password-protected / hardware-backed identity) before first use. Optionally write public recipients to `~/.passage/store/.age-recipients`.

The age identity (private key) must be available when decrypting. Unlike GPG, age keys are not usually on keyservers; you are responsible for backups. Clipboard support depends on platform tools (xclip, pbcopy, wl-copy, etc.).

# INSTALL

```apk: sudo apk add passage```

```nix: nix profile install nixpkgs#passage```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pass](/man/pass)(1), [age](/man/age)(1), [age-keygen](/man/age-keygen)(1)

# RESOURCES

```[Source code](https://github.com/FiloSottile/passage)```

<!-- verified: 2026-07-11 -->
