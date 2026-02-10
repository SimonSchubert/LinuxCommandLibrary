# TAGLINE

KDE's universal document viewer

# TLDR

**Open document**

```okular [document.pdf]```

**Open at specific page**

```okular -p [5] [document.pdf]```

**Open in presentation mode**

```okular --presentation [document.pdf]```

**Open with specific backend**

```okular --backend [poppler] [document.pdf]```

**Print document**

```okular --print [document.pdf]```

**Unique instance** (reuse window)

```okular --unique [document.pdf]```

**Start without plugins**

```okular --no-plugins [document.pdf]```

# SYNOPSIS

**okular** [_-p page_] [_--presentation_] [_--unique_] [_options_] _files_

# PARAMETERS

**-p** _PAGE_
> Start at page number.

**--presentation**
> Start in presentation mode.

**--unique**
> Use single instance.

**--print**
> Print and exit.

**--backend** _NAME_
> Use specific backend.

**--no-plugins**
> Disable plugins.

**--editor-cmd** _CMD_
> Editor for source links.

**--find** _TEXT_
> Search for text on open.

**--noraise**
> Don't raise window.

# DESCRIPTION

**okular** is KDE's universal document viewer. It supports PDF, EPUB, DjVu, PostScript, images, and many other formats through plugins.

PDF viewing includes annotations, form filling, and digital signature verification. Documents can be annotated with highlights, notes, and drawings. Annotations save separately or embed in the file.

Presentation mode provides fullscreen display for slideshows. Transitions and notes support make it suitable for presentations.

Text selection and search work across supported formats. Continuous and multi-column layouts adapt to reading preferences.

The editor integration enables clicking source locations in PDFs to open corresponding positions in LaTeX editors. This supports the SyncTeX workflow.

Printing includes advanced options like booklet printing and page scaling. Print preview shows the exact output.

# CAVEATS

KDE-based, pulls in KDE dependencies. Some format support requires optional backends. Large documents may be memory-intensive.

# HISTORY

**Okular** was created for **KDE 4** in **2007**, merging several KDE document viewers (KPDF, KGhostView, KFax) into a unified application. It became KDE's standard document viewer, continuously expanding format support.

# SEE ALSO

[evince](/man/evince)(1), [zathura](/man/zathura)(1), [mupdf](/man/mupdf)(1), [xpdf](/man/xpdf)(1)
