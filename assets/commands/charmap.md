# TLDR

**Open character map**

```charmap```

**Search for character** by name

```charmap --search "[heart]"```

**Copy character to clipboard**

```charmap --copy "[character]"```

# SYNOPSIS

**charmap** [_options_]

# DESCRIPTION

**charmap** is a Unicode character map application, typically part of GNOME desktop. It allows browsing and searching through all Unicode characters, viewing character details, and copying characters to the clipboard.

The application displays characters organized by Unicode block, with options to filter by script, language, or search term. Each character shows its code point, official name, and related information.

# PARAMETERS

**--search** _text_
> Search for characters by name.

**--copy** _char_
> Copy character to clipboard.

**--help**
> Display help information.

**--version**
> Display version information.

# CAVEATS

Requires a graphical environment. Character availability depends on installed fonts. Some characters may display as boxes if fonts don't include them.

# HISTORY

**charmap** is part of the **GNOME** desktop environment. Character map utilities have existed since early GUI systems, helping users access characters not on their keyboard. The GNOME version, known as **gucharmap**, was created in the early 2000s.

# SEE ALSO

[gucharmap](/man/gucharmap)(1), [xfd](/man/xfd)(1), [unicode](/man/unicode)(1)
