# TLDR

**List modules**

```p11-kit list-modules```

**List tokens**

```p11-kit list-tokens```

**Show object info**

```p11-kit list-objects```

**Extract certificates**

```p11-kit extract --format=pem-bundle --filter=ca-anchors [output]```

# SYNOPSIS

**p11-kit** [_command_] [_options_]

# PARAMETERS

**list-modules**
> List PKCS#11 modules.

**list-tokens**
> List tokens.

**list-objects**
> List objects.

**extract**
> Extract certificates.

**--format** _FORMAT_
> Output format.

**--help**
> Display help information.

# DESCRIPTION

**p11-kit** manages PKCS#11 modules. Provides unified access to crypto tokens.

The tool configures module loading. Handles certificate extraction.

p11-kit manages PKCS#11.

# CAVEATS

System configuration dependent. Used by many applications. Root for system changes.

# HISTORY

p11-kit was created to **unify PKCS#11 module** management across applications.

# SEE ALSO

[pkcs11-tool](/man/pkcs11-tool)(1), [openssl](/man/openssl)(1)

