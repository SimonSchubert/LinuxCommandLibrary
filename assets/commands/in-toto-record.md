# TAGLINE

creates supply chain attestations for build steps

# TLDR

**Start recording**, storing the current directory as materials

```in-toto-record start -n [step_name] --signing-key [key.pem] -m .```

**Stop recording**, storing the current directory as products

```in-toto-record stop -n [step_name] --signing-key [key.pem] -p .```

**Record specific materials**

```in-toto-record start -n [step] --signing-key [key] -m [src/]```

**Specify products** and write the link to a directory

```in-toto-record stop -n [step] --signing-key [key] -p [dist/] -d [path/to/links]```

**Sign with the default GPG key**

```in-toto-record start -n [step] --gpg -m [path/to/file]```

# SYNOPSIS

**in-toto-record** { **start** | **stop** } **-n** _name_ { **--signing-key** _path_ | **-g** [_id_] } [_options_]

# PARAMETERS

**start**
> Create a preliminary signed link file named .NAME.KEYID-PREFIX.link-unfinished.

**stop**
> Add products to the preliminary link, update the signature, and rename it to NAME.KEYID-PREFIX.link.

**-n**, **--step-name** _NAME_
> Step name (used to associate link with layout step). Required.

**--signing-key** _PATH_
> Path to a PEM/PKCS8 private signing key.

**-P**, **--password** [_PASSWORD_]
> Password for an encrypted signing key. Without a value, prompts for it.

**-g**, **--gpg** [_ID_]
> GPG keyid used to sign the link. Without a value, the default GPG key is used.

**--gpg-home** _PATH_
> Path to GPG home directory.

**-m**, **--materials** _PATH_ ...
> Files or directories to record as materials (start only).

**-p**, **--products** _PATH_ ...
> Files or directories to record as products (stop only).

**-d**, **--metadata-directory** _DIR_
> Directory to store resulting link metadata (stop only).

**--exclude** _PATTERN_ ...
> Path patterns to exclude from recording.

**--base-path** _PATH_
> Base path for relative material/product paths.

**--lstrip-paths** _PREFIX_ ...
> Left-strip path prefixes before storing in link metadata.

**--use-dsse**
> Generate metadata using DSSE (experimental).

**-v**, **--verbose**
> Verbose output.

**-q**, **--quiet**
> Suppress all output.

**--version**
> Show version information.

# DESCRIPTION

**in-toto-record** creates a signed link metadata file in two steps, providing evidence for supply chain steps that cannot be carried out by a single command (use **in-toto-run** for those). It records materials on start and products on stop.

Split recording allows capturing steps that span multiple commands or sessions.

# CAVEATS

Exactly one of **--signing-key** or **--gpg** must be given, and the same key must be used for start and stop. **stop** expects the preliminary link file in the current working directory. Do not confuse **-p** (products) with **-P** (password).

# HISTORY

in-toto-record is part of **in-toto**, a framework for supply chain integrity developed at **NYU** Secure Systems Lab.

# SEE ALSO

[in-toto-run](/man/in-toto-run)(1), [in-toto-sign](/man/in-toto-sign)(1)

# RESOURCES

```[Source code](https://github.com/in-toto/in-toto)```

```[Homepage](https://in-toto.io/)```

```[Documentation](https://in-toto.readthedocs.io/en/latest/command-line-tools/in-toto-record.html)```

<!-- verified: 2026-11-09 -->
