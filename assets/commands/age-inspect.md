# TAGLINE

inspect age-encrypted files without decrypting them

# TLDR

**Show metadata** about an age file

```age-inspect [secrets.age]```

**Read from stdin**

```cat [secrets.age] | age-inspect```

**Read from stdin** with explicit dash

```age-inspect - < [secrets.age]```

**Emit machine-readable JSON** for scripting

```age-inspect --json [secrets.age]```

**Print the version** and exit

```age-inspect --version```

# SYNOPSIS

**age-inspect** [**--json**] [_INPUT_]

# DESCRIPTION

**age-inspect** reports metadata about a file produced by **age**(1) without performing any decryption. It parses the age header to identify the file format version, list the recipient stanza types used to wrap the file key (for example `X25519`, `scrypt`, `ssh-ed25519`, or the post-quantum `mlkem768x25519`), and report whether ASCII armor was used.

When the input is a regular file (not a pipe) the tool also prints a size breakdown: header, armor overhead, encryption overhead and payload, so the size of the protected data can be estimated without supplying an identity. Because no key material is required, **age-inspect** is safe to run on files received from untrusted parties to determine which recipients can decrypt them, or to audit a directory of archived secrets.

If _INPUT_ is omitted or set to `-`, the file is read from standard input.

# PARAMETERS

**--json**
> Emit the inspection result as a JSON object suitable for programmatic processing (recipient types, post-quantum flag, armored flag, size fields).

**--version**
> Print the **age-inspect** version and exit.

# CAVEATS

**age-inspect** never decrypts the payload, so it cannot tell you whether a given identity will succeed in decryption, only which recipient stanza types are present. Size figures are exact for seekable files; when reading from a pipe, the payload size is reported as unknown. The tool was added to the official **age** distribution in version **1.3.0**; older releases ship only `age` and `age-keygen`.

# HISTORY

**age-inspect** ships with the reference **age** implementation by **Filippo Valsorda**. It was introduced in **age 1.3.0** in **2025**, alongside support for the post-quantum `mlkem768x25519` recipient type, to make it possible to reason about archived age files (recipient mix, armor, size) without unsealing them.

# INSTALL

```apt: sudo apt install age```

```dnf: sudo dnf install age```

```pacman: sudo pacman -S age```

```apk: sudo apk add age```

```zypper: sudo zypper install age```

```brew: brew install age```

```nix: nix profile install nixpkgs#age```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[age](/man/age)(1), [age-keygen](/man/age-keygen)(1), [gpg](/man/gpg)(1), [openssl](/man/openssl)(1)
