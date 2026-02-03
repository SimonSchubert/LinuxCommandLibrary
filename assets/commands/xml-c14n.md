# TLDR

**Canonicalize XML**

```xml c14n [file.xml]```

**Exclusive canonicalization**

```xml c14n --exc-c14n [file.xml]```

**Canonicalize without comments**

```xml c14n --without-comments [file.xml]```

# SYNOPSIS

**xml c14n** [_options_] [_file_]

# PARAMETERS

**--exc-c14n**
> Exclusive canonicalization.

**--without-comments**
> Remove comments.

**--with-comments**
> Keep comments.

# DESCRIPTION

**xml c14n** performs W3C XML Canonicalization. Part of xmlstarlet toolkit. Produces canonical form of XML documents for comparison and digital signatures.

# SEE ALSO

[xml-canonic](/man/xml-canonic)(1), [xml-format](/man/xml-format)(1)

