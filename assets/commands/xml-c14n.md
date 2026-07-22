# TAGLINE

Canonicalize XML documents (xmlstarlet c14n)

# TLDR

**Inclusive canonicalization with comments** (W3C XML C14N 1.0)

```xml c14n --with-comments [file.xml]```

**Inclusive canonicalization stripping comments**

```xml c14n --without-comments [file.xml]```

**Exclusive canonicalization with comments** (XML EXC-C14N)

```xml c14n --exc-with-comments [file.xml]```

**Exclusive canonicalization without comments**

```xml c14n --exc-without-comments [file.xml]```

**Canonicalize a subset selected by an XPath expression file**

```xml c14n --without-comments [file.xml] [xpath.xml]```

**Read from stdin**

```cat [file.xml] | xml c14n --with-comments -```

# SYNOPSIS

**xml c14n** _mode_ _xml-file_ [_xpath-file_] [_inclusive-ns-list_]

# PARAMETERS

_MODE_ (required, exactly one)
> One of **--with-comments**, **--without-comments**, **--exc-with-comments**, **--exc-without-comments**.

_XML-FILE_
> XML document to canonicalize. Use **-** to read stdin.

_XPATH-FILE_
> Optional XML file whose root element's text content is an XPath expression that selects the node-set to canonicalize.

_INCLUSIVE-NS-LIST_
> For exclusive C14N only: space-separated list of namespace prefixes to treat as inclusive (e.g. `'soap xsd'`).

# DESCRIPTION

**xml c14n** is the canonicalization sub-command of **xmlstarlet**. It produces a byte-stable serialization of an XML document according to the W3C **Canonical XML 1.0** or **Exclusive XML Canonicalization 1.0** specifications. The result is what tools must compute before generating or verifying XML Digital Signatures (XML-DSig) so that semantically equivalent documents hash to the same value.

Inclusive canonicalization includes ancestor namespace declarations; exclusive canonicalization (used by SAML, WS-Security, etc.) drops them unless explicitly listed in the inclusive namespace prefix list.

# CAVEATS

The mode flag is positional — every invocation must supply exactly one of the four mode options before the input file. The XPath argument is itself an XML file containing an XPath, not a literal expression on the command line.

# INSTALL

```dnf: sudo dnf install xmlstarlet```

```pacman: sudo pacman -S xmlstarlet```

```apk: sudo apk add xmlstarlet```

```zypper: sudo zypper install xmlstarlet```

```brew: brew install xmlstarlet```

```nix: nix profile install nixpkgs#xmlstarlet```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[xmlstarlet](/man/xmlstarlet)(1), [xml-canonic](/man/xml-canonic)(1), [xml-format](/man/xml-format)(1), [xmllint](/man/xmllint)(1)
