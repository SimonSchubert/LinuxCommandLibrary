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
> Step name.

**-k** _KEY_
> Signing key file.

**-m** _MATERIALS_
> Input materials paths.

**-p** _PRODUCTS_
> Output products paths.

**--help**
> Display help information.

# DESCRIPTION

**in-toto-record** creates supply chain attestations for build steps. It records materials before and products after a step, generating signed link metadata.

The tool supports split recording where start and stop are separate commands. This allows recording steps that span multiple commands or sessions.

in-toto-record creates supply chain attestations.

# CAVEATS

Requires signing key. Part of in-toto framework. Links must be verified.

# HISTORY

in-toto-record is part of **in-toto**, a framework for supply chain integrity developed at **NYU** Secure Systems Lab.

# SEE ALSO

[in-toto-run](/man/in-toto-run)(1), [in-toto-sign](/man/in-toto-sign)(1), [in-toto-verify](/man/in-toto-verify)(1)
