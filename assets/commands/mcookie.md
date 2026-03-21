# TAGLINE

generate a 128-bit random hexadecimal number

# TLDR

Generate a **128-bit random** hexadecimal number

```mcookie```

Use a **file** as an additional entropy source

```mcookie --file [path/to/file]```

Read at most a **specific number of bytes** from file as seed

```mcookie --file [path/to/file] --max-size [512]```

Show **verbose** details about randomness sources

```mcookie --verbose```

Display **version** information

```mcookie --version```

# SYNOPSIS

**mcookie** [_options_]

# DESCRIPTION

**mcookie** generates a 128-bit random hexadecimal number (32 hex characters). It is primarily used for generating X authority cookies but can be used for any purpose requiring random data.

# PARAMETERS

**-f, --file FILE**
> Use file contents as additional entropy source

**-m, --max-size BYTES**
> Maximum bytes to read from file

**-v, --verbose**
> Print details about randomness sources

**-V, --version**
> Display version information and exit

**-h, --help**
> Display help text and exit

# OUTPUT

32 hexadecimal characters (128 bits of randomness), printed to standard output with a trailing newline.

# CAVEATS

Uses /dev/urandom as its primary entropy source. Part of the util-linux package. The output is not cryptographically audited; for cryptographic key generation, prefer openssl or gpg.

# SEE ALSO

[xauth](/man/xauth)(1), [uuidgen](/man/uuidgen)(1), [openssl](/man/openssl)(1)
