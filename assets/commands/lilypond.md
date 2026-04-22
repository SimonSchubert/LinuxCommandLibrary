# TAGLINE

music engraving program that compiles text-based notation into sheet music

# TLDR

**Compile a score** to PDF (default)

```lilypond [score.ly]```

**Explicitly select PDF output**

```lilypond --pdf [score.ly]```

**Output PNG images** (one per page)

```lilypond --png [score.ly]```

**Output PostScript**

```lilypond --ps [score.ly]```

**Output SVG** (uses the SVG backend)

```lilypond -dbackend=svg [score.ly]```

**Write output to a directory** with custom file prefix

```lilypond -o [output/name] [score.ly]```

**Add an include path** for shared library files

```lilypond -I [/path/to/includes] [score.ly]```

**Disable point-and-click** for distributable PDFs

```lilypond -dno-point-and-click [score.ly]```

**Typeset a score found inside LaTeX** (via lilypond-book)

```lilypond-book [document.lytex]```

# SYNOPSIS

**lilypond** [_options_] _file_.ly...

# PARAMETERS

_FILE_
> LilyPond source file (`.ly`). Multiple files may be given; each is processed independently.

**--pdf**
> Generate PDF output (default when no backend is specified).

**--png**
> Generate PNG images (one per page).

**--ps**
> Generate PostScript. Implied by `--pdf`.

**-f**, **--format=**_FORMAT_
> Alternative syntax for output format (`pdf`, `ps`, `png`, `svg`).

**-o**, **--output=**_FILE_
> Output file prefix (or directory). `.pdf`/`.png`/`.ps` is appended.

**-I**, **--include=**_DIR_
> Add _DIR_ to the include search path. Can be repeated.

**-d**_SETTING_[=_VALUE_]
> Set a `ly:set-option` program option. Examples: `-dbackend=svg`, `-dno-point-and-click`, `-dpreview`, `-ddelete-intermediate-files`, `-dcrop`, `-dembed-source-code`.

**-e**, **--evaluate=**_EXPR_
> Evaluate _EXPR_ as Scheme before reading the `.ly` file.

**-j**, **--jail=**_USER,GROUP,JAIL,DIR_
> Run in a chroot jail (useful for server deployments).

**-s**, **--silent**
> Suppress progress messages.

**-V**, **--verbose**
> Verbose output (prints each file being read).

**-w**, **--warranty**
> Show warranty / GPL info.

**-v**, **--version**
> Show version.

**-h**, **--help**
> Show help.

# COMMON -d OPTIONS

**-dno-point-and-click**
> Disable point-and-click links in the PDF. Recommended for anything you publish — point-and-click embeds absolute paths from your machine.

**-dpreview**
> Render only the first system, as a "preview" PNG/PDF.

**-dcrop**
> Produce a cropped PDF/PNG around the music only.

**-dbackend=**_NAME_
> Select a backend: `ps` (default), `svg`, `scm`, `null`.

**-ddelete-intermediate-files**
> Delete `.ps` / `-systems.*` files after PDF generation.

**-dembed-source-code**
> Embed the `.ly` source inside the output PDF.

# DESCRIPTION

**LilyPond** compiles a plain-text description of music into engraved sheet music of publication quality. It was inspired by **TeX**'s approach to typography: the user writes logical content (notes, rhythms, lyrics, dynamics) and LilyPond handles spacing, beaming, page breaks, and collision avoidance.

The same source file can target PDF, PostScript, SVG, or PNG. Backends are chosen via `-dbackend=`. Related tools:

- **lilypond-book** — embed `.ly` snippets inside LaTeX/HTML/DocBook and render them inline.
- **midi2ly** / **abc2ly** / **musicxml2ly** — convert other formats into LilyPond source.
- **convert-ly** — upgrade older `.ly` syntax to match the current compiler.

# CAVEATS

Significant learning curve — the input language is rich and unlike WYSIWYG tools. Builds can be slow on large scores; use `-dpreview` during editing. Always pass `-dno-point-and-click` before sharing PDFs to avoid leaking filesystem paths.

# HISTORY

**LilyPond** was started in **1996** by **Han-Wen Nienhuys** and **Jan Nieuwenhuizen**, inspired by TeX's typographic quality and MusiXTeX's music input language. It is now a GNU project distributed under the GPL and written in C++ and Scheme (GNU Guile).

# SEE ALSO

[abc2ly](/man/abc2ly)(1), [musescore](/man/musescore)(1)
