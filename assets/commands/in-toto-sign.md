# TLDR

**Sign a link file**

```in-toto-sign -k [key.pem] -f [link_file]```

**Sign layout file**

```in-toto-sign -k [key] -f [root.layout]```

**Add signature to existing**

```in-toto-sign -k [key] -f [file] -a```

**Output to specific file**

```in-toto-sign -k [key] -f [input] -o [output]```

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

**--help**
> Display help information.

# DESCRIPTION

**in-toto-sign** adds cryptographic signatures to in-toto metadata files. It signs both link files from build steps and layout files that define supply chain policies.

Multiple signatures can be added for multi-party verification. The tool supports GPG and PEM key formats.

in-toto-sign adds signatures to metadata.

# CAVEATS

Part of in-toto framework. Requires compatible key format. Signatures must match verification keys.

# HISTORY

in-toto-sign is part of **in-toto**, developed at **NYU** Secure Systems Lab for supply chain integrity verification.

# SEE ALSO

[in-toto-run](/man/in-toto-run)(1), [in-toto-record](/man/in-toto-record)(1), [in-toto-verify](/man/in-toto-verify)(1)
