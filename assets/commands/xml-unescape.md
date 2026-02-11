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
> Text with XML entities.

# DESCRIPTION

**xml unescape** converts XML entities back to characters. Part of xmlstarlet toolkit. Decodes &lt; &gt; &amp; &apos; &quot; to their original characters.

# SEE ALSO

[xml-escape](/man/xml-escape)(1), [xml-format](/man/xml-format)(1)

