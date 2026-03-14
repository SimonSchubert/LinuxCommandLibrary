# TAGLINE

creates supply chain attestations for build steps

# TLDR

**Start recording**

```in-toto-record start -n [step_name] -k [key.pem]```

**Stop recording**

```in-toto-record stop -n [step_name] -k [key.pem] -p [products]```

**Record with materials**

```in-toto-record start -n [step] -k [key] -m [src/]```

**Specify products**

```in-toto-record stop -n [step] -k [key] -p [dist/]```

# SYNOPSIS

**in-toto-record** _command_ [_options_]

# PARAMETERS

**start**
> Begin recording step.

**stop**
> Finish recording step.

**-n** _NAME_
> Step name (used to associate link with layout step).

**-k** _KEY_, **--signing-key** _KEY_
> Path to signing key file.

**-g** _ID_, **--gpg** _ID_
> GPG keyid used to sign the resulting link metadata.

**--gpg-home** _PATH_
> Path to GPG home directory.

**-m** _MATERIALS_
> Input materials paths (used with start).

**-p** _PRODUCTS_
> Output products paths (used with stop).

**-d** _DIR_
> Directory to store resulting link metadata (used with stop).

**--exclude** _PATTERN_
> Path patterns to exclude from recording.

**--base-path** _PATH_
> Base path for relative material/product paths.

**--lstrip-paths** _PREFIX_
> Left-strip path prefix before storing in link metadata.

**--use-dsse**
> Use DSSE envelope format for signing.

**-v**
> Verbose output.

**-q**
> Quiet mode.

# DESCRIPTION

**in-toto-record** creates supply chain attestations for build steps. It records materials before and products after a step, generating signed link metadata.

The tool supports split recording where start and stop are separate commands. This allows recording steps that span multiple commands or sessions.

# CAVEATS

Requires signing key. Part of in-toto framework. Links must be verified.

# HISTORY

in-toto-record is part of **in-toto**, a framework for supply chain integrity developed at **NYU** Secure Systems Lab.

# SEE ALSO

[in-toto-run](/man/in-toto-run)(1), [in-toto-sign](/man/in-toto-sign)(1)
