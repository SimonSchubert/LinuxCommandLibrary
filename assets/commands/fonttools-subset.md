# TAGLINE

generate optimized subsets of font files

# TLDR

Subset a font to **Basic Latin** code points

```fonttools subset [path/to/font.ttf] --unicodes=U+0000-007F```

Write the subset with an explicit **output path**

```fonttools subset [path/to/font.ttf] --unicodes=U+0000-007F --output-file=[path/to/subset.ttf]```

Emit **WOFF2** instead of TTF

```fonttools subset [path/to/font.ttf] --unicodes=U+0000-007F --flavor=woff2```

Keep only selected OpenType **layout features**

```fonttools subset [path/to/font.ttf] --unicodes=U+0000-007F --layout-features=onum,kern```

# SYNOPSIS

**fonttools subset** [_options_] _font-file_

# PARAMETERS

**--unicodes=**_RANGE_
> Unicode code points to include (e.g., U+0000-007F for Basic Latin)

**--flavor=**_FORMAT_
> Output format: **woff**, **woff2**, or omit for original format

**--layout-features=**_LIST_
> Comma-separated OpenType features to keep (e.g., kern,liga,onum)

**--output-file=**_PATH_
> Specify output filename; defaults to input with .subset suffix

**--text=**_STRING_
> Include only glyphs needed for the given text

**--text-file=**_FILE_
> Include glyphs needed for text in the specified file

**--no-hinting**
> Remove hinting instructions to reduce file size

**--desubroutinize**
> Remove subroutines from CFF fonts

# DESCRIPTION

**fonttools subset** generates optimized subsets of font files by including only specified glyphs, Unicode ranges, or OpenType features. This is essential for web font optimization, reducing file sizes significantly by removing unused characters.

The tool supports TrueType (.ttf), OpenType (.otf), WOFF, and WOFF2 formats. It can convert between formats during subsetting using the **--flavor** option.

Common use cases include creating language-specific subsets, web-optimized fonts with only Latin characters, or icon fonts with specific glyphs.

# CAVEATS

WOFF2 output requires the **brotli** Python package. Some complex OpenType features may not subset correctly if dependent glyphs are excluded. Always test subsetted fonts thoroughly.

# INSTALL

```dnf: sudo dnf install fonttools```

```apk: sudo apk add py3-fonttools```

```brew: brew install fonttools```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[fonttools](/man/fonttools)(1)
