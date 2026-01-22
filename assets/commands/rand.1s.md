# TLDR

**Generate 32 random bytes** in hexadecimal

```openssl rand -hex 32```

**Generate 32 random bytes** in base64 encoding

```openssl rand -base64 32```

**Generate raw random bytes** and write to a file

```openssl rand -out [random.bin] 256```

**Generate a random password** (24 base64 characters)

```openssl rand -base64 18```

**Generate 1 kilobyte of random data**

```openssl rand -out [random.bin] 1K```

# SYNOPSIS

**openssl rand** [**-hex**] [**-base64**] [**-out** _file_] _num_

# PARAMETERS

**-hex**
> Output random bytes as hexadecimal string (2 characters per byte)

**-base64**
> Output random bytes encoded in base64

**-out** _file_
> Write output to file instead of standard output

**-rand** _file_
> Use specified file(s) as additional random seed source

**-help**
> Display usage information

_num_
> Number of random bytes to generate (supports K/M/G/T suffixes)

# DESCRIPTION

**openssl rand** generates cryptographically secure pseudo-random bytes using OpenSSL's CSPRNG (Cryptographically Secure Pseudo-Random Number Generator). The output provides 256 bits of security when properly seeded from the operating system's entropy source.

The command is commonly used to generate random passwords, encryption keys, initialization vectors, and other security tokens. Without encoding options, raw binary bytes are output, which may not display properly in terminals.

On modern operating systems, OpenSSL automatically seeds from trusted system entropy sources (/dev/urandom on Unix-like systems). The command fails if sufficient entropy is unavailable.

# CAVEATS

Raw output (without **-hex** or **-base64**) contains binary data that may include non-printable characters. Pipe through encoding for terminal display or shell usage.

The number of output characters differs from the number of bytes: hex output is 2x the byte count, base64 output is approximately 4/3x the byte count (plus padding).

For password generation, base64 encoding includes characters (+, /, =) that may need escaping in some contexts.

# SEE ALSO

[openssl](/man/openssl)(1), [dd](/man/dd)(1), [head](/man/head)(1), [/dev/urandom](/man/urandom)(4)
