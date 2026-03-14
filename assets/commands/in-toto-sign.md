# TAGLINE

adds cryptographic signatures to in-toto metadata files

# TLDR

**Sign a link file**

```in-toto-sign -k [key.pem] -f [link_file]```

**Sign layout file**

```in-toto-sign -k [key] -f [root.layout]```

**Append** signature to existing signatures

```in-toto-sign -k [key] -f [file] -a```

**Output** signed metadata to a specific file

```in-toto-sign -k [key] -f [input] -o [output]```

**Verify** signatures on a metadata file

```in-toto-sign --verify -k [key.pub] -f [file]```

**Sign** with a GPG key

```in-toto-sign -g [gpg_keyid] -f [file]```

# SYNOPSIS

**in-toto-sign** [_options_]

# PARAMETERS

**-k** _KEY_
> Private signing key file.

**-f** _FILE_
> File to sign (link or layout).

**-a**, **--append**
> Append signature instead of replacing.

**-o** _OUTPUT_
> Output file path.

**-g** [_KEYID ..._]
> GPG keyids used to sign or verify

**--gpg-home** _PATH_
> GPG home directory path

**--verify**
> Verify signatures instead of signing

**-v**
> Verbose output

**-q**
> Quiet output

**--version**
> Show version information

**--help**
> Display help information

# DESCRIPTION

**in-toto-sign** adds cryptographic signatures to in-toto metadata files. It signs both link files from build steps and layout files that define supply chain policies.

Multiple signatures can be added for multi-party verification. The tool supports GPG and PEM key formats.

# CAVEATS

Part of in-toto framework. Requires compatible key format. Signatures must match verification keys.

# HISTORY

in-toto-sign is part of **in-toto**, developed at **NYU** Secure Systems Lab for supply chain integrity verification.

# SEE ALSO

[in-toto-run](/man/in-toto-run)(1), [in-toto-record](/man/in-toto-record)(1)
