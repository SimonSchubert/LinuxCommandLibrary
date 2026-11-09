# TAGLINE

adds cryptographic signatures to in-toto metadata files

# TLDR

**Sign a link file**

```in-toto-sign -k [key.pem] -f [link_file]```

**Sign layout file**

```in-toto-sign -k [key] -f [root.layout]```

**Append** signature to a layout's existing signatures

```in-toto-sign -k [key] -f [root.layout] -a```

**Sign a layout with several keys** at once

```in-toto-sign -k [key1] [key2] -f [unsigned.layout] -o [root.layout]```

**Output** signed metadata to a specific file

```in-toto-sign -k [key] -f [input] -o [output]```

**Verify** signatures on a metadata file

```in-toto-sign --verify -k [key.pub] -f [file]```

**Sign** with a GPG key

```in-toto-sign -g [gpg_keyid] -f [file]```

# SYNOPSIS

**in-toto-sign** **-f** _file_ { **-k** _path_ ... | **-g** [_keyid_ ...] } [_options_]

# PARAMETERS

**-k**, **--key** _PATH_ ...
> Key files used to sign (PEM/PKCS8) or verify (PEM/subjectPublicKeyInfo).

**-p**, **--prompt**
> Prompt for the signing key decryption password.

**-f**, **--file** _FILE_
> File to sign or verify (link or layout). Required.

**-a**, **--append**
> Append signature instead of replacing. Layout metadata only.

**-o**, **--output** _OUTPUT_
> Output file path. By default, a layout is written to the input path and a link to NAME.KEYID-PREFIX.link.

**-g**, **--gpg** [_KEYID ..._]
> GPG keyids used to sign or verify. Without keyids, the default GPG key is used for signing.

**--gpg-home** _PATH_
> GPG home directory path

**--verify**
> Verify signatures instead of signing

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Quiet output

**--version**
> Show version information

**--help**
> Display help information

# DESCRIPTION

**in-toto-sign** adds cryptographic signatures to in-toto metadata files. It signs both link files from build steps and layout files that define supply chain policies.

It is useful to re-sign metadata when changing keys, or to sign unsigned links such as those from **in-toto-mock**. Layouts can carry multiple signatures for threshold signing. The tool supports GPG and PEM key formats.

# CAVEATS

Part of in-toto framework. Link metadata can only be signed by one key at a time. **--key** and **--gpg** are mutually exclusive. **--verify** cannot be combined with **--append** or **--output**, and GPG verification requires an explicit keyid.

# HISTORY

in-toto-sign is part of **in-toto**, developed at **NYU** Secure Systems Lab for supply chain integrity verification.

# SEE ALSO

[in-toto-run](/man/in-toto-run)(1), [in-toto-record](/man/in-toto-record)(1)

# RESOURCES

```[Source code](https://github.com/in-toto/in-toto)```

```[Homepage](https://in-toto.io/)```

```[Documentation](https://in-toto.readthedocs.io/en/latest/command-line-tools/in-toto-sign.html)```

<!-- verified: 2026-11-09 -->
