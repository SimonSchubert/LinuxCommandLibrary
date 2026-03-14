# TAGLINE

Decode XML entities to characters

# TLDR

**Unescape XML entities**

```xml unescape "[&lt;text&gt;]"```

**Unescape from stdin**

```echo "[&lt;text&gt;]" | xml unescape```

# SYNOPSIS

**xml unescape** [_options_] [_text_]

# PARAMETERS

_text_
> Text with XML entities. If not provided, reads from standard input.

**--help**
> Display usage information.

# DESCRIPTION

**xml unescape** (also `xml unesc`) converts XML entities back to their original characters. Part of the XMLStarlet toolkit. Decodes &amp;lt; &amp;gt; &amp;amp; &amp;apos; &amp;quot; and numeric character references to their original characters.

# SEE ALSO

[xml-escape](/man/xml-escape)(1), [xml-format](/man/xml-format)(1)

