# TAGLINE

executes a command while recording supply chain metadata

# TLDR

**Run and record command**

```in-toto-run -n [step_name] -k [key.pem] -- [command]```

**Record with materials and products**

```in-toto-run -n [build] -k [key] -m [src/] -p [dist/] -- make```

**Exclude patterns**

```in-toto-run -n [step] -k [key] --exclude [*.log] -- ./build.sh```

**Record without running**

```in-toto-run -n [step] -k [key] -m [files] -p [files]```

# SYNOPSIS

**in-toto-run** [_options_] [-- _command_]

# PARAMETERS

**-n** _NAME_
> Step name for link metadata.

**-k** _KEY_
> Private key for signing.

**-m** _MATERIALS_
> Materials (inputs) to record.

**-p** _PRODUCTS_
> Products (outputs) to record.

**--exclude** _PATTERN_
> Exclude files matching pattern.

**-c** _COMMAND_
> Command to run (alternative to --).

**--help**
> Display help information.

# DESCRIPTION

**in-toto-run** executes a command while recording supply chain metadata. It captures materials before execution and products after, creating a signed link file.

The tool is central to in-toto supply chain security. Each link provides cryptographic proof of what inputs and outputs a build step had.

# CAVEATS

Requires signing key. Links must match layout. Python-based tool.

# HISTORY

in-toto-run is the primary recording tool in **in-toto**, developed at **NYU** for protecting software supply chain integrity.

# SEE ALSO

[in-toto-record](/man/in-toto-record)(1), [in-toto-verify](/man/in-toto-verify)(1), [in-toto-sign](/man/in-toto-sign)(1)
