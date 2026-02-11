# TAGLINE

Escape special XML characters

# TLDR

**Escape XML special characters**

```xml escape [text]```

**Escape from stdin**

```echo "[<text>]" | xml escape```

# SYNOPSIS

**xml escape** [_options_] [_text_]

# PARAMETERS

_text_
> Text to escape.

# DESCRIPTION

**xml escape** escapes special XML characters. Part of xmlstarlet toolkit. Converts <, >, &, ', " to their XML entity equivalents for safe inclusion in XML documents.

# SEE ALSO

[xml-unescape](/man/xml-unescape)(1), [xml-format](/man/xml-format)(1)

