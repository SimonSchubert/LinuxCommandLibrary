# TAGLINE

Hash type identifier for the command line

# TLDR

**Identify the type** of a hash

```haiti [hash_string]```

**Identify hash type** with extended algorithms including salted variants

```haiti -e [hash_string]```

**Identify hash from stdin**

```echo "[hash_string]" | haiti -```

**Show short output** without hashcat/john references

```haiti --short [hash_string]```

**Disable colorized output**

```haiti --no-color [hash_string]```

# SYNOPSIS

**haiti** [**-e**|**--extended**] [**--short**] [**--no-color**] _hash_

# PARAMETERS

**-e**, **--extended**
> List all possible hash algorithms including ones using salt

**--short**
> Display short format without hashcat and John the Ripper references

**--no-color**
> Disable colorized output

**--hashcat-only**
> Show only hashcat references

**--john-only**
> Show only John the Ripper references

**-h**, **--help**
> Print help

**-V**, **--version**
> Print version

# DESCRIPTION

**HAITI** (HAsh IdenTifIer) is a command-line tool and library for identifying the type of a given hash. It detects over **675 hash types** including modern algorithms like SHA3, Keccak, Blake2, and many application-specific formats. For each identified hash type, it provides the corresponding **Hashcat** mode number and **John the Ripper** format name, making it easy to proceed with hash cracking.

HAITI analyzes the hash length, character set, and format to narrow down possible algorithms, presenting results ranked by likelihood.

# CAVEATS

Hash identification is probabilistic — many hash types produce output of identical length and character set, so HAITI typically returns multiple possible matches. It cannot definitively determine the exact algorithm without additional context. Requires Ruby runtime for installation.

# HISTORY

**HAITI** was created by **Alexandre ZANNI** (noraj) and is written in **Ruby**. It was developed as a modern replacement for older hash identification tools, with a focus on supporting the latest algorithms and providing direct references to cracking tools. It is available in **Kali Linux** and other security-focused distributions.

# SEE ALSO

[hashcat](/man/hashcat)(1), [john](/man/john)(1)
