# TAGLINE

Decode XML entities to characters

# TLDR

**Unescape XML entities in a string**

```xml unescape "[&lt;text&gt;]"```

**Unescape XML entities from stdin**

```echo "[&lt;text&gt;]" | xml unescape```

**Using the short alias**

```xml unesc "[&lt;text&gt;]"```

# SYNOPSIS

**xml unescape** [_options_] [_text_]

# PARAMETERS

_text_
> Text with XML entities. If not provided, reads from standard input.

**--help**
> Display usage information.

# DESCRIPTION

**xml unescape** (also `xml unesc`) converts XML entities back to their original characters. Part of the XMLStarlet toolkit. Decodes &amp;lt; &amp;gt; &amp;amp; &amp;apos; &amp;quot; and numeric character references to their original characters.

# INSTALL

```dnf: sudo dnf install xmlstarlet```

```pacman: sudo pacman -S xmlstarlet```

```apk: sudo apk add xmlstarlet```

```zypper: sudo zypper install xmlstarlet```

```brew: brew install xmlstarlet```

```nix: nix profile install nixpkgs#xmlstarlet```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[xml-escape](/man/xml-escape)(1), [xml-select](/man/xml-select)(1), [xmlstarlet](/man/xmlstarlet)(1)

