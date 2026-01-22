# TLDR

Generate **random number**

```mcookie```

Use **file** as seed

```mcookie --file [path/to/file]```

Use **limited bytes** from file as seed

```mcookie --file [path/to/file] --max-size [bytes]```

Show **verbose** randomness details

```mcookie --verbose```

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

# OUTPUT

32 hexadecimal characters (128 bits of randomness)

# CAVEATS

Uses /dev/urandom and system entropy. Part of util-linux package.

# SEE ALSO

[xauth](/man/xauth)(1), [uuidgen](/man/uuidgen)(1)
