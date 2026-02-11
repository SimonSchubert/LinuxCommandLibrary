# TAGLINE

Interactive X11 font selector

# TLDR

**Launch font selector**

```xfontsel```

**Start with font pattern filter**

```xfontsel -pattern "[*medium*]"```

**Print selected font to stdout on quit**

```xfontsel -print```

**Display custom sample text**

```xfontsel -sample "[The quick brown fox]"```

**Show scaled fonts**

```xfontsel -scaled```

# SYNOPSIS

**xfontsel** [_options_]

# PARAMETERS

**-pattern** _fontname_
> Filter fonts matching pattern.

**-print**
> Print selected font name to stdout on quit.

**-sample** _text_
> Custom sample text for preview.

**-sample16** _text_
> Sample text for 16-bit fonts.

**-sampleUCS** _text_
> Sample text for UCS fonts.

**-scaled**
> Include scaled fonts in selection.

**-display** _name_
> X display to use.

# DESCRIPTION

**xfontsel** provides an interactive GUI for browsing and selecting X11 core fonts using XLFD (X Logical Font Description) names. It displays dropdown menus for each component of the 14-part XLFD font name.

Clicking on a field name shows available options filtered by previous selections. The asterisk (*) acts as a wildcard. A preview of the selected font is displayed, and the full XLFD name can be copied to the clipboard.

The selected font name becomes the PRIMARY text selection and PRIMARY_FONT selection, allowing paste into terminal emulators and other applications.

# CAVEATS

Only shows X11 core fonts (XLFD), not modern fontconfig/FreeType fonts. Limited usefulness on modern systems using Xft fonts. Legacy tool superseded by graphical font selectors.

# HISTORY

**xfontsel** was created by Ralph R. Swick at Digital Equipment Corporation/MIT Project Athena. It was essential when XLFD fonts were the primary font system on X11. Modern systems primarily use fontconfig and Xft, making xfontsel mainly useful for legacy applications.

# SEE ALSO

[xlsfonts](/man/xlsfonts)(1), [fc-list](/man/fc-list)(1), [xfd](/man/xfd)(1), [xterm](/man/xterm)(1)
