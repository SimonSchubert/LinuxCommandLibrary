# TAGLINE

Produce canonical XML form

# TLDR

**Canonicalize XML (W3C C14N)**

```xml canonic [file.xml]```

**Exclusive canonicalization**

```xml canonic --exc-c14n [file.xml]```

**Canonicalize without comments**

```xml canonic --without-comments [file.xml]```

**Read from stdin**

```cat file.xml | xml canonic```

# SYNOPSIS

**xml** **canonic** [_options_] [_file_]

# DESCRIPTION

**xml canonic** produces a canonical XML form of the input document as defined by the W3C XML Canonicalization (C14N) specification. Canonicalization normalizes whitespace, attribute order, namespace declarations, and character encoding so that two logically equivalent documents produce identical byte streams.

It is part of the **xmlstarlet** command-line XML toolkit. Canonical XML is commonly used as a preparation step before computing cryptographic digests for XML digital signatures (XML-DSig), and for reliable document comparison.

# PARAMETERS

**--exc-c14n**
> Use Exclusive XML Canonicalization (EXC-C14N) instead of the default Canonical XML 1.0.

**--without-comments**
> Omit comments from canonical output.

# CAVEATS

Canonicalization is lossy: comments may be stripped, whitespace normalized, and namespace declarations rewritten. Non-canonical formatting differences are intentionally erased. Cryptographic signatures over canonicalized XML require both parties to use the same C14N variant.

# SEE ALSO

[xml-c14n](/man/xml-c14n)(1), [xml-format](/man/xml-format)(1)
