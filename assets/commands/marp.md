# TAGLINE

creates presentations from Markdown

# TLDR

**Convert to HTML**

```marp [slides.md] -o [slides.html]```

**Convert to PDF**

```marp [slides.md] --pdf -o [slides.pdf]```

**Convert to PPTX**

```marp [slides.md] --pptx -o [slides.pptx]```

**Preview with live reload**

```marp --preview [slides.md]```

**Use custom theme**

```marp --theme [theme.css] [slides.md] -o [output.html]```

**Start server mode**

```marp --server [slides/]```

# SYNOPSIS

**marp** [_options_] _file_

# PARAMETERS

**-o**, **--output** _file_
> Output filename.

**--pdf**
> Export as PDF.

**--pptx**
> Export as PowerPoint.

**--html**
> Export as HTML.

**--preview**
> Open preview window.

**--server**
> Start server mode.

**--theme** _css_
> Custom theme file.

**--watch**
> Watch for changes.

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

PDF export requires Chrome/Chromium. Some CSS features limited. Images need accessible paths. PPTX has formatting limitations.

# HISTORY

Marp was created by **Yuki Hattori** (yhatt) in **2016** as Marp desktop app, later rewritten as Marp Next ecosystem with CLI.

# SEE ALSO

[reveal.js](/man/reveal.js)(1), [slidev](/man/slidev)(1), [pandoc](/man/pandoc)(1), [remark](/man/remark)(1)
