# TAGLINE

creates presentations from Markdown

# TLDR

**Convert to HTML**

```marp [slides.md] -o [slides.html]```

**Convert to PDF**

```marp [slides.md] --pdf -o [slides.pdf]```

**Convert to PPTX**

```marp [slides.md] --pptx -o [slides.pptx]```

**Convert slides to images**

```marp [slides.md] --images [png] -o [slides/]```

**Convert the first slide** to a larger image

```marp [slides.md] --image [png] --image-scale [2] -o [title.png]```

**Preview with live reload**

```marp -p [slides.md]```

**Use custom theme**

```marp --theme [theme.css] [slides.md] -o [output.html]```

**Start server mode**

```marp -s [slides/]```

**Watch for changes and auto-convert**

```marp -w [slides.md] -o [slides.html]```

**Convert a whole directory**, keeping its structure

```marp -I [slides/] -o [output/]```

# SYNOPSIS

**marp** [_options_] _files_...

**marp** [_options_] **-I** _dir_

# PARAMETERS

**-o**, **--output** _file_
> Output filename or directory.

**--pdf**
> Export as PDF.

**--pptx**
> Export as PowerPoint.

**--pptx-editable**
> Experimental: generate an editable PPTX (needs LibreOffice Impress).

**--images** [png|jpeg]
> Export slides as multiple image files.

**--image** [png|jpeg]
> Export the first slide as a single image.

**--notes**
> Export presenter notes as a text file.

**-p**, **--preview**
> Open preview window.

**-s**, **--server** _dir_
> Start server mode for on-demand conversion.

**--theme** _name|css_
> Override the theme by name or CSS file.

**--theme-set** _path_
> Path to additional theme CSS files.

**--html**
> Enable or disable HTML tags.

**--template** _name_
> Choose the HTML template.

**-w**, **--watch**
> Watch for file changes and auto-convert.

**--pdf-notes**
> Add presenter notes as PDF annotations.

**--pdf-outlines**
> Add bookmarks to PDF output.

**--allow-local-files**
> Allow access to local files during conversion.

**--image-scale** _factor_
> Scale factor for rendered images (default: 1, or 2 for PPTX).

**-I**, **--input-dir** _dir_
> Base directory for input with output directory preservation.

**-c**, **--config-file** _file_
> Path to configuration file.

**--engine** _module_
> Specify Marpit-based conversion engine.

**-P**, **--parallel** _n_
> Maximum parallel processes for multiple conversions.

**--browser** _name_
> Browser used for PDF, PPTX and image conversion.

# DESCRIPTION

**Marp** (Markdown Presentation Ecosystem) creates presentations from Markdown. It converts specially formatted Markdown into slides in HTML, PDF, or PowerPoint formats.

Slides are separated by --- and support custom themes, speaker notes, and directives.

# SLIDE FORMAT

```markdown
---
marp: true
theme: default
---

# Slide 1

Content here

---

# Slide 2

More content
```

# CAVEATS

PDF, PPTX and image export require Chrome, Edge, or Firefox. Some CSS features are limited in PPTX output. Local file references require **--allow-local-files** for PDF/image conversion.

# HISTORY

Marp was created by **Yuki Hattori** (yhatt) in **2016** as Marp desktop app, later rewritten as Marp Next ecosystem with CLI.

# SEE ALSO

[pandoc](/man/pandoc)(1)

# RESOURCES

```[Source code](https://github.com/marp-team/marp-cli)```

```[Homepage](https://marp.app/)```

<!-- verified: 2026-11-09 -->
